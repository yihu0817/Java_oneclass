package com.scxh.java.ex029.data.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	// 声明Connection对象
	private Connection connect;
	// 驱动程序名
	private String driver = "com.mysql.jdbc.Driver";
	// URL指向要访问的数据库名mydata
	private String url = "jdbc:mysql://localhost:3306/scxh";
	// MySQL配置时的用户名
	private String user = "root";
	// MySQL配置时的密码
	private String password = "a123";

	public DBUtil() {
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
	public void connectDB() {
		try {
			connect = (Connection) DriverManager.getConnection(url, user,
					password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 添加学生对象
	 * 
	 * @param student
	 */
	public void addStudent(Student student) {

		String sql = "insert into student (number,name,sex,age) values ('"
				+ student.getNumber() + "','" + student.getName() + "','"

				+ student.getSex() + "','" + student.getAge() + "')";
		Statement stateMent = null;
		try {
			stateMent = connect.createStatement();
			stateMent.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void inSertStudent(Student student) {

		String sql = "insert into student (number,name,sex,age) values (?,?,?,?)";
		PreparedStatement pStmt = null;
		try {
			pStmt = connect.prepareStatement(sql);
			pStmt.setLong(1, student.getNumber());
			pStmt.setString(2, student.getName());
			pStmt.setString(3, student.getSex());
			pStmt.setString(4, student.getAge());

			pStmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pStmt != null) {
				try {
					pStmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 修改学生记录根据指定ID
	 * 
	 * @param student
	 * @param id
	 */
	public void updateStudentById(Student student, int id) {
		String sql = "update student set name = '" + student.getName()
				+ "', number = '" + student.getNumber() + "' where id='" + id
				+ "'";
		Statement stateMent = null;
		try {
			stateMent = connect.createStatement();
			stateMent.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 删除学生记录
	 * 
	 * @param id
	 */
	public void deleteStudentById(int id) {
		String sql = "delete from student where id = " + id;
		Statement stateMent = null;
		try {
			stateMent = connect.createStatement();
			stateMent.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void selectStudent() {
		String sql = "select * from student";
		Statement stateMent = null;
		ResultSet resultSet = null;
		try {
			stateMent = connect.createStatement();
			resultSet = stateMent.executeQuery(sql);
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				int number = resultSet.getInt("number");
				String sex = resultSet.getString("sex");
				String age = resultSet.getString("age");

				System.out.println("姓名:" + name + "学号 :" + number + " 性别 :"
						+ sex + " 年龄 :" + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stateMent != null) {
				try {
					stateMent.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void closeDB() {
		if (connect != null) {
			try {
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
