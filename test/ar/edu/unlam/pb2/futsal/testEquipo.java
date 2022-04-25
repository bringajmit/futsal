package ar.edu.unlam.pb2.futsal;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEquipo {

	/*1. Agregar los jugadores a los equipos (los equipos no es necesario dar de alta
porque se conforman previo al inicio de la competencia, es decir contaremos de
antemano con esa información). 
*/
	
	@Test
	public void testQueSePuedanAgregarJugadoresAUnEquipo() {

		Equipo miEquipo=new Equipo("Sacachispa");
		
		Jugador jugador1=new Jugador(2300,22);
		Jugador jugador2=new Jugador(2500,25);
		Jugador jugador3=new Jugador(3500,28);
		Jugador jugador4=new Jugador(1400,12);
		Jugador jugador5=new Jugador(900,32);
		
		miEquipo.agregarJugador(jugador1);
		
		assertTrue(miEquipo.getListaDeJugadores().contains(jugador1));
	
	}
	
/*2. Calcular el valor del equipo, esto es la sumatoria del precio de cada jugador. */

	@Test
	public void testQueSeCalculaCorrectamenteElValorDelEquipo() {

		Equipo miEquipo=new Equipo("Sacachispa");
		
		Jugador jugador1=new Jugador(2300,22);
		Jugador jugador2=new Jugador(2500,25);
		Jugador jugador3=new Jugador(3500,28);
		Jugador jugador4=new Jugador(1400,12);
		Jugador jugador5=new Jugador(900,32);
		
		miEquipo.agregarJugador(jugador1);
		miEquipo.agregarJugador(jugador2);
		miEquipo.agregarJugador(jugador3);
		miEquipo.agregarJugador(jugador4);
		miEquipo.agregarJugador(jugador5);
		
		Double resultadoObtenido=miEquipo.getValorEquipo();
		Double valorEquipoEsperado=10600.00;
		
		assertEquals(resultadoObtenido, valorEquipoEsperado);
	
	}
	
	/*3. Calcular la edad promedio del equipo.*/
	
	@Test
	public void testQueSeCalculaCorrectamenteElPromedioDeEdadDelEquipo() {

		Equipo miEquipo=new Equipo("Sacachispa");
		
		Jugador jugador1=new Jugador(2300,22);
		Jugador jugador2=new Jugador(2500,25);
		Jugador jugador3=new Jugador(3500,28);
		Jugador jugador4=new Jugador(1400,12);
		Jugador jugador5=new Jugador(900,32);
		
		miEquipo.agregarJugador(jugador1);
		miEquipo.agregarJugador(jugador2);
		miEquipo.agregarJugador(jugador3);
		miEquipo.agregarJugador(jugador4);
		miEquipo.agregarJugador(jugador5);
		
		Double resultadoObtenido=miEquipo.getCalcularPromedioEdad();
		Double valorEquipoEsperado=23.8;
		
		assertEquals(resultadoObtenido, valorEquipoEsperado);
	
	}
	
}
