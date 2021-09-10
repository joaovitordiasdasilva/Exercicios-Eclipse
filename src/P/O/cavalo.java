package P.O;

public class cavalo extends animal {
	public static void main(String[] args) {
	
		animal cavalo1 = new animal();
		
		cavalo1.setNome("alazao");
		cavalo1.setIdade("12");
		cavalo1.setSom("relinchar");
		
		System.out.println("o nome do meu cavala é: "+ cavalo1.getNome());
		System.out.println("a idade do cavalo é: "+ cavalo1.getIdade());
		System.out.println("o som que o cavala faz é: "+ cavalo1.getSom());
		System.out.println("o cavalo deve correr com selas");
		
	}
}
