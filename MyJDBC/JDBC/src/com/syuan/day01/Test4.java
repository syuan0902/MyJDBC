package com.syuan.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test4 {
	private Connection conn;
	
	//建立連線
	public void CreateConnection() {
		try {
			String url = "jdbc:sqlserver://Syuan:1433;databaseName=JDBC;trustServerCertificate=true";
			this.conn = DriverManager.getConnection(url, "sa", "kyo232411");
			System.out.println("連線成功");
		
		} catch (SQLException e) {
			System.out.println("連線失敗");			
			e.printStackTrace();
		}
	}
	
	//關閉連線
	public void CloseConnection() {
		try {
			if(conn.isClosed() == false) {
				conn.close();
				System.out.println("關閉連線");			
			}
			
		} catch (SQLException e) {
			System.out.println("關閉連線失敗");			
			e.printStackTrace();
		}
		
	}
	
	//修改資料
	public void UpdateData() {
		try {
			//將sql指令字串傳給變數data
			String data = "update product set productprice = 1000 where productid = 1004";
			//建立statement物件
			Statement state = conn.createStatement();
			//將資料修改筆數傳給變數count
			int count = state.executeUpdate(data);
			System.out.println("修改了 " + count + "筆資料");	
			state.close();
		
		
		} catch (SQLException e) {
			System.out.println("資料修改失敗");	
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//建立Test4物件, 使用該類別的方法
		Test4 test = new Test4();
		
		test.CreateConnection();
		
		test.UpdateData();
		
		test.CloseConnection();
		
	}
}
