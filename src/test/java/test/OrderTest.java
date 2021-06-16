package test;

import org.testng.annotations.Test;

import pageObjects.Base;

public class OrderTest extends Base{

	@Test(description = "This is an order by higger first",enabled=false)
	public void seachByHigherPriceTest() {
		principal.search("DRESS");
		articles.selectArticleByText("Price: Highest first");
	}

}
