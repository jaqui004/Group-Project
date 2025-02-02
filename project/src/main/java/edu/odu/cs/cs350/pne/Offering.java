package edu.odu.cs.cs350.pne;

import java.util.LinkedList;

public class Offering {
	
	// Represents a class that a student could choose to
	// enroll in during the semester


	// Made up of a course, a list of sections, an overall enrollment cap, 
	// an overall enrollment number, and a cross list group
	private Course courOff;
	private LinkedList<Section> sectionList = new LinkedList<Section>();
	private int overEnrollCap;
	private int overEnrolled;
	private int xListGroup;

	// constructor
	public Offering(Course courOffInput, int overCapInput, int overEnrolledInput, 
					int xListGroupInput, LinkedList<Section> sectList){

			courOff = courOffInput.clone();
			overEnrollCap = overCapInput;
			overEnrolled = overEnrolledInput;
			xListGroup = xListGroupInput;

			sectionList=new LinkedList<Section>();
			for (Section sect : sectList){
				sectionList.add(sect);
				
			}
			// Should overall enrolled be calculated from input courses?
	}
	public Offering(){

			courOff = new Course();
			overEnrollCap = 0;
			overEnrolled = 0;
			xListGroup = 0;
			sectionList=new LinkedList<Section>();
	}
			

	// Function to add sections to the offering object
	public void addSection(Section secIn){
		//sectionVector.add(secIn);
	
		// sectionVector.add(secIn.clone());
		// Update overall enrolled?
	}



	// Accessor functions
	public Course getCourse(){return courOff.clone();}
	public int getOverEnrolledCap(){return overEnrollCap;}
	public int getOverEnrolled(){return overEnrolled;}
	public int getXListGroup(){return xListGroup;}

	// Mutation functions
	public void setCourse(Course courIn){courOff = courIn;}
	public void setOverEnrolledCap(int overCapIn){overEnrollCap = overCapIn;}
	public void setOverEnrolled(int overEnrolledIn){overEnrolled = overEnrolledIn;}
	public void getXListGroup(int xListGroupIn){xListGroup = xListGroupIn;}


	// Clone function


	// Outputs the data in the offering
	public String toString(){
		return("Offering: " + courOff.toString() 
			 + "Overall Enrollment Cap: " + overEnrollCap + ", Overall Enrollment: " + overEnrolled
			+", xList Group: " + xListGroup
			 + "Sections: ");
		
		// Loops through the section vector and prints the info from each section
		// for(int i = 0; i < sectionVector.size(); i++){
		// 	System.out.println(sectionVector.get(i).toString()+ "\n"+"\n");
		// }

	}
}
