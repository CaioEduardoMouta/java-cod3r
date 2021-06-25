package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Carla",102.2);
		Pessoa p2 = new Pessoa("Antonio",102.3);
		
		Comida c1 = new Comida("Arroz",0.99);
		Comida c2 = new Comida("Feijão", 1.00);
		
		double pesoFinal = p1.pesoPessoa + c1.pesoComida;
		
		
		System.out.printf("Dados da Pessoa. \n" + p1.nomePessoa + "\n" +
				c1.nomeComida + "\n" + ""+ pesoFinal + "");
		//System.out.printf("Dados da Pessoa.", p2, c2,pesoFinal);
	}
}
