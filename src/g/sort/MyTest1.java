package g.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 集合排序比较
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		List<MyHashMap> list = new ArrayList<MyHashMap>();
		MyHashMap map = new MyHashMap();
		map.put("key", 4);
		list.add(map);
		map = new MyHashMap();
		map.put("key", 2);
		list.add(map);
		map = new MyHashMap();
		map.put("key", 3);
		list.add(map);
		map = new MyHashMap();
		map.put("key", 1);
		list.add(map);
		Class[] interfaces = map.getClass().getInterfaces();
		List is = Arrays.asList(interfaces);
		if(is.contains(Comparable.class)) {//若集合内的对象实现了Comparable接口，就使用Collections.sort(list)接口排序
			Collections.sort(list);
		}else {//若没有，则new 一个 Comparator
			Collections.sort(list, new Comparator<Map>() {
				@Override
				public int compare(Map o1, Map o2) {
					return (int) o1.get("key") - (int) o2.get("key");
				}
			});
		}
		for(MyHashMap map1:list) {
			System.out.println(map1.get("key"));
		}
	}
}
