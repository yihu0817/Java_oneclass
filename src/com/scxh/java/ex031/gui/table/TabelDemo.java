package com.scxh.java.ex031.gui.table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TabelDemo extends JFrame {
	private MyTableModel model;
	private JTable table;
	private JScrollPane tableJSPane;
	private JButton clearDataBtn, addDataBtn, saveDataBtn;
	private JPanel oneJPane;

	public TabelDemo() {
		super("学生信息管理系统 ");
		this.setLocation(450, 100);
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		clearDataBtn = new JButton("清除数据");
		addDataBtn = new JButton("添加数据");
		saveDataBtn = new JButton("保存数据");
		oneJPane = new JPanel();
		model = new MyTableModel(20);
		table = new JTable(model);
		tableJSPane = new JScrollPane(table);

		clearDataBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeData();
			}
		});
		addDataBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addData();
			}
		});
		saveDataBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveData();
			}
		});

		oneJPane.add(clearDataBtn);
		oneJPane.add(addDataBtn);
		oneJPane.add(saveDataBtn);

		table.setBackground(Color.white);

		this.add(tableJSPane, BorderLayout.CENTER);
		this.add(oneJPane, BorderLayout.NORTH);

		this.setVisible(true);
	}

	private void addData() {
		model.addRow("李逵", true, "19");
		table.updateUI();
	}

	private void removeData() {
		model.removeRows(0, model.getRowCount());
		table.updateUI();
	}

	// 保存数据，暂时是将数据从控制台显示出来
	private void saveData() {
		int col = model.getColumnCount();
		int row = model.getRowCount();
		for (int i = 0; i < col; i++) {
			System.out.print(model.getColumnName(i) + "\t");
		}
		System.out.print("\r\n");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(model.getValueAt(i, j) + "\t");
			}
			System.out.print("\r\n");
		}
		System.out.println("------------------------------------");
	}

	public static void main(String args[]) {
		new TabelDemo().init();
		System.out
				.println("按下保存按钮将会把JTable中的内容显示出来\r\n------------------------------------");
	}

}
