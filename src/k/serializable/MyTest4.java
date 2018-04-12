package k.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * Externalizable����Ĭ��ʱ�����������κ��ֶ�
 * ����ͻָ�һ��Externalizable�����������ȫ������
 * ע����Blip3��readExternal�����б������
 * s = (String) in.readObject(); i = in.readInt();
 * ����sΪnull,iΪ0��
 * ����ǧ�򲻿ɽ���writeExternal()����ִ���ڼ�д��������Ҫ����
 * ��û��Ĭ�ϵ���Ϊ������Ϊһ��Externalizable����д�����г�Ա���󣩵ģ����Ǳ�����readExternal()������Ҳ�ָ���Щ����
 * ����Externalizable������������Щ�������л�����Щ���Բ������л�
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
