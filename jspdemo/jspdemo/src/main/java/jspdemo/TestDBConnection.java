package jspdemo;

import java.sql.SQLException;
import java.util.List;

public class TestDBConnection {

	public static void main(String[] args) throws SQLException {
		TableDao td=new TableDao("jdbc:mysql://localhost:3306/to-do?enabledTLSProtocols=TLSv1.2","root","root");
		
		// if table is created then tell me that table is created and is available to use
		// SampleClass _something = tb.createTable("doctor");
		// if (!_something.getError())
			// yes table is created successfully
		// else 
			// table is not created
			// the reason is _Something.getError();
		// if table is not crated then tell me that the table is not created, and what is the reason.
		
		td.create_table("doctor1");
		//td.listAllTables();
		
		
	}

}



// someFunction(ClassBsoemthing _object){
	
	//int a = calucated();
	//String b = StringCalucated();
	//ClassSample A = getClassACaluclated();
	
	//return (a,b,A)
//}