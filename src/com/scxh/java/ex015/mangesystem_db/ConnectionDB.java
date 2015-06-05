package com.scxh.java.ex015.mangesystem_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	// 驱动程序名
	private String driver = "com.mysql.jdbc.Driver";
	// URL指向要访问的数据库名mydata
	private String url = "jdbc:mysql://localhost:3306/scxh";
	// MySQL配置时的用户名
	private String user = "root";
	// MySQL配置时的密码
	private String password = "a123";

	/**
	 * 加载驱动程序
	 */
	protected ConnectionDB() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 建立数据库连接
	 */
	public Connection getConnection() {
		Connection connect = null;
		try {
			connect = (Connection) DriverManager.getConnection(url, user,
					password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connect;
	}

	/**
	 * 关闭数据库连接
	 * 
	 * @param con
	 */
	public void freeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
