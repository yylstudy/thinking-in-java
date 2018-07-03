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
		//注意这里输出的是：最外层的c还是a，从第二层开始都逐一递增，这是因为这是浅克隆的关系，也就是其实浅克隆只是复制了最外层
		//若是想snake2的next不随着snake的next的变化而变化，那么需要用到深克隆
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
				//这个意味着浅克隆，只有最外层的Snake由它复制，通常可在一个可克隆的类中调用super.clone()
				//以确保所有基础类行动能够进行，随着为对象内每个句柄都明确调用clone方法，否则那些句柄会变成原始对象的句柄，
				//也就是浅克隆，构造器的调用也如此，首先构造基础构造器，然后是衍生类的构造器，知道最底层的构造器，区别在于clone()
				//方法不是构造器，所以没有办法实现自动克隆，为了实现深克隆，只有自己明确进行定义
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
