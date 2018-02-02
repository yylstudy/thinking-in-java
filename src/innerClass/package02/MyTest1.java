package innerClass.package02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 有个外部类拥有一个特殊方法，它会返回指向一个内部类的句柄,就像HashMap遍历时使用的Map.Entry一样
 * 查看Map接口源码可知 Entry是定义在Map内的一个内部接口
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("username", "yyl");
		map.put("password", "123");
		Iterator iterator = (Iterator) map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry entry = (Entry) iterator.next();
			System.out.println("--------");
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
