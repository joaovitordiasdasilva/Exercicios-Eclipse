package P.O;

public class cliente1 {

	

	    public static void main(String[] args) {
	//exercicio -- 01²

	        cliente cliente1 = new cliente();

	        cliente1.setNome("joao");
	        cliente1.setCpf("555.808.985-11");
	        cliente1.setEmail("Vagner@gmail.com");
	        cliente1.setEndereco("Rua Da Felicidade, 190");
	        cliente1.setIdade(104);


	        System.out.println("Nome do cliente: " +cliente1.getNome());
	        System.out.println("Idade do cliente: " + cliente1.getIdade());




	   }

}

