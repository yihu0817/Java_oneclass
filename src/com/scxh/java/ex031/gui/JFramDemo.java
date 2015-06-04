package com.scxh.java.ex031.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JFramDemo implements ActionListener, ListSelectionListener {
	JFrame mw;
	Container contentPane;
	JButton button;
	JLabel lable;
	JTextField text;
	JList list;
	String array[];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new JFramDemo().inint();
	}

	/**
	 * 
	 */
	public void inint() {
		array = new String[] { "java", "android", "j2ee" };
		mw = new JFrame("第一个GUI程序");
		mw.setSize(400, 200);

		contentPane = mw.getContentPane();
		contentPane.setLayout(new FlowLayout());

		button = new JButton("我是一个按钮");
		lable = new JLabel("姓名");
		text = new JTextField(20);
		list = new JList(array);

		contentPane.add(lable);
		contentPane.add(text);

		contentPane.add(button);
		contentPane.add(list);

		button.addActionListener(this);
		list.addListSelectionListener(this);
		mw.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Container conPane = mw.getContentPane();
		// if (e.getActionCommand().equals("我是一个按钮")){
		// conPane.setBackground(Color.RED);
		// String content = text.getText();
		// button.setText(content);
		// }

		if (e.getSource() == button) {
			String content = text.getText();
			button.setText(content);
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int tmp = 0;
		String stmp = "选取:";
		int[] index = list.getSelectedIndices();// 利用JList类所提供的getSelectedIndices()方法可得到用户所选取的所有
		for (int i = 0; i < index.length; i++)// index值，这些index值由一个int array返回.
		{
			tmp = index[i];
			stmp = stmp + array[tmp] + "  ";
		}
		lable.setText(stmp);

	}

}
