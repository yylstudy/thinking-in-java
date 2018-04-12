package k.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Externalizable����Ĭ��ʱ�����������κ��ֶ�
 * �������л��Ŀ���
 * Blip1��Blip2��������Blip1�Ĺ������ǡ������ġ���public����Blip2�Ĺ�������Ȼ����������ڻָ�ʱ���Υ��
 * ������д�����ʱ��Externalizable��writeExternal�����ᱻ���ã�
 * �ڶ�ȡ����ʱ Externalizable ��readExternal �����ᱻ����
 * �ڷ����л�ʱ�����ȵ��ù��췽�����ٵ���readExternal����
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
