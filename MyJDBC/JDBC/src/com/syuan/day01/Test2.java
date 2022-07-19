package com.syuan.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test2 {

	public static void main(String[] args) {
		// 透過url自動載入
		// databaseName輸入要連接的資料庫名稱
		// 本機名稱:1433

		try {
			String url = "jdbc:sqlserver://Syuan:1433;databaseName=JDBC;trustServerCertificate=true";
			Connection conn = DriverManager.getConnection(url, "sa", "kyo232411");
			// 透過isclose方法檢查是成功連線
			// 因為沒有關閉連線, 所以isClosed為false, 前面加上!就變成true (比較直覺)
			boolean status = !conn.isClosed();
			System.out.println("連線狀態: " + status);
			//關閉連線
			conn.close();
			System.out.println("關閉連線");
			
		} catch (SQLException e) {
			System.out.println("連線失敗!!");
			e.printStackTrace();
		}
	}
}
