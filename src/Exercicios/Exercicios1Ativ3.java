package Exercicios;

import java.util.Scanner;

public class Exercicios1Ativ3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;

		for (numero = 1000; numero <= 1999; numero++) {
			if (numero % 11 == 5) {
				System.out.println("O numero atual é: " + numero);
			}
			ler.close();
		}
	}
}
