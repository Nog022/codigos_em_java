package fundamentos;

public class MudançaDeTemperatura {
	public static void main(String[] args) {
		//(F - 32) * 5/9 = C
		final double ajuste = 32;
		final double fator = 5/9.0;
		double F = 86;
		double c = (F - ajuste) * fator;
		
		System.out.println("O resultado é "+ c + " Celsius");
		
	}
}
