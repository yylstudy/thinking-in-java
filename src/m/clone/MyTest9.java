package m.clone;

/**
 * ��¡����������
 * @author yyl-pc
 *
 */
public class MyTest9 {
	public static void main(String[] args) {
		Person person = new Person();
		Hero hero = new Hero();
		Scientist scientist = new Scientist();
		MadScientist madScientist = new MadScientist();
//		person.clone();//���뱨��
//		hero.clone();//���뱨��
		scientist.clone();
		madScientist.clone();
	}
	public static class Person{
	}
	public static class Hero extends Person{
	}
	public static class Scientist extends Person implements Cloneable{
		public Object clone() {
			try {
				return super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
				throw new InternalError();
			}
		}
	}
	public static class MadScientist extends Scientist{
	}
	
}
