package m.clone;

/**
 * 所以只读对象可以很好的解决别名问题，所谓的别名问题就是：
 * 多个句柄指向同一个对象，若这个对象不是只读的，那么修改其中一个句柄，其它句柄都会受影响，但是若是这个对象是只读的，
 * 那么修改这个对象的唯一方法就是重新构建一个对象，这样，修改句柄，那么其它句柄就不会受影响，类似的不可变对象有
 * 基本类型，以及其装箱类型
 * @author yyl-pc
 *
 */
public class MyTest93 {
	
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String q = new String("s");
		System.out.println(q);//s
		String qq = upcase(q);//因为String是不可变对象，所以toUpperCase其实是重新创建了一个对象，所以q等于s，而不是S
		System.out.println(qq);//S  
		System.out.println(q);//s
	}
}
