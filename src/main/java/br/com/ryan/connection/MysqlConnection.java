package br.com.ryan.connection;

public class MysqlConnection implements IConnection {

	@Override
	public void connect() {
		System.out.println("Connection...");
	}
}