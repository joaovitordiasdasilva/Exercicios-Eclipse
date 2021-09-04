package Exercicios;

import java.util.Scanner;

public class Exercicios2Ativ3 {

	public static void main(String[] args) {

		int numero, par = 0, impar = 0;

		Scanner ler = new Scanner(System.in);

		for (numero = 0; numero <= 10; numero++) {
			if (numero % 2 == 0) {
				par++;
				System.out.println("O numero par foi apresentado: " + par + " vezes.");
			} else {
				impar++;
				System.out.println("O numero impar foi apresentado: " + impar + " vezes.");
			}
			ler.close();
		}
	}
}
