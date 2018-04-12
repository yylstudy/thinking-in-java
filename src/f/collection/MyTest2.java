package f.collection;

/**
 * ×Ô¶¨ÒåDictionary£¨×Öµä£©
 * @author yyl-pc
 *
 */
public class MyTest2 {
	public static void main(String[] args) {
		AssocArray aa = new AssocArray();
		for (char c = 'a'; c <= 'z'; c++)
			aa.put(String.valueOf(c), String.valueOf(c).toUpperCase());
		char[] ca = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < ca.length; i++)
			System.out.println("Uppercase: " + aa.get(String.valueOf(ca[i])));
	}
}
