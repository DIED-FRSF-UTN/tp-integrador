package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.InsumoLiquido;
import isi.died.tp.dominio.UnidadDeMedida;

public class TestRangoABB {
	
	

	@Test
	public void test() {
		// 4)
		//Insumo: Insumo(int id, String descripcion, UnidadDeMedida unidad, double costo, int stock, boolean esRefrigerado )
		Insumo i1 = new Insumo(1, "primer insumo de prueba", UnidadDeMedida.KILO, 20.5, 3, 3, false);
		Insumo i2 = new Insumo(1, "primer insumo de prueba", UnidadDeMedida.KILO, 20.5, 5, 5, false);
		Insumo i3 = new Insumo(1, "primer insumo de prueba", UnidadDeMedida.KILO, 20.5, 7, 7, false);
		Insumo i4 = new Insumo(1, "primer insumo de prueba", UnidadDeMedida.KILO, 20.5, 8, 8, false);

		//InsumoLiquido(int id, String descripcion, UnidadDeMedida unidad, double costo, int stock, boolean esRefrigerado, double densidad)
	//	Insumo il1 = new InsumoLiquido(1, "primer insumo de prueba", UnidadDeMedida.KILO, 20.5, 5, false, 30.50);
			
			
		Arbol<Insumo> arbol1 = new ArbolBinarioBusqueda<Insumo>(i1);
		arbol1.agregar(i2);
		arbol1.agregar(i3);
		arbol1.agregar(i4);
		
		ArrayList<Insumo> lista = new ArrayList<>();
		lista.add(i1);
		lista.add(i2);
		lista.add(i3);
		lista.add(i4);
		
		assertEquals(lista,((ArbolBinarioBusqueda) arbol1).rango(2,9));
	}

}
