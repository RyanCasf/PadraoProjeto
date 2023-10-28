package br.com.ryan.connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
final class OracleConnectionTest {

    private OracleConnection connection;

    @BeforeEach
    void setUp() {
        connection = new OracleConnection();
    }

    @Test
    void connect() {
        connection.connect();
    }
}