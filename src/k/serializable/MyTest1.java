package k.serializable;
/**
 * �������ݹ鴴������
 * ���й۲�toString����
 * @author yyl-pc
 *
 */
public class MyTest1 {
	private String name = "yyl";
	private String password = "123";
	private MyTest1 next;
	public MyTest1(int i) {
		if(i-->0) {
			name+=i;
			password+=i;
			next = new MyTest1(i);
		}
	}
	
	@Override
	public String toString() {
		return "MyTest [name=" + name + ", password=" + password + ", next=" + next + "]";
	}
	public static void main(String[] args) {
		MyTest1 test1 = new MyTest1(5);
		System.out.println(test1);
	}
}
