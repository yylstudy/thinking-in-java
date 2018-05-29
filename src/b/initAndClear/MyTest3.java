package b.initAndClear;

/**
 * 测试静态成员初始化 如果它属于一个基本类型（主类型），而且未对其初始化，就会自动获得自己的标准基本类型初始值
 * 如果它是指向一个对象的句柄，那么除非新建一个对象，并将句柄同它连接起来，否则就会得到一个空值（NULL）
 * 由于static值只有一个存储区域，所以若创建的对象相同,无论创建多少个对象，都只会执行一次
 * 如下：在main方法中static new Cupboard();后再调用两次new Cupboard();
 * 那么Cupboard类中的static 属性就不会初始化了，因为之前已经初始化过一次了
 * 并且static 变量会比非static变量先初始化
 * (1) 类型为Dog的一个对象首次创建时，或者Dog类的static方法／static字段首次访问时，
 * Java解释器必须找到Dog.class（在事先设好的类路径里搜索）。
 * (2) 找到Dog.class后（它会创建一个Class对象，这将在后面学到），它的所有static初始化模块都会运行。
 * 因此，static初始化仅发生一次——在Class对象首次载入的时候。
 * (3) 创建一个new Dog()时，Dog对象的构建进程首先会在内存堆（Heap）里为一个Dog对象分配足够多的存储空间。
 * (4) 这种存储空间会清为零，将Dog中的所有基本类型设为它们的默认值（零用于数字，以及boolean和char的等价设定）。+
 * (5) 进行字段定义时发生的所有初始化都会执行。
 * @author yyl-pc
 *
 */
public class MyTest3 {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
	}

	static Table t2 = new Table();
	static Cupboard t3 = new Cupboard();
}
