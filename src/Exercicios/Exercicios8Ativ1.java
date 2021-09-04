package Exercicios;

import java.util.Scanner;

public class Exercicios8Ativ1 {

	public static void main(String[] args) {
		
		double custoFabrica, custoConsumidor;
		
		 Scanner ler = new Scanner(System.in);
		 System.out.println("Digite o valor do custo de fábrica: ");
			custoFabrica = ler.nextDouble();
		
		
		custoFabrica = custoFabrica + (custoFabrica * 0.28);
		custoConsumidor = custoFabrica + (custoFabrica * 0.48);
		
		System.out.println("O custo ao consumidor é: " + custoConsumidor);
		
		ler.close();
		} 
}
