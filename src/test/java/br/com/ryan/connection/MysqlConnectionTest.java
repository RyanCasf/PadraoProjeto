package br.com.ryan.connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
final class MysqlConnectionTest {
	
	private MysqlConnection connection;
	
	@BeforeEach
	void setUp() {
		connection = new MysqlConnection();
	}
	
	@Test
	void connect() {
		connection.connect();
	}
}