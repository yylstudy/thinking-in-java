package i.exception;
/**
 * �����׳��쳣
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
			throw e.fillInStackTrace();//���÷�����Ϊ�쳣������㣬����û�е���fillInStackTrace()��������ô�ڴ�ӡ�쳣
			//����ʱ�������쳣�������׳����ٴΣ�����ָ�����������Ҳ����f()���������ú󣬾ͻ�ָ��g()����
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
