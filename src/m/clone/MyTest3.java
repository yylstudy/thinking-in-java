package m.clone;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 浅clone测试：Vector有clone方法，因为其中定义了clone方法
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
		System.out.println(vector==vector2);//克隆，所以这两个对象肯定不是同一个对象，
		//由于这里使用的是浅克隆，vector被克隆了，但是Vector中包含的对象还是同一个对象，所以这里会打印true
		System.out.println(vector.get(0)==vector2.get(0));
		System.out.println("vector2:"+vector2);
		for(Enumeration<Int> enumra = vector2.elements();enumra.hasMoreElements();) {
			enumra.nextElement().increment();
		}
		//这里由于是浅克隆，内部包含的对象其实是一个对象，所以对vector2的修改会影响vector中的Int对象
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
