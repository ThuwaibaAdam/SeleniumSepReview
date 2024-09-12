 package tutorialsNinja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.tutorialsNinja.BasePage;

public class ItemListingPage extends BasePage{
	
	@FindBy (xpath = "//input[@id = 'input-quantity']")
	public WebElement quantityBar;
	
	@FindBy (xpath = "//button[@id = 'button-cart']")
	public WebElement addToCartButton;
	
	@FindBy (xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	public WebElement successMessage;
	public ItemListingPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAddToCartButton() {
		addToCartButton.click();
	}
	
	public String getSuccessMessage() {
		return successMessage.getText();
	}
	
	public String getQuantityBarValue() {
		return quantityBar.getText();
	}
}
