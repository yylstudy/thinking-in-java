package innerClass.package06;

public class Sequence {
	private Object[] o;
	private int next = 0;
	public Sequence(int size) {
		o = new Object[size];
	}
	public void add(Object x) {
		if(next<o.length) {
			o[next] = x;
			next ++;
		}
	}
	private class SSelector implements Selector{
		int i = 0;
		@Override
		public boolean end() {
			return i==o.length;
		}

		@Override
		public Object current() {
			return o[i];
		}

		@Override
		public void next() {
			if(i<o.length) {
				i++;
			}
		}
	}
	public SSelector getSelector() {
		return new SSelector();
	}
	
	
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i=0;i<10;i++) {
			sequence.add(Integer.toString(i));
		}
		Selector sl = sequence.getSelector();
		while(!sl.end()) {
			System.out.println(sl.current());
			sl.next();
		}
	}
}
