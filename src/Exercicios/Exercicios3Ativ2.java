package Exercicios;

import java.util.Scanner;

public class Exercicios3Ativ2 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a sua idade: ");
		idade = ler.nextInt();
		
		if(idade > 9 && idade <= 14) {
		System.out.println("A sua categoria � Infantil. ");
		}
		if(idade > 14  && idade <= 17) {
			System.out.println("A sua categoria � Juvenil. ");
			}
		if(idade > 17 && idade <= 25) {
			System.out.println("A sua categoria � Adulto. ");
			}
		else {
			System.out.println("Voc� n�o pode fazer parte de uma categoria.");
		}
		ler.close();
	}
}
