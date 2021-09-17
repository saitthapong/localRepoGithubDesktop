package shibaInu.utilities;

import shibaInu.pages.LandingPageElements;
import shibaInu.pages.LoginPageElements;

public class PageInitializer {

	public static LoginPageElements login;
	public static LandingPageElements landing;
	
	public static void init() {
		login= new LoginPageElements();
		landing= new LandingPageElements();
	}
}
