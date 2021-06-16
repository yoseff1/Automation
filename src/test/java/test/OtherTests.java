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
		Assert.assertTrue(a+b == 25); // lo que esta contenido dentro es true, si no se cumple, falla la prueba
		
	}
	@Test
	public void testFalse() {
		int a = 15;
		int b = 5;
		Assert.assertFalse(a%b==1); // lo que esta contenido dentro es false, si no se cumple, falla la prueba
	}
	@Test
	public void testEquals() {
		int a = 5;
		int b = 10;
		Assert.assertEquals(a, b/2); // lo que esta contenido dentro debe ser igual, si no se cumple, falla la prueba
	}
	@Test
	public void testStringEquasls() {
		String a = "Hola";
		Assert.assertEquals(a, "Hola");
	}
	@Test
	public void testBooleanEquals()	{
		boolean a = false;
		Assert.assertEquals(a, false);
	}
	@Test
	public void testNumericEquals()	{
		Assert.assertEquals(10*2+20, 80/2);
	}
	@Test
	public void notEquals() {
		Assert.assertNotEquals(20, 21);
	}
}
