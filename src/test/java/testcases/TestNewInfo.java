package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.member.newinfo.AddNewInfo;
import utilities.TestUtil;

public class TestNewInfo {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void testNewInfo(Hashtable<String, String> data) {
		AddNewInfo aInfo = new AddNewInfo();
		aInfo.newName(data.get("name"));
		aInfo.newQQ(data.get("qq"));
		aInfo.newMsn(data.get("msn"));
	}
}
