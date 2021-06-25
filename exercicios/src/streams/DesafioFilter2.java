package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	public static void main(String[] args) {
	
	Produto p1 = new Produto("Lapis",1.99,0.12,0);
	Produto p2 = new Produto("Notebook",5500.20,0.32,0);
	Produto p3 = new Produto("Caderno",10.00,0.45,0);
	Produto p4 = new Produto("Impressora",900,0.40,0);
	Produto p5 = new Produto("iPad",2800,0.29,0);
	Produto p6 = new Produto("Relogio",1900,0.12,0);
	Produto p7 = new Produto("Monitor",800,0.12,0);
	
	List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	
	//Filter, filter, map
	
	Predicate<Produto> grandeDesconto = p -> p.desconto >= 30;
	Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
	Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
	
	Function<Produto, String> chamadaPromocional = 
			p -> "Aproveite" + p.nome + " por R$ " + p.preco;
	
	produtos.stream()
			.filter(grandeDesconto)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}
