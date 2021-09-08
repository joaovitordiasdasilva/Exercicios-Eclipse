package P.O;

public class produtosEletronicos1 {
	public static void main(String[] args) {
		
		produtosEletronicos produtosEletronicos1 = new produtosEletronicos();
		
		produtosEletronicos1.setPlacaDeVideo("RTX 3090");
		produtosEletronicos1.setProcessador("I10 9900k");
		produtosEletronicos1.setSsd("Kingston 1TB");
		
		System.out.println("Esta placa de video é a: "+ produtosEletronicos1.getPlacaDeVideo() );
		System.out.println("Este processador é um: "+ produtosEletronicos1.getProcessador());
		System.out.println("Este ssd é um: "+ produtosEletronicos1.getSsd());
		
	}
	
}
