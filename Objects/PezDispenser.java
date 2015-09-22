public class PezDispenser {
	public static final int MAX_PEZ = 12;
	private String mCharachterName;
	private int mPezCount;

	public PezDispenser(String charachterName) {
		mCharachterName = charachterName;
		mPezCount = 0;
	}

	public void load() {
		mPezCount = MAX_PEZ;
	}

	public boolean isEmpty() {
		return mPezCount == 0;
	}

	public String getCharachterName() {
		return mCharachterName;
	}
}