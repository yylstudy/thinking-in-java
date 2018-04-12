package innerClass;

/**
 * 内部类汇总
 * @author yyl-pc
 *
 */
public class MyTest {
	//外部类调用其内部类静态、非静态方法
	public static void main(String[] args) {
		//非静态内部类：new一个外部类实例的new一个内部类
		NoInnerStaticClass no = new MyTest().new NoInnerStaticClass();
		no.noStaticMethod();
		//静态内部类静态方法：外部类.内部类.静态方法
		MyTest.InnerStaticClass.staticMethod();
		//静态内部类非静态方法：new 外部类.内部类实例.非静态方法
		new MyTest.InnerStaticClass().noStaticMethod();
	}
	public void main2() {
		
	}
	
	public void dosomething3() {
		System.out.println("dosomething1");
	}
	class NoInnerStaticClass{
		public void noStaticMethod() {
			System.out.println("dosomething2");
			main2();
		}
	}
	static class InnerStaticClass{
		public static void staticMethod() {
			System.out.println("dosomething3");
			new MyTest().main2();
		}
		public  void noStaticMethod() {
			System.out.println("dosomething4");
			new MyTest().main2();
		}
	}
}
