package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CiudadesService;

class TestCiudadesService {
	CiudadesService service;
	@BeforeEach
	void setUp() throws Exception {
		service=new CiudadesService();
		service.nuevaCiudad("c1", "p1", 100_000, 23.5);
		service.nuevaCiudad("c2", "p1", 200_000, 15.4);
		service.nuevaCiudad("c3", "p2", 800_000, 22.0);
		service.nuevaCiudad("c4", "p2", 70_000, 19.4);
		service.nuevaCiudad("c5", "p2", 140_000, 15.6);
	}

	@Test
	void testExisteCiudadTempInf() {
		assertTrue(service.existeCiudadTempInf(20));
		assertFalse(service.existeCiudadTempInf(5));
		
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("c3", service.ciudadMasPoblada().getNombre());
	}
	
	@Test
	void testTotalPaises() {
		assertEquals(2, service.totalPaises());
	}
	@Test
	void testMediaHabitantes() {
		assertEquals(150_000, service.mediaHabitantesPorPais("p1"),0.5);
	}
	@Test
	void testTemperaturaMax() {
		assertEquals(23.5, service.temperaturaMasAlta());
	}
	
	@Test
	void testAgrupamiento() {
		service.nuevaCiudad("c6", "p3", 140_000, 15.6);
		assertEquals(3, service.ciudadesPorPais().get("p2").size());
		assertEquals(2, service.ciudadesPorPais().get("p1").size());
		assertEquals(1, service.ciudadesPorPais().get("p3").size());
	}

}
