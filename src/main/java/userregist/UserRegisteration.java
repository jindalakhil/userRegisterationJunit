package userregist;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	Pattern pattern;
	Matcher matcher;
	
	public static void main(String[] args) {
		System.out.println("Welcome to User Registeration");
		UserRegisteration obj = new UserRegisteration();
		
		System.out.println("Enter first name having first letter capital");
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		System.out.println(obj.validateFirstName(fname));
		
		System.out.println("Enter last name having first letter capital");
		String lname = sc.nextLine();
		System.out.println(obj.validateLastName(lname));
		
		System.out.println("Enter Email");
		String email = sc.nextLine();
		System.out.println(obj.validateEmail(email));
		
		System.out.println("Enter 10 digit mobile number");
		String phone = sc.nextLine();
		System.out.println(obj.validatePhoneNumber(phone));
		
		System.out.println("Enter 8-16 length password having minimum 1 uppercase, 1 lower case , 1 special character and 1 digit value");
		String password = sc.nextLine();	
		System.out.println(obj.validatePassword(password));
	}
	
	public String validateFirstName(String fname) {
		pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		matcher = pattern.matcher(fname);
		if( matcher.find()) {
			return "Happy";
		}
		else {
			System.out.println("First Name should start with capital and should have min 3 charcaters and having no special characters");
			return "Sad";
		}
	}
	
	public String validateLastName(String lname) {
		pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	    matcher = pattern.matcher(lname);
		if( matcher.find()) {
			return "Happy";
		}
		else {
			System.out.println("Last Name should start with capital and should have min 3 charcaters and having no special characters");
			return "Sad";
		}
	}
	
	public String validateEmail(String email) {
		pattern =Pattern.compile("^[a-z]+([-+-.]{0,1}[a-zA-z0-9]{1,})?@[a-z]{2,}\\.[a-z]{2,4}(\\.[a-z]{2})?$");
	    matcher = pattern.matcher(email);
		if( matcher.find()) {
			return "Happy";
		}
		else {
			System.out.println("Invalid Email");
			return "Sad";
		}
	}
	
	public String validatePhoneNumber(String phone) {
		pattern =Pattern.compile("^[1-9]{1}[0-9]{9}$");
	    matcher = pattern.matcher(phone);
		if( matcher.find()) {
			return "Happy";
		}
		else {
			System.out.println("Invalid Phone Number");
			return "Sad";
		}
	}
	
	public String validatePassword(String password) {
		pattern =Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%]).{8,16}$");
	    matcher = pattern.matcher(password);
		if( matcher.find()) {
			return "Happy";
		}
		else {
			System.out.println("Invalid Password");
			return "Sad";
		}
	}
	
}
