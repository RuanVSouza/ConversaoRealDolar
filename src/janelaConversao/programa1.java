package janelaConversao;

import java.util.Locale;
import java.util.Scanner;

import entidades.CurrencyConverter;


public class programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual o preço do dolar? ");
		CurrencyConverter.dollar = sc.nextDouble();
		
		System.out.println("Quantos dolares serão compraods?");
		CurrencyConverter.quantify = sc.nextDouble();
		
		System.out.printf("Valor a ser pago em reais: %.2f%n" , CurrencyConverter.transform() );
		
		

		sc.close();
	}

}
