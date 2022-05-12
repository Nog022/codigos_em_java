package fundamentos.operadores;

public class DesafioAritmeticos {
	// int b = Math.pow(a,3);
	public static void main(String[] args) {
		
		//Part 1
		int x1 = 6 * (3+2);
		int x2 = 3 * 2;
		
		int x1total = (int) Math.pow(x1, 2);
		
		int x = x1total / x2;
		
		// Part 2
		int y1 = (1 - 5) * (2 - 7);
		int y2 = 2;
		
		int ytotal = y1/y2;
		
		int y = (int) Math.pow(ytotal, 2);
		
		
		//Part 3
		int base = (int)Math.pow(10, 3);
		int xy = x - y;
		int xytotal = (int)Math.pow(xy, 3);
		
		//Part 4
		int resultado_final = xytotal / base;
		
		
				
		System.out.println(resultado_final);
		
		
		
		
	}
}
