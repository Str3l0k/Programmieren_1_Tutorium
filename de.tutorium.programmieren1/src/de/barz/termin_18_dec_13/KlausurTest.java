package de.barz.termin_18_dec_13;

public class KlausurTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Klausur[] klausuren = new Klausur[100];
		
		int j = 50000;
		for (int i = 0; i < klausuren.length; i++) {
			klausuren[i] = new Klausur("KLAUSUR_2012", j, 100, 2.3);
			j += 10;
		}
		
		for (int i = 0; i < klausuren.length; i++) {
			System.out.println(klausuren[i].getFachnummer());
		}
	}

}
