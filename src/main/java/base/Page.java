package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilities.ExcelReader;

public class Page {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fils;
	public static TopMenu menu;
	public static ExcelReader excel = new ExcelReader("D:\\JAVA_workspace\\First\\src\\test\\resources\\excel\\testdata.xlsx");
	
	public Page() {
		if (driver == null) {
			try {
				fils = new FileInputStream("D:\\JAVA_workspace\\First\\src\\test\\resources\\properties\\config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				config.load(fils);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fils = new FileInputStream("D:\\JAVA_workspace\\First\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				OR.load(fils);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (config.getProperty("browser").equals("chrome")) {
				driver = new ChromeDriver();
			}else if (config.getProperty("browser").equals("firefox")) {
				driver = new FirefoxDriver();
			}else if (config.getProperty("browser").equals("ie")) {
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(config.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			menu = new TopMenu(driver);
		}
		
	}
	public void sendKeys(String locator, String value) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
		}else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
		}else if (locator.endsWith("_NAME")) {
			driver.findElement(By.name(OR.getProperty(locator))).sendKeys(value);
		}
	}
	public void click(String locator) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
		}else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}else if (locator.endsWith("_NAME")) {
			driver.findElement(By.name(OR.getProperty(locator))).click();
		}
	}
	public void clear(String locator) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).clear();
		}else if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).clear();
		}else if (locator.endsWith("_NAME")) {
			driver.findElement(By.name(OR.getProperty(locator))).clear();
		}
	}
	public static void quit() {
		driver.quit();
	}

}
