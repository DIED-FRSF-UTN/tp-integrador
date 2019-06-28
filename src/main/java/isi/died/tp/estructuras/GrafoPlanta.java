package isi.died.tp.estructuras;
import java.util.List;
import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.Planta;

public class GrafoPlanta extends Grafo<Planta> {

	public void imprimirDistanciaAdyacentes(Planta inicial) {
	 List<Planta> adyacentes = super.getAdyacentes(inicial);
	 for(Planta unAdyacente: adyacentes) {
		 Arista<Planta> camino = super.buscarArista(inicial, unAdyacente);
		 System.out.println("camino de "+inicial.getNombre()+" a "+
				 unAdyacente.getNombre()+ " tiene valor de "+ camino.getValor() );
	 }
 }
 // a
 public Planta buscarPlanta(Planta inicial, Insumo i, Integer saltos) {
	 List<Planta> adyacentesDelInicial  = this.getAdyacentes(inicial);
	 
	// List<Planta> = this.recorridoProfundidad(inicial);
	 /*
	 if()
	 profundidad
	 que le falte el insumo
	 checkear los visitados y los a visitar
	 
	 */
	 return inicial;
	 }
  
 
 
 //b
 
 /*
 public Planta buscarPlanta(Planta inicial, Insumo i) {
 }
 // c
 public Planta buscarPlanta(Insumo i) {
 	}
 	
 	*/
 }

