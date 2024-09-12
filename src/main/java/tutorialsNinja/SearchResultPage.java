package tutorialsNinja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.tutorialsNinja.BasePage;
import test_TutorialsNinja.TestItemListingPage;

public class SearchResultPage extends BasePage{

	@FindBy(partialLinkText = "HP LP3065")
	public WebElement searchTerm;
	
	@FindBy (partialLinkText = "HP LP3065")
	public WebElement firstSearchResult;

	public SearchResultPage() {

		PageFactory.initElements(driver, this);
	}

	public TestItemListingPage clickFirstSearchResut() {
		firstSearchResult.click();
		return new TestItemListingPage();
	}
	
	public String getSearchTerm() {
		return searchTerm.getText().toLowerCase();
	}
}
