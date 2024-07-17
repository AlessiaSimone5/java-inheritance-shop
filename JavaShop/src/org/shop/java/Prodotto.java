package org.shop.java;

public class Prodotto {
    
	private int codice;
	String nome;
	String marca;
	float prezzo;
	double iva;
	
	public Prodotto (String nome, String marca, int codice, float prezzo, double iva) {
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	public int getCodice() {
		return this.codice;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double prezzoConIva () {
		return prezzo += (prezzo * iva /100);
	}
	
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }
	
}
