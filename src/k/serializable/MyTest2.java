package k.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 对象序列化测试：将一个对象序列化保存到一个文件，再将这个文件反序列化成对象
 * 
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) throws Exception {
		//将对象序列化到file.x文件
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.x"));
		Alien a = new Alien();
		out.writeObject(a);
		
		//将file.x文件反序列化成Object
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.x"));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass().toString());
	}
}
