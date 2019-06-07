package isi.died.tp.estructuras;

import static org.junit.Assert.*;
import org.junit.Test;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.InsumoLiquido;
import isi.died.tp.dominio.UnidadDeMedida;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import org.junit.Test;

public class InsumoLiquidoTest {
	
	@Before
	public void antes() {
		
		//Insumo i1 = new Insumo(1, "primer insumo de prueba", UnidadDeMedida.KILO, 20.5, 3, 50.5, false);
		//Insumo insumoLiquido1 = new InsumoLiquido(1, "primer insumo de prueba", UnidadDeMedida.KILO, 20.5, 5, false, 30.50);
	}
	

	@Test
	public void testCalcularPeso() {
		Insumo insumoLiquido = new InsumoLiquido(1, "primer insumo liquido de prueba", UnidadDeMedida.KILO, 15.5, 30, true, 75.50);
		assertEquals((2),((int)((InsumoLiquido) insumoLiquido).calcularPeso()));
																																			//Como hago para que me deje usar assertEquals(double,double); ???
	}

}
