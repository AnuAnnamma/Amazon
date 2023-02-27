package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomAddtocart extends BaseAmazonClass {
@FindBy(xpath="//*[@id=\"sw-gtc\"]/span/a")
WebElement Gotocartbutton;
@FindBy(xpath="//*[@id=\"a-autoid-6-announce\"]/span[2]")
Select Qty;
@FindBy(name="proceedToRetailCheckout")
WebElement Proceedtocheckout;

public PomAddtocart() {
	
	PageFactory.initElements(driver, this);
}

public void GoTO_button() {
	Gotocartbutton.click();
}

public void Quantity(String num) {
	Qty.deselectByVisibleText(num);
}

public void proceedcheckout_button() {
	Proceedtocheckout.click();
}

public void pomaddtocart() {
	WebElement Gotocart = Gotocartbutton ;
	Actions action = new Actions(driver);
	action.moveToElement(Gotocart).perform();
	WebElement Proceedcart = Proceedtocheckout;
	@SuppressWarnings("unused")
	Actions action1 = new Actions(driver);
	action.moveToElement(Proceedcart).perform();
	action.click().perform();
	
}
}
