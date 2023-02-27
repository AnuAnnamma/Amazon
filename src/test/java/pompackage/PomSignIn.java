package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseAmazonClass;

public class PomSignIn extends BaseAmazonClass{

	//Object Repository
		@FindBy(id="ap_email")
		WebElement email;
		@FindBy(id="continue")
		WebElement Continue_button;
		@FindBy(id="ap_password")
		WebElement password;
		@FindBy(id="signInSubmit")
		WebElement Sign_In_button;

	//intiaite page elements
		public PomSignIn() {
			
			PageFactory.initElements(driver, this);
		}
		
		/*public void typeemail(String e_mail) {
			email.sendKeys(e_mail);
		}
		
		public void clickbtn_continue() {
			Continue_button.click();
		}
		public void typepassword(String pass) {
			password.sendKeys(pass);
		}
		public void clickbtn_signin() {
			Sign_In_button.click();
		}
		public String verify() {
			return driver.getTitle();
		}*/
		public void pomsignin() {
			email.sendKeys("anu.joseph@gmail.com");
			Continue_button.click();
			password.sendKeys("anu1987@");
			Sign_In_button.click();
		}
		
}
