package it.etlabora.testjava.figure.impl;


public class Rettangolo { //implementazione dell'interfaccia rimossa per incongruenza con le altre figure

	public static final int NUM_LATI = 4;
	private int lunghezzaLatoA;
	private int lunghezzaLatoB;
	
	public int calcolaPerimetro() {
		int perimetro = (lunghezzaLatoA*2) + (lunghezzaLatoB*2);
		return perimetro;
	}

	public int getLunghezzaLatoA() {
		return lunghezzaLatoA;
	}

	public void setLunghezzaLatoA(int lunghezzaLatoA) {
		this.lunghezzaLatoA = lunghezzaLatoA;
	}

	public int getLunghezzaLatoB() {
		return lunghezzaLatoB;
	}

	public void setLunghezzaLatoB(int lunghezzaLatoB) {
		this.lunghezzaLatoB = lunghezzaLatoB;
	}

}
