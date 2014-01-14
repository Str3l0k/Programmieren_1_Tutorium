package de.barz.termin_8_Jan_14;

public class Temperaturumwandlung {

	public static void main(String[] args) {

		// Fahrenheit werte vorbereiten
		int[] fahrenheit = new int[301];

		// Mit Werten von 0-300 vorbelegen
		for (int i = 0; i < fahrenheit.length; i++) {
			fahrenheit[i] = i;
		}

		// Werte für celsius vorbereiten
		double[] celsius = new double[fahrenheit.length];

		// Ueberschriftenzeile ausgeben
		System.out.println("Fahrenheit" + "\t\t" + "Celsius");

		// Celsius Werte berechnen
		for (int i = 0; i < celsius.length; i++) {
			celsius[i] = (5.0f / 9.0f) * (fahrenheit[i] - 32.0f);
		}

		// Werte mit 3 Tabulator ausgeben
		for (int i = 0; i < fahrenheit.length; i++) {
			System.out.println(fahrenheit[i] + "\t\t\t" + celsius[i]);
		}
	}
}