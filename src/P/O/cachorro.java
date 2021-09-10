package P.O;

public class cachorro extends animal {
	public static void main(String[] args) {
	animal cachorro1 = new animal();
	
	cachorro1.setIdade("5");
	cachorro1.setNome("dante");
	cachorro1.setSom("rosnar");
	
	
	System.out.println("o nome do cachorro é: " + cachorro1.getNome());
	System.out.println("a idade do cachorro é: "+ cachorro1.getIdade());
	System.out.println("o som que o cachorro faz é: "+ cachorro1.getSom());
	System.out.println("meu cachorro rapido");
	
	}
}