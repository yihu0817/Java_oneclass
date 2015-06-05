package com.scxh.java.ex031.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.scxh.java.ex015.mangesystem_db.StudentBean;
import com.scxh.java.ex015.mangesystem_db.StudentDB;

public class InsertDemo extends JFrame {
	JTextField userTxt;
	JButton inserBtn;

	public InsertDemo() {
		super("登录界面");
		this.setLayout(new FlowLayout());
		this.setBounds(500, 100, 290, 390);
	}

	public void init() {
		userTxt = new JTextField(10);
		inserBtn = new JButton("插入数据");

		inserBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String message = userTxt.getText();

				StudentBean student = new StudentBean();
				student.setName(message);
				student.setNumber("2001");

				StudentDB db = StudentDB.getInstance();
				db.addStudent(student);

			}
		});
		
		this.getContentPane().add(userTxt);
		this.getContentPane().add(inserBtn);
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new InsertDemo().init();

	}

}
