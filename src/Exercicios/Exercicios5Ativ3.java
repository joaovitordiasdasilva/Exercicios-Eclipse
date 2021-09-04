package Exercicios;

import java.util.Scanner;

public class Exercicios5Ativ3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 0, soma = 0;

		do {
			System.out.println("Digite o numero: ");
			numero = ler.nextInt();
			soma = numero + soma;
		} while (numero != 0);
		System.out.println("A soma dos valores é: " + soma);

		ler.close();
	}
}
