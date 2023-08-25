package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jsp";
		String password = "jsp";

		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩실패");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("DB접속오류");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("알수없는오류");
			e.printStackTrace();
		}
		return conn;
	}
}
