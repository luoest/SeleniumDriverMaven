package pages.member;

import org.openqa.selenium.By;

import base.Page;

public class MemberCenter extends Page{
	
	public ChangeInfo memberCenter() {
		driver.findElement(By.linkText("��Ա����")).click();
		return new ChangeInfo();
	}
	

}
