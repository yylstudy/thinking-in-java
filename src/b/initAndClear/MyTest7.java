package b.initAndClear;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class MyTest7 {
	private static CyclicBarrier cb = new CyclicBarrier(11);
	public static void main(String[] args) throws Exception{
		TestCyclicBarrier tc = new TestCyclicBarrier();
		tc.test();
		cb.await();
		cb.await();
	}
	static class TestCyclicBarrier{
		public void test() {
			for(int i=0;i<10;i++) {
				new Thread() {
					Random random = new Random();
					@Override
					public void run() {
						try {
							System.out.println("我已准备完毕");
							cb.await();
							Thread.sleep(random.nextInt(10)*1000);
							System.out.println("----------------");
							cb.await();
							System.out.println("我已执行完毕");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}.start();
			}
		}
	}
}
