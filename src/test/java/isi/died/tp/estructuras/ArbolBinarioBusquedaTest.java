package isi.died.tp.estructuras;

import isi.died.tp.dominio.Insumo;

import isi.died.tp.dominio.InsumoLiquido;
import isi.died.tp.dominio.UnidadDeMedida;
import isi.died.tp.estructuras.Arbol;
import isi.died.tp.estructuras.ArbolBinarioBusqueda;
import isi.died.tp.estructuras.ArbolVacio;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Before;

public class ArbolBinarioBusquedaTest {

	Arbol<Integer> a0,a1,a2,a3,a4,a5,a6,a7,a8,a9;
	
	
	//@Test(timeout =1) //--> si no se ejecuta en menos de 1 segundo fallará!
	@Before
	public void setUp() {
		a0 = new ArbolBinarioBusqueda<Integer>(6);
		a1 = new ArbolBinarioBusqueda<Integer>(6);
		a2 = new ArbolBinarioBusqueda<Integer>(6);
		a3 = new ArbolBinarioBusqueda<Integer>(6);
		a4 = new ArbolBinarioBusqueda<Integer>(6);
		a5 = new ArbolBinarioBusqueda<Integer>(6);
		a6 = new ArbolBinarioBusqueda<Integer>(6);
		a7 = new ArbolBinarioBusqueda<Integer>(6);
		a8 = new ArbolBinarioBusqueda<Integer>(6);
		a9 = new ArbolBinarioBusqueda<Integer>(6);
		
		
		//arbol raiz
		//a0
		
		//arbol raiz con un hijo izquierdo
		a1.agregar(2);
		
		//arbol raiz con un hijo derecho
		a2.agregar(8);
		
		//arbol lleno prof=1
		a3.agregar(2);
		a3.agregar(8);

		//Lleno y completo
		a4.agregar(3);
		a4.agregar(2);
		a4.agregar(4);
		a4.agregar(8);
		a4.agregar(7);
		a4.agregar(9);

		
		//completo pero no lleno
		a5.agregar(3);
		a5.agregar(2);
		a5.agregar(4);
		a5.agregar(8);
		a5.agregar(7);
		
		//Ni completo ni lleno
		a6.agregar(3);
		a6.agregar(2);
		a6.agregar(4);
		a6.agregar(1);
		a6.agregar(8);
		a6.agregar(9);
		
		//Arbol igual al a6
		a7.agregar(3);
		a7.agregar(2);
		a7.agregar(4);
		a7.agregar(1);
		a7.agregar(8);
		a7.agregar(9);
		
	}
	
		
	@Test
	public void testContiene() {
		assertEquals(true, a5.contiene(2)&&a5.contiene(8)&&a5.contiene(6));
		assertEquals(false, a5.contiene(9));		
	}
	@Test
	public void testEqualsArbolOfE() {
		assertEquals(true, a6.equals(a7)&& !a6.equals(a3));
	}

	@Test
	public void testAgregar() {
		a1.agregar(4);
		a1.agregar(8);
		assertEquals(true,a1.contiene(4)&&a1.contiene(8)&&a1.contiene(6));
		
	}

	@Test
	public void testProfundidad() {
		assertEquals(0, a0.profundidad());
		assertEquals(1, a1.profundidad());
		assertEquals(1, a2.profundidad());
		assertEquals(1, a3.profundidad());
		assertEquals(2, a4.profundidad());
		assertEquals(2, a5.profundidad());
		assertEquals(3, a6.profundidad());
		assertEquals(3, a7.profundidad());
		}
	 @Test
     public void testCuentaNodosDeNivel() {
		 	assertEquals(1,a6.cuentaNodosDeNivel(0));
			assertEquals(2,a6.cuentaNodosDeNivel(1));
			assertEquals(3,a6.cuentaNodosDeNivel(2));
			assertEquals(1,a6.cuentaNodosDeNivel(3));
     }
    
     @Test
     public void testEsCompleto() {
    	 assertEquals(true,a0.esCompleto());
    	 assertEquals(true,a1.esCompleto());
    	 assertEquals(true,a3.esCompleto());
    	 assertEquals(true,a4.esCompleto());
    	 assertEquals(true,a5.esCompleto());
    	 
    	 
    	 assertEquals(false,a2.esCompleto());
    	 assertEquals(false,a6.esCompleto());
 
     }
    
     @Test
     public void testEsLleno() {
    	 assertEquals(true,a0.esLleno());
    	 assertEquals(true,a3.esLleno());
    	 assertEquals(true,a4.esLleno());

    	 assertEquals(false,a1.esLleno());
    	 assertEquals(false,a2.esLleno());
    	 assertEquals(false,a5.esLleno());
    	 assertEquals(false,a6.esLleno());
    	 
    	 
     }
     
    

     
	@Ignore("Este metodo debe ser ignorado")
	public void ignorame() {
		fail("I must be ignored...");
	}
	/*
*/
}
