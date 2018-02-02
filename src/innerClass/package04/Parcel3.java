package innerClass.package04;
/**
 * @author yyl-pc
 *
 */
public class Parcel3 {
	private class PContents extends Contents{
		private int i=11;
		@Override
		public int value() {
			return i;
		}
	}
	protected class PDestination implements Destination{
		private String label;
		private PDestination(String whereTo){
			this.label = whereTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	public Destination dest(String dest){
		return new PDestination(dest);
	}
	public Contents cont(){
		return new PContents();
	}
	
}
