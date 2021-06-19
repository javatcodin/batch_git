package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Myfirsttestng {

//annotation	commands ah vaechu how a method can be executed
	@BeforeSuite
	public void beforeclass() {
		System.out.println("beforclass");

	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");

	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");

	}

	@Test(priority = 1,enabled=false)
	public void login() {
		System.out.println("beforemethod");

	}

	@AfterMethod
	public void homepage() {
		System.out.println("aftermethod");

	}

	@Test(priority = 2)
	public void aftermethod() {
		System.out.println("aftermethod");
	}

	@Test(priority = 3)
	public void addtocart() {
		System.out.println("c");
	}

}
