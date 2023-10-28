package br.com.ryan.report;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
final class ReservationReportTest {

    private ReservationReport report;

    @BeforeEach
    void setUp() {
        report = new ReservationReport();
    }

    @Test
    void report() {
        assertTrue(report.report());
    }
}