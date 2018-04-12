package e.constructor;
/**
 * 测试初始化顺序
 * 可以结合 b.initAndClear 照看，b.initAndClear是没有涉及继承
 * 1）：调用基础类构建器，这个步骤会不断重复下去，知道找到最深一层继承的根
 * 2）：按照声明顺序调用成员初始化模块
 * 3）：调用衍生类构建器
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		new Sandwich();
	}
}
