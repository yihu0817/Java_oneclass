package com.scxh.java.ex031.gui.table;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("unchecked")
public class MyTableModel extends AbstractTableModel {

	private static final long serialVersionUID = -7495940408592595397L;

	private Vector content = null;

	private String[] titleCols = { "ID", "姓名", "性别", "年龄" };

	public MyTableModel() {
		content = new Vector();
	}

	public MyTableModel(int count) {
		content = new Vector(count);
	}

	public void addRow(String name, boolean sex, String age) {
		Vector v = new Vector(4);
		v.add(0, new Integer(content.size()));
		v.add(1, name);
		v.add(2, new Boolean(sex));
		v.add(3, age);
		content.add(v);
	}

	public void removeRow(int row) {
		content.remove(row);
	}

	public void removeRows(int row, int count) {
		for (int i = 0; i < count; i++) {
			if (content.size() > row) {
				content.remove(row);
			}
		}
	}

	/**
	 * 让表格中某些值可修改，但需要setValueAt(Object value, int row, int col)方法配合才能使修改生效
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return false;
		}
		return true;
	}

	public String getColumnName(int col) {
		return titleCols[col];
	}

	public int getColumnCount() {
		return titleCols.length;
	}

	public int getRowCount() {
		return content.size();
	}

	public Object getValueAt(int row, int col) {
		return ((Vector) content.get(row)).get(col);
	}

	/**
	 * 使修改的内容生效
	 */
	public void setValueAt(Object value, int row, int col) {
		((Vector) content.get(row)).remove(col);
		((Vector) content.get(row)).add(col, value);
		this.fireTableCellUpdated(row, col);
	}

	/**
	 * 返回数据类型
	 */
	public Class getColumnClass(int col) {
		return getValueAt(0, col).getClass();
	}
}
