package m.clone;

/**
 * 成功的克隆
 * @author yyl-pc
 *
 */
public class MyTest5 implements Cloneable{
	public static MyObject g(MyObject o) {
		o.i++;
		return o;	
	}
	public static MyObject f(MyObject o) {
		o = (MyObject) o.clone();
		o.i++;
		return o;
	}
	public static void main(String[] args) {
		MyObject my1 = new MyObject(11);
		MyObject my2 = g(my1);
		System.out.println(my1==my2);
		System.out.println(my1);
		System.out.println(my2);
		
		MyObject my3 = new MyObject(47);
		MyObject my4 = f(my3);
		System.out.println(my3==my4);
		//my3是47还是48呢？因为是浅克隆，my4对i的改变会影响my3，所以应该是48？   答案是47   这里不存在浅克隆和深克隆的问题
		//浅克隆和深克隆的区别指的是对象中包含的别的对象
		System.out.println(my3);
		System.out.println(my4);
	}
	
	
	public static class MyObject implements Cloneable{
		int i;
		public  MyObject(int i) {
			this.i = i;
		}
		//clone方法必须能访问，所以将其设置为public，其次作为clone的初期行动，应调用clone()的基础版本类
		
		public Object clone() { 
			Object object = null;
			try {
				object = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return object;
		}
		@Override
		public String toString() {
			return "MyObject [i=" + i + "]";
		}
		
	}
	
}
