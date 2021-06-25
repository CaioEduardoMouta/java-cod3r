package controle;

public class For3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
			System.out.printf("[%d %d]\n", i, j);
		;
			}
		}
		
		int i = 0; //
		System.out.println("Saiu do for...");
		System.out.println(i); 
		// agora ela pode ser usada porque foi criada fora do for
		
		// Variavel i só funciona dentro do for 
	}
}
