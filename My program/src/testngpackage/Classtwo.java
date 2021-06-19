package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Classtwo {
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");

	}

	@Test(priority = 1, description = "this method is for login purpose")
	public void testone() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}

	@Test(priority = 2, dependsOnMethods = { "testone" })
	public void testtwo() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}

	@Test(priority = 3, groups = "mine")
	public void testhree() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}

	@Test(priority = 4, groups = "mine")
	public void testfour() {
		System.out.println("third page");
	}

}
