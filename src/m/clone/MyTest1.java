package m.clone;

/**
 * ��������
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		int i = 2;
		int j = i;
		i++;
		System.out.println(j);
		
		Person p = new Person(1);
		//������Ǳ�����p2��p����ͬһ�����󣬶���ָ��Person(1),���Ե��ı�p������ֵ��p2Ҳ����ű�
		//����p����ָ����һ������
		Person p2 = p;
		p.i++;
		System.out.println(p2);
		
		
		Person p3 = new Person(4);
		Person p4 = p3;
		p3 = new Person(8);
		System.out.println(p3==p4);//false ˵����p3����ָ���µĶ���ʱ��p4ָ��Ļ���֮ǰ�Ǹ�����
		System.out.println(p3);
		System.out.println(p4);
		
	}
}
