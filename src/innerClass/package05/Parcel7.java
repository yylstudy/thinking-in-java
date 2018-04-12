package innerClass.package05;

public class Parcel7 {
	public Wrapping wrap(int x) {
		return new Wrapping(x) {
			@Override
			public int value() {
				return super.value()*47;
			}
		};
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		p.wrap(1);
	}
}
