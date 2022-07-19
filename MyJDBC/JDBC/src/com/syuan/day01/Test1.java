package com.syuan.day01;

public class Test1 {

	public static void main(String[] args) {
		//用Class.forName方法載入JDBC driver
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("連接成功");
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("連接失敗");
			e.printStackTrace();
		}
	}

}
