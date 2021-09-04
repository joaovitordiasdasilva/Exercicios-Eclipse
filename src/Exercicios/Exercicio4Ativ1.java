package Exercicios;

import java.util.Scanner;

public class Exercicio4Ativ1 {

	public static void main(String[] args) {
		
		double a, b, c, D, R, S;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de B ");
		b = ler.nextDouble();
		System.out.println("Digite o valor de C ");
		c = ler.nextDouble();
		
		R = (a + b) * (a + b);
		S = (b + c) * (b + c);
		D = (R + S) / 2;
		
		System.out.println("Seu resultado é: "+ D);
		
		ler.close();

	}

}