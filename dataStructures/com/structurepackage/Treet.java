package com.structurepackage;
import java.util.Date;

// author, description, creationDate

public class Treet {
	private String mDescription;
	private String mAuthor;
	private Date mCreationDate;

	public Treet( String author, String description, Date creationDate) {
		mDescription  = description;
		mAuthor       = author;
		mCreationDate = creationDate;
	}

	public String getAuthor(){
		return mAuthor;
	}

	public String getDescription(){
		return mDescription;
	}

	public Date getCreationDate(){
		return mCreationDate;
	}

	@Override
	public String toString(){
		return "Treet: \"" + mDescription + "\" - @" + mAuthor;
	}
}