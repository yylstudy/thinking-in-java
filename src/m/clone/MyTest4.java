package m.clone;

/**
 * 使类具有克隆能力，可以看到list并没有clone方法
 * 尽管clone方法在Object中定义，但clone方法并不是每个类都可以调用，这似乎有些不可思议，因为所有类都是Object子类，
 * 在Object中 clone方法被定义成protected，正常情况下子类可以调用父类的方法，但是Integer不能调用clone方法，
 * 所以如果想在一个类中使用clone方法，那么需要定义clone方法,
 * 这是因为，为了避免我们创建出来的每个类都有克隆能力，clone()方法在基础类Object中得到了保留，（设置为protected）
 * 总结：使类具有克隆能力：
 * 1：重新定义clone方法,需要注意两点：几乎肯定要调用super.clone()和将clone()方法设置为public
 * 2: 实现Cloneable接口
 * 	Cloneable接口是空的，类似这种类 Serializable 这些类扮演标记的角色，表示这个类能被克隆，所以，若是类没有实现Cloneable接口
 * 那么在调用clone方法时，会抛出异常
 * @author yyl-pc
 *
 */
public class MyTest4 implements Cloneable{
	public static void main(String[] args) throws Exception {
		MyTest4 my = new MyTest4();
		my.clone();//运行可知，若是没有实现Cloneable接口，会抛出异常
		Integer i = new Integer(1);
		System.out.println("111");
//		Integer x = i.clone();//编译报错
	}
	
}
