package ProjetoJava;

import java.util.Scanner;

public class Agendamento extends Usuario {
	String[] cidadeV = new String [3];
	String[] horarioV = new String [3];
	
	Scanner scan = new Scanner(System.in);
	
	int verificar;
public void preCadastro() {
		cidadeV[0] = "Santos";
		cidadeV[1] = "Osasco";
		cidadeV[2] = "Maua";
		
		horarioV[0] = "09:00";
		horarioV[1] = "10:00";	
		horarioV[2] = "11:00";
}
	
	
	public void fazCadastro() {
		
		do {
			
			System.out.print("\nCidades disponiveis: 1 - Santo Andre  2 - Sao Bernardo   3 - Maua:\nDigite sua cidade:\n");
			cidade = scan.nextInt();
			if(cidade == 1) {
			System.out.println("sua cidade é Santo Andre.");
			
			}
			if(cidade == 2) {
			System.out.println("sua cidade é Sao Bernardo.");
			
			}
			if(cidade == 3) {
			System.out.println("sua cidade é Maua.");
			
			}
		
			System.out.println("Horario disponivel:   1 - 09:00    2 - 10:00   3 - 11:00.\nDigite seu horario:\n");
			horario = scan.nextInt();
			if(horario == 1){
			System.out.println("seu horario é 09:00.");
		
			}
			if(horario == 2) {	
			System.out.println("seu horario é 10:00.");
		
			}
			if(horario == 3) {
			System.out.println("seu horario é 11:00.");
			
			}
			
			
			
		} while (cidade <= 0 || cidade >= 4 || horario <= 0 || horario >= 4);
		//System.out.println(cid + " " + hora);
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public int getVerificar() {
		return verificar;
	}

	public void setVerificar(int verificar) {
		this.verificar = verificar;
	}

	public String[] getCidadeV() {
		return cidadeV;
	}

	public void setCidadeV(String[] cidadeV) {
		this.cidadeV = cidadeV;
	}

	public String[] getHorarioV() {
		return horarioV;
	}

	public void setHorarioV(String[] horarioV) {
		this.horarioV = horarioV;
	}

}
