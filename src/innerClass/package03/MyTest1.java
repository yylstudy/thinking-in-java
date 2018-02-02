package innerClass.package03;

/**
 * 更典型的一种情况是，一个外部类拥有一个特殊的方法，它会返回指向一个内部类的句柄
 * 若想在除外部类非static方法内部之外的任何地方生成内部类的一个对象，
 * 必须将那个对象的类型设为“外部类名.内部类名
 * 例如 Parcel2.Contents、Parcel2.Destination
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
