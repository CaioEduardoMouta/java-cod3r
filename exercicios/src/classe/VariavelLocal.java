package classe;

public class VariavelLocal {

	// Variabel na classe 
	
	int a = 2;
	
	void teste1() {
		// Variavel no Metodo 
		int a = 1;
		System.out.println(a);
		System.out.println(this.a);
	}
}
