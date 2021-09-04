package Exercicios;

import java.util.Scanner;

public class Exercicios1Ativ2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Escreva o valor da variavel A: ");
		a = ler.nextInt();
		System.out.println("Escreva o valor da variavel B: ");
		b = ler.nextInt();
		System.out.println("Escreva o valor da variavel C: ");
		c = ler.nextInt();
		
		if(a > b && a > c) {
			System.out.println("A nota maior foi: "+ a);
		}
			else if(b > a && b > c) {
				System.out.println("A nota maior foi: "+ b);
		}
					else if(c > a && c > b) {
						System.out.println("A nota maior foi: "+ c);
		}
		ler.close();
	}
}