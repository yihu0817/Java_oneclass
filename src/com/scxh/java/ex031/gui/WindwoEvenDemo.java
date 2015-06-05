package com.scxh.java.ex031.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 1.窗口->容器->布局->组件 
 * 2.事件->监听->注册事件监听
 * 
 * @author viktor
 * 
 */
public class WindwoEvenDemo extends JFrame {
	Container container; // 容器
	JButton loginBtn; // 登录按钮
	JButton registBtn; // 注册按钮
	JLabel userNameLable; // 显示用户名的标签
	JLabel passWordLable; // 显示密码标签
	JTextField userNameTxt;//用户名文本输入框
	JTextField passWordTxt;//密码文本输入框
	JPanel userJPanel,pwJPanel,userPwJPanel; 
	
	public WindwoEvenDemo() {
		super("第一个窗口程序");
		this.setBounds(500, 100, 300, 300);
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
//		container.setBackground(Color.white);
//		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void intint() {
		// 初化控件
		loginBtn = new JButton("登录");
		registBtn = new JButton("注册");
		userNameLable = new JLabel("用户名:");
		passWordLable = new JLabel("密码:");
		userNameTxt = new JTextField(10);
		passWordTxt= new JTextField(10);
		userJPanel = new JPanel();
		pwJPanel = new JPanel();
		userPwJPanel = new JPanel();
		
		userJPanel.setLayout(new FlowLayout());
		pwJPanel.setLayout(new FlowLayout());
		userPwJPanel.setLayout(new FlowLayout());
		
		// 添加控件到容器
		userJPanel.add(userNameLable);
		userJPanel.add(userNameTxt);
		
		pwJPanel.add(passWordLable);
		pwJPanel.add(passWordTxt);
		
		userPwJPanel.add(loginBtn);
		userPwJPanel.add(registBtn);

		container.add(userJPanel);
		container.add(pwJPanel);
		container.add(userPwJPanel);
		
		
		// 注册监听事件
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = userNameTxt.getText();
				System.out.println(txt);
				
				if(txt.equals("")){
					JOptionPane.showMessageDialog(null, "登录名和密码不能为空！");
				}
			}
		});
		registBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				WindwoEvenDemo.this.setVisible(false);
				new ContainerDemo().ininWindow();

			}
		});
	
		
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindwoEvenDemo().intint();
	}

}
