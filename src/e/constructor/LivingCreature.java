package e.constructor;

public class LivingCreature {
	Characteristic p = new Characteristic("is alive");
	LivingCreature(){
	    System.out.println("LivingCreature()");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("LivingCreature finalize");
		if(DoBaseFinalization.flag) {
			super.finalize();
		}
	}
}
