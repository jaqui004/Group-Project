package edu.odu.cs.cs350.pne;
public class Course {
	// Used as part of an offering or section object to store
	// data on what the course is about
	// Info shared between all sections of a course

	
	// Made up of a course number, a subject, and a description
	private String subj;
	private String courNum;
	private String title;
	private int credits;
	private int hours; 

	// Constructor
	public Course(){
		courNum = 0;
		subj = "";
		title = "";
		credits = 0;
		hours = 0;
	}

	// Alternate constructor
	// May need to change based on how inputs will be read from the
	// directories
	public Course(String subjInput, String numInput, String titleInput,
	              int creditInput, int hourInput){
		subj = subjInput;
		courNum = numInput;
		title = titleInput;
		credits = creditInput;
		hours = hourInput;
	}

	// Variable accessor functions
	public String getCourNum(){return courNum;}
	public String getSubj(){return subj;}
	public String getTitle(){return title;}
	public int getCredits(){return credits;}
	public int getHours(){return hours;}

	// Variable mutator functions
	public void setCourNum(String numInput){courNum = numInput;}
	public void setSubj(String subjInput){subj = subjInput;}
	public void setTitle(String titleInput){title = titleInput;}
	public void setCredits(int creditInpt){credits = creditInput;}
	public void setHours(int hoursInput){hours = setHours;}

	// Clone function
	public Course clone(){
		Course courseClone = new Course(subj, courseNum, title, credits);
		return courseClone;
	}

	// Returns the subject and course number as a single string
	public String toString(){
		return subj + " " + courNum + " - " title;
	}

	// Equivalence check function
	
	
}
