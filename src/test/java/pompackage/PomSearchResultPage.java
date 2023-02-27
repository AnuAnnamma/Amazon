package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomSearchResultPage extends BaseAmazonClass{
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[8]/div/div/div/div/div[2]/span/a/div/img")
	WebElement Huggiesimg;
	@FindBy(xpath="//*[@id=\"size_name_1_price\"]/p[1]")
	WebElement Size;
	@FindBy(id="quantity")
	Select Qty;
	@FindBy(id="add-to-cart-button")
	WebElement addtocart_button;
	
	public PomSearchResultPage() {
		PageFactory.initElements(driver, this);
	}
public void clickbtn_Size(){
	Size.click();
}
public void Quantity(String num) {
	Qty.deselectByValue(num);
}
public void clickbtn_addtocart() {
	addtocart_button.click();
	}

public void pomSearchResultPage() {
	WebElement search = Huggiesimg;
	Actions action = new Actions(driver);
	action.moveToElement(search).perform();
	WebElement size = Size;
	action.moveToElement(size).perform();
	action.click().build().perform();
}
}
