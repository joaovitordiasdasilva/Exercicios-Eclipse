package P.O;

public class funcionario1 {
	
	public static void main(String[] args) {
		
		funcionario funcionario1 = new funcionario();
		
		funcionario1.setPausa("15:30");
		funcionario1.setPonto("09:00");
		funcionario1.setSalario("R$ 1550,00");
		
		System.out.println("O funcionario vai para o intervalo as: "+ funcionario1.getPausa());
		System.out.println("O funcionario entra as: " + funcionario1.getPonto()+ " da manha.");
		System.out.println("O funcionario recebe" + funcionario1.getSalario() + " por mes.");
	}

}
