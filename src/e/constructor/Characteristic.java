package e.constructor;

public class Characteristic {
	String s;
	Characteristic(String s){
		this.s = s;
		System.out.println("create Characteristic "+s);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize Characteristic "+ s);
	}
}
