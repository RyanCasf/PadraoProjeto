package br.com.ryan.service;

import br.com.ryan.connection.IConnection;

public class RoomService {
	
	private IConnection connection;
	
	public RoomService(IConnection connection) {
		this.connection = connection;
	}
	
	public boolean verification() {
		connection.connect();
		return true;
	}
}