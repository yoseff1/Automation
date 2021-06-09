package test;



//importamos los drivers
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import extras.Waiter;
import pageObjects.Articles;
import pageObjects.Principal;

public class SearchTest { // aqui va todo lo que aplica a la prueba una unica vez
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
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Empieza un test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Finaliza el test");
	}
	
	@Test
	public void testSearchWithResult() {
		principal.search("dress");
		Waiter.waitForPage(4000);
		Assert.assertTrue(articles.articleName().contains("DRESS"),"Expected to contain DRESS but not found");
	}
	
	@Test
	public void testSearchWithoutResult() {
		principal.search("hola mundo");
		Waiter.waitForPage(4000);
		Assert.assertTrue(articles.errorMessage().contains("No results"), "Expected to contain no results text");
	}

	
	
}
