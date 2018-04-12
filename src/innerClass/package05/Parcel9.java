package innerClass.package05;

import innerClass.package04.Destination;

public class Parcel9 {
	public Destination dest(String dest,float price) {
		return new Destination() {
			private  int cost;
			{
				cost = Math.round(price);
				if(cost>100) 
					System.out.println("Over budget");
			}
			String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		p.dest("hahha", 101.3f);
	}
}
