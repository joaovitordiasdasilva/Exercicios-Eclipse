package matriz;

import java.util.Scanner;

public class Exercicio1Ativ4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[] vetor = new int[5]; 
		int maiorValor = 0, media = 0;
		
		
		for(int i = 0; i <= 4; i++) {
			
			System.out.println("Digite o "+ (i + 1) + "� valor.");
			vetor[i] = ler.nextInt();
			
			maiorValor = vetor[i] + maiorValor;
			media = maiorValor / 5;
		}
		System.out.println("O maior valor �: " + maiorValor);
		System.out.println("E a m�dia �: "+ media);
		
		ler.close();
	}
}
