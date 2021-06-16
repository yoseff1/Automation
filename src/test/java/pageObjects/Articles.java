package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Articles {
	//private String articleBanner = "lighter";
	//private String errorBanner = "//*[@id=\'center_column\']/p";
	private By articleBanner;
	private By errorBanner;
	private By orderSelect;
	private By titleBanner;
	private WebDriver driver;
	public Articles(WebDriver driver) {
		this.driver = driver;
		articleBanner = By.className("lighter");
		errorBanner = By.xpath("//*[@id=\'center_column\']/p");
		orderSelect = By.id("selectProductSort");
		titleBanner = By.id("titulo_seleccion");
	}
	public String articleName() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(articleBanner), "asdfsdfs"));
		return driver.findElement(articleBanner).getText();
	}
	
	public String errorMessage() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(errorBanner));
		return driver.findElement(errorBanner).getText();
	}
	public void selectArticleByText(String value) {
		Select order = new Select(driver.findElement(orderSelect));
		order.selectByVisibleText(value);
	}
	public void selectArticleByIndex(int i) {
		Select order = new Select(driver.findElement(orderSelect));
		order.selectByIndex(i);
	}
	public void selectArticleByValue(String value) {
		Select order = new Select(driver.findElement(orderSelect));
		order.deselectByValue(value);
	}
	public String errorlogin() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(titleBanner));
		return driver.findElement(titleBanner).getText();
	}
}
