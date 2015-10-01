package com.structurepackage;
import java.io.Serializable;
import java.util.Date;

// author, description, creationDate

public class Treet implements Comparable, Serializable{
	// serialver com.structurepackage.Treet
	private static final long serialVersionUID = 6096248543031087865L;
	// private boolean mBreakit = true;
	private String mDescription;
	private String mAuthor;
	private Date mCreationDate;

	public Treet( String author, String description, Date creationDate) {
		mDescription  = description;
		mAuthor       = author;
		mCreationDate = creationDate;
	}


	public String[] getWords(){
		return mDescription.toLowerCase().split("[^\\w#@']+");
	}

	public String getDescription(){
		return mDescription;
	}

	public Date getCreationDate(){
		return mCreationDate;
	}
	
	@Override
	public int compareTo(Object obj) {
		Treet other = (Treet) obj;
		if (equals(other)) {
			return 0;
		}

		int dateCmp = mCreationDate.compareTo(other.mCreationDate);
		if (dateCmp == 0) {
			return mDescription.compareTo(other.mDescription);
		}
		return dateCmp;
	}
	public String getAuthor(){
		return mAuthor;
	}
	
	@Override
	public String toString(){
		// return "Treet: \"" +mDescription + "\" - @" + mAuthor;
		return String.format("Treet: \"%s\" by %s on %s",
			mDescription, mAuthor, mCreationDate);
	}
}