package d.polymorphism;

public class SuperUseField {
	public SuperUseField(){
		overrideMe();
	}
	public void overrideMe(){
		System.out.println("调用父类方法");
	}
	public static void main(String[] args) {
		SuperUseField s = new SubUseField();
	}
}
