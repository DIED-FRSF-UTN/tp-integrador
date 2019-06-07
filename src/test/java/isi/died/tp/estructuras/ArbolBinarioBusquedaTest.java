package isi.died.tp.estructuras;

import isi.died.tp.dominio.Insumo;

import isi.died.tp.dominio.InsumoLiquido;
import isi.died.tp.dominio.UnidadDeMedida;
import isi.died.tp.estructuras.Arbol;
import isi.died.tp.estructuras.ArbolBinarioBusqueda;
import isi.died.tp.estructuras.ArbolVacio;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class ArbolBinarioBusquedaTest {

	
	
	
	@Before
    public void antes() {
		

				
    }
	
	//@Test(timeout =1) //--> si no se ejecuta en menos de 1 segundo fallará!
	@Test
	public void testContiene() {
		Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
		a1.agregar(2);
		a1.agregar(8);
		assertEquals(true, a1.contiene(2)&&a1.contiene(8)&&a1.contiene(6));
		assertEquals(false, a1.contiene(7));		
	}
	@Test
	public void testEqualsArbolOfE() {
		Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
		a1.agregar(2);
		a1.agregar(8);
		Arbol<Integer> a2 = new ArbolBinarioBusqueda<Integer>(6);
		a2.agregar(2);
		a2.agregar(8);
		Arbol<Integer> a3 = new ArbolBinarioBusqueda<Integer>(6);
		a3.agregar(1);
		a3.agregar(7);
		assertEquals(true, a1.equals(a2)&& !a1.equals(a3));
	}

	@Test
	public void testAgregar() {
		Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
		a1.agregar(2);
		a1.agregar(8);
		assertEquals(true,a1.contiene(2)&&a1.contiene(8)&&a1.contiene(6));
		
	}

	@Test
	public void testProfundidad() {
		Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
		assertEquals(0, a1.profundidad());
		Arbol<Integer> a2 = new ArbolBinarioBusqueda<Integer>(6);
		a2.agregar(2);
		a2.agregar(8);
		assertEquals(1, a2.profundidad());
		Arbol<Integer> a3 = new ArbolBinarioBusqueda<Integer>(6);
		a3.agregar(2);
		a3.agregar(8);
		a3.agregar(9);
		assertEquals(2, a3.profundidad());
		Arbol<Integer> a4 = new ArbolBinarioBusqueda<Integer>(6);
		a4.agregar(2);
		assertEquals(1, a4.profundidad());
		Arbol<Integer> a5 = new ArbolBinarioBusqueda<Integer>(6);
		a5.agregar(2);
		a5.agregar(1);
		assertEquals(2, a5.profundidad());
		Arbol<Integer> a6 = new ArbolBinarioBusqueda<Integer>(6);
		a6.agregar(9);
		a6.agregar(8);
		a6.agregar(7);
		assertEquals(3, a6.profundidad());
	}
	 @Test
     public void testCuentaNodosDeNivel() {
		 	Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
			a1.agregar(2);
			a1.agregar(1);
			a1.agregar(8);
			a1.agregar(9);
			a1.agregar(7);
			assertEquals(1,a1.cuentaNodosDeNivel(0));
			assertEquals(2,a1.cuentaNodosDeNivel(1));
			assertEquals(3,a1.cuentaNodosDeNivel(2));
			
			Arbol<Integer> a2 = new ArbolBinarioBusqueda<Integer>(8);
			a2.agregar(9);
			a2.agregar(10);
			a2.agregar(4);
			a2.agregar(6);
			a2.agregar(5);
			a2.agregar(7);
			a2.agregar(2);
			a2.agregar(1);
			a2.agregar(3);
			assertEquals(3,a2.cuentaNodosDeNivel(2));
			assertEquals(4,a2.cuentaNodosDeNivel(3));
     }
    
     @Test
     public void testEsCompleto() {
    	Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
 		assertEquals(true, a1.esCompleto());
 		Arbol<Integer> a2 = new ArbolBinarioBusqueda<Integer>(6);
 		a2.agregar(3);
 		Arbol<Integer> a5 = new ArbolBinarioBusqueda<Integer>(6);
 		a5.agregar(7);
 		assertEquals(false, a5.esCompleto());
 		
 		Arbol<Integer> a3 = new ArbolBinarioBusqueda<Integer>(6);
 		a3.agregar(2);
 		a3.agregar(1);
 		a3.agregar(3);
		a3.agregar(8);
		a3.agregar(7);
 		assertEquals(true, a3.esCompleto());
 		
 		Arbol<Integer> a4 = new ArbolBinarioBusqueda<Integer>(6);
 		a4.agregar(2);
 		a4.agregar(1);
 		a4.agregar(3);
		a4.agregar(8);
		a4.agregar(9); //ya no sera completo
		assertEquals(false, a4.esCompleto());
		/*
		*/
     }
    
     @Test
     public void testEsLleno() {
    	Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
		assertEquals(true, a1.esLleno());
		Arbol<Integer> a2 = new ArbolBinarioBusqueda<Integer>(6);
		a2.agregar(5);
		a2.agregar(7);
		assertEquals(true, a2.esLleno());
		Arbol<Integer> a3 = new ArbolBinarioBusqueda<Integer>(6);
		a3.agregar(9);
		assertEquals(false, a3.esLleno());
		
		Arbol<Integer> a4 = new ArbolBinarioBusqueda<Integer>(6);
		a4.agregar(2);
		a4.agregar(1);
		a4.agregar(3);
		a4.agregar(8);
		a4.agregar(7);
		a4.agregar(9);
		assertEquals(true, a4.esLleno());
		
		Arbol<Integer> a5 = new ArbolBinarioBusqueda<Integer>(6);
		a5.agregar(2);
		a5.agregar(1);
		a5.agregar(3);
		a5.agregar(8);
		a5.agregar(7);
		assertEquals(false, a5.esLleno());
		
		Arbol<Integer> a6 = new ArbolBinarioBusqueda<Integer>(6);
		a6.agregar(2);
		a6.agregar(1);
		a6.agregar(3);
		a6.agregar(8);
		a6.agregar(7);
		a6.agregar(9);
		assertEquals(true, a6.esLleno());
		
		/*
		*/
     }
     
    

     
	@Ignore("Este metodo debe ser ignorado")
	public void ignorame() {
		fail("I must be ignored...");
	}
	/*
*/
}
