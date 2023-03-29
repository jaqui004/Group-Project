package main.java.edu.odu.cs;
public class Course {
	// Used as part of an offering or section object to store
	// data on what the course is about

	
	// Made up of a course number and a subject
	private String subj;
	private int courNum;

	// Constructor
	public Course(){
		courNum = 0;
		subj = "";
	}

	// Alternate constructor
	// May need to change based on how inputs will be read from the
	// directories
	public Course(String subjInput, int numInput){
		subj = subjInput;
		courNum = numInput;
	}

	// Variable accessor functions
	public int getCourNum(){return courNum};
	public string getSubj(){return subj};

	// Variable mutator functions
	public void setCourNum(int numInput){courNum = numInput};
	public void setSubj(String subjInput){subj = subjInput};

	// Clone function
	public Course clone(){
		Course courseClone = new Course(subj, courseNum);
		return courseClone;
	}

	// Returns the subject and course number as a single string
	public String toString(){
		return subj + " " + courNum.toString();
	}
	
}
