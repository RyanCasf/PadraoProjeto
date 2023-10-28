package br.com.ryan.connection;

public class OracleConnection implements IConnection {

    @Override
    public void connect() {
        System.out.println("Connection...");
    }
}