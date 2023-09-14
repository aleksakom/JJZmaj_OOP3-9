package uvodniZadaci;

public class Zadatak3 {

	public static void main(String[] args) {
		// Ispisati uz pomoc FOR petlje neparne brojeve od 1 do 10.
		int[] array = new int[10]; // deklaracija niza koji ukupno ima deset elemenata
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		array[5] = 6;
		array[6] = 7;
		array[7] = 8;
		array[8] = 9;
		array[9] = 10;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i] + " je neparan broj!");
			}
		}
	}

}
