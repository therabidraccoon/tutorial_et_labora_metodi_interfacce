package it.etlabora.testjava.figure.impl;

import it.etlabora.testjava.figure.IFigura;

public class Cerchio implements IFigura{
	
	private int raggio;

	@Override
	public int calcolaPerimetro() {
		double perimetro = raggio*2*Math.PI;
		return (int) perimetro;
	}

	public int getRaggio() {
		return raggio;
	}

	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}

}
