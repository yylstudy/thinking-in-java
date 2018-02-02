package b.initAndClear;
/**
 * �����������ջ���
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		args = new String[1];
		args[0] = "after";
		if (args.length == 0) {
			System.err.println("Usage: \n" + "java Garbage before\n  or:\n" + "java Garbage after");
			return;
		}
		while (!Chair.f) {
			new Chair();
			new String("To take up space");//�ö������ڶ�����������������������ռ���
		}
		System.out.println("After all Chairs have been created:\n" + "total created = " + Chair.created
				+ ", total finalized = " + Chair.finalized);
		if (args[0].equals("before")) {
			System.out.println("gc():");
			System.gc();//ǿ��ִ�������ռ���
			System.out.println("runFinalization():");
			System.runFinalization();
		}
		System.out.println("bye!");
		if (args[0].equals("after"))
			System.runFinalizersOnExit(true);
	}
}
