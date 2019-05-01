package pages;

import org.openqa.selenium.By;

import base.Page;
import pages.member.MemberCenter;

public class LoginPage extends Page{

	public MemberCenter login(String usn, String psw, String jump) {
		sendKeys("usn_XPATH", usn);
		sendKeys("psw_CSS", psw);
		click("sbm_NAME");
		
		By jumpLoc = By.partialLinkText(jump);
		driver.findElement(jumpLoc).click();
		
		return new MemberCenter();
	}
}
