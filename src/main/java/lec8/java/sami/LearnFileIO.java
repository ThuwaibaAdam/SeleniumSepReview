package lec8.java.sami;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LearnFileIO {

	static String absPath;
	static String relPath;
	static String filePath;
	
	// input = read form a file
	static FileInputStream fis;
	static InputStreamReader isr;
	static BufferedReader br;
	
	// output = write to a file
	static FileOutputStream fos;
	static OutputStreamWriter osw;
	static BufferedWriter bw;
	
	public static void main(String[]args) throws FileNotFoundException {
		
		String path = "\\src\\main\\java\\lec8\\java\\sami\\Example.txt";
		
		System.out.println(System.getProperty("user.dir"));
	
	absPath = System.getProperty("user.dir");
	relPath = "\\src\\main\\java\\lec8\\java\\sami\\Example.txt";
	filePath = absPath + relPath;
	
	File file = new File(filePath);
	
	try {
		fos = new FileOutputStream(file);
		osw = new OutputStreamWriter(fos);
		bw = new BufferedWriter(osw);
	} catch(FileNotFoundException fnf) {
		System.out.println("File not exist");
	}
	
	 fis = new FileInputStream(file);
	 isr = new InputStreamReader(fis);
	 br = new BufferedReader(isr);
	
	String line;
	
	try {
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
	
	
}
