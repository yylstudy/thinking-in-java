package m.clone;
/**
 * 深克隆测试
 * @author yyl-pc
 *
 */
public class MyTest7 {
	public static void main(String[] args) {
		OceanReading or = new OceanReading(1,2);
		OceanReading or2 = (OceanReading) or.clone();
		or.depthReading.depth = 3;
		System.out.println(or);
		//若是没有深克隆，那么or2.depthReading.depth的值也会是3
		System.out.println(or2);
	}
	public static class OceanReading implements Cloneable{
		public DepthReading depthReading;
		public TempReading tempReading;
		public OceanReading(double tdata,double ddata) {
			depthReading = new DepthReading(ddata);
			tempReading = new TempReading(tdata);
		}
		public Object clone() {
			OceanReading obj = null;
			try {
				//obj就是待克隆的对象，所谓的深克隆就是克隆对象内部的对象
				obj = (OceanReading) super.clone(); 
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			obj.depthReading = (DepthReading) obj.depthReading.clone();
			obj.tempReading = (TempReading) obj.tempReading.clone();
			return obj;
		}
		@Override
		public String toString() {
			return "OceanReading [depthReading=" + depthReading + ", tempReading=" + tempReading + "]";
		}
		
	}
	
	public static class DepthReading implements Cloneable{
		public double depth;
		public DepthReading(double depth) {
			this.depth = depth;
		}
		public Object clone() {
			Object obj = null;
			try {
				obj = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return obj;
		}
		@Override
		public String toString() {
			return "DepthReading [depth=" + depth + "]";
		}
		
	}
	public static class TempReading implements Cloneable{
		private long time;
		private double temperator;
		public TempReading(double temperator) {
			time = System.currentTimeMillis();
			this.temperator = temperator;
		}
		public Object clone() {
			Object obj = null;
			try {
				obj = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return obj;
		}
		@Override
		public String toString() {
			return "TempReading [time=" + time + ", temperator=" + temperator + "]";
		}
		
	}
	
	
}
