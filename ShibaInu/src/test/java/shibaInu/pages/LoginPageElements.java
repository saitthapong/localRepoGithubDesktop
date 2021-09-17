package shibaInu.pages;

import org.openqa.selenium.support.PageFactory;

import shibaInu.utilities.BaseClass;

public class LoginPageElements {

	public LoginPageElements() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
}
