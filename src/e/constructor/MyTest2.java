package e.constructor;
/**
 * 测试继承和finalize方法的调用
 * finalize方法调用时，可看可不看
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
	    if(args.length != 0 && 
	       args[0].equals("finalize"))
	       DoBaseFinalization.flag = true;
	    else
	      System.out.println("not finalizing bases");
	    new Frog(); // Instantly becomes garbage
	    System.out.println("bye!");
	    // Must do this to guarantee that all 
	    // finalizers will be called:
	    //程序结束时，进行垃圾回收
	    System.runFinalizersOnExit(true);
	  }
}
