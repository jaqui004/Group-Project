package edu.odu.cs.cs350.pne;
public class Snapshot {
	
	// Is a part of a section object used for data analysis

	// Made up of a date and an enrollment number
	private String date;
	private int enrolled;

	// Constructor
	public Snapshot(String dateInput, int enrolledInput){
		date = dateInput;
		enrolled = enrolledInput;
	}

	// Creates a clone of the snapshot
	public Snapshot clone(){
		Snapshot snapClone = new Snapshot(date, enrolled);
		return snapClone;
	}

}
