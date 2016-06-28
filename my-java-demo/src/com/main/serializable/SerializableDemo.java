package com.main.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * 	Java序列化与反序列化
 * 
 * 	定义：
 *		Java序列化就是把对象转换成字节序列，而反序列化就是把字节序列还原成Java对象。
 *	
 *	应用：
 *		1、实现数据的持久化，可以将Java对象序列化之后永久保存在硬盘中；
 *		2、用于网络传输，网络通信；
 *
 *******************************
 * Author	:	lynch
 * Date		: 	2016年6月28日 
 * Time		:	下午4:49:05 
 *******************************
 */
public class SerializableDemo {

	private static ObjectOutputStream oos;
	private static FileOutputStream fos;
	private static ObjectInputStream ois;
	private static FileInputStream fis;

	public static void main(String[] args) {
		Student stu=new Student("Lynch",'男',(short) 25);
		System.out.print("序列化之前：");
		System.out.println(stu);
		File file=new File("C:\\Users\\Think\\Desktop\\student.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//对student序列号
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(stu);
			oos.flush();
			System.out.println("--------------- 序列号完毕 ---------------");
			
			//对student反序列化
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			Student student=(Student) ois.readObject();
			System.out.print("反序列化后：");
			System.out.println(student);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				oos.close();
				fos.close();
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
