package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// official information 
		
		// numeric types
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// numeric real types 
		
		float salario = 11_445.44F;
		
		double vendasAcumuladas = 2_99_797_103.01;
		
		// Boolean types 
		boolean estaDeFerias = false; // true 
		
		// character types
		char status = 'A';
		
		//days working
		
		System.out.println(anosDeEmpresa * 365);
		
		// number of trips
		System.out.println(numeroDeVoos / 2);
		
		// points 
		System.out.println(pontosAcumulados/ vendasAcumuladas);
		
		System.out.println(id);
		System.out.println(status);
		System.out.println(estaDeFerias);
		System.out.println(salario);
		
	}
}
