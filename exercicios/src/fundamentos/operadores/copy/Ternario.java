package fundamentos.operadores.copy;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 6.2;
		String resultadoParcial = media >= 5.0 ?
				" em recupera��o" : " reprovado";
		String resultadoFinal = media >= 7.0 ? " Aprovado" : resultadoParcial;
		
		System.out.println("O aluno est�" + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "N�o";
		System.out.printf("Tem Desconto?" + resultado);
	}
}
