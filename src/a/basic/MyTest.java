package a.basic;

import org.junit.Test;

public class MyTest {
	/**
	 * 测试八大数据类型（未装箱的）默认值（不初始化） 这种默认值只作用于类成员变量，若是局部变量则会报错
	 */
	@Test
	public void test1() {
		TestClass t = new TestClass();
		System.out.println("不初始化情况下，boolean默认值为：" + t.a);
		System.out.println("不初始化情况下，char默认值为：" + t.b);
		System.out.println("不初始化情况下，byte默认值为：" + t.c);
		System.out.println("不初始化情况下，short默认值为：" + t.d);
		System.out.println("不初始化情况下，int默认值为：" + t.e);
		System.out.println("不初始化情况下，long默认值为：" + t.f);
		System.out.println("不初始化情况下，float默认值为：" + t.g);
		System.out.println("不初始化情况下，double默认值为：" + t.h);
	}

	/**
	 * 测试八大数据类型（已装箱的）默认值（不初始化）
	 */
	@Test
	public void test2() {
		TestClass2 t = new TestClass2();
		System.out.println("不初始化情况下，Boolean默认值为：" + t.a);
		System.out.println("不初始化情况下，Character默认值为：" + t.b);
		System.out.println("不初始化情况下，Byte默认值为：" + t.c);
		System.out.println("不初始化情况下，Short默认值为：" + t.d);
		System.out.println("不初始化情况下，Integer默认值为：" + t.e);
		System.out.println("不初始化情况下，Long默认值为：" + t.f);
		System.out.println("不初始化情况下，Float默认值为：" + t.g);
		System.out.println("不初始化情况下，Double默认值为：" + t.h);
	}
	
	/**
	 * java中 +是按照顺序运算的 1+1 返回int类型 所以是2 2+"" 变为字符串"2" 字符串"2"+1 就变成21了
	 */
	@Test
	public void test3() {
		System.out.println(1 + 1 + 1 + "");// 3
		System.out.println(1 + 1 + "" + 1);// 21.0
		System.out.println(1 + 5 * 6 + "" + 10);// 3110
	}
	
	/**
	 * 测试对象赋值
	 */
	@Test
	public void test4() {
		int a = 4;// 包括Integer 因为Integer是基本数据类型的装箱类型
		int b = 3;
		a = b;
		a = 5;
		/**
		 * 主数据类型的赋值是非常直接的,主类型容纳了实际的值，而且并非指向一个对象的句柄，所以在为
		 * 其赋值的时候，可将来自一个地方的内容复制到另一个地方 所以b不受a的改变而改变
		 */
		System.out.println(a);// 5 
		System.out.println(b);// 3

		/**
		 * 但在为对象“赋值”的时候，情况却发生了变化。 对一个对象进行操作时，我们真正操作的是它的句柄
		 * 所以倘若“从一个对象到另一个对象”赋值，实际就是将句柄从一个地方复制到另一个地方
		 */
		Number c = new Number();
		Number d = new Number();
		c.i = 7;
		d.i = 8;
		c = d; // c和d的句柄都同时指向 d 所以当我修改 c时 就相当于修改了d
		c.i = 9;
		System.out.println(c.i);// 9
		System.out.println(d.i);// 9 所以输出值不是8 而是9
	}
	public void f(Letter x){
		x.c = 'z';
	}
	/**
	 * 测试方法传递：
	 * 实际传递的是一个句柄，所以值会改变
	 */
	@Test
	public void test5(){
		Letter x = new Letter();
	    x.c = 'a';
	    System.out.println("1: x.c: " + x.c);
	    f(x);
	    System.out.println("2: x.c: " + x.c);
	}
	/**
	 * do-while和while区别就是do-while至少会执行一次
	 */
	@Test
	public void test6(){
		int i = 10;
		do{
			System.out.println(i);
			i--;
		}while(i>5);
				
	}
	
	/**
	 * continue和break的区别
	 */
	@Test
	public void test7() {
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 10; i++) {
				if (i == 5) {
					continue;
				}
				if (i == 8) {
					break;
				}
				System.out.println("j=" + j + ";i=" + i);
			}
		}
	}
	
	/**
	 * switch用法
	 */
	@Test
	public void test8() {
		int s = 3;
		switch(s){
			case 0:
				System.out.println(s);
				break;
			case 1:
				System.out.println(s);
				break;
			default:
				System.out.println(s);
				break;
		}
	}
	
	
}
