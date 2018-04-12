package f.collection;

import java.util.Hashtable;
/**
 * ���Զ�����Ϊkey��Hashtable�洢
 * ��������Ϊkeyʱ��һ��Ҫ��дequals��hashCode�������ܶԱ�
 * ��ΪĬ�����������ÿ�������ɢ�������Ĭ�������ֻʹ�����Ķ���ĵ�ַ������Groundhog(3)
 * �ĵ�һ��ʵ�������������Groundhog(3)�ڶ���ʵ����ȵ�ɢ���룬�������õڶ���ʵ�����м������Ͳ��ܼ�����
 * ��������ǣ���дequals��hashCode��ȱһ����
 * @author yyl-pc
 *
 */
public class MyTest4 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for(int i=0;i<10;i++) {
			ht.put(new Groundhog(i), new Prediction());
		}
		System.out.println("ht = "+ht+"\n");
		System.out.println(
			      "Looking up prediction for groundhog #3:");
		Groundhog gh = new Groundhog(3);
	    if(ht.containsKey(gh))
	      System.out.println((Prediction)ht.get(gh));
	}
}
