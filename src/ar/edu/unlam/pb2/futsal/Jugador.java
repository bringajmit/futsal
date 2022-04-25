package ar.edu.unlam.pb2.futsal;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

	private Integer precio;
	private Integer edad;
	private List<Tarjetas>amonestaciones;

	public Jugador(Integer precio, Integer edad) {
		amonestaciones=new ArrayList<Tarjetas>();
		this.precio=precio;
		this.edad=edad;
	
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void amonestado(Double tiempo, Tarjetas tarjeta) {
		
		amonestaciones.add(tarjeta);
	}

	public List<Tarjetas> getAmonestaciones() {
		return amonestaciones;
	}

	public void setAmonestaciones(List<Tarjetas> amonestaciones) {
		this.amonestaciones = amonestaciones;
	}

}
