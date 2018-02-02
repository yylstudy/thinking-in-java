package b.initAndClear;

/**
 * 测试非静态成员初始化顺序： 在Card中，Tag对象的定义故意到处散布，以证明它们全都会在 构建器进入或者发生其他任何事情之前得到初始化
 * 
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
		Card t = new Card();
		t.f(); // Shows that construction is done
	}
}
