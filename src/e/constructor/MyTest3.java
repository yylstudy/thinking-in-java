package e.constructor;

/**
 * ���Թ��췽���е��ÿɱ����ǵķ���
 * ע��������Ϊ
 * Glyph() before draw()
 * RoundGlyph.draw(), radius = 0   ������0  �Ȳ���1Ҳ����5 ��Ϊ�������Ի�δ��ʼ�� ����intĬ����0
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
