package m.clone;

/**
 * 副本构建器代替克隆，但是java中不是特别推荐这种
 * @author yyl-pc
 *
 */
public class MyTest95 {
	public class Pointer{
		private int i;
		private int j;
		public Pointer() {
			
		}
		public Pointer(Pointer p) {
			this.i = p.i;
			this.j = p.j;
		}
	}
}
