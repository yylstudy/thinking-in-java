package innerClass.package04;

/**
 * 至此内部类都没有什么特殊的地方，然而当我们准备上塑造型到基础类（特别是一个接口）的时候，内部类就开始发挥巨大作用
 * （从用于实现的对象生成一个接口句柄具有与上溯造型至一个基础类相同的效果）。这是由于内部类，随后可完全进入不可用或
 * 不可见状态，对任何人都将如此，所以我们可以非常方便的隐藏实施细节，如下所示
 * 在Parcel3中，内部类PContents被设置为private，所以除了Parcel3其它东西都不能访问他，
 * 这意味着客户端程序员对这些成员的认识和访问都将得到限制，
 * 普通类（非内部类）不可设置为private或者protected的，只允许设置为public 或者友好的
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		Contents c = p.cont();
		Destination d = p.dest("china");
	}
}
