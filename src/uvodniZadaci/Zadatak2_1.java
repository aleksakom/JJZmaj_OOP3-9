package uvodniZadaci;

public class Zadatak2_1 {

	public static void main(String[] args) {
		// Obrnuti niz: int[] array = {5,4,3,2,1,0};
		int[] array = {5,4,3,2,1,0};
		
		int[] tempArray = new int[array.length]; //kreira se pomocni niz gde se smestaju obrnute vrednosti
        int j = array.length; //j uzima vrednost duzine niza
        for (int i = 0; i < array.length; i++) {
        	tempArray[j - 1] = array[i]; //bri broj iz niza ce biti poslednji u pomocnom nizu
            j = j - 1; //j se smanjuje u svakoj iteraciji kako bi se smanjio i indeks pomocnog niza
        }
 
        System.out.println("Obrnuti niz je:");
        for (int k = 0; k < array.length; k++) {
            System.out.println(tempArray[k]);
        }

	}

}
