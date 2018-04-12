package f.collection;

import java.util.Hashtable;
/**
 * 测试对象作为key的Hashtable存储
 * 当对象作为key时，一定要重写equals和hashCode方法才能对比
 * 因为默认情况下是用每个对象的散列码而且默认情况下只使用它的对象的地址，所以Groundhog(3)
 * 的第一个实例并不会产生与Groundhog(3)第二个实例相等的散列码，而我们用第二个实例进行检索，就不能检索出
 * 解决方法是：重写equals和hashCode，缺一不可
 * @author yyl-pc
 *
 */
public class MyTest4 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for(int i=0;i<10;i++) {
			ht.put(new Groundhog(i), new Prediction());
		}
		System.out.println("ht = "+ht+"\n");
		System.out.println(
			      "Looking up prediction for groundhog #3:");
		Groundhog gh = new Groundhog(3);
	    if(ht.containsKey(gh))
	      System.out.println((Prediction)ht.get(gh));
	}
}
