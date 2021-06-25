package classe;

public class Funcionario {

	String nome; 
	double salario;
	String funcao;
	
	Funcionario() {
		
	}
	
	Funcionario(String nome, double salario, String funcao ) {
		this.nome = nome;
		this.salario = salario;
		this.funcao = funcao;
		
	}
	
	String obterRetorno () {
		final String formato = "%d/%d/%d"; 
		return String.format(nome, salario,funcao);
	}
 }
