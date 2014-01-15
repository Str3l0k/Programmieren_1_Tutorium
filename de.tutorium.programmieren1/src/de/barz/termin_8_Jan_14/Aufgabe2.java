package de.barz.termin_8_Jan_14;

public class Aufgabe2 {

	// Main methode zum testen
	public static void main(String[] args) {
		System.out.println(sudoku(new int[][] { {1,2,4} , { 4,5,6}, {7,8,9}}));
	}

	// Intervall check
	public static boolean[] intervallCheck(int par1, int[][] par2) {

		// Rueckgabefeld erstellen
		boolean[] rueckgabefeld = new boolean[par2.length];

		// Testschleife
		for (int i = 0; i < par2.length; i++) {
			if (par1 >= par2[i][0] && par1 <= par2[i][1])
				rueckgabefeld[i] = true;
			else
				rueckgabefeld[i] = false;
		}

		return rueckgabefeld;
	}

	// Sudoku test
	public static boolean sudoku(int[][] feld) {
		// 1-9 durchgehen
		for (int zahl = 1; zahl <= 9; zahl++) {
			// vorbelegen, dass Zahl nicht gefunden wurde
			boolean gefunden = false;

			// Sudoku feld nach Zahl absuchen
			for (int i = 0; i < feld.length; i++) {
				for (int j = 0; j < feld[i].length; j++) {
					if (feld[i][j] == zahl)
						// Wenn Zahl gefunden entsprechend auf true setzen
						gefunden = true;
				}
				
			}
			// Falls Zahl nicht gefunden, fehlt diese Zahl und das Sudokufeld ist unvollstaendig
			if (gefunden == false)
				return false;
		}

		// Falls alle Zahlen gefunden wurde Sudokufeld vollstaendig
		return true;
	}
}
