package b.initAndClear;

public class Chair {
	static boolean gcrun = false;//垃圾收集器是否已经开始运行
	static boolean f = false;//Chair可告诉main()它应停止对象的生成
	static int created = 0;
	static int finalized = 0;
	int i;

	Chair() {
		i = ++created;
		if (created == 47)
			System.out.println("Created 47");
	}

	protected void finalize() {
		//创建了多少个对象，就会执行几次，说明在发生垃圾回收后，每个对象都会执行finalize方法，为了调试方便将其注释
//		System.out.println("1111");
		if (!gcrun) {
			gcrun = true;
			//在Chair初始化created次后，发生垃圾回收
			System.out.println("Beginning to finalize after " + created + " Chairs have been created");
		}
		if (i == 47) {
			System.out.println("Finalizing Chair #47, " + "Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
		if (finalized >= created)
			System.out.println("All " + finalized + " finalized");
	}
}
