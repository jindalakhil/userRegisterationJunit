package userregist;

import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
	
	@Test
	public void should_Return_Happy_When_FirstName_Is_Valid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Happy", obj.validateFirstName("First"));
	}
	
	@Test
	public void should_Return_Sad_When_FirstName_Having_Small_First_Letter() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Sad", obj.validateFirstName("first"));
	}
	
	@Test
	public void should_Return_Sad_When_FirstName_Is_Short() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Sad", obj.validateFirstName("Fi"));
	}
	
	@Test
	public void should_Return_Happy_When_LastName_Is_Valid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Happy", obj.validateLastName("Last"));
	}
	
	@Test
	public void should_Return_Sad_When_LastName_Having_Small_First_Letter() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Sad", obj.validateLastName("lasts"));
	}
	
	@Test
	public void should_Return_Sad_When_LastName_Is_Short() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Sad", obj.validateLastName("La"));
	}
	
	@Test
	public void should_Return_Sad_When_Email_Is_Invalid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Sad", obj.validateEmail("asd.aail.com"));
	}
	
	@Test
	public void should_Return_Happy_When_Email_Is_Valid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Happy", obj.validateEmail("abc@gmail.com"));
	}
	
	@Test
	public void should_Return_Happy_When_Phone_Is_Valid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Happy", obj.validatePhoneNumber("9988998899"));
	}
	
	@Test
	public void should_Return_Sad_When_Phone_Is_Invalid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Sad", obj.validatePhoneNumber("090999"));
	}
	
	@Test
	public void should_Return_Sad_When_Password_Is_Invalid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Sad", obj.validatePassword("assdasa"));
	}
	
	@Test
	public void should_Return_Happy_When_Password_Is_Valid() {
		UserRegisteration obj = new UserRegisteration();
		Assert.assertEquals("Happy", obj.validatePassword("Ajaj@012"));
	}
	
	
}
