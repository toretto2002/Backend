package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
	String dbName = "compitojdbc";
	String user = "postgres";
	String pass = "root";
	Statement st;
	
	
	public DbConnection() throws SQLException {
		
		Connection conn = DriverManager.getConnection(url+dbName, user, pass);
		st = conn.createStatement();
		createStudentTable();
		System.out.println("Db connesso!!!");
	}
	
	//long id;
	//String name;
	//String lastname;
	//char gender;
	//LocalDate birthdate;
	//double avg;
	//double min_vote;
	//double max_vote;
	
	public void createStudentTable() throws SQLException {
		String sql = " CREATE TABLE IF NOT EXISTS student ("
				+ "		id SERIAL PRIMARY KEY,"
				+ " 	name VARCHAR NOT NULL,"
				+ "		lastname VARCHAR NOT NULL,"
				+ "		gender VARCHAR NOT NULL,"
				+ "		birthdate VARCHAR NOT NULL,"
				+ "		avg DECIMAL NOT NULL,"
				+ "		min_vote DECIMAL NOT NULL,"
				+ "		max_vote DECIMAL NOT NULL"
				+ " );" ;
		
		st.executeUpdate(sql);
		
		System.out.println("Table studenti created!!!");
	}
	
	public void insertStudent(SchoolStudent s) throws SQLException {
		
		String sql = "INSERT INTO student (name, lastname, gender, birthdate, avg, min_vote, max_vote)"
				+ " VALUES ('" + s.getName() + "', '" + s.getLastname() + "', '" + s.getGender() + "', '" + s.getBirthdate() + "', '"
				+ s.getAvg() + "', '" + s.getMin_vote() + "', '" + s.getMax_vote() + "'); ";
		st.executeUpdate(sql);
		System.out.println("studente aggiunto!!!");
	}
	
	
}
