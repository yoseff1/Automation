package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Principal {
	//private String searchBox = "search_query_top";
	//private String searchButton = "submit_search";
	private By searchBox;
	private By searchButton;
	private WebDriver driver;
	public Principal(WebDriver driver) {
		this.driver = driver;
		searchBox = By.id("search_query_top");
		searchButton = By.name("submit_search"); 
		//es mas facil cambiar un locator en el constructor y que cambie todos los metodos que dependen de el
	}
	public void search (String searchParameter) {
		driver.findElement(searchBox).sendKeys(searchParameter);
		driver.findElement(searchButton).click();
	}

}
