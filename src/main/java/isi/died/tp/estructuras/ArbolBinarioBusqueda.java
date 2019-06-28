package isi.died.tp.estructuras;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import isi.died.tp.dominio.Insumo;

public class ArbolBinarioBusqueda<E extends Comparable<E>> extends Arbol<E> {

	//Atributos:
	//protected E valor: es heredado desde Arbol
	protected Arbol<E> izquierdo;
	protected Arbol<E> derecho;
	
	
	//Constructores:	
		public ArbolBinarioBusqueda(){
		this.valor=null;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e){
		this.valor=e;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	//Excepcion: si e==null
	
	public ArbolBinarioBusqueda(E e,Arbol<E> i,Arbol<E> d){
		this.valor=e;
		this.izquierdo=i;
		this.derecho=d;
	}
	
	
	//Metodos de instancia:
	@Override
	public List<E> preOrden() {
		List<E> lista = new ArrayList<E>();
		lista.add(this.valor);
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> inOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.add(this.valor);
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> posOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		lista.add(this.valor);
		return lista;

	}
	@Override
	public boolean esVacio() {
		return false;
	}
    
	
	@Override
	public E valor() {
		return this.valor;
	}
	
	@Override
	public Arbol<E> izquierdo() {
		return this.izquierdo;
	}
	
	@Override
	public Arbol<E> derecho() {
		return this.derecho;
	}


	@Override
	public void agregar(E a) {
		if(this.valor.compareTo(a)<1) { //valor-a.valor
			if (this.derecho.esVacio()) this.derecho = new ArbolBinarioBusqueda<E>(a);
			else this.derecho.agregar(a);
		}else { //a la izquierda:
			if (this.izquierdo.esVacio()) this.izquierdo= new ArbolBinarioBusqueda<E>(a);
			else this.izquierdo.agregar(a);
		}
	}
	
	@Override
	public boolean equals(Arbol<E> unArbol) {
		return (this.valor.equals(unArbol.valor()) && this.izquierdo.equals(unArbol.izquierdo()) && this.derecho.equals(unArbol.derecho()));
	}
	
	
	// A) contiene(E unValor) → retorna true si un elemento existe en el árbol
	@Override
	public boolean contiene(E unValor) {
		// TODO 1.a
			return this.valor.equals(unValor) || this.izquierdo.contiene(unValor) || this.derecho.contiene(unValor);
	}

	// B) profundidad():método recursivo que cuenta las altura de un árbol binario
	@Override
	public int profundidad() {
		// TODO 1.b
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) return 0;
		return (1+ Math.max(izquierdo.profundidad(),derecho.profundidad()));
	}

	// C) cuentaNodosDeNivel(int nivel) : método que determina el número de nodos que se encuentran en un nivel N de un árbol.
	@Override
	public int cuentaNodosDeNivel(int nivel) {
		// TODO 1.c
		if(nivel==0) {return 1;}
		if(this.esVacio()) {return 0;}
		return (this.izquierdo().cuentaNodosDeNivel(nivel-1)+this.derecho().cuentaNodosDeNivel(nivel-1));
	}
	
	// D) EsCompleto():método que determina si el árbol binario es completo2
	@Override
	public boolean esCompleto() {
//		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {return true;} //si es un solo nodo ya es lleno por lo tanto ya dara true, es redundante
		if(this.esLleno()) {return true;}
		
		if(this.profundidad()==1) {
			if(this.derecho.esVacio()) return true;
			else return false;
		}
		
		int dif = this.izquierdo.profundidad() - this.derecho.profundidad();
		if (dif >1) {return false;}
		
		if (dif==0 && this.izquierdo.esLleno() && this.derecho.esCompleto())
			return true;
		if (dif==1 && this.derecho.esLleno()&& this.izquierdo.esCompleto())
			return true;
		return false;
	}
	
	
	//  E) esLleno():método que determina si el árbol binario es lleno
	@Override
	public boolean esLleno() {
		// TODO 1.e
		int cantNodos = this.cuentaNodosDeNivel(this.profundidad());
		if(cantNodos == Math.pow(2, this.profundidad())){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public ArrayList<E> rango (int inicial, int fin){
		ArrayList<E> listaResultado=new ArrayList<>();

		return rangoAux(inicial,fin,listaResultado);
		}

	public ArrayList<E> rangoAux(int inicio,int fin,ArrayList<E> lista){
		int raiz=((Insumo)this.valor).getStock();
		boolean izqVacio=this.izquierdo.esVacio();
		boolean derVacio=this.derecho.esVacio();

		if (izqVacio && derVacio) {
			if(raiz>=inicio && raiz<=fin)
				lista.add(this.valor);
		}else {
			if( raiz<inicio){
				lista=this.derecho.rangoAux(inicio,fin,lista);
			} else if ( raiz>fin) {
				lista=this.izquierdo.rangoAux(inicio,fin,lista);
			} else if ( raiz>=inicio && raiz<=fin ) {
				lista.add(this.valor);
				lista=this.derecho.rangoAux(inicio,fin,lista);
				lista=this.izquierdo.rangoAux(inicio,fin,lista);
			}
		}
		Collections.sort(lista);

		return lista;
		}
}
