package e.constructor;

public class Animal extends LivingCreature {
	Characteristic p = new Characteristic("has heart");

	Animal() {
		System.out.println("Animal()");
	}

	protected void finalize() {
		System.out.println("Animal finalize");
		if (DoBaseFinalization.flag)
			try {
				super.finalize();
			} catch (Throwable t) {
			}
	}
}
