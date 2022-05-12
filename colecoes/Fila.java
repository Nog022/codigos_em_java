package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e add -> adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia 
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("Gui");
		
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		//fila.contains()
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());

		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}
}
