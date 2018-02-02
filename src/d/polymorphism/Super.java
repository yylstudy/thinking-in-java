package d.polymorphism;

/**
 * @author yyl-pc
 *
 */
public class Super {
	public Super(){
		overrideMe();
	}
	public void overrideMe(){
		System.out.println("调用父类方法");
	}
}
