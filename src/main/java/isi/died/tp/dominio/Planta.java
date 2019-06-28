package isi.died.tp.dominio;
import java.util.List;
import java.util.stream.Collectors;

public class Planta {
	
	public List<Stock> listaStock;
	
	
	private Integer id;
	private String Nombre;
	
	//Geters and Seters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	//Metodos
	public Double costoTotal() {
		return listaStock.stream().distinct().mapToDouble((s)->s.getInsumo().getCosto()*s.getCantidad()).sum();	
	}
	
	public List<Insumo> stockEntre(Integer s1,Integer s2) {
		return listaStock.stream()
				.filter(s->s.getCantidad()>=s1 && s.getCantidad()<=s2 )
				.map(s-> s.getInsumo())
				.collect(Collectors.toList());
	}
	
	public Boolean necesitInsumo(Insumo i) {
		Stock s1=new Stock();
		
		s1=listaStock.stream().filter(s->s.getInsumo().equals(i)).collect(Collectors.toList()).get(0);
		if(s1.getCantidad() >= s1.getPuntoPedido()) {
			return false;
		}
		return true;
	}
	

}
