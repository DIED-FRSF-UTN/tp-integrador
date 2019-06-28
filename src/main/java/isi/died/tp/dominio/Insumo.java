package isi.died.tp.dominio;

public class Insumo implements Comparable<Insumo>{
	
	//Atributos
	public String descripcion;
	public UnidadDeMedida unidad_de_medida;
	public double costo;
	public int stock;
	public double peso; //siempre en Kg
	public boolean esRefrigerado;
	
	//Geters and Setters
	protected int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public UnidadDeMedida getUnidad_de_medida() {
		return unidad_de_medida;
	}
	public void setUnidad_de_medida(UnidadDeMedida unidad_de_medida) {
		this.unidad_de_medida = unidad_de_medida;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}
	public void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}

	

	//constructores
	//con peso, para insumos no loquidos
	public Insumo(int id, String descripcion, UnidadDeMedida unidad, double costo, int stock, double peso, boolean esRefrigerado ) {
		this.id = id;
		this.descripcion = descripcion;
		this.unidad_de_medida = unidad;
		this.costo = costo;
		this.stock = stock;
		this.peso = peso;
		this.esRefrigerado = esRefrigerado;
		
	}
	//Sin peso: usado en Insumo liquido por "super(id, descripcion, unidad, costo, stock, esRefrigerado);"
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
	
	
	
	
}
