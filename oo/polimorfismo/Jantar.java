package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingridiente1 = new Arroz(0.2);
		Feijao ingridiente2 = new Feijao(0.1);
		Comida ingridiente3 = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingridiente1);
		convidado.comer(ingridiente2);
		convidado.comer(ingridiente3);
		
		System.out.println(convidado.getPeso());
		
		Sorvete Sobremesa = new Sorvete(0.4);
		
		convidado.comer(Sobremesa);
		
		System.out.println(convidado.getPeso());
		
		

	}
}
