package innerClass.package05;

public class Parcel4 {
	public Detination dest(String s) {
		class PDetination implements Detination{
			private String label;
			private PDetination(String label) {
				this.label = label;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDetination(s);
	}
	
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Detination de = p.dest("123");
	}
	
	
}
