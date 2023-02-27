package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseAmazonClass;

public class PomSearch extends BaseAmazonClass{
	@FindBy(id="searchDropdownBox")
	Select departmentselectbox;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtext;
	@FindBy(id="nav-search-submit-button")
	WebElement submit;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/span/div/div/div")
	WebElement SearchResult;



public PomSearch() {
	PageFactory.initElements(driver, this);
}

public void search(String department, String content) {
    departmentselectbox.deselectByVisibleText(department);
    //searchtext.sendKeys(content);
    
   // this.clickAndToPage(submit, SearchResultPage.class);
}

public void typesearchtext(String search_type) {
	searchtext.sendKeys(search_type);
}

public void clickbtn_submit() {
	submit.click();
}

public void SearchResult() {
	SearchResult.isDisplayed();
}

public void pomsearch() {
	departmentselectbox.deselectByVisibleText("Baby");
	searchtext.sendKeys("diaper");
	submit.click();
	SearchResult.isDisplayed();
}

}