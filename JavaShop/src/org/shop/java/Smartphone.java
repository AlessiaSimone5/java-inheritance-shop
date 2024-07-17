package org.shop.java;

public class Smartphone extends Prodotto {
	private double codiceImei;
	private int memoria;
	
	public Smartphone(String nome, String marca, int codice, float prezzo, double iva, double codiceImei, int memoria) {

		super(nome, marca, codice, prezzo, iva);
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}

	public double getCodiceImei() {
		return this.codiceImei;
	}
	public void setCodiceImei(double codiceImei) {
		this.codiceImei = codiceImei;		
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
    public String toString() {
        return "Smartphone{" +
                "codice imei='" + codiceImei + '\'' +
                ", memoria=" + memoria +
                "} " + super.toString();
    }
}
	

