package k.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Externalizable对象默认时不保存它的任何字段
 * 对象序列化的控制
 * Blip1和Blip2的区别是Blip1的构建器是“公共的”（public），Blip2的构建器则不然，这样便会在恢复时造成违例
 * 并且在写入对象时，Externalizable的writeExternal方法会被调用，
 * 在读取对象时 Externalizable 的readExternal 方法会被调用
 * 在反序列化时，会先调用构造方法，再调用readExternal方法
 * @author yyl-pc
 *
 */
public class MyTest3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Constructing objects:");
		Blip1 b1 = new Blip1();
		Blip2 b2 = new Blip2();
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blips.out"));
		System.out.println("saving object");
		o.writeObject(b1);
		o.writeObject(b2);
		o.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Blips.out"));
		System.out.println("recoving b1");
		Object b11 = ois.readObject();
		Object b22 = ois.readObject();
	}
}
