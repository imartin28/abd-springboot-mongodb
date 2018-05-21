package aficion.transfer;



import org.springframework.data.annotation.Id;

import aficion.entidad.Aficiones;

public class TransferAficiones {
	@Id
	private String id;
	private String Tema;
	private String Apodo;
	private String Nombre;
	private int Puntuacion;
	private double Precio;
	
	
	public TransferAficiones() {}
	
	public TransferAficiones(String id, String tema, String apodo, String nombre, int puntuacion, double precio) {
		this.id = id;
		this.Tema = tema;
		this.Apodo = apodo;
		this.Nombre = nombre;
		this.Puntuacion = puntuacion;
		this.Precio = precio;
	}
	
	public TransferAficiones( String tema, String apodo, String nombre, int puntuacion, double precio) {
		
		this.Tema = tema;
		this.Apodo = apodo;
		this.Nombre = nombre;
		this.Puntuacion = puntuacion;
		this.Precio = precio;
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

	
}
