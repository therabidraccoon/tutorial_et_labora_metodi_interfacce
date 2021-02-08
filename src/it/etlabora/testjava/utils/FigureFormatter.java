package it.etlabora.testjava.utils;

import it.etlabora.testjava.figure.IFigura;
import it.etlabora.testjava.figure.impl.Quadrato;

public class FigureFormatter {

//	public static void descriviPerimetroFigura(int perimetro, int lato) {
//		System.out.println("Il perimetro della figura con lato lungo: " + lato + " è :" + perimetro);
//	}

	
//	public static void descriviPerimetroFigura(Quadrato figura) {
//		System.out.println("Il perimetro della figura è :" + figura.calcolaPerimetro());
//	}
//	
//	public static void descriviPerimetroFigura(TriangoloEquilatero figura) {
//		System.out.println("Il perimetro della figura è :" + figura.calcolaPerimetro());
//	}
//	
//	public static void descriviPerimetroFigura(Cerchio figura) {
//		System.out.println("Il perimetro della figura è :" + figura.calcolaPerimetro());
//	}
	
	public static void descriviPerimetroFigura(IFigura figura) {
		System.out.println("Il perimetro della figura è :" + figura.calcolaPerimetro());
	}
	
	public static void descriviAreaFigura(Quadrato figura) {
		System.out.println("L'area della figura è :" + figura.calcolaArea());
	}
}
