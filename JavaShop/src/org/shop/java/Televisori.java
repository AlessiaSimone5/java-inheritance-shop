package org.shop.java;

public class Televisori extends Prodotto {
	String dimensioni;
	boolean smart;

	public Televisori(String nome, String marca, int codice, float prezzo, double iva, String dimensioni, boolean smart) {
		super(nome, marca, codice, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	
	}

	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
    public String toString() {
        return "Televisori{" +
                "dimensioni=" + dimensioni +
                ", smart=" + smart +
                "} " + super.toString();
    }
}
