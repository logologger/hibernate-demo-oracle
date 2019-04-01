package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	public static void main(String args[]) {
		
		try {
			String url  = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimeZone=UTC";
			
			String user = "hbstudent";
			String pass = "hbstudent";
			
			System.out.println("Connection Started .. ");
			Connection con = DriverManager.getConnection(url , user , pass);
			System.out.println("Connection Completed ..");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
