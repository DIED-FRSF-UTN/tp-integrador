package isi.died.tp.estructuras;

public class App {
	
	public static void main(String args[]) {
		System.out.println("Starting...");
		final Arbol<Integer> a1 = new ArbolBinarioBusqueda<Integer>(6);
		
		/*
		a1.agregar(1);
        a1.agregar(7);
        a1.agregar(3);
        a1.agregar(4);
        a1.agregar(5);
        a1.agregar(7);
        a1.agregar(8);
        a1.agregar(9);
        */
        
        System.out.println("Arbol:");
        System.out.println(print(a1));
	}
	
	public static String print(Arbol<Integer> a){
		return (a.valorString()+print(a.izquierdo()));
		//return (print(a.izquierdo())+a.valorString()+print(a.derecho()));
		
	}

}
