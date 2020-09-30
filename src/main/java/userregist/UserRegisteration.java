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
	}
}
