package test;

//mvn -Dtest=OtherTests test
//para probar una clase unicamente
import org.testng.Assert;
import org.testng.annotations.Test;

public class OtherTests {
	@Test
	public void testTrue() {
		int a = 10;
		int b = 15;
		Assert.assertTrue(a+b == 25); // lo que esta contenido dentro es true si no se cumple, falla la prueba
		
	}
	public void testFalse() {
		int a = 15;
		int b = 5;
		Assert.assertFalse(a%b==1);
	}

}
