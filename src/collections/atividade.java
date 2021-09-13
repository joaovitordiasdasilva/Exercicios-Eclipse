package collections;

import java.util.ArrayList;
import java.util.Collections;

public class atividade {

	
public static void main(String[] args) {
		
	String aula1 = "Bloco I - Java";
	String aula2 = "Bloco II - SpringBoot";
	String aula3 = "Bloco III - Angular";
	String aula4 = "Programador Formado";
	
	ArrayList<String> aulas = new ArrayList<>();
	aulas.add(aula1);
	aulas.add(aula2);
	aulas.add(aula3);
	aulas.add(aula4);
	
		System.out.println("Aula: " + aulas);
	}
}

