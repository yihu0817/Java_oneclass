//
//package com.scxh.java.ex030.data.connects;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//
//import org.apache.log4j.Logger;
//
//import com.josetech.connectionpool.ConnectionConfig;
//import com.josetech.connectionpool.ConnectionPool;
//
///**
// * 数据库连接池
// * @author sqlover
// */
//public class DBPool
//{
//	private final static Logger logger = Logger.getLogger(DBPool.class);
//	private static String type = Parameter.DB_TYPE;
//	private static String driver = Parameter.DB_DRIVER;
//	private static String dbName = Parameter.DB_NAME;
//	private static String userName = Parameter.DB_USER;
//	private static String ip = Parameter.DB_IP;
//	private static String userPassword = Parameter.DB_PASSWORD;
//		
//	/**
//	 * 从连接池里得到一条数据库连接
//	 * @return Connection
//	 */
//	public static Connection getConnection()
//	{
//		ConnectionConfig config =
//			new ConnectionConfig(
//				type,
//				driver,
//				dbName,
//				userName,
//				userPassword,
//				ip);
//		ConnectionPool pool = null;
//		Connection con = null;
//		
//		/*System.out.println("type="+type);
//		System.out.println("driver="+driver);
//		System.out.println("dbName="+dbName);
//		System.out.println("userName="+userName);
//		System.out.println("ip="+ip);
//		System.out.println("userPassword="+userPassword);*/
//
//		try
//		{
//			pool = ConnectionPool.getInstance(config);
//			con = pool.getConnection();
//		}
//		catch (ClassNotFoundException cnfe)
//		{
//			logger.error(cnfe.getMessage(), cnfe);
//		}
//		catch (SQLException sqle)
//		{
//			logger.error(sqle.getMessage(), sqle);
//		}
//
//		return con;
//	}
//
//	/**
//	 * 释放一条连接回数据库连接池
//	 * @param con
//	 */
//	public static void freeConnection(Connection con)
//	{
//		ConnectionConfig config =
//			new ConnectionConfig(
//				type,
//				driver,
//				dbName,
//				userName,
//				userPassword,
//				ip);
//		ConnectionPool pool = null;
//
//		try
//		{
//			pool = ConnectionPool.getInstance(config);
//			pool.poolConnection(con);
//		}
//		catch (ClassNotFoundException cnfe)
//		{
//			logger.error(cnfe.getMessage(), cnfe);
//		}
//		catch (SQLException sqle)
//		{
//			logger.error(sqle.getMessage(), sqle);
//		}
//	}
//}
