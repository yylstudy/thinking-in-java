package b.initAndClear;

/**
 * 
 * @author yyl-pc
 *
 */
public class MyTest5 {
	public static void main(String[] args) {
		Singleton sin = Singleton.getInstance();
		//static����sin�ȼ��أ����� ����counter1��counter2������1  ��
		//Ȼ��counter1û�г�ʼ��������counter2������ʼ��Ϊ0������counter1Ϊ1��counter2 Ϊ0
		System.out.println(sin.counter1); //1  
		System.out.println(sin.counter2); //0  
	}
	static class Singleton {
		private static Singleton sin = new Singleton();
		public static int counter1;
		public static int counter2 = 0;

		private Singleton() {
			counter1++;
			counter2++;
		}

		public static Singleton getInstance() {
			return sin;
		}
	}
}


