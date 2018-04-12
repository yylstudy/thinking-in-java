package f.collection;

import java.util.Hashtable;

/**
 * 随机数生成情况
 * @author yyl-pc
 *
 */
public class MyTest3 {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for(int i=0;i<10000;i++) {
			int s = (int) (Math.random()*20);
			if(ht.containsKey(s)) {
				((Counter)ht.get(s)).i++;
			}else {
				ht.put(s, new Counter());
			}
		}
		System.out.println(ht);
	}
}
