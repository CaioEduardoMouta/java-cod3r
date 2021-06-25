package arrays;

//import java.util.Arrays;
//import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		/*Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos?");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno");
		int qtdeNotas = entrada.nextInt();
		
		double[] [] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d:"
						, n + 1,a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
				
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é" + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			
			System.out.println(Arrays.toString(notasDaTurma));
		}
			
		entrada.close(); */
		
		double [][] notasJoao = {{7.7,8.6},{6.2,9.7}};
		
		double[][] notasPedro = new double [2][];
		notasPedro[0] = new double[2];
		notasPedro[1] = new double[2];
		notasPedro[0][0] = 7.7;
		notasPedro[0][1] = 8.6;
		notasPedro[1][0] = 6.2;
		notasPedro[1][1] = 9.7;
		
		double totalJoao = 0;
		int qtdeNotasJoao = 0;
		for (int i = 0; i < notasJoao.length; i++) {
			for(int j = 0; j < notasJoao[i].length; j++) {
				totalJoao += notasJoao[i][j];
				qtdeNotasJoao++;
			}
		}
		
		double totalPedro = 0;
		int qtdeNotasPedro = 0;
		for(double[] notasParciais: notasPedro) {
			for(double nota: notasParciais) {
				totalPedro += nota;
				qtdeNotasPedro++;
			}
		}
		
		System.out.println(totalJoao / qtdeNotasJoao);
		System.out.println(totalPedro / qtdeNotasPedro);
	}
}
