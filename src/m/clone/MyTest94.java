package m.clone;

/**
 *	若是这么写，会新建一个字符串，包含abc和foo的内容，在创建一个字符串，继续添加def，在创建一个字符串，继续添加47
 *	尽管最终的目的只是获得包含了所有内容的一个新字串，但中间却要用到大量字串对象，创建无用的多个对象，
 *	增加gc运行的概率，解决方法就是像之前介绍的那样，建立一个可变的“同志类”，对字符串来说，这个“同志类”就是StringBuffer
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
