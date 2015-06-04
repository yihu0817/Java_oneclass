package com.scxh.java.ex031.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContainerDemo extends JFrame{
	
	public ContainerDemo(){
		this.setTitle("ÈÝÆ÷Ñ§Ï°");
		getContentPane().setBackground(Color.BLUE);
		this.setBounds(500, 100, 400, 300);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
	}
	
	public void ininWindow(){
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.setBackground(Color.red);
		jp.setSize(50, 20);
		
		
		JButton loginBtn = new JButton("µÇÂ¼");
		JButton registBtn = new JButton("×¢²á");
		
		jp.add(loginBtn);
		jp.add(registBtn);
		
		this.add("North",jp);
		
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.setBackground(Color.yellow);
		JButton loginBtn1 = new JButton("µÇÂ¼1");
		JButton registBtn1 = new JButton("×¢²á1");
		
		jp1.add(loginBtn1);
		jp1.add(registBtn1);
		
		this.add("South",jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.setBackground(Color.green);
		JButton loginBtn2 = new JButton("µÇÂ¼2");
		JButton registBtn2 = new JButton("×¢²á2");
		
		jp2.add(loginBtn2);
		jp2.add(registBtn2);
		
		this.add("West",jp2);
		
		
		JPanel jp3 = new JPanel();
		jp3.setLayout(new FlowLayout());
		jp3.setBackground(Color.green);
		JButton loginBtn3 = new JButton("µÇÂ¼3");
		JButton registBtn3 = new JButton("×¢²á3");
		
		jp3.add(loginBtn3);
		jp3.add(registBtn3);
		
		this.add("East",jp3);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ContainerDemo().ininWindow();

	}
	
	

}
