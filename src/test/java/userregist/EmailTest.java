package userregist;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class EmailTest {
	private String mail;
	private String result;
	
	 public EmailTest(String mail, String result) {
		// TODO Auto-generated constructor stub
		 this.mail = mail;
		 this.result = result;
	}
	
	@Parameterized.Parameters
	public static Collection mails() {
		return Arrays.asList(new Object[][] {{"abc@yahoo.com","Happy"},
			{"abc-100@yahoo.com","Happy"},
			{"abc.100@yahoo.com","Happy"},
			{"abc111@abc.com","Happy"},
			{"abc-100@abc.net","Happy"},
			{"abc.100@abc.com.au","Happy"},
			{"abc@1.com","Sad"},
			{"abc+100@gmail.com","Happy"},
			{"abc-","Sad"},
			{"abc@.com.my","Sad"},
			{"abc123@gmail.a","Sad"},
			{".abc123@.com","Sad"},
			{"abc123@.com.com","Sad"},
			{".abc@abc.com","Sad"},
			{"abc()*@gmail.com","Sad"},
			{"abc@%*.com","Sad"},
			{"abc..2002@gmail.com","Sad"},
			{"abc.@gmail.com","Sad"},
			{"abc@abc@gmail.com","Sad"},
		    {"abc@gmail.com.1a","Sad"},
			{"abc@gmail.com.aa.au","Sad"}});
	}
	
	@Test
	public void test_Valid_Or_Invalid_Emails() {
//		UserRegisteration obj = new UserRegisteration();
//		System.out.println(mail);
//		Assert.assertEquals(result, obj.validateEmail(mail));
	}
	
	
}
