package m.clone;

import java.util.Vector;

/**
 * Vector实现深克隆，集合类型的深克隆都可以这样实现
 * 在对 容器集合进行深克隆时，必须先遍历其中的元素，并将这些元素克隆重新赋值给这个新克隆的容器
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
				vector2.set(i, (Int)vector.get(i).clone());//Vector实现深克隆
			}
			for(Int int5:vector2) {
				int5.increment();
			}
			//发现vector中的Int不会随着vector2的Int变化而变化，也就是这两个不是一个对象，所以这里正确的实现了深克隆
			System.out.println("vector:"+vector);
			System.out.println("vector2:"+vector2);
			System.out.println(vector.get(0)==vector2.get(0));//false
		}
	}
	
	
}
