package Exercicios;

import java.util.Scanner;

public class Exercicios3Ativ2 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a sua idade: ");
		idade = ler.nextInt();
		
		if(idade > 9 && idade <= 14) {
		System.out.println("A sua categoria é Infantil. ");
		}
		if(idade > 14  && idade <= 17) {
			System.out.println("A sua categoria é Juvenil. ");
			}
		if(idade > 17 && idade <= 25) {
			System.out.println("A sua categoria é Adulto. ");
			}
		else {
			System.out.println("Você não pode fazer parte de uma categoria.");
		}
		ler.close();
	}
}
