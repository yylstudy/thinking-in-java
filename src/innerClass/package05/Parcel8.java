package innerClass.package05;

/**
 * 匿名内部类不能拥有构建器，因为他是匿名的没有名字，所以没有构建器
 * 但是我们可以在匿名内部类的主类上传入参数
 * @author yyl-pc
 *
 */
public class Parcel8 {
	public Detination dest(String dest) {
		return new Detination() {
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		p.dest("s");
	}
}
