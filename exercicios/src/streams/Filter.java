package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana",6.9);
		Aluno a2 = new Aluno("Bia",8.1);
		Aluno a3 = new Aluno("Daniel",7.1);
		Aluno a4 = new Aluno("Gui",2.8);
		Aluno a5 = new Aluno("Rebeca",9.1);
		Aluno a6 = new Aluno("Pedro",8.8);
		Aluno a7 = new Aluno("Caio",7.2);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
		
		Predicate<Aluno> estaAprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado =
				a -> "Parabéns" + a.nome + "! Você foi aprovado";
		
		alunos.stream()
			  .filter(a -> a.nota >= 7)
			  .map(a -> "Parabéns " + a.nome + "! Você foi aprovado!")
			  .forEach(System.out::println);
	}
}
