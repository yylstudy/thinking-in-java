package e.constructor;
/**
 * ���Լ̳к�finalize�����ĵ���
 * finalize��������ʱ���ɿ��ɲ���
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
	    //�������ʱ��������������
	    System.runFinalizersOnExit(true);
	  }
}
