package innerClass.package01;
/**
 * ��һ���ඨ����һ�����ڷ�װ��������ڲ�
 * @author yyl-pc
 *
 */
public class MyTest1 {
	class Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		public Destination(String whereTo){
			label = whereTo;
		}
		public String readLabel(){
			return label;
		}
	}
	public void ship(String desc){
		Contents c = new Contents();
		Destination d = new Destination(desc);
	}
	public static void main(String[] args) {
		MyTest1 p1 = new MyTest1();
		p1.ship("China");
	}
}
