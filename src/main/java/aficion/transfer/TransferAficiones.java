package aficion.transfer;



import org.springframework.data.annotation.Id;

import aficion.entidad.Aficiones;

public class TransferAficiones {
	@Id
	private String id;
	private String tema;
	private String apodo;
	private String nombre;
	private int puntuacion;
	private double precio;
	
	
	public TransferAficiones() {}
	
	public TransferAficiones(String id, String tema, String apodo, String nombre, int puntuacion, double precio) {
		this.id = id;
		this.tema = tema;
		this.apodo = apodo;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
	}
	
	public TransferAficiones( String tema, String apodo, String nombre, int puntuacion, double precio) {
		
		this.tema = tema;
		this.apodo = apodo;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
	}

	public static TransferAficiones EntityToTransfer(Aficiones aficiones) {
		return new TransferAficiones(
				aficiones.getId(),
				aficiones.getTema(),
				aficiones.getApodo(),
				aficiones.getNombre(),
				aficiones.getPuntuacion(),
				aficiones.getPrecio()
				
				
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

	
}
