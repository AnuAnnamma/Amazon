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
		/*WebElement hellosignin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action = new Actions(driver);
		action.moveToElement(hellosignin).perform();
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
		action.moveToElement(signin).perform();
		action.click().build().perform();*/
	}
	
	@Test
	public void Signin_TC() throws InterruptedException{
		Thread.sleep(2000);
		Signin.pomsignin();
		Thread.sleep(2000);
	}
	/*public void Title() {
		String actual = Signin.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "amazon sign in");
	}*/
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}
