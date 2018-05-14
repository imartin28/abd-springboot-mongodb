package prototipo.SA;



public class ServicioAplicacionImp implements ServicioAplicacion {
	private int resultado;
	
		
	public int suma(int operando1, int operando2 )throws NumberFormatException {
		resultado = operando1 + operando2;
		return resultado;
		
	
	}
	
	public int resta(int operando1, int operando2) {
		resultado = operando1 - operando2;
		return resultado;
		
	}

	public int getResultadoTotal() {
		return resultado;
	}
	
	
}
