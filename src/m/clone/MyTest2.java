package m.clone;

/**
 * java���ݲ��ԣ����ô���
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
		Person p1 = new Person(1);
		change(p1);
		System.out.println(p1);
		change2(p1);
		System.out.println(p1);
	}
	public static void change(Person p) {
		p.i = 5;
	}
	public static void change2(Person p) {
		p = new Person(7);
		p.i = 9;
	}
}
