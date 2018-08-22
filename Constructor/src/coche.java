
public class coche {

	private int velocidad, aceleracion;
	private String nombre;
	
	//Set and Get
	
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad  = velocidad;
	}
	public int getAceleracion() {
		return aceleracion;
	}
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodo
	public void acelearar (int aceleracion) {
		this.aceleracion= aceleracion;
		velocidad += this.aceleracion;
	}
	
	public void frenar () {
		velocidad = 0;
	}
	
}
