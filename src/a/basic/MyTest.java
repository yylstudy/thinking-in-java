package a.basic;

import org.junit.Test;

public class MyTest {
	/**
	 * ���԰˴��������ͣ�δװ��ģ�Ĭ��ֵ������ʼ���� ����Ĭ��ֵֻ���������Ա���������Ǿֲ�������ᱨ��
	 */
	@Test
	public void test1() {
		TestClass t = new TestClass();
		System.out.println("����ʼ������£�booleanĬ��ֵΪ��" + t.a);
		System.out.println("����ʼ������£�charĬ��ֵΪ��" + t.b);
		System.out.println("����ʼ������£�byteĬ��ֵΪ��" + t.c);
		System.out.println("����ʼ������£�shortĬ��ֵΪ��" + t.d);
		System.out.println("����ʼ������£�intĬ��ֵΪ��" + t.e);
		System.out.println("����ʼ������£�longĬ��ֵΪ��" + t.f);
		System.out.println("����ʼ������£�floatĬ��ֵΪ��" + t.g);
		System.out.println("����ʼ������£�doubleĬ��ֵΪ��" + t.h);
	}

	/**
	 * ���԰˴��������ͣ���װ��ģ�Ĭ��ֵ������ʼ����
	 */
	@Test
	public void test2() {
		TestClass2 t = new TestClass2();
		System.out.println("����ʼ������£�BooleanĬ��ֵΪ��" + t.a);
		System.out.println("����ʼ������£�CharacterĬ��ֵΪ��" + t.b);
		System.out.println("����ʼ������£�ByteĬ��ֵΪ��" + t.c);
		System.out.println("����ʼ������£�ShortĬ��ֵΪ��" + t.d);
		System.out.println("����ʼ������£�IntegerĬ��ֵΪ��" + t.e);
		System.out.println("����ʼ������£�LongĬ��ֵΪ��" + t.f);
		System.out.println("����ʼ������£�FloatĬ��ֵΪ��" + t.g);
		System.out.println("����ʼ������£�DoubleĬ��ֵΪ��" + t.h);
	}
	
	/**
	 * java�� +�ǰ���˳������� 1+1 ����int���� ������2 2+"" ��Ϊ�ַ���"2" �ַ���"2"+1 �ͱ��21��
	 */
	@Test
	public void test3() {
		System.out.println(1 + 1 + 1 + "");// 3
		System.out.println(1 + 1 + "" + 1);// 21.0
		System.out.println(1 + 5 * 6 + "" + 10);// 3110
	}
	
	/**
	 * ���Զ���ֵ
	 */
	@Test
	public void test4() {
		int a = 4;// ����Integer ��ΪInteger�ǻ����������͵�װ������
		int b = 3;
		a = b;
		a = 5;
		/**
		 * ���������͵ĸ�ֵ�Ƿǳ�ֱ�ӵ�,������������ʵ�ʵ�ֵ�����Ҳ���ָ��һ������ľ����������Ϊ
		 * �丳ֵ��ʱ�򣬿ɽ�����һ���ط������ݸ��Ƶ���һ���ط� ����b����a�ĸı���ı�
		 */
		System.out.println(a);// 5 
		System.out.println(b);// 3

		/**
		 * ����Ϊ���󡰸�ֵ����ʱ�����ȴ�����˱仯�� ��һ��������в���ʱ���������������������ľ��
		 * ������������һ��������һ�����󡱸�ֵ��ʵ�ʾ��ǽ������һ���ط����Ƶ���һ���ط�
		 */
		Number c = new Number();
		Number d = new Number();
		c.i = 7;
		d.i = 8;
		c = d; // c��d�ľ����ͬʱָ�� d ���Ե����޸� cʱ ���൱���޸���d
		c.i = 9;
		System.out.println(c.i);// 9
		System.out.println(d.i);// 9 �������ֵ����8 ����9
	}
	public void f(Letter x){
		x.c = 'z';
	}
	/**
	 * ���Է������ݣ�
	 * ʵ�ʴ��ݵ���һ�����������ֵ��ı�
	 */
	@Test
	public void test5(){
		Letter x = new Letter();
	    x.c = 'a';
	    System.out.println("1: x.c: " + x.c);
	    f(x);
	    System.out.println("2: x.c: " + x.c);
	}
	/**
	 * do-while��while�������do-while���ٻ�ִ��һ��
	 */
	@Test
	public void test6(){
		int i = 10;
		do{
			System.out.println(i);
			i--;
		}while(i>5);
				
	}
	
	/**
	 * continue��break������
	 */
	@Test
	public void test7() {
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < 10; i++) {
				if (i == 5) {
					continue;
				}
				if (i == 8) {
					break;
				}
				System.out.println("j=" + j + ";i=" + i);
			}
		}
	}
	
	/**
	 * switch�÷�
	 */
	@Test
	public void test8() {
		int s = 3;
		switch(s){
			case 0:
				System.out.println(s);
				break;
			case 1:
				System.out.println(s);
				break;
			default:
				System.out.println(s);
				break;
		}
	}
	
	
}
