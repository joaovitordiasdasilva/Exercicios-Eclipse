package ProjetoJava;

import java.util.Scanner;

public class Projeto2 {
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        int x, psic = 2; 
	        String login = null; String senha = null; String logins; String senhas;
	        
	    	System.out.print("Você é:"
					+ "\n1- Paciente"
					+ "\n2- Psicólogo"
					+ "\nResposta: ");
			x = in.nextInt();
			
			do {
				
			
				if(x == psic) {
				}
				System.out.print("\nO que você deseja?"
						+ "\n1- Login"
						+ "\n2- Registre-se"
						+ "\nResposta: ");
				x = in.nextInt();
				
				if(x == 1) {
	        
	        System.out.println("login> ");
	        login = in.next();
	     
				
	        System.out.println("senha> ");
	        senha = in.next();
				
				}
			
	        if(login.equals("claudio") && senha.equals("1234")){
	            System.out.printf("Usuário %s logado com sucesso.", login);
	        }else{
	            System.out.println("Login ou senha inválidos!");
	        }
    } while(login != "claudio" || senha !="1234");
  }
}