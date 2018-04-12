package innerClass.package05;

public class Parcel5 {
	public void internalTracking(boolean b) {
		if(b) {
			class TrackSlip {
				private String id;
				private TrackSlip(String s) {
					id = s;
				}
				String getSlip() {
					return id;
				}
			}
			TrackSlip ts = new TrackSlip("slip");
			String ss = ts.getSlip();
		}
	}
	public void track() {
		internalTracking(true);
	}
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		p.track();
	}
}
