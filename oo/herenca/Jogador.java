package oo.herenca;

public class Jogador {
	
	public int vida = 100;
	public int x;
	public int y;
	
	Jogador(){
		this(0,0);
	}
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(	Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		
		} else {
			return false;
		}
		
	}
	
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) {
			y--;
		}
		
		if(direcao == Direcao.LESTE) {
			x++;
		}
		
		if(direcao == Direcao.SUL) {
			y++;
		}
		
		if(direcao == Direcao.OESTE) {
			x--;
		}
		
//		switch(direcao) {
//		case NORTE:
//			
//			break;
//		
//		case LESTE:
//			;
//			break;
//		
//		case SUL:
//			y++;
//			break;
//		
//		case OESTE:
//			x--;
//			break;
//			
//		}
		
		return true;
	}
}
