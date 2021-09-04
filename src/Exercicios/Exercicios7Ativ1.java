package Exercicios;

import java.util.Scanner;

public class Exercicios7Ativ1 {

public static void main(String[] args) {
		
		double a, b, c, d, E, f, x, y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota ");
		a = ler.nextDouble();
		System.out.println("Digite o valor da segunda nota ");
		b = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		c = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		d = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		E = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		f = ler.nextDouble();
		
		x = ((c*E) - (b*f)) / ((a*E) - (b*d));
		y = ((a*f) - (c*d)) / ((a*E) - (b*d));
		
				
		System.out.println("O valor de x é: : "+ x + " e o valor de y é: "+ y);
		
		ler.close();

	}

}