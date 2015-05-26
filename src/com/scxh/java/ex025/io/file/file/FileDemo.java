package com.scxh.java.ex025.io.file.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("F:/scxh.txt");
		File newFile = new File("F:/newscxh.txt");
		
		File fileDir = new File("F:/scxh");
		
		System.out.println("文件是否存在  :"+file.exists());
		if(file.exists()){
			file.createNewFile();
		}
		
		
		fileDir.mkdir();
		
		String fileName = file.getName();
		String path = file.getPath();
		
		System.out.println("文件名 :"+fileName+ "文件路径 :"+path);
		
		
//		file.renameTo(newFile);
		
		
//		file.delete();
	}

}
