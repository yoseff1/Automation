package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import extras.Waiter;
import pageObjects.Articles;
import pageObjects.Principal;

public class OrderTest {
	private WebDriver driver;
	private Principal principal;
	private Articles articles;
	@BeforeTest // lo que aplica antes de cada test
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/");
		principal = new Principal(driver);
		articles = new Articles(driver);
	}
		
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void seachByHigherPriceTest() {
		principal.search("DRESS");
		Waiter.waitForPage(4000);
		articles.selectArticleByText("Price: Highest first");
	}

}
