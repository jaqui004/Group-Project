package main.java.edu.odu.cs.cs350.pne;

public class Offering {
	
	// Represents a class that a student could choose to
	// enroll in during the semester


	// Made up of a course, a list of sections, an overall enrollment cap, 
	// an overall enrollment number, and a cross list group
	private Course courOff;
	private Vector<Section> sectionVector = new Vector<Section>();
	private int overEnrollCap;
	private int overEnrolled;
	private int xListGroup;

	// constructor
	public Offering(Course courOffInput, int overCapInput, int overEnrolledInput, 
					int xListGroupInput){

			courOff = courOffInput.clone();
			overEnrollCap = overCapInput;
			overEnrolled = overEnrolledInput;
			xListGroup = xListGroupInput;

			// Should overall enrolled be calculated from input courses?
	}

	// Function to add sections to the offering object
	public void addSection(Section secIn){
		sectionVector.add(secIn.clone());

		// Update overall enrolled?
	}



	// Accessor functions
	public Course getCourse(){return courOff.clone();}
	public int getOverEnrolledCap(){return overEnrolledCap;}
	public int getOverEnrolled(){return overEnrolled;}
	public int getXListGroup(){return xListGroup;}

	// Mutation functions
	public Course setCourse(Course courIn){courOff = courIn.clone();}
	public int setOverEnrolledCap(int overCapIn){overEnrolledCap = overCapIn;}
	public int setOverEnrolled(int overEnrolledIn){overEnrolled = overEnrolledIn;}
	public int getXListGroup(int xListGroupIn){xListGroup = xListGroupIn;}


	// Clone function


	// Outputs the data in the offering
	public String toString(){
		cout << "Offering: " << courOff.toString() << endl 
			 << "Overall Enrollment Cap: " << overEnrollCap << ", Overall Enrollment: " << overEnrolled << ", xList Group: " << xListgroup << endl
			 << "Sections: " << endl << endl;
		
		// Loops through the section vector and prints the info from each section
		for(int i = 0; i < sectionVector.size(); i++){
			cout << sectionVector.get(i).toString() << endl << endl;
		}

	}
}
