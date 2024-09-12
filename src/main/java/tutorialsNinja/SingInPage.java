package tutorialsNinja;

import org.openqa.selenium.support.PageFactory;

import base.tutorialsNinja.BasePage;

public class SingInPage extends BasePage {

	public SingInPage() {
		PageFactory.initElements(driver, this);
	}
}
