package br.com.ryan.report;

import br.com.ryan.connection.IConnection;

public class ReservationReport {
	
	private IConnection connection;
	
	public ReservationReport(IConnection connection) {
		this.connection = connection;
	}
	
	public boolean report() {
		connection.connect();
		return true;
	}
}