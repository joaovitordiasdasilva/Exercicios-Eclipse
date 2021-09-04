package matriz;

import java.util.Scanner;

public class Exercicio2Ativ4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		int[] dado = new int[4];
		int dadoMaior = 0, total = 0;
		double media = 0.0, soma = 0.0;
		
	for(int i = 0; i <= 3; i++) {
			
			System.out.println("Digite o valor do dado");
			dado[i] = ler.nextInt();
			
			soma = dado[i] + soma  ; 
			media = soma / 4;
		
			if(dado[i] >= dadoMaior) {
				if(dado[i] == dadoMaior) {
					total++;
				}
					else {
						total = 1;
						
				}
				dadoMaior =	dado[i];
		}
	}
	System.out.println("A média dos dados lançados é: " + media);
	System.out.println("A maior pontuação dos dados ocorreu: " + total + " vezes.");
  }	
}
