package aficion.entidad;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import aficion.transfer.TransferAficiones;

public class Aficiones {
	
	@Id
	private String id;
	@Indexed
	private String Tema;
	private String Apodo;
	private String Nombre;
	private int Puntuacion;
	private double Precio;
	
	
	
	public Aficiones(){}
	
	
	public Aficiones(String id, String tema, String apodo, String nombre, int puntuacion, double precio){
		this.id = id;
		this.Tema = tema;
		this.Apodo = apodo;
		this.Nombre = nombre;
		this.Puntuacion = puntuacion;
		this.Precio = precio;
		
	}
	
	/*public Aficiones( String tema, String apodo, String nombre, int puntuacion, double precio){
		
		this.tema = tema;
		this.apodo = apodo;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		
	}*/
	public Aficiones(Aficiones aficiones) {
		this.id  = aficiones.id;
		this.Tema = aficiones.Tema;
		this.Apodo = aficiones.Apodo;
		this.Nombre = aficiones.Nombre;
		this.Puntuacion = aficiones.Puntuacion;
		this.Precio = aficiones.Precio;
	}
	
	
	public static Aficiones TransferToEntity(TransferAficiones transferAficiones, String idAficion) {
			Aficiones aficiones = new Aficiones(
					transferAficiones.getId(),
					transferAficiones.getTema(),
					transferAficiones.getApodo(),
					transferAficiones.getNombre(),
					transferAficiones.getPuntuacion(),
					transferAficiones.getPrecio()
					);
					return aficiones;
	}
	
	
	public static Aficiones TransferToEntity(TransferAficiones transferAficiones) {
		return new Aficiones(
				transferAficiones.getId(),
				transferAficiones.getTema(),
				transferAficiones.getApodo(),
				transferAficiones.getNombre(),
				transferAficiones.getPuntuacion(),
				transferAficiones.getPrecio()
				);
				
}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTema() {
		return Tema;
	}


	public void setTema(String tema) {
		this.Tema = tema;
	}


	public String getApodo() {
		return Apodo;
	}


	public void setApodo(String apodo) {
		this.Apodo = apodo;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}


	public int getPuntuacion() {
		return Puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.Puntuacion = puntuacion;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		this.Precio = precio;
	}

	@Override
	public String toString() {
		return "Tema: " + this.getTema() + " / Apodo: " + this.getApodo() + " / Nombre: " + this.Nombre + " / Puntuación: " + this.Puntuacion + " / Precio: " + this.Precio;
	}
	
}
