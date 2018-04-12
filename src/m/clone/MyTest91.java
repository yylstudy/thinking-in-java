package m.clone;

/**
 * 可以创建自己的只读类，就是将自己所有的域都设置为私有的，并且不为这些域提供修改方法
 * 
 * @author yyl-pc
 *
 */
public class MyTest91 {
	public static class Immutable1 {
		private int data;

		public Immutable1(int data) {
			this.data = data;
		}

		public int read() {
			return data;
		}

		public boolean nonzero() {
			return data != 0;
		}

		public Immutable1 quadruple() {
			return new Immutable1(data * 4);
		}

		static void f(Immutable1 i1) {
			Immutable1 quad = i1.quadruple();
			System.out.println("i1 = " + i1.read());
			System.out.println("quad = " + quad.read());
		}
	}

	public static void main(String[] args) {
		Immutable1 x = new Immutable1(47);
		System.out.println("x = " + x.read());
		Immutable1.f(x);
		System.out.println("x = " + x.read());
	}
}
