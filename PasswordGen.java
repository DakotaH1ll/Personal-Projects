package Review;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class PasswordGen {

		public static void main(String[] args) {

			Random r = new Random();
			String password = "";
			String alphabet = "abcdefghijklmnopqrstuvwxyz";;
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("What is this password for?");
		    String host = myObj.nextLine();
		    
			System.out.println("How many characters would you like?");
		    int chars = Integer.parseInt(myObj.nextLine());
		    
		    System.out.println("Would you like to include capital letters (Y/N)?");
		    String caps = myObj.nextLine();
		    if (caps.equals("Y")){
		    	alphabet += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    }
		    
		    System.out.println("Would you like to include numbers (Y/N)?");
		    String nums = myObj.nextLine();
		    if (nums.equals("Y")){
		    	alphabet += "1234567890";
		    }
		    
		    System.out.println("Would you like to include special characters? (Y/N)");
		    String specials = myObj.nextLine();
		    if (specials.equals("Y") ){
		    	alphabet += "~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.";
		    }
		    
		    
		    System.out.print("Your " + host +" password is: ");
		    for (int i = 0; i < chars; i++) {
		       password += alphabet.charAt(r.nextInt(alphabet.length()));
		    }
		    System.out.println(password);
		 
		    try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("passwords.txt", true));    
		        
		        
		        out.write("Your " + host +" password is: ");
		    	out.write(password);
		    	out.newLine();
		    	    
		        out.close();
		        } catch (IOException e) {}
		  
		}

	}

