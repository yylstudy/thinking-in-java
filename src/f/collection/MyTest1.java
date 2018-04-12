package f.collection;

import java.util.Enumeration;
import java.util.Vector;
/**
 * ≤‚ ‘vector
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Vector cats = new Vector();
		for(int i=0;i<7;i++) 
			cats.addElement(new Cat2(i));
		cats.addElement(new Dog2(7));
		Enumeration e = cats.elements();
		while(e.hasMoreElements()) {
			((Cat2)(e.nextElement())).print();
		}
	}
}
