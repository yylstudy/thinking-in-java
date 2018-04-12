package k.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * �������л����ԣ���һ���������л����浽һ���ļ����ٽ�����ļ������л��ɶ���
 * 
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) throws Exception {
		//���������л���file.x�ļ�
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.x"));
		Alien a = new Alien();
		out.writeObject(a);
		
		//��file.x�ļ������л���Object
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.x"));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass().toString());
	}
}
