package Exercicios;

import java.util.Scanner;

public class Exercicios3Ativ3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade = 0, adulto = 0, menopausa = 0;

		while (idade != -99) {
			System.out.println("Digite a sua idade: ");
			idade = ler.nextInt();

			if (idade > 0 && idade <= 21) {
				adulto++;
			} else if (idade >= 50) {
				menopausa++;
			}
			System.out.println("O total de pessoas que tem a idade menor que 21 é: " + adulto);
			System.out.println("O total de pessoas que tem a idade maior que 50 é: " + menopausa);
		}
		ler.close();
	}
}