package oo.herenca.desafio2;

public class Ferrari extends Carro implements Esportivo{
	
	public Ferrari(){
		super(315);
	}
	@Override
	public void acelerar() {
		velocidadeAtual += 15;
		super.acelerar();
	}
	
	
	public void ligarTurbo() {
		velocidadeAtual += 35;
		
	}
	
	
	public void desligarTurbo() {
		velocidadeAtual += 15;
		
	}
}
