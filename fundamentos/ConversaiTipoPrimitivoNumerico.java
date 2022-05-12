package fundamentos;

public class ConversaiTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;//Implicita 
		System.out.println(a);
		
		float b = (float)1.123456788888; //explicita (CAST)
		System.out.println(b);
		
		int c = 12;
		byte d = (byte)c; //explicita (CAST)
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int)e;
		System.out.println(f);
		
	}	
}
