package testcases;

import org.testng.annotations.Test;

import pages.member.ChangeInfo;
import pages.member.MemberCenter;

public class TestMemberPage {
	
	@Test
	public void testMemberPage() {
		MemberCenter mCenter = new MemberCenter();
		ChangeInfo cInfo = mCenter.memberCenter();
		cInfo.changeInfo();
		
	}

}
