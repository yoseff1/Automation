package extras;

public class Waiter {
	public static void waitForPage (int mills) {
		try {
			Thread.sleep(mills);//añade tiempo de espera, miles significa segs
		} catch (InterruptedException e) {// si atrapa el error muestrame algo
			e.printStackTrace();
			System.out.println("Hubo una interrupcion");
		}
	}
}
