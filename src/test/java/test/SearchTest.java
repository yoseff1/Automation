package test;

//importamos los drivers
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SearchTest {
	/*@Test //se usa para traer el anotations
	public void testSearchWithResults() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver(); // elijo el explorador
		driver.navigate().to("http://automationpractice.com/index.php"); //ubicacion
		driver.findElement(By.id("search_query_top")).sendKeys("dress"); //empiezo a seleccionar acciones
		driver.findElement(By.name("submit_search")).click();
		String titleText = driver.findElement(By.className("lighter")).getText();//creo un metodo para la deficion de texto
		Assert.assertTrue(titleText.contains("DRESS"), "Expected to contain DRESS but not found");//condicion de exito validando por booleano
		driver.close();
		
	}
	@Test
	public void testSearchWithoutResult() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver(); // elijo el explorador
		driver.navigate().to("http://automationpractice.com/index.php"); //ubicacion
		driver.findElement(By.id("search_query_top")).sendKeys("hola mundo");
		driver.findElement(By.name("submit_search")).click();
		String errorText = driver.findElement(By.xpath("//*[@id=\'center_column\']/p")).getText();
		Assert.assertTrue(errorText.contains("No results"), "Expected to contain no results text");
		driver.close();	
	}*/
	@Test
	public void testSearchWithResults() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\'block_top_menu\']/ul/li[3]/a")).click();
		String titleText = driver.findElement(By.className("cat-name")).getText();
		Assert.assertTrue(titleText.contains("T-SHIRTS"), "Expected to contain T-SHIRTS but not found");
		driver.close();
	}
}
