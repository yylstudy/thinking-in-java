package m.clone;

/**
 * ʹ����п�¡���������Կ���list��û��clone����
 * ����clone������Object�ж��壬��clone����������ÿ���඼���Ե��ã����ƺ���Щ����˼�飬��Ϊ�����඼��Object���࣬
 * ��Object�� clone�����������protected�����������������Ե��ø���ķ���������Integer���ܵ���clone������
 * �����������һ������ʹ��clone��������ô��Ҫ����clone����,
 * ������Ϊ��Ϊ�˱������Ǵ���������ÿ���඼�п�¡������clone()�����ڻ�����Object�еõ��˱�����������Ϊprotected��
 * �ܽ᣺ʹ����п�¡������
 * 1�����¶���clone����,��Ҫע�����㣺�����϶�Ҫ����super.clone()�ͽ�clone()��������Ϊpublic
 * 2: ʵ��Cloneable�ӿ�
 * 	Cloneable�ӿ��ǿյģ����������� Serializable ��Щ����ݱ�ǵĽ�ɫ����ʾ������ܱ���¡�����ԣ�������û��ʵ��Cloneable�ӿ�
 * ��ô�ڵ���clone����ʱ�����׳��쳣
 * @author yyl-pc
 *
 */
public class MyTest4 implements Cloneable{
	public static void main(String[] args) throws Exception {
		MyTest4 my = new MyTest4();
		my.clone();//���п�֪������û��ʵ��Cloneable�ӿڣ����׳��쳣
		Integer i = new Integer(1);
		System.out.println("111");
//		Integer x = i.clone();//���뱨��
	}
	
}
