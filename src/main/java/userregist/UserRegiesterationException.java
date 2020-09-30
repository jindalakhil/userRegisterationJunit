package userregist;

public class UserRegiesterationException extends Exception {
	public enum EnumType{
		FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, PASSWORD
	}
	
	public UserRegiesterationException(EnumType type, String msg) {
		super(msg);
		System.out.println(type);
	}
}
