package b.initAndClear;

/**
 * ���Ծ�̬��Ա��ʼ�� ���������һ���������ͣ������ͣ�������δ�����ʼ�����ͻ��Զ�����Լ��ı�׼�������ͳ�ʼֵ
 * �������ָ��һ������ľ������ô�����½�һ�����󣬲������ͬ����������������ͻ�õ�һ����ֵ��NULL��
 * ����staticֵֻ��һ���洢���������������Ķ�����ͬ,���۴������ٸ����󣬶�ֻ��ִ��һ��
 * ���£���main������static new Cupboard();���ٵ�������new Cupboard();
 * ��ôCupboard���е�static ���ԾͲ����ʼ���ˣ���Ϊ֮ǰ�Ѿ���ʼ����һ����
 * ����static ������ȷ�static�����ȳ�ʼ��
 * (1) ����ΪDog��һ�������״δ���ʱ������Dog���static������static�ֶ��״η���ʱ��
 * Java�����������ҵ�Dog.class����������õ���·������������
 * (2) �ҵ�Dog.class�����ᴴ��һ��Class�����⽫�ں���ѧ��������������static��ʼ��ģ�鶼�����С�
 * ��ˣ�static��ʼ��������һ�Ρ�����Class�����״������ʱ��
 * (3) ����һ��new Dog()ʱ��Dog����Ĺ����������Ȼ����ڴ�ѣ�Heap����Ϊһ��Dog��������㹻��Ĵ洢�ռ䡣
 * (4) ���ִ洢�ռ����Ϊ�㣬��Dog�е����л���������Ϊ���ǵ�Ĭ��ֵ�����������֣��Լ�boolean��char�ĵȼ��趨����+
 * (5) �����ֶζ���ʱ���������г�ʼ������ִ�С�
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
