package ProjetoJava;

import java.util.Scanner;

public class Projeto3 extends Usuario {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
				
		paciente Paciente = new paciente();
			
		System.out.println("=====================================================");
		System.out.print("Para iniciarmos, responda o que voc� �: " 
				+ "\n1- Paciente            2- Psic�logo\n"
				+ ">>> ");
		

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();
			
			// PACIENTE
			if (x == 1) {
				
				Paciente.chamaPaciente();
				
			}

			//PSICO (IMPLEMENTA��ES FUTURAS)
			
				if (x == 2) {
				
				Paciente.chamaPaciente();
				
			}
			
				if (x == 1) {
					
					Paciente.chamaPaciente();
					
				}
		}
		
		scan.close();
	}
}
