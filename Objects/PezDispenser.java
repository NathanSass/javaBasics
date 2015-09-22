public class PezDispenser {
	// Must match filename
	public static final int MAX_PEZ = 12; // final means the value is immutable
	private String mCharachterName; // Instance variable
	private int mPezCount;

	public PezDispenser(String charachterName) { // Constructor must be same as the class name
		mCharachterName = charachterName;
		mPezCount = 0;
	}

	public void load() { // void means it return nothing
		mPezCount = MAX_PEZ;
	}

	public String getCharachterName() {
		return mCharachterName;
	}
}