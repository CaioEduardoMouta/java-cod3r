package classe;



public class ProdutoTeste {

	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook",4122.32);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto("Camiseta",21.31); // vem do construtor
		//p2.nome = "Camiseta";
		//p2.preco = 46.89;
		//p2.desconto = 0.21;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto()) ;
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		// quando chama com parentesis está chamando um metodo
		//quando chama sem parentesis está chamando uma variavel
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		System.out.printf("Media do carinho = R$%.2f.", mediaCarrinho) ;
	}
}
