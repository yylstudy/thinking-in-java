package f.collection;

public class Groundhog {
	int ghNumber;

	Groundhog(int n) {
		ghNumber = n;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ghNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Groundhog other = (Groundhog) obj;
		if (ghNumber != other.ghNumber)
			return false;
		return true;
	}
	
}
