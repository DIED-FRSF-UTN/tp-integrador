package isi.died.tp.dominio;

public class Insumo implements Comparable<Insumo>{
	
	//Atributos
	protected int id;
	public String descripcion;
	public UnidadDeMedida unidad_de_medida;
	public double costo;
	public int stock;
	public double peso; //siempre en Kg
	public boolean esRefrigerado;

	//constructor
	public Insumo(int id, String descripcion, UnidadDeMedida unidad, double costo, int stock, double peso, boolean esRefrigerado ) {
		this.id = id;
		this.descripcion = descripcion;
		this.unidad_de_medida = unidad;
		this.costo = costo;
		this.stock = stock;
		this.peso = peso;
		this.esRefrigerado = esRefrigerado;
		
	}
	
	public Insumo(int id, String descripcion, UnidadDeMedida unidad, double costo, int stock, boolean esRefrigerado ) {
		this.id = id;
		this.descripcion = descripcion;
		this.unidad_de_medida = unidad;
		this.costo = costo;
		this.stock = stock;
		this.esRefrigerado = esRefrigerado;
		
	}
	
	//metodos
	
	public int compareTo(Insumo otroInsumo) {
		return (this.stock-otroInsumo.stock);	//borre el casteo (int) porque stock ya es de tipo int
	}
	
	public String toString() {
		return String.valueOf(this.stock);
	}
	
	public int getStock() {
		return this.stock;
	}
	
	
}
