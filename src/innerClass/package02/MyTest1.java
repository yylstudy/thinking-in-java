package innerClass.package02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * �и��ⲿ��ӵ��һ�����ⷽ�������᷵��ָ��һ���ڲ���ľ��,����HashMap����ʱʹ�õ�Map.Entryһ��
 * �鿴Map�ӿ�Դ���֪ Entry�Ƕ�����Map�ڵ�һ���ڲ��ӿ�
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
