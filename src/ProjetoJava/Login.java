package ProjetoJava;

import java.util.Scanner;

public class Login extends Usuario {
	String userV[] = new String [3];
	String senhaV[] = new String [3];
	
	Scanner scan = new Scanner(System.in);
	
	int verificar;
	
	public Login () {
		
		//System.out.println("abrir a classe login");
		}
	
	public void preLogin () {
		
		userV[0] = "amanda"; 
		userV[1] = "rafaela";
		userV[2] = "joao";
		
		senhaV[0] = "1234";  
		senhaV[1] = "1212";
		senhaV[2] = "3232";	
	}
	
	public void fazLogin () {
		do {

			System.out.print("\nInsira seu usu�rio:\n");
			user = scan.next();

			System.out.println("Insira sua senha:");
			senha = scan.next();

			//System.out.print("\nusu�rio: " + user);
			//System.out.print("\nsenha: " + senha);

			for (int cont = 0; cont < 3; cont++) {
				if (user.equals(userV[cont])) {   //(user.equals(userV[cont])) {
					verificar = cont;
				}
			}
		} while (!user.equals(userV[verificar]) || !senha.equals(senhaV[verificar]));
	}
	
	

	public String[] getUserV() {
		return userV;
	}

	public void setUserV(String[] userV) {
		this.userV = userV;
	}

	public String[] getSenhaV() {
		return senhaV;
	}

	public void setSenhaV(String[] senhaV) {
		this.senhaV = senhaV;
	}
	
	
	
}
