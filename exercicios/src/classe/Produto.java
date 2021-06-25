package classe;

public class Produto {

	//com os atributos criados eu não preciso colocar como parametro
	String nome;
	double preco;
	static double desconto = 0.25;
	// quando coloca static no atributo não precisa passar 
	// para o construtor 

	Produto() {
		
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial; 
		preco = precoInicial;
		
	}
	
						//parametro
	double precoComDesconto() {
		
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		
		return preco * (1 - desconto + descontoDoGerente);
	}
}
