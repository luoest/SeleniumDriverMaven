package pages.member;

import org.openqa.selenium.By;

import base.Page;
import pages.member.newinfo.AddNewInfo;

public class ChangeInfo extends Page{

	public AddNewInfo changeInfo() {
		driver.findElement(By.linkText("�޸�����")).click();
		return new AddNewInfo();
	}
}
