package arrays;


import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas voce quer informar? ");
		
		int quantidadeDeNotas = entrada.nextInt();
		
		double [] notas = new double[quantidadeDeNotas];
		
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double media = 0; 
		for(double nota: notas) {
			media += nota;
		}
		
		System.out.println(media / notas.length);
		
		entrada.close();
	}
}
