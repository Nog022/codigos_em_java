package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		//terça v ou f
		//quinta v ou f
		//se um tiver certo vai comprar a tv de 32 polegadas e vai tomar sorvete 
		// se dois tiver certo vai comprar a tv de 50 polegadas e tomar sorvete
		//se os dois tiver errado não vai acontecer nada 
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean maisSaudavel = trabalho1 || trabalho2;
		
		System.out.println("Comprou Tv 50\"?" + comprouTv50 );
		System.out.println("Comprou Tv 32\"?" + comprouTv32 );
		System.out.println("Comprou Tv 32\"Sorvete" + comprouTv32 );
		System.out.println("Mais saudavel" + maisSaudavel );
		
	}
}
