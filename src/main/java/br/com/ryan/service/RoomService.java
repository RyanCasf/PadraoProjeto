package br.com.ryan.service;

import br.com.ryan.connection.MysqlConnection;

public class RoomService {
	
	private MysqlConnection connection;
	
	public RoomService() {
		connection = new MysqlConnection();
	}
	
	public boolean verification() {
		connection.connection();
		return true;
	}
}