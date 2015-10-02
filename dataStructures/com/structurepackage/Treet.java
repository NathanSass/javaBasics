package com.structurepackage;

import java.io.Serializable;
import java.util.Date;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

// author, description, creationDate

public class Treet implements Comparable<Treet>, Serializable{
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


	public List<String> getWords(){
		String[] words = mDescription.toLowerCase().split("[^\\w#@']+");
		return Arrays.asList(words);
	}

	public String getDescription(){
		return mDescription;
	}

	public Date getCreationDate(){
		return mCreationDate;
	}
	
	@Override
	public int compareTo(Treet other) {
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

	public List<String> getHashTags(){
		return getWordsPrefixedWith("#");
	}

	public List<String> getMentions(){
		return getWordsPrefixedWith("@");
	}

	private List<String> getWordsPrefixedWith(String prefix){
		List<String> results = new ArrayList<String>();
		for (String word : getWords()) {
			if (word.startsWith(prefix)) {
				results.add(word);
			}
		}
		return results;
	}
	
	@Override
	public String toString(){
		// return "Treet: \"" +mDescription + "\" - @" + mAuthor;
		return String.format("Treet: \"%s\" by %s on %s",
			mDescription, mAuthor, mCreationDate);
	}
}