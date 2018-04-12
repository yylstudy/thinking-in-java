package m.clone;

/**
 * 一成不变的弊端：一旦需要那种新类型的一个修改对象，就必须辛苦的进行对象的创建工作，同时可能涉及更频繁的垃圾收集 比如
 * String类，也是一成不变的，为了解决这个问题，我们可以提供一个“同志类”，并使其能够修改，
 * 以后只要涉及大量修改的工作，就可替换成这个同志类，完事后，再切换为不可变类，典型的 String 与 StringBuffer
 * 
 * @author yyl-pc
 *
 */
public class MyTest92 {
	static class Mutable {
		private int data;
		public Mutable(int data) {
			this.data = data;
		}
		public Mutable add(int x) {
			data += x;
			return this;
		}
		public Mutable multiply(int x) {
			data *= x;
			return this;
		}
		public Immutable2 makeImmutable2() {
			return new Immutable2(data);//不可变对象若是想改变，那么就必须重新创建一个对象，来改变，
		}
	}

	public static class Immutable2 {
		private int data;
		public Immutable2(int initVal) {
			data = initVal;
		}
		public int read() {
			return data;
		}
		public boolean nonzero() {
			return data != 0;
		}
		public Immutable2 add(int x) {
			return new Immutable2(data + x);
		}
		public Immutable2 multiply(int x) {
			return new Immutable2(data * x);
		}
		public Mutable makeMutable() {
			return new Mutable(data);
		}
		public static Immutable2 modify1(Immutable2 y) {
			Immutable2 val = y.add(12);
			val = val.multiply(3);
			val = val.add(11);
			val = val.multiply(2);
			return val;
		}
		public static Immutable2 modify2(Immutable2 y) {
			Mutable m = y.makeMutable();
			m.add(12).multiply(3).add(11).multiply(2);
			return m.makeImmutable2();
		}

		public static void main(String[] args) {
			Immutable2 i2 = new Immutable2(47);
			Immutable2 r1 = modify1(i2);
			Immutable2 r2 = modify2(i2);
			System.out.println("i2 = " + i2.read());
			System.out.println("r1 = " + r1.read());
			System.out.println("r2 = " + r2.read());
		}
	}
}
