package a.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Java ÊÇÖµ´«µÝ
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
		StringBuffer j = new StringBuffer("0");
		Map map =new HashMap();
		map.put("name", 10);
		change(map,j);
		System.out.println(map);//{name=10}
		System.out.println(j);//0222
	}
	public static void change(Map map,StringBuffer j){
		map = new HashMap();
		j.append("222");
	}
}
