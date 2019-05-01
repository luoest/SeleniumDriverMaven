package testcases;

import org.testng.annotations.AfterSuite;

import base.Page;

public class BaseTest extends Page{

	@AfterSuite
	public static void quit() {
		Page.quit();
	}
}
