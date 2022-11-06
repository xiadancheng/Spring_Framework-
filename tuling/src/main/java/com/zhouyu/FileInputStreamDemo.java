package com.zhouyu;

import org.springframework.context.annotation.Bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {

		InputStream is= new FileInputStream("G:\\java\\05_tuling\\projects\\spring-framework-5.3.10\\tuling\\src\\main\\java\\com\\zhouyu\\Test.java");
		int b;
		while ((b=is.read())!=-1){
			System.out.println((char) b);
		}

		byte[] buffer=new byte[3];
 		is.read(buffer);
		System.out.println(buffer);
		String rs=new String(buffer);
		System.out.println(rs);
	}
}
