package com.scxh.java.ex012.classs.interfaces;
/**
 * 日立硬盘
 * 只实现读数据功能，未实现写数据功能，这种硬盘就叫劣质硬盘
 * @author viktor
 *
 */
public abstract class RiliHadd implements SataHdd{

	public String readData() {
		return "读出的数据";
	}


}
