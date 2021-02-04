package it.etlabora.testjava;

import it.etlabora.testjava.figure.IFigura;
import it.etlabora.testjava.figure.impl.Quadrato;
import it.etlabora.testjava.figure.impl.Triangolo;
import it.etlabora.testjava.utils.FigureFormatter;

public class AppMain {

	public static void main(String[] args) {

		Quadrato q = new Quadrato();
		q.setLunghezzaLato(5);

		Quadrato altroQuad = new Quadrato();
		altroQuad.setLunghezzaLato(10);
		
		Triangolo t = new Triangolo();
		t.setLunghezzaLato(3);
		
		IFigura figura = new Triangolo();
		figura.calcolaPerimetro();
		
//		int perimetroPrimoQuad = q.calcolaPerimetro();
//		FigureFormatter.descriviPerimetroFigura(perimetroPrimoQuad, q.getLunghezzaLato());
//		FigureFormatter.descriviPerimetroFigura(q);
		
		FigureFormatter.descriviPerimetroFigura(q);
		FigureFormatter.descriviPerimetroFigura(t);
		
		
	}

}
