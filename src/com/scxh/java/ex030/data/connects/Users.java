//package com.scxh.java.ex030.data.connects;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.Vector;
//
//import org.apache.log4j.Logger;
//
//public class Users {
//	private static Logger log = Logger.getLogger(Users.class);
//
//	private static Users USS = null;
//
//
//	public static Users getInstance() {
//		if (USS == null) {
//			USS = new Users();
//		}
//		return USS;
//	}
//
//	public void addUser(User user) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "insert into systemuser (username,password,usertype,regdatetime)values(?,?,?,?)";
//		try {
//			con = DBPool.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setString(1, user.getUserName());
//			ps.setString(2, user.getPassWord());
//			ps.setString(3, user.getUserType());
//			ps.setString(4, user.getRegdatetime());
//			ps.executeUpdate();
//		} catch (Exception ex) {
//			log.info(ex.getMessage(), ex);
//		} finally {
//			try {
//				if (ps != null)
//					ps.close();
//			} catch (SQLException sqle) {
//			}
//			if (con != null)
//				DBPool.freeConnection(con);
//		}
//	}
//
//	public boolean selectUser(String username) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "select * from systemuser where username=?";
//		boolean fals = false;
//		try {
//			con = DBPool.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setString(1, username);
//			ResultSet rs = ps.executeQuery();
//			if (rs.next()) {
//				fals = true;
//			}
//		} catch (Exception ex) {
//			log.info(ex.getMessage(), ex);
//		} finally {
//			try {
//				if (ps != null)
//					ps.close();
//			} catch (SQLException sqle) {
//			}
//			if (con != null)
//				DBPool.freeConnection(con);
//		}
//		return fals;
//	}
//
//	public void updateUser(User user) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "update systemuser set username=?,password=?,usertype=?,regdatetime=? where id=?";
//		try {
//			con = DBPool.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setString(1, user.getUserName());
//			ps.setString(2, user.getPassWord());
//			ps.setString(3, user.getUserType());
//			ps.setString(4, user.getRegdatetime());
//			ps.setString(5, user.getId());
//			ps.executeUpdate();
//		} catch (Exception ex) {
//			log.info(ex.getMessage(), ex);
//		} finally {
//			try {
//				if (ps != null)
//					ps.close();
//			} catch (SQLException sqle) {
//			}
//			if (con != null)
//				DBPool.freeConnection(con);
//		}
//	}
//
//	public void deleteUser(String id) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "delete from systemuser where id=?";
//		try {
//			con = DBPool.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setString(1, id);
//			ps.executeUpdate();
//		} catch (Exception ex) {
//			log.info("delete:" + ex.getMessage());
//		} finally {
//			try {
//				if (ps != null)
//					ps.close();
//			} catch (SQLException sqle) {
//			}
//			if (con != null)
//				DBPool.freeConnection(con);
//		}
//	}
//
//	public ArrayList<User> selectAllUser() {
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "select * from systemuser";
//		ArrayList<User> mList = new ArrayList<User>();
//		try {
//			con = DBPool.getConnection();
//			ps = con.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				User user = new User();
//				user.setId(rs.getString("id"));
//				user.setUserName(rs.getString("username"));
//				user.setPassWord(rs.getString("password"));
//				user.setRegdatetime(rs.getString("regdatetime"));
//				if (rs.getString("usertype").equals("0"))
//					user.setUserType("管理员");
//				else
//					user.setUserType("一般用户");
//				mList.add(user);
//			}
//		} catch (Exception ex) {
//			log.info(ex.getMessage(), ex);
//		} finally {
//			try {
//				if (ps != null)
//					ps.close();
//			} catch (SQLException sqle) {
//			}
//			if (con != null)
//				DBPool.freeConnection(con);
//		}
//		return mList;
//	}
//
//	public User seleUsers(String id) {
//		Connection con = null;
//		PreparedStatement ps = null;
//		String sql = "select * from systemuser where id =?";
//		User user = new User();
//		try {
//			con = DBPool.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setString(1, id);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				user.setId(rs.getString("id"));
//				user.setUserName(rs.getString("username"));
//				user.setPassWord(rs.getString("password"));
//				user.setRegdatetime(rs.getString("regdatetime"));
//			}
//		} catch (Exception ex) {
//			log.info(ex.getMessage(), ex);
//		} finally {
//			try {
//				if (ps != null)
//					ps.close();
//			} catch (SQLException sqle) {
//			}
//			if (con != null)
//				DBPool.freeConnection(con);
//		}
//		return user;
//
//	}
//}
