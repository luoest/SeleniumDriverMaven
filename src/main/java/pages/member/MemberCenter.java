package pages.member;

import org.openqa.selenium.By;

import base.Page;

public class MemberCenter extends Page{
	
	public ChangeInfo memberCenter() {
		driver.findElement(By.linkText("会员中心")).click();
		return new ChangeInfo();
	}
	

}
