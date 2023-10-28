package br.com.ryan.service;

import br.com.ryan.connection.IConnection;

public class ReservationService {
	
	private IConnection connection;
	
	public ReservationService(IConnection connection) {
		this.connection = connection;
	}
	
	public boolean create() {
		connection.connect();
		return true;
	}
}