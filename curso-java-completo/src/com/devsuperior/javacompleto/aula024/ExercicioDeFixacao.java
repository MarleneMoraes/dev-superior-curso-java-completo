/*
 * Em um novo programa, inicie as seguintes vari�veis:
 * String product1 = "Computer";
 * String product2 = "Office desk";
 * 
 * int age = 30;
 * int code = 5290;
 * char gender = 'F';
 * 
 * double price1 = 2100.0;
 * double price2 = 650.50;
 * double measure = 53.234567;
 * 
 * Em seguida, usando os valores das vari�veis, produza a seguinte sa�da na tela do console:
 * 
 * Products:
 * Computer, which price is $ 2100,00
 * Office Desk, which price is $ 650,00
 * 
 * Record: 30 years old, code 5290 and gender: F
 * 
 * Measur with eight decimal places: 53,23456700
 * Rouded (three decimal places): 53,235
 * US decimal point: 53.235
 */

/**
 * @author Marlene
 * @since 2020-08-23
 */

package com.devsuperior.javacompleto.aula024;

import java.util.Locale;

public class ExercicioDeFixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		 
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		System.out.printf("Measur with eight decimal places:%f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
	}

}
