package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filmeA = new Filme("A Origem", 9.9);
		Filme filmeB = new Filme("Titanic", 9.1);
		
		Ator atorA = new Ator("Leonardo DiCaprio");
		Ator atrizB = new Ator("Kate Winslet");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
	}
}
