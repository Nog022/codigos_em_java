package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.println("\nBom");
		
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("\nSala rio: %.1f", 1234.5678);
		System.out.printf("\nNome: %s", "Joao");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.\n",
				nome, sobrenome, idade);
		
		entrada.close();
	}
}
