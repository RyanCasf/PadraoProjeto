package br.com.ryan.service;

import br.com.ryan.connection.MysqlConnection;

public class ReservationService {
	
	private MysqlConnection connection;
	
	public ReservationService() {
		connection = new MysqlConnection();
	}
	
	public boolean create() {
		connection.connection();
		return true;
	}
}