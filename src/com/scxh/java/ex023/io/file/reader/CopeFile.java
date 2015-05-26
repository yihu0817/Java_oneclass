package com.scxh.java.ex023.io.file.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopeFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String filePath = "f:/test.txt";
		String fileCopePath = "e:/java.txt";
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader(filePath);
			fileWriter = new FileWriter(fileCopePath);
			
			int cbuf;
			while ((cbuf = fileReader.read()) != -1) {
				char c = (char) cbuf;
				fileWriter.write(c);

				System.out.print(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	
	
}
