package Exercicios;

import java.util.Scanner;

public class Exercicios6Ativ1 {
	
public static void main(String[] args) {
		
		double x1, x2, y1, y2, p1, p2, resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota ");
		x1 = ler.nextDouble();
		System.out.println("Digite o valor da segunda nota ");
		x2 = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		y1 = ler.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		y2 = ler.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		resultado = Math.sqrt(p1 +p2);
				
		System.out.println("Sua Media é: "+ resultado);
		
		ler.close();

	}

}