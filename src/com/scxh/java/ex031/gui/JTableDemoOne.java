package com.scxh.java.ex031.gui;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import com.scxh.java.ex015.mangesystem_db.StudentBean;
import com.scxh.java.ex015.mangesystem_db.StudentDB;

public class JTableDemoOne extends JFrame {
	Container container;

	public JTableDemoOne() {
		super("表格控件");
		this.setBounds(400, 100, 500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = this.getContentPane();
	}

	public void init() {

		String[] cols =  { "学号", "姓名" };
//		String[][] rows =  { { "1", "张三" }, { "2", "李四" },
//				{ "3", "麻子" } };

		String[][] rows = getRowData();
		
		JTable table = new JTable(rows, cols);
		JScrollPane scrollPane = new JScrollPane(table);
		
		container.add(scrollPane);

		this.setVisible(true);
	}
	
	public String[][] getRowData() {
		ArrayList<StudentBean> lists = StudentDB.getInstance()
				.selectAllStudent();
		int length = lists.size();
		String[][] arrays = new String[length][2];

		for (int i = 0; i < length; i++) {
			StudentBean student = lists.get(i);
			arrays[i][0] = student.getName();
			arrays[i][1] = student.getNumber();
		}

		return arrays;

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new JTableDemoOne().init();

	}

}
