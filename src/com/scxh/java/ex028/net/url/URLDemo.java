package com.scxh.java.ex028.net.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 从指定网络资源读取数据 读取https://www.baidu.com
 * 
 * @author viktor
 * 
 */
public class URLDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("http://it.warmtel.com/?p=661");
			URLConnection con = url.openConnection();

			InputStream input = con.getInputStream();
			InputStreamReader instr = new InputStreamReader(input,"UTF-8");
			BufferedReader bufReader = new BufferedReader(instr);
			
			String line;
			while( (line = bufReader.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
