package Exercicios;

import java.util.Scanner;

public class Exercicios4Ativ3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int pessoas = 0, idade, idade18Calmas = 0, idade40Nervosas = 0, sexo, sexoFemininoNervoso = 0, sexoMasculinoAgressivo = 0, sexoOutrosCalma = 0,
                comportamento, calma = 0;
        
        while(pessoas != 4){
            System.out.println("\nDigite a idade da " + (pessoas + 1) + "� pessoa:");
            idade = leia.nextInt();

            System.out.println("Digite seu sexo, 1 para feminino, " +
                    "2 para masculino, 3 para outros: ");
            sexo = leia.nextInt();

            System.out.println("Digite 1 se voc� � uma pessoal calma, 2 se voc� � nervosa, 3 se voc� � agressiva: ");
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
        System.out.println("\nO n�mero de pessoas calmas �: " + calma);
        System.out.println("O n�mero de mulheres nervosas �: " + (sexoFemininoNervoso));
        System.out.println("O n�mero de homens agressivos �: " + (sexoMasculinoAgressivo));
        System.out.println("o n�mero de outros calmos �: " + (sexoOutrosCalma));
        System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + (idade40Nervosas));
        System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + (idade18Calmas));

        leia.close();
    }
}