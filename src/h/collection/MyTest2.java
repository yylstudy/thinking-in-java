package h.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * ¼¯ºÏÉ¾³ıÔªËØ
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(3);
		list.add(4);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			if(it.next()==3)
			it.remove();
		}
		for(Integer i:list) {
			System.out.println(i);
		}
	}
}
