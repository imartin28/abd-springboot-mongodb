package prototipo.controlador;






public class Aficiones {
	

	//private String id;
	private String tema;
	private String apodo;
	private String nombre;
	private int puntuacion;
	private double precio;
	
	
	
	public Aficiones(){}
	
	
	public Aficiones(String tema, String apodo, String nombre, int puntuacion, double precio){
	
		this.tema = tema;
		this.apodo = apodo;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		
	}
	
	
	/*public Aficiones(BasicDBObject dBObjectAficiones) {
		this.tema = dBObjectAficiones.getString("tema");
		this.apodo = dBObjectAficiones.getString("apodo");
		this.nombre = dBObjectAficiones.getString("nombre");
		this.puntuacion = dBObjectAficiones.getInt("puntuacion");
		this.precio = dBObjectAficiones.getDouble("precio");
	
	}
	
	public BasicDBObject toDBObjectAficiones() {

	   
	    BasicDBObject dBObjectAficiones = new BasicDBObject();
	    
	    dBObjectAficiones.append("tema", this.getTema());
	    dBObjectAficiones.append("apodo",this.getApodo());
	    dBObjectAficiones.append("nombre",this.getNombre());
	    dBObjectAficiones.append("puntuacion",this.getPuntuacion());
	    dBObjectAficiones.append("precio",this.getPrecio());
	    

	    return dBObjectAficiones;
	}*/
	
	
	/*public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}*/


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
