package ProjetoJava;

import java.util.Scanner;

public class Projeto3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		login.preLogin();
		Agendamento agendamento = new Agendamento();

		
		
		int x;
		

		System.out.print("Você é:" + "\n1- Paciente" + "\n2- Psicólogo" + "\nResposta: ");

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();

			if (x == 1) {

				System.out.print("\nO que você deseja?" + "\n1- Login" + "\n2- Registre-se" + "\nResposta: ");
				x = scan.nextInt();

				if (x == 1) {
					login.fazLogin();
				

					System.out.println("\nO que deseja fazer?" + "\n1- Consultas" + "\n2- Agendamentos" + "\nResposta: ");
					x = scan.nextInt();
				}
			}
			
			if (x == 2) {

				System.out.print("\nO que você deseja?" + "\n1- Login" + "\n2- Registre-se" + "\nResposta: ");
				x = scan.nextInt();

				if (x == 1) {
					login.fazLogin();
					
					System.out.println("\nO que deseja fazer?" + "\n1- Consultas" + "\n2- Agendamentos" + "\nResposta: ");
					x = scan.nextInt();
				}
			}

			if (x == 1) {
				System.out.print("Você tem uma consulta marcada para o dia 09/09/21 as 17:00 na cidade de Maua com o Dr joao");
			}

			if (x == 2) {
				agendamento.fazCadastro();
			
			}
		}
	}
}