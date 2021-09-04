package Exercicios;

import java.util.Scanner;

public class Exercicios4Ativ3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int pessoas = 0, idade, idade18Calmas = 0, idade40Nervosas = 0, sexo, sexoFemininoNervoso = 0, sexoMasculinoAgressivo = 0, sexoOutrosCalma = 0,
                comportamento, calma = 0;
        
        while(pessoas != 4){
            System.out.println("\nDigite a idade da " + (pessoas + 1) + "ª pessoa:");
            idade = leia.nextInt();

            System.out.println("Digite seu sexo, 1 para feminino, " +
                    "2 para masculino, 3 para outros: ");
            sexo = leia.nextInt();

            System.out.println("Digite 1 se você é uma pessoal calma, 2 se você é nervosa, 3 se você é agressiva: ");
            comportamento = leia.nextInt();

            if(idade < 18 && comportamento == 1){
                idade18Calmas++;
            }
            if(idade > 40 && comportamento == 2){
                idade40Nervosas++;
            }

            if(sexo == 1 && comportamento == 2){
                sexoFemininoNervoso++;
            } else if(sexo == 2 && comportamento == 3){
                sexoMasculinoAgressivo++;
            } else if(sexo == 3 && comportamento == 1){
                sexoOutrosCalma++;
            }

            if(comportamento == 1){
                calma++;
            }

            pessoas++;

        }
        System.out.println("\nO número de pessoas calmas é: " + calma);
        System.out.println("O número de mulheres nervosas é: " + (sexoFemininoNervoso));
        System.out.println("O número de homens agressivos é: " + (sexoMasculinoAgressivo));
        System.out.println("o número de outros calmos é: " + (sexoOutrosCalma));
        System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + (idade40Nervosas));
        System.out.println("O número de pessoas calmas com menos de 18 anos é: " + (idade18Calmas));

        leia.close();
    }
}