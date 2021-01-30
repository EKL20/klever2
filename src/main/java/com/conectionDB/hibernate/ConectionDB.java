package com.conectionDB.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl="jdbc:mysql://localhost:3306/dbklever?useSSL=false";
		
		String user="root";
		String password="";
		
		try {
			System.out.println("Conectando a la DB..."+jdbcUrl);
			Connection cnn=DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Estas conectado ahora!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
