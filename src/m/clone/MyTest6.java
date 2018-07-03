package m.clone;

/**
 * 
 * @author yyl-pc
 *
 */
public class MyTest6 {
	public static void main(String[] args) {
		Snake snake = new Snake(5,'a');
		System.out.println("snake:"+snake);
		Snake snake2 = (Snake) snake.clone();
		System.out.println("snake:"+snake);
		System.out.println("snake2:"+snake2);
		snake.increment();
		System.out.println("snake:"+snake);
		//ע������������ǣ�������c����a���ӵڶ��㿪ʼ����һ������������Ϊ����ǳ��¡�Ĺ�ϵ��Ҳ������ʵǳ��¡ֻ�Ǹ����������
		//������snake2��next������snake��next�ı仯���仯����ô��Ҫ�õ����¡
		System.out.println("snake2:"+snake2);
	}
	
	public static class Snake implements Cloneable{
		private Snake next;
		private char c;
		public Snake(int i,char x) {
			c = x;
			if(--i>0) {
				next = new Snake(i,(char)(x+1));
			}
		}
		public void increment() {
			c++;
			if(next!=null) {
				next.increment();
			}
		}
		@Override
		public String toString() {
			return "Snake [next=" + next + ", c=" + c + "]";
		}
		
		public Object clone() {
			Snake obj = null;
			try {
				//�����ζ��ǳ��¡��ֻ��������Snake�������ƣ�ͨ������һ���ɿ�¡�����е���super.clone()
				//��ȷ�����л������ж��ܹ����У�����Ϊ������ÿ���������ȷ����clone������������Щ�������ԭʼ����ľ����
				//Ҳ����ǳ��¡���������ĵ���Ҳ��ˣ����ȹ��������������Ȼ����������Ĺ�������֪����ײ�Ĺ���������������clone()
				//�������ǹ�����������û�а취ʵ���Զ���¡��Ϊ��ʵ�����¡��ֻ���Լ���ȷ���ж���
				obj = (Snake) super.clone();
//				if(this.next!=null) {
//					obj.next = (Snake) this.next.clone();
//				}
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return obj;
		}
	}
}
