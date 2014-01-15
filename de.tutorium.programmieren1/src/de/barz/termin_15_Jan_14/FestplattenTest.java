package de.barz.termin_15_Jan_14;

public class FestplattenTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Festplatte[] festplatten = new Festplatte[1000];
		
		for (int i = 0; i < festplatten.length; i++) {
			festplatten[i] = new Festplatte("FH-DIGITAL", 734, 8500, 85.75);
		}
		
		System.out.println(gesamtKapazitaet(festplatten));
	}
	
	public static long gesamtKapazitaet(Festplatte[] f) {
		long sum  = 0;
		for (int i = 0; i < f.length; i++) {
			sum += f[i].getKapazitaet();
		}
		
		return sum;
	}
}
