package br.com.ryan.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
final class ReservationServiceTest {

	private ReservationService service;

	@BeforeEach
	void setUp() {
		service = new ReservationService();
	}

	@Test
	void create() {
		assertTrue(service.create());
	}
}