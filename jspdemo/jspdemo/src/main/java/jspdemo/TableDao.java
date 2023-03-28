package jspdemo;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class TableDao {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;

	public TableDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	protected void db_connect() throws SQLException {
		System.out.println(this.jdbcConnection);
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				System.out.println("DB connection sucessful");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

	public void create_table(String table_name) throws SQLException{
		String create = "CREATE TABLE " + table_name + "(" + "NAME VARCHAR(45) NOT NULL);";
		System.out.println(create);
		db_connect();
		Statement statement = jdbcConnection.createStatement();
		List<String> checkTable = new ArrayList<>();
		listAllTables();
	boolean table_exists=checkTable.contains(table_name);
	System.out.println(table_exists);
	
		try {
		if (!table_exists) {
			
			
			statement.executeUpdate(create);
			System.out.println("Table "+table_name+" created");
		} else {
			System.out.println("entered else loop");
			System.out.println("Table name "+table_name+" already exists");
			
		}
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
	// if table exists then don't create table
	// check if the table with the same name exists.. how do we do this?
	// execute getmetatada.getschema
	// then execute getschema.gettables
	// store it in an array all the tables names
	// see if the table name exists then do no execute line number 58
	// if table name doesn't exist, then execute line number 58
//	DatabaseMetaData databaseMetaData = jdbcConnection.getMetaData();
//	String[] types = { "TABLE" };
//	ResultSet rs = databaseMetaData.getTables(null, null, "%", types);
//	while (rs.next()) {
//		checkTable.add(rs.getString("TABLE_NAME"));
//	}
//	
//	System.out.println(table_name);

//  Table table=new Table(table_name);
//  statement.setString(1,table.getTablename());

	// listAlltables(String _schmaName)
	public List<String> listAllTables() throws SQLException {
		List<String> listTable = new ArrayList<>();
		db_connect();
		DatabaseMetaData databaseMetaData = jdbcConnection.getMetaData();
		String[] types = { "TABLE" };
		ResultSet rs = databaseMetaData.getTables(null, null, "%", types);
		while (rs.next()) {
//			String tablename = rs.getString("TABLE_NAME");
//			Table table = new Table(tablename);
			listTable.add(rs.getString("TABLE_NAME"));
		}
//		for (int i = 0; i < listTable.size(); i++) {
//			System.out.println(listTable.get(i));
//		}
	

		return listTable;
	}

}
