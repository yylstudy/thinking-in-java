package m.clone;

/**
 * ����ֻ��������ԺܺõĽ���������⣬��ν�ı���������ǣ�
 * ������ָ��ͬһ�����������������ֻ���ģ���ô�޸�����һ��������������������Ӱ�죬�����������������ֻ���ģ�
 * ��ô�޸���������Ψһ�����������¹���һ�������������޸ľ������ô��������Ͳ�����Ӱ�죬���ƵĲ��ɱ������
 * �������ͣ��Լ���װ������
 * @author yyl-pc
 *
 */
public class MyTest93 {
	
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		String q = new String("s");
		System.out.println(q);//s
		String qq = upcase(q);//��ΪString�ǲ��ɱ��������toUpperCase��ʵ�����´�����һ����������q����s��������S
		System.out.println(qq);//S  
		System.out.println(q);//s
	}
}
