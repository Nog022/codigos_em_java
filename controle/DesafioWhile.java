package controle;

import java.util.Scanner;

public class DesafioWhile {
	//para sair digite -1
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int nota = 0;
		int contadorDeNotas = 0;
		
		while(nota != -1) {
			
			nota = entrada.nextInt();
			
			if(nota <= 10 && nota >= 0) {
				
				total += nota;
				
				contadorDeNotas++;
			}
		}
		
		
		int media = total / contadorDeNotas;
		System.out.println("Media: " + media);
		
		entrada.close();
		
	}
}
