package ProjetoJava;

import java.util.Scanner;

public class Projeto3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		login.preLogin();
		Agendamento agendamento = new Agendamento();

		
		
		int x, veri = 0;
		//String userV[] = { "amanda", "rafaela", "joao" };
		//String senhaV[] = { "1234", "1212", "3232" };
		String cidadeV[] = { "sao paulo", "maua", "santo andre" };
		//String user;
		//String senha;
		String cidade;

		System.out.print("Você é:" + "\n1- Paciente" + "\n2- Psicólogo" + "\nResposta: ");

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();

			if (x == 2) {

				System.out.print("\nO que você deseja?" + "\n1- Login" + "\n2- Registre-se" + "\nResposta: ");
				x = scan.nextInt();

				if (x == 1) {
					login.fazLogin();
					/*do {

						System.out.print("\nInsira seu usuário:\n");
						user = scan.next();

						System.out.println("Insira sua senha:");
						senha = scan.next();

						System.out.print("\nusuário: " + user);
						System.out.print("\nsenha: " + senha);

						for (int cont = 0; cont < 3; cont++) {
							if (user.equals(login.getUserV(cont))) {   //(user.equals(userV[cont])) {
								veri = cont;
							}
						}
					} while (!user.equals(userV[veri]) || !senha.equals(senhaV[veri]));*/

					System.out.println("\nO que deseja fazer?" + "\n1- Consultas" + "\n2- Agendamentos" + "\nResposta: ");
					x = scan.nextInt();
				}
			}

			if (x == 1) {
				System.out.print("Você tem uma consulta marcada para o dia 09/09/21 as 17:00 na cidade de sao paulo com o dr joao");
			}

			if (x == 2) {
				agendamento.fazCadastro();
				/*do {

					System.out.print("Digite a cidade: ");
					cidade = scan.next();
					
					
				} while (!cidade.equals(cidadeV[veri]));

				System.out.println("cidade incorreta, digite outra cidade. ");
				cidade = scan.next();*/
			}
		}
	}
}