package ar.edu.unlam.pb2.futsal;

import java.util.ArrayList;
import java.util.List;

public class Partido {

	private Equipo equipo1;
	private Equipo equipo2;
	private List<Gol> goles; 
	private List<Jugador> amonestados;

	public Partido(Equipo equipo1, Equipo equipo2) {
		goles=new ArrayList<Gol>();
		amonestados=new ArrayList<Jugador>();
		this.equipo1=equipo1;
		this.equipo2=equipo2;
		
	}

	public boolean inicio() {
		if(equipo1.getCantidadDeJugadores()<=5 && equipo2.getCantidadDeJugadores()<=5) {
			return true;
		}
		
		return false;
	}
	
	public void amonestar(Jugador jugador, Double tiempo, Tarjetas tarjeta) {
		jugador.amonestado(tiempo, tarjeta);
		 amonestados.add(jugador);
	}

	public Boolean gol(Gol gol) {
	return	goles.add(gol);
	}
	
	

	public List<Jugador> getAmonestados() {	
		return amonestados;
	}

	public void setAmonestados(List<Jugador> amonestados) {
		this.amonestados = amonestados;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public List<Gol> getGoles() {
		return goles;
	}

	public void setGoles(List<Gol> goles) {
		this.goles = goles;
	}

	public void expulsarJugador(Jugador jugador) {

		if(jugador.getAmonestaciones().size()>=2) {
			equipo1.getListaDeJugadores().remove(jugador);
		}
		
	}

}
