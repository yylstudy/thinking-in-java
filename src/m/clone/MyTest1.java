package m.clone;

/**
 * 别名问题
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		int i = 2;
		int j = i;
		i++;
		System.out.println(j);
		
		Person p = new Person(1);
		//这里就是别名，p2和p属于同一个对象，都是指向Person(1),所以当改变p的属性值，p2也会跟着变
		//除非p重新指向另一个对象
		Person p2 = p;
		p.i++;
		System.out.println(p2);
		
		
		Person p3 = new Person(4);
		Person p4 = p3;
		p3 = new Person(8);
		System.out.println(p3==p4);//false 说明当p3重新指向新的对象时，p4指向的还是之前那个对象
		System.out.println(p3);
		System.out.println(p4);
		
	}
}
