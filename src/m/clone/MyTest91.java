package m.clone;

/**
 * ���Դ����Լ���ֻ���࣬���ǽ��Լ����е�������Ϊ˽�еģ����Ҳ�Ϊ��Щ���ṩ�޸ķ���
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
