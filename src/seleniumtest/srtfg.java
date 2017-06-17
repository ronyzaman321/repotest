package seleniumtest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class srtfg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\Selenium 4th Batch\\geckodriver\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");

	}

}
