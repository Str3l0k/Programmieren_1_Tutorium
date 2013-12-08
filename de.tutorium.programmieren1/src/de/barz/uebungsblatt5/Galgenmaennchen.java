package de.barz.uebungsblatt5;

import java.util.Scanner;

public class Galgenmaennchen {

	//=============================================
	// Strings
	//=============================================
	private static String[] mWords = { "Programmiersprache" };
	
	private static char[] mWord;
	private static char[] mPlayerStatus;
	
	//=============================================
	// Variables
	//=============================================
	private static int mCounter = 1;
	private static int mMaxTrys = 15;
	
	//=============================================
	// Input 
	//=============================================
	private static Scanner mScanner;

	//=============================================
	// Main
	//=============================================	
	public static void main(String[] args) {
		initialise();
		
		while(mCounter <= mMaxTrys) {
			System.out.print(mCounter + ".Versuch: ");
			outputCharArray(mPlayerStatus);
			char input = readChar();
			checkIfCharIsPresent(input);
			if(playerHasWon())
				break;
		}
		
		if(mCounter < mMaxTrys) 
			System.out.println("Herzlichen Glueckwunsch!");	
		else
			System.out.println("Leider verloren!");		
		
		System.out.println("Das Wort lautet: ");
		outputCharArray(mWord);
	}
	
	// Input initialisieren und Spieler status fuellen
	public static void initialise() {
		mScanner = new Scanner(System.in);
		
		// Zufaelliges wort waehlen
		int a = (int) (Math.random() * mWords.length);
				
		// Status und aktuelles wort array initialisieren
		mPlayerStatus = new char[mWords[a].length()];
				
		// Status mit dummys fuellen
		for (int i = 0; i < mPlayerStatus.length; i++) {			
			mPlayerStatus[i] = '_';
		}
		
		// gewähltes Wort in char array umwandeln
		mWord = mWords[a].toCharArray();
	}
	
	// Aktuellen Status ausgeben
	public static void outputCharArray(char[] c) {		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}		
		System.out.println("\n");
	}
	
	// Buchstabe einlesen
	public static char readChar() {
		System.out.println("Bitte Buchstabe eingeben:");
		
		String temp = null;
		
		while(true) {
			temp = mScanner.nextLine();
			// Überprüfung ob min ein Buchstabe eingegeben wurde
			try {
				temp.charAt(0);
				break;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Bitte Buchstaben eingeben!");
			}
		}
		
		// Versuch hochzaehlen
		mCounter++;
		
		// Eingabe zurückgeben
		return temp.charAt(0);
	}
	
	// Ueberpruefe char und trage in Ergebnis ein
	public static void checkIfCharIsPresent(char c) {
		for (int i = 0; i < mWord.length; i++) {
			// Wenn buchstabe uebereinstimmt (gross,klein)
			if(mWord[i] == c || mWord[i] == (c + 32) || mWord[i] == (c - 32))
				mPlayerStatus[i] = c;
		}
	}
	
	// Ueberpruefe ob alle Buchstaben gefunden sind
	public static boolean playerHasWon() {
		for (int i = 0; i < mPlayerStatus.length; i++) {
			// Falls noch ein dummy enthalten nicht fertig
			if(mPlayerStatus[i] == '_')
				return false;
		}
		
		return true;
	}
}
