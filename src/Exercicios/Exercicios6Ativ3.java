package Exercicios;

import java.util.Scanner;

public class Exercicios6Ativ3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double numero = 0, soma = 0, contador = 0, media = 0;

		do {
			System.out.println("Digite o numero: ");
			numero = ler.nextDouble();

			if (numero % 3 == 0 && numero != 0) {
				soma = numero + soma;
				contador++;
				media = soma / contador;
			}
		} while (numero != 0);
		System.out.println("A média dos valores multiplos de 3: " + media);

		ler.close();
	}
}
