package innerClass.package04;

/**
 * �����ڲ��඼û��ʲô����ĵط���Ȼ��������׼���������͵������ࣨ�ر���һ���ӿڣ���ʱ���ڲ���Ϳ�ʼ���Ӿ޴�����
 * ��������ʵ�ֵĶ�������һ���ӿھ������������������һ����������ͬ��Ч���������������ڲ��࣬������ȫ���벻���û�
 * ���ɼ�״̬�����κ��˶�����ˣ��������ǿ��Էǳ����������ʵʩϸ�ڣ�������ʾ
 * ��Parcel3�У��ڲ���PContents������Ϊprivate�����Գ���Parcel3�������������ܷ�������
 * ����ζ�ſͻ��˳���Ա����Щ��Ա����ʶ�ͷ��ʶ����õ����ƣ�
 * ��ͨ�ࣨ���ڲ��ࣩ��������Ϊprivate����protected�ģ�ֻ��������Ϊpublic �����Ѻõ�
 * @author yyl-pc
 *
 */
public class MyTest1 {
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		Contents c = p.cont();
		Destination d = p.dest("china");
	}
}
