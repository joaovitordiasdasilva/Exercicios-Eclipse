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
		System.out.println("Seu numero é par e o resultado da raiz é: " + raiz);
		}
		if(numero % 2 == 1) {
		elevado = Math.pow(numero, 2);	
		System.out.println("Seu numero é impar e o resultado da potencia é: " + elevado);
		}
		ler.close();
	}
 }	

