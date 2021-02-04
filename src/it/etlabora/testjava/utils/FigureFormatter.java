package it.etlabora.testjava.utils;

import it.etlabora.testjava.figure.IFigura;
import it.etlabora.testjava.figure.impl.Quadrato;
import it.etlabora.testjava.figure.impl.Triangolo;

public class FigureFormatter {

//	public static void descriviPerimetroFigura(int perimetro, int lato) {
//		System.out.println("Il perimetro della figura con lato lungo: " + lato + " è :" + perimetro);
//	}

	
//	public static void descriviPerimetroFigura(Quadrato q) {
//		System.out.println("Il perimetro della figura con lato lungo: " + q.getLunghezzaLato() + " è :" + q.calcolaPerimetro());
//	}
//	
//	public static void descriviPerimetroFigura(Triangolo q) {
//		System.out.println("Il perimetro della figura con lato lungo: " + q.getLunghezzaLato() + " è :" + q.calcolaPerimetro());
//	}
	
	public static void descriviPerimetroFigura(IFigura figura) {
		System.out.println("Il perimetro della figura con lato lungo: " + figura.getLunghezzaLato() + " è :" + figura.calcolaPerimetro());
	}
}
