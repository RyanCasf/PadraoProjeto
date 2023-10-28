package br.com.ryan.report;

import br.com.ryan.connection.IConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
final class ReservationReportTest {

    private ReservationReport report;

    private IConnection iConnection = Mockito.mock(IConnection.class);

    @BeforeEach
    void setUp() {
        report = new ReservationReport(iConnection);
    }

    @Test
    void report() {
        assertTrue(report.report());
    }
}