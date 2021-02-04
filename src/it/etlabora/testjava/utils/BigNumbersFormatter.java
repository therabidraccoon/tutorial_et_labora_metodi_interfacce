package it.etlabora.testjava.utils;

public class BigNumbersFormatter {
	
	public static String convertBigNumbers(int numero) {
		String ret = null;
		if(numero > 1000000) {
			ret = numero / 1000000 + "M DMG";
		} else {
			ret = numero + " DMG";
		}
		return ret;
	}

}
