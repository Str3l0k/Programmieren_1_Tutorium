package de.barz.termin_18_dec_13;

public class Klausur {

	private String name_ref;

	private int fachnummer;
	private int anzahlStudenten; 

	private double notenSchnitt;

	public static final int DEFAULTWERT = -1;
	public static final double DEFAULTNOTE = -1.0;

	// Constructor
	public Klausur(String name, int fnr, int anStudenten, double schnitt) {
		this.name_ref = name;
		setFachnummer(fnr);
		if (anStudenten >= 0 && anStudenten <= 500)
			this.anzahlStudenten = anStudenten;
		else
			this.anzahlStudenten = DEFAULTWERT;
		
		if(schnitt >= 1.0 && schnitt <= 5.0)
			this.notenSchnitt = schnitt;
		else 
			this.notenSchnitt = DEFAULTNOTE;
	}
	
	public int getFachnummer() {
		return fachnummer;
	}

	public void setFachnummer(int fachnummer) {
		if (fachnummer >= 10000 && fachnummer < 100000)
			this.fachnummer = fachnummer;
		else
			this.fachnummer = DEFAULTWERT;
	}

	public void setAnzahlStudenten(int anzahl) {
		if (anzahl >= 0 && anzahl <= 500)
			this.anzahlStudenten = anzahl;
	}
	
	public void setNotenSchnitt(double schnitt) {
		if(schnitt >= 1.0 && schnitt <= 5.0)
			this.notenSchnitt = schnitt;
	}
	
	public void setNotenSchnitt(double notenSumme, int anzahlStudenten) {
		double schnitt = notenSumme / anzahlStudenten;
		setNotenSchnitt(schnitt);
	}

	public boolean ueberpuefeAnzahlstudenten(int anzahl) {
		if (anzahl >= 0 && anzahl <= 500)
			return true;
		else
			return false;
	}
}
