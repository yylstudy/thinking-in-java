package k.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
/**
 * transient控制Serializable接口的序列化
 * 可以看到被transient修饰的字段反序列化的时候，值是没有的，因为该字段不会保存到Logon.out文件中
 * @author yyl-pc
 *
 */
public class MyTest5 {
	public static void main(String[] args) {
		Logon a = new Logon("yyl", "123");
	    System.out.println( "logon a = " + a);
	    try {
	      ObjectOutputStream o =
	        new ObjectOutputStream(
	          new FileOutputStream("Logon.out"));
	      o.writeObject(a);
	      o.close();
	      // Delay:
	      int seconds = 5;
	      long t = System.currentTimeMillis()
	             + seconds * 1000;
	      while(System.currentTimeMillis() < t)
	        ;
	      // Now get them back:
	      ObjectInputStream in =
	        new ObjectInputStream(
	          new FileInputStream("Logon.out"));
	      System.out.println(
	        "Recovering object at " + new Date());
	      a = (Logon)in.readObject();
	      System.out.println( "logon a = " + a);
	    } catch(Exception e) {
	      e.printStackTrace();
	    }
	}
}
