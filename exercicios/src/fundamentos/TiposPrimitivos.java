package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do Funcionario
		
		
		//Tipos Numericos inteiros 
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 524;
		int id = 56789;
		long pontosAcumulados = 3_134_845_233L;
		System.out.println(Integer.toBinaryString(anosDeEmpresa));
		System.out.println(Integer.toBinaryString(numeroDeVoos));
		System.out.println(Integer.toBinaryString(id));
		System.out.println(Long.toBinaryString(pontosAcumulados));
		
		// Tipos numéricos reais 
		float salario = 11_455.44f;
		double vendasAcumuladas = 2_991_797_103.01;
	
		
		// Tipo booleano 
		boolean bo1 = false; 
		boolean bo2 = true;
		System.out.printf("%b %b\n", bo1,bo2);
		
		//Tipo Caractere
		char  c1 = 'A';
		char  c2 = 'B';
		char  c3 = '\u0050';
		System.out.printf("%c %c %c\n" , c1, c2, c3);
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens 
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real 
		System.out.println(pontosAcumulados / vendasAcumuladas );
		
		System.out.println(id + ": ganha" + salario);
		
		
	}
}
