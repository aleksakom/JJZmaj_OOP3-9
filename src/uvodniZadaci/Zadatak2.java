package uvodniZadaci;

public class Zadatak2 {

	public static void main(String[] args) {
		// Napisati program koji će racunati faktorijel broja 5.
		int number = 5;
		int factoriel = 1;

		while (number > 0) {
			factoriel = factoriel * number; // 5*4*3*2*1
			number--;

		}
		System.out.println("Faktorijel broja 5 je: " + factoriel);

	}

}
