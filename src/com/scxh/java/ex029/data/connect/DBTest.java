package com.scxh.java.ex029.data.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 1.引入数据库驱动程序
 * 2.加载驱动  
 * 3.建立连接
 * 4.获取Statement对象，处理SQL语句的类
 * @author viktor
 *
 */
public class DBTest {
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://192.168.1.199:3306/scxh?characterEncoding=UTF-8";
		String url = "jdbc:mysql://192.168.1.199:3306/scxh";
		String username = "root";
		String password = "a123";
		
		Connection connect = null;
		Statement sql = null;
		try {
			Class.forName(driver);////加载驱动程序

			//建立数据库连接
			connect = DriverManager.getConnection(url, username,password);
			
			if(!connect.isClosed())
				System.out.println("数据连接成功！");
			
			//处理SQL语句的类
			sql = connect.createStatement();
			
			//执行SQL语句
			sql.execute("insert into student (number,name,sex,age) values (1004,'小明','女','3岁')");
			
			sql.execute("update student set name = '小汪' where name='小明'");
			
			System.out.println("插入数据成功");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(sql != null)
				try {
					sql.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			
			if(connect!= null){
				try {
					connect.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}			
		}
	}
}
