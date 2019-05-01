package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu {
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	
	public void homePage() {
		
	}
	public void newsCenter() {
		driver.findElement(By.linkText("新闻中心")).click();
	}

}
