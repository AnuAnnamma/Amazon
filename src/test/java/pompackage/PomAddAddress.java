package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomAddAddress extends BaseAmazonClass {

	@FindBy(xpath="//*[@id=\"address-ui-widgets-countryCode\"]/span/span")
	Select Countrydropdown;
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement Fullname;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement Phonenumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement Address1;
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement Address2;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	WebElement City;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")
	Select Province;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement Postal;
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement Makeitdefault;
	@FindBy(xpath="//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")
	WebElement AddAddress;
	
	public PomAddAddress() {
		PageFactory.initElements(driver, this);
	}
	
	public void Country(String name) {
		Countrydropdown.deselectByVisibleText(name);
	}
	
	public void Full_name(String name) {
		Fullname.sendKeys(name);
	}
	public void Phone_number(CharSequence[] num) {
		Phonenumber.sendKeys(num);
	}
	
	public void Address1() {
		Address1.sendKeys();
	}
	public void Address2() {
		Address2.sendKeys();
	}
	public void province(String name) {
		Province.deselectByVisibleText(name);
	}
	public void postal() {
		Postal.sendKeys();
	}
	public void makedefault() {
		Makeitdefault.sendKeys();
	}
	public void Addaddress_button() {
		AddAddress.click();
	}
	
	public void pomaddaddress() {
		
	   //Countrydropdown.deselectByVisibleText(Canada);
	   
	}
}
