package d.polymorphism;

public class Son extends Father{
	public String s = "获取子类属性";
	@Override
	public void method() {
		System.out.println("运行子类方法");
	}
}
