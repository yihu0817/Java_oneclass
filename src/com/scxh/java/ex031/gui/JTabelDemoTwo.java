package com.scxh.java.ex031.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.scxh.java.ex015.mangesystem_db.StudentBean;
import com.scxh.java.ex015.mangesystem_db.StudentDB;

public class JTabelDemoTwo extends JFrame {
	private JPanel topPanel;
	private JTable table;

	public JTabelDemoTwo() {
		setTitle("Simple JTable Application");
		setSize(300, 100);
		setBackground(Color.gray);

		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		getContentPane().add(topPanel);

		String cols[] = { "ÐÕÃû", "Ñ§ºÅ" };

		String rowData[][] = getRowData();

		table = new JTable(rowData, cols);
		JScrollPane scrollPane = new JScrollPane(table);
		topPanel.add(scrollPane, BorderLayout.CENTER);
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

	public static void main(String args[]) {
		JTabelDemoTwo mainFrame = new JTabelDemoTwo();
		mainFrame.setVisible(true);
	}
}