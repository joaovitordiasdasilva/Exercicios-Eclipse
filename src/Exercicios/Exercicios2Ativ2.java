package Exercicios;

import javax.swing.JOptionPane;

public class Exercicios2Ativ2 {

	public static void main(String[] args) {
        
 
                int numero1;
                int numero2;
                int numero3;
                int auxiliar;
 
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
                numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3"));
                
 
                if (numero1 > numero2){
                    auxiliar = numero1;
                    numero1 = numero2;
                    numero2 = auxiliar;
                }
                if (numero2 > numero3){
                    auxiliar = numero2;
                    numero2 = numero3;
                    numero3 = auxiliar;
                } 
                if (numero1 > numero2){
                	auxiliar = numero1;
                	numero1 = numero2;
                	numero2 = auxiliar;
                }
                                                                                                             
                JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero1 + " " + numero2 + " " + numero3);
            }
        }