package servicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import modelos.Calculadora;

@DisplayName("Tests Clase ServicioPersona")
public class ServicioCalculadoraTest {
	
	private static Logger logger = Logger.getLogger("cl.desafiolatam.servicios.ServicioPersonaTest");
	private final ServicioCalculadora servicioCalculadora = new ServicioCalculadora();
	 
	@BeforeEach
	void init() {
		logger.info("*******Inicio metodo de prueba");
	}
	
	@Test
	@DisplayName("*******Test sumar Bien*******")
	void testSumarBien() {
		logger.info("info test sumarBien");
		Calculadora calcu = new Calculadora(2, 3);
		double respuestaServicio = servicioCalculadora.sumar(2, 3);
		assertEquals(5.0, respuestaServicio);
	}// fin testSumarBien
	
	@Test
	@DisplayName("*******Test sumar Mal*******")
	void testSumarMal() {
		logger.info("info test sumarMal");
		Calculadora calcu = new Calculadora(null, null);
		double respuestaServicio = servicioCalculadora.sumar(null, null);
		assertEquals(-100, respuestaServicio);
	}// fin testSumarMal
		
	@Test
	@DisplayName("*******Test restar Mal*******")
	void testRestarMal() {
		logger.info("info test sumarMal");
		Calculadora calcu = new Calculadora(null, null);
		double respuestaServicio = servicioCalculadora.restar(null, null);
		assertEquals(-100, respuestaServicio);
	}// fin testRestarMal
	
	@Test
	@DisplayName("*******Test multiplicar Mal*******")
	void testMultiplicarMal() {
		logger.info("info test multiplicar Mal");
		Calculadora calcu = new Calculadora(null, null);
		double respuestaServicio = servicioCalculadora.multiplicar(null, null);
		assertEquals(-100, respuestaServicio);
	}// fin testMultiplicarMal
	
	@Test
	@DisplayName("*******Test dividir Bien*******")
	void testDividirBien() {
		logger.info("info test dividir bien");
		Calculadora calcu = new Calculadora(2, 3);
		double respuestaServicio = servicioCalculadora.dividir(2, 3);
		assertEquals(0.6666666666666666, respuestaServicio);
	}// fin testDividirBien
	
	
	@Test
	@DisplayName("*******Test dividir Mal*******")
	void testDividirMal() {
		logger.info("info test dividir Mal");
		Calculadora calcu = new Calculadora(null, null);
		double respuestaServicio = servicioCalculadora.dividir(null, null);
		assertEquals(-100, respuestaServicio);
	}// fin testDividirMal
	
		
				
	@AfterEach
	void tearDown() {
		logger.info("*******Metodo de prueba finalizado");
	}
	
	@AfterAll
	static void done() {
		logger.info("*******Fin clase de pruebas");
	}

}// cierre clase: ServicioCalculadoraTest
