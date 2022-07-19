package com.syuan.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test03 {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://Syuan:1433;databaseName=JDBC;trustServerCertificate=true";
		//此方法會自動關閉連線, 不需要使用 close方法
		try(Connection conn = DriverManager.getConnection(url, "sa", "kyo232411")) {
			
			System.out.println("連線成功");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("連線失敗");
			e.printStackTrace();
		}

	}

}
