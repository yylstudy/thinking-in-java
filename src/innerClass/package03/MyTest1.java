package innerClass.package03;

/**
 * �����͵�һ������ǣ�һ���ⲿ��ӵ��һ������ķ��������᷵��ָ��һ���ڲ���ľ��
 * �����ڳ��ⲿ���static�����ڲ�֮����κεط������ڲ����һ������
 * ���뽫�Ǹ������������Ϊ���ⲿ����.�ڲ�����
 * ���� Parcel2.Contents��Parcel2.Destination
 * @author yyl-pc
 *
 */
public class MyTest1 {
	class Contents{
		private int i=11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			this.label = whereTo;
		}
	}
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents cont(){
		return new Contents();
	}
	public void ship(String dest){
		Contents c = cont();
		Destination d = to(dest);
	}
	public static void main(String[] args) {
		MyTest1 p = new MyTest1();
		p.ship("China");
		MyTest1 q = new MyTest1();
		MyTest1.Contents c = q.cont();
		MyTest1.Destination d = q.to("Russia");
	}
}
