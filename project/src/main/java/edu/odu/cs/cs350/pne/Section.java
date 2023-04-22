package edu.odu.cs.cs350.pne;

import java.util.Vector;

public class Section {
	
	// Part of an offering object used to account for 
	// extra sections of an offering

	// Made up of a course, a CRN, a cross list cap, a total 
	// enrollment value, a cross list group??, a location 
	// (campus and maybe class), and a list of snapshots
	private Course secCour;
	private String CRN;
	private int xListCap;
	private int xListGroup;
	private int enrolled;
	private String link;
	private String building;
	private String room;
	private Vector<Snapshot> snapshotVector= new Vector<Snapshot>();
	


	// Section constructor
	public Section(){
		this.secCour = new Course();
		this.CRN = "";
		this.xListCap = 0;
		this.xListGroup = 0;
		this.enrolled = 0;
		this.link = "";
		this.building = "";
		this.room = "";
		this.snapshotVector = new Vector <Snapshot>();
	}

	// Accessor functions
	public Course getCourse(){return this.secCour;}
	public String getCRN(){return this.CRN;}
	public int getXListCap(){return this.xListCap;}
	public int getXListGroup(){return this.xListGroup;}
	public int getEnrolled(){return this.enrolled;}
	public String getLink(){return this.link;}
	public String getBuilding(){return this.building;}
	public String getRoom(){return this.room;}
	public Vector <Snapshot>  getSnapshotVec(){return this.snapshotVector;}

	/**
	 * Get the snapshot for a certain date
	 * @param dateDir the semesterCode
	 * @param date the date yyyy-mm-dd format
	 */
	public  Snapshot getEnrollmentAsOf(String dateDir, String date){
		
		//loop through vector of snapshots and return if found
		for (Snapshot snapEn : this.getSnapshotVec()){
				if(snapEn.getSemesterDirectory()== dateDir
				&& snapEn.getDate()== date)
					return snapEn;		
			
		}
		return null;
		

	}

	// Mutator functions

	// Adds a snapshot to this sections vector of snapshots
	public void addSnapshot(Snapshot snapIn){
		snapshotVector.add(snapIn);
	}




	// Creates a clone of a section
	public Section clone(){
		// Create new section object with variables
		Section secClone = new Section(enrolled, CRN, secCour.clone(), 
						   xListCap, /*ENR, link, scheduletype, */
						   campus, /*INSM, print,*/ meetTime, meetDays,
						   building, room, /*override,*/ instructor,
						   ptrmStart, ptrmEnd, waitListCap, waitList,
						   waitListRemain);

		// Make a copy of the snapshot vector and uses a loop to fill it
		// with snapshots
		Vector<Snapshot> snapVecClone = new Vector<Snapshot>();
		for(int i = 0; i < snapshotVector.size(); i++){
			snapVecClone.add(snapshotVector.get(i).clone());
		}

		// return clone
		return secClone;
	}

	// Prints out information of the section
	public String toString(){
		return (secCour.toString() + " - CRN " + CRN 
			 + "Instructor: " + instructor + ", Location: " + campus + " campus, " 
			 + building + " " + room + " "
			 + "Meeting Time: " + meetDays + " " + meetTime + " "
			 + "Start Date: " + ptrmStart + ", End Date: " + ptrmEnd + " " 
			 + "Currently Enrolled: " + enrolled + ", Enrollment Cap: " + enrollmentCap
			 + ", xList Group: " + xListGroup + ", xList Cap: " + xListCap + " "
			 + "Wait List Cap: " + waitListCap + ", Wait List: " 
			 + waitList + ", Wait List Remaining: " + waitListRemain + " ");
	}
}
