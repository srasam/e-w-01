package com.proj1.net;

import java.sql.SQLException;

public class TestConn {

	public static void main(String[] args) throws SQLException {
		DB_connection conn= new DB_connection("jdbc:mysql://localhost:3306/bookstore?enabledTLSProtocols=TLSv1.2","root","root");
		conn.get_schema();
		conn.get_tables();
		

	}

}
