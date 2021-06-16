package test;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Base;

public class SearchTest extends Base{ // aqui va todo lo que aplica a la prueba una unica vez
		
	@Test(description = "This is a search with results WIP",enabled=false)//esto inhabilita una prueba work in progress
	public void testSearchWithResult() {
		principal.search("dress");
		Assert.assertTrue(articles.articleName().contains("DRESS"),"Expected to contain DRESS but not found");
	}
	
	@Test(description = "This is a search with not results",enabled=false)
	public void testSearchWithoutResult() {
		principal.search("hola mundo");
		Assert.assertTrue(articles.errorMessage().contains("No results"), "Expected to contain no results text");
	}

	
	
}
