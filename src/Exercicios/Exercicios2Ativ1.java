package Exercicios;

import java.util.Scanner;

public class Exercicios2Ativ1 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		
		idadeAnos = dias / 365;
		idadeMeses = dias % 365 / 30;
		idadeDias = dias % 365 % 30;
		
		
		System.out.println("Sua idade em anos é: "+ idadeAnos +"\nem meses é: " + idadeMeses + "\ne em dias é: " + idadeDias );
		
		ler.close();

	}

}