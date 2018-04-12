package i.exception;
/**
 * 重新抛出异常
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void f() throws Exception {
		System.out.println("the exception in f()");
		throw new Exception("throw from f()");
	}
	public static void g() throws Throwable{
		try {
			f();
		} catch (Exception e) {
			System.out.println("the exception in g()");
			e.printStackTrace();
//			throw e;
			throw e.fillInStackTrace();//将该方法作为异常的新起点，若是没有调用fillInStackTrace()方法，那么在打印异常
			//错误时，无论异常被重新抛出多少次，都会指向真正的起点也就是f()方法，调用后，就会指向g()方法
		}
	}
	public static void main(String[] args) {
		try {
			g();
		} catch (Throwable e) {
			System.out.println("the exception in main()");
			e.printStackTrace();
		}
	}
}
