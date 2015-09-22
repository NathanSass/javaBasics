public class PezDispenser {
	// Must match filename
	private String mCharachterName; // Instance variable

	public PezDispenser(String charachterName) { // Constructor must be same as the class name
		mCharachterName = charachterName;
	}

	public String getCharachterName() {
		return mCharachterName;
	}
}