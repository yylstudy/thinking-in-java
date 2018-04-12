package m.clone;

import java.util.Vector;

/**
 * Vectorʵ�����¡���������͵����¡����������ʵ��
 * �ڶ� �������Ͻ������¡ʱ�������ȱ������е�Ԫ�أ�������ЩԪ�ؿ�¡���¸�ֵ������¿�¡������
 * @author yyl-pc
 *
 */
public class MyTest8 {
	public static class Int implements Cloneable{
		private int i;
		public Int(int i) {
			this.i = i;
		}
		public void increment() {
			i++;
		}
		@Override
		public String toString() {
			return "Int [i=" + i + "]";
		}
		public Object clone() {
			Object obj = null;
			try {
				obj = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return obj;
		}
	}
	public static class Int3 extends Int{
		private int j;
		public Int3(int i) {
			super(i);
		}
	}
	public static class AddClone{
		public static void main(String[] args) {
			Int int1 = new Int(10);
			Int int2 = (Int) int1.clone();
			int2.increment();
			System.out.println("int1:"+int1);//10
			System.out.println("int2:"+int2);//11
			Int3 int3 = new Int3(7);
			Int3 int4 = (Int3) int3.clone();
			int3.increment();
			System.out.println("int3:"+int3);//8
			System.out.println("int4:"+int4);//7
			Vector<Int> vector = new Vector<Int>();
			for(int i=0;i<10;i++)
				vector.add(new Int(i));
			System.out.println("vector:"+vector);
			Vector<Int> vector2 = (Vector<Int>) vector.clone();
			for(int i=0;i<vector.size();i++) {
				vector2.set(i, (Int)vector.get(i).clone());//Vectorʵ�����¡
			}
			for(Int int5:vector2) {
				int5.increment();
			}
			//����vector�е�Int��������vector2��Int�仯���仯��Ҳ��������������һ����������������ȷ��ʵ�������¡
			System.out.println("vector:"+vector);
			System.out.println("vector2:"+vector2);
			System.out.println(vector.get(0)==vector2.get(0));//false
		}
	}
	
	
}
