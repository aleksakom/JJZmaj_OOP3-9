package uvodniZadaci;

public class Zadatak1_1 {

	public static void main(String[] args) {
		// Proizvoljno inicijalizovati niz i ispisati njegovu duzinu.
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int counter = 0;
		
		for (int i = 0; i < array.length; i++) { // uociti da indeksiranje u Java programskom jeziku ide od nule!
			counter++;
		}
		System.out.println(counter);
	}

}
