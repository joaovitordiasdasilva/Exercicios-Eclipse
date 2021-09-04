package Exercicios;

import java.util.Scanner;

public class Exercicios3Ativ1 {

	public static void main(String[] args) {
		
		int segundos, minutos, horas, s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		s = ler.nextInt();
		
		horas = s / 3600;
		minutos = (s % 3600) / 60;	
		segundos = minutos % 60;
		
		System.out.println("Seu evento durou "+ horas + " horas, "+ minutos + " minutos" +" e " + segundos+ " segundos.");
		
		ler.close();

	}

}