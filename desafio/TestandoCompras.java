package desafio;

public class TestandoCompras {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Rodrigo");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Celular", 2.000),1);
		
		cliente1.compras.add(compra1);
	}
}
