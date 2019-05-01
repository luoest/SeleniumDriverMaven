package rough;

import pages.HomePage;
import pages.LoginPage;
import pages.member.ChangeInfo;
import pages.member.MemberCenter;
import pages.member.newinfo.AddNewInfo;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage home = new HomePage();
		LoginPage lPage = home.gotoLoginPage();
		MemberCenter mCenter = lPage.login("gotIt", "gotIt123", "请点击这里");
		ChangeInfo cInfo = mCenter.memberCenter();
		AddNewInfo aInfo = cInfo.changeInfo();
		aInfo.newMsn("hotmail.com");
		aInfo.newQQ("56789");
		aInfo.newName("小李");

	}

}
