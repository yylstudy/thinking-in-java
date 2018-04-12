package k.serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Blip3 implements Externalizable {

	int i;
	String s; // No initialization

	public Blip3() {
		System.out.println("Blip3 Constructor");
		// s, i not initialized
	}

	public Blip3(String x, int a) {
		System.out.println("Blip3(String x, int a)");
		s = x;
		i = a;
		// s & i initialized only in non-default
		// constructor.
	}

	public String toString() {
		return s + i;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Blip3.writeExternal");
		// You must do this:
		out.writeObject(s);
		out.writeInt(i);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("Blip3.readExternal");
		// You must do this:
		s = (String) in.readObject();
		i = in.readInt();
	}


}
