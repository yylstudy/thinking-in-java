package innerClass.package07;

import java.util.Base64;

/**
 * 
 * 静态内部类意味着：
 * 1：为创建一个static内部类，我们不需要一个外部类的对象
 * 2：不能从static内部类的一个对象中访问一个外部类对象
 * 3：静态内部类不能再拥有静态内部类
 */
public class Parcel10 {
	private static class PContents extends Contents{
		private int i = 11;
		public int value() {
			return i;
		}
	}
	protected static class  PDetination implements Detination{
		private String label;
		private PDetination(String label) {
			this.label = label;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	
	public static Detination dest(String s) {
		return new PDetination(s);
	}
	public static Contents cont() {
		return new PContents();
	}
	public static void main(String[] args) {
		Contents c = cont();
		Detination d = dest("yyl");
	}
}




