package de.barz.termin_15_Jan_14;

public class Festplatte {

	private String typ;
	private long seriennr;
	
	private int kapazitaet;
	private int umdrehung;
	
	private double preis;
	
	private static long lfdSeriennr = 29012008;
	
	public Festplatte() {
		this.seriennr = lfdSeriennr;
		lfdSeriennr += 10;
	}
	
	public Festplatte(String typ, int kapazitaet, int umdrehung, double preis) {
		this();
		
		if(kapazitaet > 20 && umdrehung > 5000 && preis >= 0) {
			this.typ = typ;
			this.kapazitaet = kapazitaet;
			this.umdrehung = umdrehung;
			this.preis = preis;
		} else {
			this.typ = "--- kein Name ---";
			this.kapazitaet = 500;
			this.umdrehung = 7200;
			this.preis = 90.0;
		}
	}
	
	public void setPreis(double p) {
		if(p >= 0)
			preis = p;
	}
	
	public double getPreis() {
		return preis;
	}

	public String getTyp() {
		return typ;
	}

	public long getSeriennr() {
		return seriennr;
	}

	public int getKapazitaet() {
		return kapazitaet;
	}

	public int getUmdrehung() {
		return umdrehung;
	}

	public String getType() {
		return typ;
	}
	
	public long getSerienNr() {
		return seriennr;
	}
	
	public double getBruttoPreis() {
		return preis * (1 + 19f / 100f);
	}
	
	
}
