package uvodniZadaci;

public class Zadatak3_1 {

	public static void main(String[] args) {
		// Pronaci ukupan broj elemenata koji su deljivi sa 3 i 6. Niz proizvoljno
		// inicijalizovati.
		int[] array = { 5, 4, 3, 2, 1, 6, 18 };
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0 && array[i] % 6 == 0) {
				counter++;
			}
		}
		System.out.println("Ukupan broj elemenata koji su deljivi sa 3 i 6 je: " + counter);
	}

}
