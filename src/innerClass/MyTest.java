package innerClass;

/**
 * �ڲ������
 * @author yyl-pc
 *
 */
public class MyTest {
	//�ⲿ��������ڲ��ྲ̬���Ǿ�̬����
	public static void main(String[] args) {
		//�Ǿ�̬�ڲ��ࣺnewһ���ⲿ��ʵ����newһ���ڲ���
		NoInnerStaticClass no = new MyTest().new NoInnerStaticClass();
		no.noStaticMethod();
		//��̬�ڲ��ྲ̬�������ⲿ��.�ڲ���.��̬����
		MyTest.InnerStaticClass.staticMethod();
		//��̬�ڲ���Ǿ�̬������new �ⲿ��.�ڲ���ʵ��.�Ǿ�̬����
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
