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
			System.out.println("Name should start with capital and should have min 3 charcaters and having no special characters");
			
		
		}
	}
}
