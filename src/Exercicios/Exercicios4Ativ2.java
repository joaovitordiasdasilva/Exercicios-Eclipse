package Exercicios;

import java.util.Scanner;

public class Exercicios4Ativ2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, raiz, elevado;
		
		System.out.println("Digite o valor: ");
		numero = ler.nextDouble();
		
		if(numero % 2 == 0) {
		raiz = Math.sqrt(numero);
		System.out.println("Seu numero � par e o resultado da raiz �: " + raiz);
		}
		if(numero % 2 == 1) {
		elevado = Math.pow(numero, 2);	
		System.out.println("Seu numero � impar e o resultado da potencia �: " + elevado);
		}
		ler.close();
	}
 }	

