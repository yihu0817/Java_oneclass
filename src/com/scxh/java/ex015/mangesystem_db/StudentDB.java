package com.scxh.java.ex015.mangesystem_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class StudentDB {
	private static StudentDB USS = null;
	// 驱动程序名
	private String driver = "com.mysql.jdbc.Driver";
	// URL指向要访问的数据库名mydata
	private String url = "jdbc:mysql://localhost:3306/scxh";
	// MySQL配置时的用户名
	private String user = "root";
	// MySQL配置时的密码
	private String password = "a123";

	public static StudentDB getInstance() {
		if (USS == null) {
			USS = new StudentDB();
		}
		return USS;
	}

	private StudentDB(){
		// 加载驱动程序
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 数据库连接
	 */
	public Connection getConnection() {
		Connection connect = null;
		try {
			connect = (Connection) DriverManager.getConnection(url, user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connect;
	}
	/**
	 * 添加学生对象到数据库
	 * @param student
	 */
	public void addStudent(StudentBean student) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into students (name,number)values(?,?)";
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getNumber());
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
	}
	/**
	 * 根据学生姓名判断学生是否存在
	 * @param studentName
	 * @return
	 */
	public boolean selectStudent(String studentName) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students where name=?";
		boolean fals = false;
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, studentName);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				fals = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return fals;
	}
	
	/**
	 * 根据学生学号判断学生是否存在
	 * @param number
	 * @return
	 */
	public boolean selectStudentByNumber(String number) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students where number=?";
		boolean fals = false;
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, number);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				fals = true;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return fals;
	}
	/**
	 * 修改学生信息
	 * @param student
	 */
	public void updateStudentBean(StudentBean student,String oldNumber) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "update students set name=?,number=? where number=?";
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, student.getName());
			ps.setString(2, student.getNumber());
			ps.setString(3, oldNumber);
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
	}
	/**
	 * 删除学生信息
	 * @param number
	 */
	public void deleteStudentBean(String number) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "delete from students where number=?";
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, number);
			ps.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
	}
	/**
	 * 查询所有学生信息
	 * @return
	 */
	public ArrayList<StudentBean> selectAllStudent() {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students";
		ArrayList<StudentBean> mList = new ArrayList<StudentBean>();
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentBean student = new StudentBean();
				
				student.setName(rs.getString("name"));
				student.setNumber(rs.getString("number"));
				
				mList.add(student);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return mList;
	}
	/**
	 * 根据学号查找学生
	 * @param number
	 * @return
	 */
	public StudentBean seleStudentBeans(String number) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "select * from students where number =?";
		StudentBean student = new StudentBean();
		try {
			con = getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, number);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				student.setName(rs.getString("name"));
				student.setNumber(rs.getString("number"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException sqle) {
			}
			if (con != null)
				freeConnection(con);
		}
		return student;

	}
	
	public void freeConnection(Connection con){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
