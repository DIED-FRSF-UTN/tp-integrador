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
	Insumo insumoLiquido1,insumoLiquido2,insumoLiquido3;
	
	@Before
	public void setUp() {
		//public InsumoLiquido(int id, String descripcion, UnidadDeMedida unidad, double costo, int stock, boolean esRefrigerado, double densidad)
		//			public InsumoLiquido(id, 			descripcion, 					unidad, 	costo, stock, esRefrigerado, densidad)
		insumoLiquido1 = new InsumoLiquido(1, "primer insumo liquido de prueba", UnidadDeMedida.KILO, 15.5, 50, true, 15.50);
		insumoLiquido2 = new InsumoLiquido(1, "segundo insumo liquido de prueba", UnidadDeMedida.KILO, 15.5, 20, true, 52.50);
		insumoLiquido3 = new InsumoLiquido(1, "tercer insumo liquido de prueba", UnidadDeMedida.KILO, 15.5, 80, true, 75.50);
	}
		
	@Test
	public void testCalcularPeso() { 
		assertEquals((0),((int)((InsumoLiquido) insumoLiquido1).calcularPeso()));
		assertEquals((1),((int)((InsumoLiquido) insumoLiquido2).calcularPeso()));
		assertEquals((6),((int)((InsumoLiquido) insumoLiquido3).calcularPeso()));
																																			//Como hago para que me deje usar assertEquals(double,double); ???
	}

}