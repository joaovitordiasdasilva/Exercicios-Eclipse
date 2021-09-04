package Exercicios;

import java.util.Scanner;

public class Exercicios1Ativ1 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, dias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em Anos: ");
		idadeAnos = ler.nextInt();
		System.out.println("Digite sua idade em meses: ");
		idadeMeses = ler.nextInt();
		System.out.println("Digite sua idade em dias: ");
		idadeDias = ler.nextInt();
		
		dias = (idadeAnos*365)+(idadeMeses*30)+idadeDias;
		
		System.out.println("Sua idade em dias é: "+ dias);
		
		ler.close();

	}

}
