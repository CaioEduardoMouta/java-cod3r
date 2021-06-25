package streams;

public class MediaTeste {

	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(8.3).adicionar(9.2);
		Media m2 = new Media().adicionar(9.2).adicionar(8.2);
		
		System.out.println(m1.getValor());

	}
}
