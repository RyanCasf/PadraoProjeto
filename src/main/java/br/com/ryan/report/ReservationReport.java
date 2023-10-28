package br.com.ryan.report;

import br.com.ryan.connection.MysqlConnection;

public class ReservationReport {
	
	private MysqlConnection connection;
	
	public ReservationReport() {
		connection = new MysqlConnection();
	}
	
	public boolean report() {
		connection.connection();
		return true;
	}
}