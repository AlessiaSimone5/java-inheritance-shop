package org.shop.java;

public class Cuffie extends Prodotto {
	String colore;
	boolean wireless;

	public Cuffie(String nome, String marca, int codice, float prezzo, double iva, String colore, boolean wireless) {
		super(nome, marca, codice, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
    public String toString() {
        return "Cuffie{" +
                "colore='" + colore + '\'' +
                ", wireless=" + wireless +
                "} " + super.toString();
    }
}
