package g.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ��������Ƚ�
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
		if(is.contains(Comparable.class)) {//�������ڵĶ���ʵ����Comparable�ӿڣ���ʹ��Collections.sort(list)�ӿ�����
			Collections.sort(list);
		}else {//��û�У���new һ�� Comparator
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
