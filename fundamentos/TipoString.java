package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa Tarde";

		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "nome: " +nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor  %s %s tem %s anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor  %s %s tem %s anos e ganha R$%.2f.", 
				nome, sobrenome, idade, salario);
				
		System.out.println(frase);
		
		System.out.println("frase qualquer".contains("qual"));
		System.out.println("frase qualquer".indexOf("qual"));
		System.out.println("frase qualquer".substring(6));
		System.out.println("frase qualquer".substring(6, 8));

	}
}
