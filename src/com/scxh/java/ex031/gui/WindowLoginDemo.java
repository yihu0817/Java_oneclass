package com.scxh.java.ex031.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowLoginDemo extends JFrame {
	Container container; // 容器
	JButton loginBtn; // 登录按钮
	JButton registBtn; // 注册按钮
	
	JLabel userNameLable; // 显示用户名的标签
	JLabel passWordLable; // 显示密码标签
	JLabel imageLable;
	
	JTextField userNameTxt;// 用户名文本输入框
	JTextField passWordTxt;// 密码文本输入框
	
	JPanel imageJP;
	JPanel gridJP;
	JPanel userPwJP;

	public WindowLoginDemo() {
		super("网络布局学习GridLayout");
		this.setBounds(500, 100, 300, 400);
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		// 初化控件
		ImageIcon image = new ImageIcon("pic\\xslogin.png");
		
		loginBtn = new JButton("登录");
		registBtn = new JButton("注册");
		
		userNameLable = new JLabel("用户名:");
		passWordLable = new JLabel("密    码:");
		imageLable = new JLabel(image);
		
		userNameTxt = new JTextField(10);
		passWordTxt = new JTextField(10);
		gridJP = new JPanel();
		userPwJP = new JPanel();
		imageJP = new JPanel();
		
		imageJP.setLayout(new FlowLayout());
		imageJP.add(imageLable);
		
		gridJP.setLayout(new GridLayout(3,2));
		gridJP.add(userNameLable);
		gridJP.add(userNameTxt);
		gridJP.add(passWordLable);
		gridJP.add(passWordTxt);
		
		userPwJP.setLayout(new FlowLayout());
		userPwJP.add(loginBtn);
		userPwJP.add(registBtn);
		
		container.add(imageJP);
		container.add(gridJP);
		container.add(userPwJP);
		
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindowLoginDemo().init();
	}

}
