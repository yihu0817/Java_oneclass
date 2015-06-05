package com.scxh.java.ex031.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 1.窗口->容器->布局->组件 2.事件->监听->注册事件监听
 * 
 * @author viktor
 * 
 */
public class WindwoEevenDemoOne extends JFrame implements ActionListener {
	Container container; //容器
	JButton loginBtn;    //登录按钮
	JButton registBtn;  //注册按钮
	JLabel userNameLable; //显示用户名的标签
	JLabel passWordLable; //显示密码标签

	public WindwoEevenDemoOne() {
		super("第一个窗口程序");
		this.setBounds(500, 100, 400, 300);
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
		container.setBackground(Color.white);
		
		this.setVisible(true);
	}

	public void intint() {
		//初化控件
		loginBtn = new JButton("登录");
		registBtn = new JButton("注册");
		userNameLable = new JLabel("用户名:");
		passWordLable = new JLabel("密码:");

		//添加控件到容器
		container.add(userNameLable);
		container.add(loginBtn);
		container.add(passWordLable);
		container.add(registBtn);

		//注册监听事件
		loginBtn.addActionListener(this);
		registBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// if(e.getActionCommand() == "登录") {
		// System.out.println("ok >>>登录>>>>>>>>>>");
		// }
		// if(e.getActionCommand() == "注册") {
		// System.out.println("ok >>>注册>>>>>>>>>>");
		// }

		//处理监听事件
		if (e.getSource() == loginBtn) {
			System.out.println("ok >>>登录>>>>>>>>>>");
		}
		if (e.getSource() == registBtn) {
			System.out.println("ok >>>注册>>>>>>>>>>");
			this.setVisible(false);
			new ContainerDemo().ininWindow();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindwoEevenDemoOne().intint();
	}

}
