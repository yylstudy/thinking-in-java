package innerClass.package05;

/**
 * �����ڲ��಻��ӵ�й���������Ϊ����������û�����֣�����û�й�����
 * �������ǿ����������ڲ���������ϴ������
 * @author yyl-pc
 *
 */
public class Parcel8 {
	public Detination dest(String dest) {
		return new Detination() {
			private String label = dest;
			@Override
			public String readLabel() {
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		p.dest("s");
	}
}
