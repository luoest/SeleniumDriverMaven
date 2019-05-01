package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.member.MemberCenter;
import utilities.TestUtil;

public class TestLogin extends BaseTest{
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void testLogin(Hashtable<String, String> data) {
		HomePage home = new HomePage();
		LoginPage lPage = home.gotoLoginPage();
		MemberCenter mCenter = lPage.login(data.get("username"), data.get("password"), data.get("jump"));
	}

}
