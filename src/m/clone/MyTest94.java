package m.clone;

/**
 *	������ôд�����½�һ���ַ���������abc��foo�����ݣ��ڴ���һ���ַ������������def���ڴ���һ���ַ������������47
 *	�������յ�Ŀ��ֻ�ǻ�ð������������ݵ�һ�����ִ������м�ȴҪ�õ������ִ����󣬴������õĶ������
 *	����gc���еĸ��ʣ��������������֮ǰ���ܵ�����������һ���ɱ�ġ�ͬ־�ࡱ�����ַ�����˵�������ͬ־�ࡱ����StringBuffer
 *	
 */
public class MyTest94 {
	public static void main(String[] args) {
		String foo = "ss";
		String s = "abc" + foo + "def" + Integer.toString(47);
		StringBuffer sb = new StringBuffer("abc");
		sb.append(foo);
		sb.append("def");
		sb.append(Integer.toString(47));
	}
}
