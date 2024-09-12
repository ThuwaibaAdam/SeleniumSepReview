 package test_TutorialsNinja;

import org.testng.annotations.Test;

import base.tutorialsNinja.BasePage;
import tutorialsNinja.Homepage;

public class TestItemListingPage extends BasePage{
	
	@Test
	public void testAddItemToCart() {

		Homepage homepage = new Homepage();
		String searchTerm = "hp";
		homepage.doSearch(searchTerm);
		

	}
	
	
}
