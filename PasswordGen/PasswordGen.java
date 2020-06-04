/********************************
Password Generator
Written By Dakota Hill
April 2019
For personal use
*********************************/

package Review;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class PasswordGen {

		public static void main(String[] args) {

			Random r = new Random();
			String password = "";
			String alphabet = "abcdefghijklmnopqrstuvwxyz"; // Basic Alphabet
			Scanner myObj = new Scanner(System.in);
			
			System.out.println("What website is this password for?"); // For storage
		    String host = myObj.nextLine();
		    
			System.out.println("How many characters would you like?");
		    int chars = Integer.parseInt(myObj.nextLine());
		    
		    System.out.println("Would you like to include capital letters (Y/N)?");  // Add uppercase, if requested
		    String caps = myObj.nextLine();
		    if (caps.equals("Y")){
		    	alphabet += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    }
		    
		    System.out.println("Would you like to include numbers (Y/N)?");  // Add numbers, if requested
		    String nums = myObj.nextLine();
		    if (nums.equals("Y")){
		    	alphabet += "1234567890";
		    }
		    
		    System.out.println("Would you like to include special characters? (Y/N)");   // Add special characters, if requested
		    String specials = myObj.nextLine();
		    if (specials.equals("Y") ){
		    	alphabet += "~`!@#$%^&*()+=_-{}[]|:;”’?/<>,.";
		    }
		    
		    
		    System.out.print("Your " + host +" password is: ");
		    for (int i = 0; i < chars; i++) {
		       password += alphabet.charAt(r.nextInt(alphabet.length()));  // Console output for user to confirm accuracy
		    }
		    System.out.println(password);
		 
		    try {
		        BufferedWriter out = new BufferedWriter(new FileWriter("passwords.txt", true));    
		        
		        
		        out.write("Your " + host +" password is: ");
		    	out.write(password);									  // Write password to text file for future use
		    	out.newLine();
		    	    
		        out.close();
		        } catch (IOException e) {}
		  
		}

	}

