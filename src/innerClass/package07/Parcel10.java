package innerClass.package07;

import java.util.Base64;

/**
 * 
 * ��̬�ڲ�����ζ�ţ�
 * 1��Ϊ����һ��static�ڲ��࣬���ǲ���Ҫһ���ⲿ��Ķ���
 * 2�����ܴ�static�ڲ����һ�������з���һ���ⲿ�����
 * 3����̬�ڲ��಻����ӵ�о�̬�ڲ���
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




