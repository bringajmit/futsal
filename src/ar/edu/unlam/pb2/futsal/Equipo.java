package ar.edu.unlam.pb2.futsal;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private String nombre;
	private List <Jugador> listaDeJugadores;
	final Integer CANTIDAD_MAXIMA_DE_JUGADORES;

	public Equipo(String nombre) {
		CANTIDAD_MAXIMA_DE_JUGADORES=5;
		listaDeJugadores =new ArrayList<Jugador>();
		this.nombre=nombre;
	}

	public void agregarJugador(Jugador jugador) {

		listaDeJugadores.add(jugador);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public List<Jugador> getListaDeJugadores() {
		return listaDeJugadores;
	}

	public void setListaDeJugadores(List<Jugador> listaDeJugadores) {
		this.listaDeJugadores = listaDeJugadores;
	}

	public Integer getCANTIDAD_MAXIMA_DE_JUGADORES() {
		return CANTIDAD_MAXIMA_DE_JUGADORES;
	}

	public Double getValorEquipo() {
		Double valor=0.0;
		for (Jugador jugador : listaDeJugadores) {
			valor+=jugador.getPrecio();
		}
		return valor;
	}

	public Double getCalcularPromedioEdad() {
		Double edad=0.0;
		for (Jugador jugador : listaDeJugadores) {
			edad+=jugador.getEdad();
		}
		Double promedio=edad/listaDeJugadores.size();
		return promedio;
	}

	public int getCantidadDeJugadores() {
		Integer cantidad=0;
		for (Jugador jugador : listaDeJugadores) {
			if(listaDeJugadores.contains(jugador)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	

}
