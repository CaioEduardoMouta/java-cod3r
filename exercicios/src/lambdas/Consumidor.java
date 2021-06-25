package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.12, 0.09);
		imprimirNome.accept(p1);
		Produto p2 = new Produto("Notebook", 2131.12, 0.03);
		Produto p3 = new Produto("Caderno", 22.12, 0.18);
		Produto p4 = new Produto("Lapis", 1.12, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4); 
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
