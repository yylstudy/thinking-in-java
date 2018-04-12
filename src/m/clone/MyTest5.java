package m.clone;

/**
 * �ɹ��Ŀ�¡
 * @author yyl-pc
 *
 */
public class MyTest5 implements Cloneable{
	public static MyObject g(MyObject o) {
		o.i++;
		return o;	
	}
	public static MyObject f(MyObject o) {
		o = (MyObject) o.clone();
		o.i++;
		return o;
	}
	public static void main(String[] args) {
		MyObject my1 = new MyObject(11);
		MyObject my2 = g(my1);
		System.out.println(my1==my2);
		System.out.println(my1);
		System.out.println(my2);
		
		MyObject my3 = new MyObject(47);
		MyObject my4 = f(my3);
		System.out.println(my3==my4);
		//my3��47����48�أ���Ϊ��ǳ��¡��my4��i�ĸı��Ӱ��my3������Ӧ����48��   ����47   ���ﲻ����ǳ��¡�����¡������
		//ǳ��¡�����¡������ָ���Ƕ����а����ı�Ķ���
		System.out.println(my3);
		System.out.println(my4);
	}
	
	
	public static class MyObject implements Cloneable{
		int i;
		public  MyObject(int i) {
			this.i = i;
		}
		//clone���������ܷ��ʣ����Խ�������Ϊpublic�������Ϊclone�ĳ����ж���Ӧ����clone()�Ļ����汾��
		
		public Object clone() { 
			Object object = null;
			try {
				object = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return object;
		}
		@Override
		public String toString() {
			return "MyObject [i=" + i + "]";
		}
		
	}
	
}
