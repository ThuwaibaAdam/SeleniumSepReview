package tutorialsNinja;

import org.openqa.selenium.support.PageFactory;

import base.tutorialsNinja.BasePage;

public class CreateAccountPage extends BasePage {

	
	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}
}
