package de.barz.altklausur.ws_12;

public class Aufgabe_1 {

	public static void main(String[] args) {
		System.out.println(istGrossBuchstabe('T'));
		System.out.println(istGrossBuchstabe('t'));
		
		
		double[] a = { 1, 2 , 3, 4 , 5, 6};
		
		a = multipliziereFeld(a, 4);
	}
	
	public static int istGrossBuchstabe(char c) {
		if(c >= 'A' && c <= 'Z') {
			return 1;
		} else if(c >= 'a' && c <= 'z') {
			return -1;
		} else {
			return 0;
		}
	}

	public static double[] multipliziereFeld(double[] d,int a) {
		
		double[] s = new double[d.length];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = d[i] * a;
		}
		
		return s;
	}
}
