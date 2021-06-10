package extras;

public class Waiter {
	/**
	 * this is for a timer 
	 * @param mills define how secs will have to wait
	 */
	public static void waitForPage (int mills) {
		try {
			Thread.sleep(mills);//añade tiempo de espera, miles significa segs
		} catch (InterruptedException e) {// si atrapa el error muestrame algo
			e.printStackTrace();
			System.out.println("Hubo una interrupcion");
		}
	}
}
