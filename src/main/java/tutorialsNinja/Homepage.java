package tutorialsNinja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.tutorialsNinja.BasePage;

public class Homepage extends BasePage{

	
	@FindBy (xpath = "//input[@name = 'search']")
	public WebElement searchBar;
	
	@FindBy (css = "button.btn.btn-default.btn-lg")
	public WebElement searchButton;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public SearchResultPage doSearch(String searchTerm) {
		typeOnSearchBar(searchTerm);
		clickOnSearchButton();
		return new SearchResultPage();
	}
	public void typeOnSearchBar(String text) {
		searchBar.sendKeys(text);
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
}
