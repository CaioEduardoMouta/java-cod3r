package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	// quando defini uma constante obrigatoriamente precisa iniciar com valor
	// seja na propria classe ou no construtor
	// se variavel pertence a classe ela pode ser inilizada por padr�o
	Data () { //construtor padr�o
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		//usando o this como um metodo chamando um constutor
		//n�o pode usar ele fora do construto
		// variavel local n�o � inicializada por padr�o
		// Objeto por padr�o recebe o valor nulo
		// int , byte , short , long -> por padr�o o valor ser� = 0
		// float , double -> 0.0;
		// boolean -> valor padr�o false char - u000
		
		this(1,1,2017);
		
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// se variavel for fora do metodo pode ser usada em qualquer lugar
	// porque ele pertence a inst�ncia
	// Usar this pare referenciar o objeto atual 
	String obterDataFormata () { //parametros s�o visiveis dentro do metodo
		final String formato = "%d/%d/%d"; // variavel local n�o pode ser
		//acessada em outro metodo
		// se colocar final passar a ser uma constante local
		return String.format(formato , dia, mes,ano);
	}
	
	//This invalido dentro de um metodo estatico 
	static void teste() {
		
	}
}
