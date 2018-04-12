package g.sort;

import java.util.HashMap;

public class MyHashMap extends HashMap implements Comparable<MyHashMap>{
	
	@Override
	public int compareTo(MyHashMap o) {
		return (int)get("key")-(int)o.get("key");
	}
}
