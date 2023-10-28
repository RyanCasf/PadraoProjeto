package br.com.ryan.service;

import static org.junit.jupiter.api.Assertions.*;

import br.com.ryan.connection.IConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
final class ReservationServiceTest {

	private ReservationService service;

	private IConnection iConnection = Mockito.mock(IConnection.class);

	@BeforeEach
	void setUp() {
		service = new ReservationService(iConnection);
	}

	@Test
	void create() {
		assertTrue(service.create());
	}
}