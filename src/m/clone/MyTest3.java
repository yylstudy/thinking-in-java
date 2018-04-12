package m.clone;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ǳclone���ԣ�Vector��clone��������Ϊ���ж�����clone����
 * 
 * @author yyl-pc
 *
 */
public class MyTest3 {
	public static void main(String[] args) {
		Vector<Int> vector = new Vector<Int>();
		for(int i=0;i<10;i++) {
			vector.add(new Int(i));
		}
		System.out.println("vector:"+vector);
		Vector<Int> vector2 = (Vector<Int>) vector.clone();
		System.out.println(vector==vector2);//��¡����������������϶�����ͬһ������
		//��������ʹ�õ���ǳ��¡��vector����¡�ˣ�����Vector�а����Ķ�����ͬһ����������������ӡtrue
		System.out.println(vector.get(0)==vector2.get(0));
		System.out.println("vector2:"+vector2);
		for(Enumeration<Int> enumra = vector2.elements();enumra.hasMoreElements();) {
			enumra.nextElement().increment();
		}
		//����������ǳ��¡���ڲ������Ķ�����ʵ��һ���������Զ�vector2���޸Ļ�Ӱ��vector�е�Int����
		System.out.println("vector:"+vector);
	}
	
	public static class Int {
		private int i;
		public Int(int i) {
			this.i = i;
		}
		public void increment() {
			i++;
		}
		public String toString() {
			return Integer.toString(i);
		}
	}
}
