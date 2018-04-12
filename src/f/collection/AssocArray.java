package f.collection;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

public class AssocArray extends Dictionary {
	private Vector keys = new Vector();
	private Vector values = new Vector();
	@Override
	public int size() {
		return keys.size();
	}

	@Override
	public boolean isEmpty() {
		return keys.isEmpty();
	}

	@Override
	public Enumeration keys() {
		return keys.elements();
	}

	@Override
	public Enumeration elements() {
		return values.elements();
	}

	@Override
	public Object get(Object key) {
		int index = keys.indexOf(key);
		if(index==-1) return null;
		return values.get(index);
	}

	@Override
	public Object put(Object key, Object value) {
		keys.addElement(key);
		values.addElement(value);
		return key;
	}

	@Override
	public Object remove(Object key) {
		int index = keys.indexOf(key);
		if(index==-1) return null;
		keys.removeElementAt(index);
		Object val = values.get(index);
		values.removeElementAt(index);
		return val;
	}
	
}
