package userregist;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisteration {
	
	public static void main(String[] args) throws UserRegiesterationException {
		System.out.println("Welcome to User Registeration");
		UserRegisteration obj = new UserRegisteration();
	//	List<String> userDetails = new ArrayList<String >();
		
		System.out.println("Enter first name having first letter capital");
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		Validator validate = n -> {
			Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			Matcher matcher = pattern.matcher(n);
			if( matcher.find()) {
				return true;
			}
			else {
				throw new UserRegiesterationException(UserRegiesterationException.EnumType.FIRST_NAME, "Enter valid First Name");
		}
		};
		 validate.vvalidate(fname);
		
		System.out.println("Enter last name having first letter capital");
		String lname = sc.nextLine();
		//System.out.println(obj.validateLastName(lname));
		
		 validate = n -> {
			 Pattern pattern =Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
			 Matcher matcher = pattern.matcher(n);
			if( matcher.find()) {
				return true;
			}
			else {
				throw new UserRegiesterationException(UserRegiesterationException.EnumType.LAST_NAME, "Enter valid Last Name");
		}
		 };
			System.out.println (validate.vvalidate(lname));
			
		System.out.println("Enter Email");
		String email = sc.nextLine();
		//System.out.println(obj.validateEmail(email));
		validate = n -> {
			Pattern pattern =Pattern.compile("^[a-z]+([-+-.]{0,1}[a-zA-z0-9]{1,})?@[a-z]{2,}\\.[a-z]{2,4}(\\.[a-z]{2})?$");
		    Matcher matcher = pattern.matcher(n);
			if( matcher.find()) {
				return true;
			}
			else {
				System.out.println("Invalid Email");
				return false;
		}
		};
			System.out.println (validate.vvalidate(email));
		
		System.out.println("Enter 10 digit mobile number");
		String phone = sc.nextLine();
		//System.out.println(obj.validatePhoneNumber(phone));
		validate = phoneNumber -> {
			Pattern pattern =Pattern.compile("^[1-9]{1}[0-9]{9}$");
		    Matcher matcher = pattern.matcher(phoneNumber);
			if( matcher.find()) {
				return true;
			}
			else {
				throw new UserRegiesterationException(UserRegiesterationException.EnumType.PHONE_NUMBER, "Enter valid Phone Number");
		}
		};
			System.out.println (validate.vvalidate(phone));
		
		System.out.println("Enter 8-16 length password having minimum 1 uppercase, 1 lower case , 1 special character and 1 digit value");
		String password = sc.nextLine();	
		//System.out.println(obj.validatePassword(password));
		validate = pass -> {
			Pattern pattern =Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%]).{8,16}$");
		    Matcher matcher = pattern.matcher(pass);
			if( matcher.find()) {
				return true;
			}
			else{
				throw new UserRegiesterationException(UserRegiesterationException.EnumType.PASSWORD, "Enter valid Password ");
		}
		};
			System.out.println(validate.vvalidate(password));
	
		}
}
