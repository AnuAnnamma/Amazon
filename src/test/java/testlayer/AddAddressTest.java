package testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseAmazonClass;
import pompackage.PomAddAddress;

public class AddAddressTest extends BaseAmazonClass{
		PomAddAddress Search;


			public AddAddressTest() {
				super();
			}
			@BeforeMethod
			public void initsetup() {
				initiate();
				WebElement hellosignin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
				Actions action = new Actions(driver);
				action.moveToElement(hellosignin).perform();
				WebElement signin = driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
				action.moveToElement(signin).perform();
				action.click().build().perform();
				
				Search = new PomAddAddress();
				
			}
			
			@Test
			public void Signin_TC() throws InterruptedException{
				Thread.sleep(2000);
				Search.pomaddaddress();
				Thread.sleep(2000);
			}
			
			@AfterMethod
			public void close() {
				driver.close();
			}
		}

	



