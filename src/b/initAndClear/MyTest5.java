package b.initAndClear;

/**
 * 
 * @author yyl-pc
 *
 */
public class MyTest5 {
	public static void main(String[] args) {
		Singleton sin = Singleton.getInstance();
		//static变量sin先加载，所以 首先counter1和counter2都会变成1  ，
		//然后counter1没有初始化，但是counter2继续初始化为0，所以counter1为1，counter2 为0
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


