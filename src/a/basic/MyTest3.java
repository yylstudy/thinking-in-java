package a.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
/**
 * ������ʽѧϰ��
 * ע��������ʽ��һ��һ��ƥ��ģ�������*��\�ȶ��Ǳ�ʾǰһ��
 * ������ʽֻ��ƥ�����е� ���� zoop ȥ��֤ o{2} ���ʱfalse ��Ȼ
 * ��������o�����������ַ�ƥ�䲻��
 * @author yyl-pc
 *
 */

/**
 * ������ʽ�����﷨
 * \: ת���ַ�
 * ^: ƥ�������ַ����Ŀ�ʼλ��  ������֤�Ĺ��� ��^��ͷ����$��β
 * $: ƥ�������ַ����Ľ���λ��
 * *��ƥ��ǰ����ӱ��ʽ����Σ�����0�Σ������� zo* ��ƥ�� z�� zoo �ȼ���{0,}
 * +: һ�λ���ƥ��ǰ��ı��ʽ  zo+��ƥ��zo��zoo��������ƥ��z �ȼ���{1,}
 * ?: 0�λ�1��ƥ��ǰ��ı��ʽ zo? ��ƥ��z �� zo
 * {n}: n�ǷǸ���������ƥ��n�Σ�����o{2}�� zo�е�o��ƥ�䣬������zoop�е�����oƥ��
 * {n,m}: m��n��Ϊ�Ǹ�����������n<=m,����ƥ��n�Σ�����ƥ��m��
 * ?: 
 * .: ƥ���\r\n֮����κε����ַ���Ҫƥ�����\r\n���ڵ��κ��ַ�����ʹ�� [\s\S]ģʽ
 * (pattern): 
 */
public class MyTest3 {
	/**
	 * ������ʽ�����÷�
	 */
	@Test
	public void test1(){
		String validationStr = "zoo";//Ҫ��֤���ַ���
		String regex = "z?o{2}";//��֤����
		boolean b = Pattern.matches(regex,validationStr);//�ж��ַ����Ƿ���������ʽ��ƥ��
		System.out.println(b);
	}
}
