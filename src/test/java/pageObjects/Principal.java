package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Principal {
	//private String searchBox = "search_query_top";
	//private String searchButton = "submit_search";
	private By searchBox;
	private By searchButton;
	private By textBox;
	private By password;
	private By loginButton;
	private WebDriver driver;
	public Principal(WebDriver driver) {
		this.driver = driver;
		searchBox = By.id("search_query_top");
		searchButton = By.name("submit_search");
		textBox = By.id("userName");
		password = By.id("password");
		loginButton = By.className("btn-inicioSesion");
		//es mas facil cambiar un locator en el constructor y que cambie todos los metodos que dependen de el
	}
	public void search (String searchParameter) {
		driver.findElement(searchBox).sendKeys(searchParameter);
		driver.findElement(searchButton).click();
	}
	public void login (String login) {
		driver.findElement(textBox).sendKeys(login);
		
	}
	public void pass (String pass) {
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		
	}

}
