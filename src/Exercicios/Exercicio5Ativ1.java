package Exercicios;

import java.util.Scanner;

public class Exercicio5Ativ1 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, mediaPonderada;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota ");
		nota1 = ler.nextDouble();
		System.out.println("Digite o valor da segunda nota ");
		nota2 = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		nota3 = ler.nextDouble();
		
		mediaPonderada = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10;
		
		System.out.println("Sua Media é: "+ mediaPonderada);
		
		ler.close();

	}

}