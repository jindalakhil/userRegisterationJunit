package userregist;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registeration");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name having first letter capital");
		String fname = sc.nextLine();
		Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matcher = pattern.matcher(fname);
		if( matcher.find()) {
			System.out.println("Match found");
		}
		else {
			System.out.println("First Name should start with capital and should have min 3 charcaters and having no special characters");
			return;
		}

			System.out.println("Enter last name having first letter capital");
			String lname = sc.nextLine();
			pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		    matcher = pattern.matcher(lname);
			if( matcher.find()) {
				System.out.println("Match found");
			}
			else {
				System.out.println("Last Name should start with capital and should have min 3 charcaters and having no special characters");
				return;
		}
		
			System.out.println("Enter Email");
			String email = sc.nextLine();
		    pattern =Pattern.compile("^[a-z]+([-+-.]{0,1}[a-zA-z0-9]{1,})?@[a-z]{2,}\\.[a-z]{2,4}(\\.[a-z]{2})?$");
		    matcher = pattern.matcher(email);
			if( matcher.find()) {
				System.out.println("Match found");
			}
			else {
				System.out.println("Email not Valid");
				return;
			}	
			
			System.out.println("Enter 10 digit mobile number");
			String phone = sc.nextLine();
		    pattern =Pattern.compile("^[1-9]{1}[0-9]{9}$");
		    matcher = pattern.matcher(phone);
			if( matcher.find()) {
				System.out.println("Match found");
			}
			else {
				System.out.println("Number not Valid");
				return;
			}	
			
			System.out.println("Enter 8-16 length password having minimum 1 uppercase, 1 lower case , 1 special character and 1 digit value");
			String password = sc.nextLine();
		    pattern =Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%]).{8,16}$");
		    matcher = pattern.matcher(password);
			if( matcher.find()) {
				System.out.println("Match found");
			}
			else {
				System.out.println("password not Valid");
				return;
			}
	}
}
