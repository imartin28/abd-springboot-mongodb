package pruebaUnitaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import prototipo.SA.ServicioAplicacionImp;


class PruebaUnitariaOperaciones {

	
	@Test
	public void resultadoEsperadoSuma() {
			
		ServicioAplicacionImp sa = new ServicioAplicacionImp();
		sa.suma(3, 2);
		assertEquals(5, sa.getResultadoTotal(), "El resultado es el esperado");
	}
	
	
	
	@Test
	public void resultadoEsperadoResta() {
		ServicioAplicacionImp sa = new ServicioAplicacionImp();
		sa.resta(3, 2);
		assertEquals(1, sa.getResultadoTotal(), "El resultado es el esperado");
			
	}

}
