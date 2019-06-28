package isi.died.tp.dominio;

public class InsumoLiquido extends Insumo{
	
	//atributos
	public double densidad;
	
	//constructor
	public InsumoLiquido(int id, String descripcion, UnidadDeMedida unidad, double costo, int stock, boolean esRefrigerado, double densidad){
		super(id, descripcion, unidad, costo, stock, esRefrigerado);
		this.densidad = densidad;
		this.peso = this.calcularPeso();
	}
	
	public double calcularPeso() {
		return (((double) this.stock)*0.001* this.densidad);
	}

}
