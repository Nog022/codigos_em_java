package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	void testeAcessos() {
//		segredo = "...";
//		facoDentroDeCAsa = "..."; // default or package
//		formaDeFalar = "...";
//		todosSabem = "...";
		
		Ana mae = new Ana();
		
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCAsa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
