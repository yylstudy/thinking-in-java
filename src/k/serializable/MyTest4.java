package k.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * Externalizable对象默认时不保存它的任何字段
 * 保存和恢复一个Externalizable对象必须做的全部事情
 * 注意在Blip3的readExternal方法中必须调用
 * s = (String) in.readObject(); i = in.readInt();
 * 否则s为null,i为0，
 * 所以千万不可仅在writeExternal()方法执行期间写入对象的重要数据
 * （没有默认的行为可用来为一个Externalizable对象写入所有成员对象）的，而是必须在readExternal()方法中也恢复那些数据
 * 所以Externalizable可用来控制哪些属性序列化，哪些属性不想序列化
 * @author yyl-pc
 *
 */
public class MyTest4 {
	public static void main(String[] args) {
		System.out.println("Constructing objects:");
		Blip3 b3 = new Blip3("A String ", 47);
		System.out.println(b3.toString());
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blip3.out"));
			System.out.println("Saving object:");
			o.writeObject(b3);
			o.close();
			// Now get it back:
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Blip3.out"));
			System.out.println("Recovering b3:");
			b3 = (Blip3) in.readObject();
			System.out.println(b3.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
