package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Articles;
import pageObjects.Principal;

public class LoginTest {
	public WebDriver driver;
	public Principal principal;
	public Articles articles;

	@BeforeTest
	public void beforeTest() {
		System.out.println("Ejecuto antes de la prueba");
	}
		
	@AfterTest
	public void afterTest() {
		System.out.println("ejecuto luego de la prueba");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://extranet.osde.com.ar/OSDEExtranet/jsp/multiempresas/osde/HomePublicaV2.jsp");
		principal = new Principal(driver);
		articles = new Articles(driver);
		driver.manage().window().maximize();
		System.out.println("Empieza un test");
	}
	@AfterMethod
	public void afterMethod() {
		driver.close();
		driver.quit();
	}
	@Test(description = "Login ok")
	public void trueLogin() {
		principal.login("re94731266","reserv16");
		Assert.assertTrue(articles.errorlogin().contains("Selección de visualización de página principal"), "Expected to contain admin page");
	}
}
