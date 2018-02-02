package a.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
/**
 * 正则表达式学习：
 * 注意正则表达式是一个一个匹配的，所以像*、\等都是表示前一个
 * 正则表达式只能匹配现有的 比如 zoop 去验证 o{2} 结果时false 虽然
 * 他有两个o，但是其他字符匹配不过
 * @author yyl-pc
 *
 */

/**
 * 正则表达式常用语法
 * \: 转义字符
 * ^: 匹配输入字符串的开始位置  就是验证的规则 以^开头，以$结尾
 * $: 匹配输入字符串的结束位置
 * *：匹配前面的子表达式任意次（包括0次），例如 zo* 能匹配 z和 zoo 等价于{0,}
 * +: 一次或多次匹配前面的表达式  zo+能匹配zo和zoo，但不能匹配z 等价于{1,}
 * ?: 0次或1次匹配前面的表达式 zo? 能匹配z 和 zo
 * {n}: n是非负整数，正匹配n次，例如o{2}与 zo中的o不匹配，但是与zoop中的两个o匹配
 * {n,m}: m、n均为非负整数，其中n<=m,至少匹配n次，至多匹配m次
 * ?: 
 * .: 匹配除\r\n之外的任何单个字符，要匹配包括\r\n在内的任何字符，请使用 [\s\S]模式
 * (pattern): 
 */
public class MyTest3 {
	/**
	 * 正则表达式基本用法
	 */
	@Test
	public void test1(){
		String validationStr = "zoo";//要验证的字符串
		String regex = "z?o{2}";//验证规则
		boolean b = Pattern.matches(regex,validationStr);//判断字符串是否与正则表达式相匹配
		System.out.println(b);
	}
}
