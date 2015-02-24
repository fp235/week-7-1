/**
 * Purpose Entering the user name and password
 * @author franzperez
 *
 */

import java.util.Scanner;
public class UserName {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Username");
		Scanner keyboard = new Scanner(System.in);
		String cuserName, cpassword;
		cuserName = "bob";
		System.out.println("Enter password");
		cpassword = "bob12";
		
		String userName = keyboard.nextLine();
		String password = keyboard.nextLine();
		
		if(userName.equals(cuserName) && password.equals(cpassword)) {
		System.out.println("Welcome Username");
		} else { 
			System.out.println("Incorrect username and password");
		
			
		}
		
		}
	}


