package ar.edu.unlam.pb2.futsal;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLiga {

	/*4. Registrar un nuevo partido. En él se debe poder incorporar al local y al visitante.
Una vez creado el partido, se nos solicita poder registrar los siguientes eventos:
	a. Gol, se interesa conocer el autor y el minuto en el que ocurrió
 	b. Amonestados, se desea conocer el jugador amonestado y en qué minuto
(cuando un jugador es amonestado en dos oportunidades
automáticamente debe ser expulsado, y se espera que el sistema informes
esta situación).
	c. Expulsados, ya sea por doble amonestación o por expulsión directa, se
debe conocer los jugadores que son expulsados del partido.
	Ver el resumen. En este resumen se espera conocer el resultado del partido, y el
detalle de los autores de los goles, amonestados y expulsados*/
	
	@Test
	public void testQueSePuedadRegistrarUnNuevoPartido() {

		Equipo miEquipo=new Equipo("Sacachispa");
		//Equipo 1
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
		
		//Equipo 2
		Equipo miEquipo2=new Equipo("Def del Chaco");
		Jugador jugador6=new Jugador(2300,22);
		Jugador jugador7=new Jugador(2500,25);
		Jugador jugador8=new Jugador(3500,28);
		Jugador jugador9=new Jugador(1400,12);
		Jugador jugador10=new Jugador(900,32);
		
		miEquipo2.agregarJugador(jugador6);
		miEquipo2.agregarJugador(jugador7);
		miEquipo2.agregarJugador(jugador8);
		miEquipo2.agregarJugador(jugador9);
		miEquipo2.agregarJugador(jugador10);
		
		Partido partido=new Partido(miEquipo,miEquipo2);
		
		assertTrue(partido.inicio());
		
	}

	@Test
	public void testQueSePuedadRegistrarUnNuevoGolEnElPartido() {

		Equipo miEquipo=new Equipo("Sacachispa");
		//Equipo 1
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
		
		//Equipo 2
		Equipo miEquipo2=new Equipo("Def del Chaco");
		Jugador jugador6=new Jugador(2300,22);
		Jugador jugador7=new Jugador(2500,25);
		Jugador jugador8=new Jugador(3500,28);
		Jugador jugador9=new Jugador(1400,12);
		Jugador jugador10=new Jugador(900,32);
		
		miEquipo2.agregarJugador(jugador6);
		miEquipo2.agregarJugador(jugador7);
		miEquipo2.agregarJugador(jugador8);
		miEquipo2.agregarJugador(jugador9);
		miEquipo2.agregarJugador(jugador10);
		
		Partido partido=new Partido(miEquipo,miEquipo2);
		Gol gol1=new Gol(jugador1,15.0);
		partido.gol(gol1);
		
		assertTrue(partido.getGoles().contains(gol1));
	
		
	}
	
	@Test
	public void testQueSePuedadRegistrarUnAmonestadoEnElPartido() {

		Equipo miEquipo=new Equipo("Sacachispa");
		//Equipo 1
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
		
		//Equipo 2
		Equipo miEquipo2=new Equipo("Def del Chaco");
		Jugador jugador6=new Jugador(2300,22);
		Jugador jugador7=new Jugador(2500,25);
		Jugador jugador8=new Jugador(3500,28);
		Jugador jugador9=new Jugador(1400,12);
		Jugador jugador10=new Jugador(900,32);
		
		miEquipo2.agregarJugador(jugador6);
		miEquipo2.agregarJugador(jugador7);
		miEquipo2.agregarJugador(jugador8);
		miEquipo2.agregarJugador(jugador9);
		miEquipo2.agregarJugador(jugador10);
		
		Partido partido=new Partido(miEquipo,miEquipo2);
		//Amonestado amarilla=new Amonestado(jugador1,15.0);
		partido.amonestar(jugador1,15.0,Tarjetas.AMARILLA);
		//jugador1.amonestado(15.0, Tarjetas.AMARILLA);
		partido.amonestar(jugador1,15.0,Tarjetas.AMARILLA);
		partido.expulsarJugador(jugador1);
		
		assertEquals(partido.getEquipo1().getCantidadDeJugadores(),4);
		//assertEquals(partido.getAmonestados().contains(jugador1), jugador1.getAmonestaciones().contains(Tarjetas.AMARILLA));
	}
	
}
