package d.polymorphism;

import org.junit.Test;

/**
 * 构造器决不能调用可被覆盖的方法
 * 因为超类的构造器方法在子类构造器方法之前运行
 *  若父类构造器调用可被覆盖的方法 那么程序会再调用子类覆盖的方法
 *  但是这时子类还未实例化，虽然可以调用子类的方法，但是可能存在问题，例如
 *  当子类的方法中需要引用子类的变量时就会报空指针异常，因为这时变量尚未实例化会抛出空指针
 * @author yyl-pc
 *
 */
public class MyTest1 {
	@Test
	public void test1(){
		Super s = new Sub();
		s.overrideMe();
	}
	@Test
	public void test2(){
		SuperUseField s = new SubUseField();
		s.overrideMe();
	}
}
