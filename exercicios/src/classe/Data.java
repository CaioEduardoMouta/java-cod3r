package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	// quando defini uma constante obrigatoriamente precisa iniciar com valor
	// seja na propria classe ou no construtor
	// se variavel pertence a classe ela pode ser inilizada por padrão
	Data () { //construtor padrão
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		//usando o this como um metodo chamando um constutor
		//não pode usar ele fora do construto
		// variavel local não é inicializada por padrão
		// Objeto por padrão recebe o valor nulo
		// int , byte , short , long -> por padrão o valor será = 0
		// float , double -> 0.0;
		// boolean -> valor padrão false char - u000
		
		this(1,1,2017);
		
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// se variavel for fora do metodo pode ser usada em qualquer lugar
	// porque ele pertence a instância
	// Usar this pare referenciar o objeto atual 
	String obterDataFormata () { //parametros são visiveis dentro do metodo
		final String formato = "%d/%d/%d"; // variavel local não pode ser
		//acessada em outro metodo
		// se colocar final passar a ser uma constante local
		return String.format(formato , dia, mes,ano);
	}
	
	//This invalido dentro de um metodo estatico 
	static void teste() {
		
	}
}
