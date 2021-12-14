package test;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;



public class SaveloadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileOutputStream out = new FileOutputStream("c:/save.txt");
		
		try {
			
			ObjectOutputStream o_stream = new ObjectOutputStream(out);
//			Status statS = ;
//			o_stream.writeObject(statS);
			
			o_stream.close();
			
			
			System.out.println("저장성공");
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		FileInputStream fileStream = new FileInputStream("c:/save.txt");
		
		ObjectInputStream os = new ObjectInputStream(fileStream);
		
		Object one = os.readObject();
		
		Status cha = (Status)one;
		System.out.println("불러오기");
		System.out.println(cha.getLv());
		System.out.println(cha.getName());
		System.out.println(cha.getHp());
		System.out.println(cha.getMp());
		System.out.println(cha.getMaxHp());
		System.out.println(cha.getMaxMp());
		
		os.close();
		
//		PrintWriter sv = new PrintWriter("c:/out.txt");
//	    String data = stat.getName();          
//	    sv.write(data);
//	    sv.close();

	}

}
