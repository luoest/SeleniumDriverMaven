package pages.member.newinfo;

import base.Page;

public class AddNewInfo extends Page{
	
	public void newName(String name) {
		clear("name_NAME");
		sendKeys("name_NAME", name);
	}
	public void newQQ(String qq) {
		clear("qq_NAME");
		sendKeys("qq_NAME", qq);
	}
	public void newMsn(String msn) {
		clear("msn_NAME");
		sendKeys("msn_NAME", msn);
	}

}
