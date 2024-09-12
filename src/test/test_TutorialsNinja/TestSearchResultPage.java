package test_TutorialsNinja;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.tutorialsNinja.BasePage;
import tutorialsNinja.Homepage;
import tutorialsNinja.SearchResultPage;

public class TestSearchResultPage extends BasePage {

	@Test
	public void testSearchResultTerm() {
		String searchTerm = "hp";
		Homepage home = new Homepage();
		SearchResultPage searchResults =home.doSearch(searchTerm);
		// the line above is equle to 
		// SearchResultPage searchResultPage = new SearchResultPage();
		String expectedReuslt = "HP LP3065";
		String actualResult = driver.findElement(By.partialLinkText("HP LP3065")).getText();
		
		Assert.assertEquals(searchResults.getSearchTerm(), expectedReuslt);
	}
}
