package aficion.entidad;

import org.springframework.data.annotation.Id;

import aficion.transfer.TransferAficiones;

public class Aficiones {
	
	@Id
	private String id;
	private String tema;
	private String apodo;
	private String nombre;
	private int puntuacion;
	private double precio;
	
	
	
	public Aficiones(){}
	
	
	public Aficiones(String id, String tema, String apodo, String nombre, int puntuacion, double precio){
		this.id = id;
		this.tema = tema;
		this.apodo = apodo;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		
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
		this.tema = aficiones.tema;
		this.apodo = aficiones.apodo;
		this.nombre = aficiones.nombre;
		this.puntuacion = aficiones.puntuacion;
		this.precio = aficiones.precio;
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
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}


	public String getApodo() {
		return apodo;
	}


	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tema: " + this.getTema() + " / Apodo: " + this.getApodo() + " / Nombre: " + this.nombre + " / Puntuación: " + this.puntuacion + " / Precio: " + this.precio;
	}
	
}
