package oo.herenca.desafio2;

public class Carro {
	
	
	int velocidadeAtual;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		
		VELOCIDADE_MAXIMA = velocidadeMaxima;
		
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		
		} else {
			
			velocidadeAtual += delta;
		}
		
	}
	
	
	public void frear() {
		if(velocidadeAtual >= 5 ) {
			velocidadeAtual -= 5;
			
		} else {
			velocidadeAtual = 0;
		}
		
	}
	
	public String ToString() {
		return "A velocidade desse carro e " + velocidadeAtual + "KM/H.";
	}
}
