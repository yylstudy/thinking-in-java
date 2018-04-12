package h.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 测试各种List性能
 * 相对于LinkedList和ArrayList
 * ArrayList 在随机查询方面效率高，而在插入或者删除方面，效率较低
 * 而LinkedList在插入、删除方面效率高，查询效率低
 * @author yyl-pc
 *
 */
public class MyTest1 {
	private static final int REPS = 100;
	private abstract static class Tester{
		String name;
		int size;
		Tester(String name,int size){
			this.name = name;
			this.size = size;
		}
		abstract void test(List a);
	}
	private static Tester[] tests = {
		new Tester("get",300) {
			@Override
			void test(List a) {
				for(int i=0;i<REPS;i++) {
					for(int j=0;j<a.size();j++) {
						a.get(j);
					}
				}
			}
		},
		new Tester("iteration",300) {
			@Override
			void test(List a) {
				for(int i=0;i<REPS;i++) {
					Iterator it = a.iterator();
					while(it.hasNext()) {
						it.next();
					}
				}
			}
		},
		new Tester("insert",1000) {
			@Override
			void test(List a) {
				int half = a.size()/2;
				String s  = "test";
				ListIterator it = a.listIterator(half);
				for(int i = 0;i<size*10;i++) {
					it.add(s);
				}
			}
		},
		new Tester("remove",5000) {
			@Override
			void test(List a) {
				ListIterator it = a.listIterator(3);
				while(it.hasNext()) {
					it.next();
					it.remove();
				}
			}
		},
	};
	public static void main(String[] args) {
		List list = new ArrayList();
		List linkedList = new LinkedList();
		for(int i=0;i<1000;i++) {
			linkedList.add(i);
			list.add(i);
		}
		for(Tester test:tests) {
			long t1 = System.currentTimeMillis();
			test.test(list);
			long t2 = System.currentTimeMillis();
			System.out.println("ArrayList耗时："+(t2-t1));
			long t3 = System.currentTimeMillis();
			test.test(linkedList);
			long t4 = System.currentTimeMillis();
			System.out.println("LinkedList耗时："+(t4-t3));
		}
	}
}
