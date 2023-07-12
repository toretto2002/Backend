package com.JDBC;

import java.sql.SQLException;

public class MainProject {

	public static void main(String[] args) {
		
		//long id;
		//String name;
		//String lastname;
		//char gender;
		//LocalDate birthdate;
		//double avg;
		//double min_vote;
		//double max_vote;
		
		try {
			
			DbConnection db = new DbConnection();
			
			SchoolStudent s1 = new SchoolStudent("Mario", "Rossi", "m", "16/11/2002", 5, 8, 7.2); 
			SchoolStudent s2 = new SchoolStudent("Luigi", "Verdi", "m", "10/07/2008", 8, 9, 8.4); 
			SchoolStudent s3 = new SchoolStudent("Christian", "Neri", "m", "03/09/2000", 3, 6, 5.7); 
			
			db.insertStudent(s1);
			db.insertStudent(s2);
			db.insertStudent(s3);
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}

}
