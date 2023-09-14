package uvodniZadaci;

public class Zadatak1 {

	public static void main(String[] args) {
		// jednolinijski komentar
		/*
		 * viselinijski komentar
		 */

		/*
		 * Proizvoljno inicijalizovati niz koji je tipa integer i postaviti vrednosti.
		 * Proveriti za svaki broj iz niza da li je paran ili neparan i to ispisati.
		 */
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // inicijaliyacija niza
		for (int i = 0; i < array.length; i++) { // postavljanje for petlje, koristi se predefinisana funkcija length
													// koja vraca broj elemenata
			if (array[i] % 2 == 0) { // % predstavlja ostatak pri deljenju
				System.out.println(array[i] + " je paran broj!"); // ispisuje u konzoli; + omogucava konkatenaciju (spajanje)
			} else {
				System.out.println(array[i] + " je neparan broj!");
			}
		}

	}

}
