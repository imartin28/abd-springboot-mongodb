package pruebaIntegracion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import transfer.TransferCalculadora;

class PruebaIntegracionOperaciones {

	@Test
	public void resultadoEsperadoCalcularSuma() {
		TransferCalculadora calcu = new TransferCalculadora();
		calcu.setOperando1("2");
		calcu.setOperando2("6");
		calcu.setOperador("suma");
		calcu.calcular();
		assertEquals(8, calcu.getResultado(), "El resultado es el esperado");
		
	}
	
	
	@Test
	public void resultadoEsperadoCalcularResta() {
		TransferCalculadora calcu = new TransferCalculadora();
		calcu.setOperando1("10");
		calcu.setOperando2("6");
		calcu.setOperador("resta");
		calcu.calcular();
		assertEquals(4, calcu.getResultado(), "El resultado es el esperado");
		
	}
}
