package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.PomSignIn;

public class SignInTest extends BaseAmazonClass {
	PomSignIn Signin;
	public SignInTest() {
		super();
	}

	@BeforeMethod
	public void initsetup() {
		initiate();
		
		Signin = new PomSignIn();
		
	}
	
	@Test
	public void Signin_TC() throws InterruptedException{
		Thread.sleep(2000);
		Signin.pomsignin();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
