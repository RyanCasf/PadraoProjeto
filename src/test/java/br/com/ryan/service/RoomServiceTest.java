package br.com.ryan.service;

import br.com.ryan.connection.IConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
final class RoomServiceTest {

    private RoomService service;

    private IConnection iConnection = Mockito.mock(IConnection.class);

    @BeforeEach
    void setUp() {
        service = new RoomService(iConnection);
    }

    @Test
    void verification() {
        assertTrue(service.verification());
    }
}