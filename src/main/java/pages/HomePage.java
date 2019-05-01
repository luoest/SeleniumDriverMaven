package pages;

import base.Page;

public class HomePage extends Page{

	public LoginPage gotoLoginPage() {
		return new LoginPage();
	}
}
