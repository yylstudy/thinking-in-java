package e.constructor;

/**
 * 测试构造方法中调用可被覆盖的方法
 * 注意输出结果为
 * Glyph() before draw()
 * RoundGlyph.draw(), radius = 0   这里是0  既不是1也不是5 因为子类属性还未初始化 所以int默认是0
 * Glyph() after draw()
 * RoundGlyph.RoundGlyph(), radius = 5
 * @author yyl-pc
 *
 */
public class MyTest3 {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
