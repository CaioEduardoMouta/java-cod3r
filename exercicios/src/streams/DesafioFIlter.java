package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFIlter {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Bugatti", 420);
		Carro c2 = new Carro("Lamborghinni", 410);
		Carro c3 = new Carro("Mercedez", 330);
		Carro c4 = new Carro("Aston Martin", 250);
		Carro c5 = new Carro("Porsche", 310);
		Carro c6 = new Carro("Ferrari", 400);
		
		List<Carro> carros = Arrays.asList(c1,c2,c3,c4,c5,c6);
		
		Predicate<Carro> acima = c -> c.velocidade >= 400;
		
		Function<Carro, String> velocidadeMaxima = c -> "A " +
				c.nome + " Tem a velocidade acima da media";
		
		carros.stream() 
			  .filter(acima)
			  .map(velocidadeMaxima)
			  .forEach(System.out::println);
	}
}
