package P.O;

public class aviao1 {
	public static void main(String[] args) {
		
		
		aviao aviao1 = new aviao();
		
		aviao1.setPiloto(2);
		aviao1.setAsa(2);
		aviao1.setHelice(2);
		
		
		System.out.println("piloto: " + aviao1.getPiloto());
		System.out.println("asas: " + aviao1.getAsa());
		System.out.println("helices: " + aviao1.getHelice());
	}

}
