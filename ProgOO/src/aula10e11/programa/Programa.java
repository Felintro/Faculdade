package aula10e11.programa;

import java.text.DateFormatSymbols;
import java.util.Arrays;

public class Programa {

	public static void main(String[] args) {
		
		String[] diasSemanaAbreviado = DateFormatSymbols.getInstance().getShortWeekdays();
		
		for (int i=1; i <= diasSemanaAbreviado.length-1; i++) {
			System.out.println(diasSemanaAbreviado[i]);
		}
		
		System.out.println(Arrays.toString(diasSemanaAbreviado));
		System.out.println(diasSemanaAbreviado[0]);
				
	}

}
