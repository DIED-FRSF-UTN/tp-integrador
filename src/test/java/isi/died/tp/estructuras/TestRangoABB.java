package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.InsumoLiquido;
import isi.died.tp.dominio.UnidadDeMedida;

public class TestRangoABB {
	Insumo i0,i1,i2,i3,i4,i5,i6,i7,i8,i9;
	Arbol<Insumo> arbol1;
	ArrayList<Insumo> lista;

	@Before
	public void setUp() {
		// 4)
		//	public Insumo(int, String, 		UnidadDeMedida, 	double, int, double , boolean) {
		//	public Insumo(id, descripcion, 		unidad, 		costo, stock, peso, esRefrigerado ) {
		i0 = new Insumo(1, "primer insumo", UnidadDeMedida.KILO, 20.5, 1, 30.5, false);
		i1 = new Insumo(1, "seundo insumo", UnidadDeMedida.KILO, 20.5, 2, 30.5, false);
		i2 = new Insumo(1, "tercer insumo", UnidadDeMedida.KILO, 20.5, 3, 30.5, false);
		i3 = new Insumo(1, "cuarto insumo", UnidadDeMedida.KILO, 20.5, 4, 30.5, false);
		i4 = new Insumo(1, "quinta insumo", UnidadDeMedida.KILO, 20.5, 5, 30.5, false);
		i5 = new Insumo(1, "sexto insumo", UnidadDeMedida.KILO, 20.5, 6, 30.5, false);
		i6 = new Insumo(1, "septimo insumo", UnidadDeMedida.KILO, 20.5, 7, 30.5, false);
		i7 = new Insumo(1, "octavo insumo", UnidadDeMedida.KILO, 20.5, 8, 30.5, false);
		i8 = new Insumo(1, "noveno insumo", UnidadDeMedida.KILO, 20.5, 9, 30.5, false);
		i9 = new Insumo(1, "decimo insumo", UnidadDeMedida.KILO, 20.5, 10, 30.5, false);
		
		arbol1 = new ArbolBinarioBusqueda<Insumo>(i6);
		arbol1.agregar(i1);
		arbol1.agregar(i8);
		arbol1.agregar(i2);
		arbol1.agregar(i9);
		arbol1.agregar(i0);
		arbol1.agregar(i3);
		arbol1.agregar(i5);
		arbol1.agregar(i4);
		
		lista = new ArrayList<>();
		lista.add(i1); //stock 2
		lista.add(i2);
		lista.add(i3);
		lista.add(i4);
		lista.add(i5);
		lista.add(i6);
		//lista.add(i7); // no fue agregado al arbol
		lista.add(i8); //stock 9
	}
	
	@Test
	public void testRango() {
		assertEquals(lista,((ArbolBinarioBusqueda) arbol1).rango(2,9));
		assertNotEquals(lista,((ArbolBinarioBusqueda) arbol1).rango(1,9));
		assertNotEquals(lista,((ArbolBinarioBusqueda) arbol1).rango(3,9));
		assertNotEquals(lista,((ArbolBinarioBusqueda) arbol1).rango(2,5));
		assertNotEquals(lista,((ArbolBinarioBusqueda) arbol1).rango(2,12));
		lista.add(i7);
		assertNotEquals(lista,((ArbolBinarioBusqueda) arbol1).rango(2,9));
	}

}
