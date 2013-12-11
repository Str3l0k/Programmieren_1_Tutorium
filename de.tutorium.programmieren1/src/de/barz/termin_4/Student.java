package de.barz.termin_4;

public class Student {
	
	private String name;
	private String vorname;
	private String studienGang;
	
	private int matrikelnummer;
	
	//Constructor
	public Student() {
		this.name    = "Mustermann";
		this.vorname = "Max";
		this.studienGang    = "Informatik";
		this.matrikelnummer = 123456;
	}
	
	public Student(String name, String vorname, String studienGang, int mtnr) {
		this.name = name;
		this.vorname = vorname;
		this.studienGang = studienGang;
		this.matrikelnummer = mtnr;
	}
	
	// Getter and setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getStudienGang() {
		return studienGang;
	}

	public void setStudienGang(String studienGang) {
		this.studienGang = studienGang;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		if(matrikelnummer > 0)
			this.matrikelnummer = matrikelnummer;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nVorname: " + vorname + "\nNr." + matrikelnummer;
	}
}
