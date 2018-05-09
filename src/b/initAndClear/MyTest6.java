package b.initAndClear;

public class MyTest6 {
	public static void main(String[] args) {
        Singleton sin = Singleton.getInstance();
        System.out.println(sin.counter1);
        System.out.println(sin.counter2);
    }
	static class Singleton {  
	    public static int counter1;
	    public static int counter2 = 2;
	    private static Singleton sin = new Singleton();
	 
	    private Singleton() {
	        counter1++;
	        counter2++;
	    }
	     
	    public static Singleton getInstance() {
	        return sin;
	    }
	}
}

