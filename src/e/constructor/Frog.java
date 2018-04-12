package e.constructor;

public class Frog extends Amphibian {
	Frog() {
		System.out.println("Frog()");
	}

	protected void finalize() {
		System.out.println("Frog finalize");
		if (DoBaseFinalization.flag)
			try {
				super.finalize();
			} catch (Throwable t) {
			}
	}
}
