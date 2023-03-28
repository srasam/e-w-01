package com.customer.jquery;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		CityDAO cityDao=new CityDAO("jdbc:mysql://localhost:3306/world_x?enabledTLSProtocols=TLSv1.2","root","root");
	//cityDao.connect();	
	cityDao.listAllRows();
	}

}
