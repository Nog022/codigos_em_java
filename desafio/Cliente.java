package desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	
	List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompras(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal(){
		double total = 0;
		
		for(Compra cliente: compras) {
			total += cliente.obterValorTotal();
		}
		
		return total;
	}
}
