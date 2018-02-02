package d.polymorphism;

public class Sub extends Super{
	@Override
	public void overrideMe() {
		System.out.println("调用子类的方法");
	}
}
