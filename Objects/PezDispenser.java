public class PezDispenser {
	public static final int MAX_PEZ = 12;
	private String mCharachterName;
	private int mPezCount;

	public PezDispenser(String charachterName) {
		mCharachterName = charachterName;
		mPezCount = 0;
	}

	public void load() {
		load(MAX_PEZ);
	}

	public void load(int pezAmount) {
		int newAmount = mPezCount + pezAmount;
		if (newAmount > MAX_PEZ) {
			throw new IllegalArgumentException("Too many PEZ!!!");
		}
		mPezCount += newAmount;
	}

	public boolean isEmpty() {
		return mPezCount == 0;
	}

	public String getCharachterName() {
		return mCharachterName;
	}

	public boolean dispense() {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			mPezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}
}