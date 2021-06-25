package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOutImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOutImpar.apply(32));
		
		Function<String, String> oResultadoE =
				valor-> "O resultado é" + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
				
		Function<String, String> duvida = 
				valor -> valor + "???";
		
		String resultadoFinal = parOutImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
				
		System.out.println(resultadoFinal);

		String resultadoFinal2 = parOutImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(31);
				
		System.out.println(resultadoFinal2);
	}
}
