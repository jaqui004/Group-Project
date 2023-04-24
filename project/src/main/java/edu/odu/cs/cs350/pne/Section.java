package edu.odu.cs.cs350.pne;

import java.io.File;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Scanner;

public class Section {
	
	// Part of an offering object used to account for 
	// extra sections of an offering

	// Made up of a course, a CRN, a cross list cap, a total 
	// enrollment value, a cross list group??, a location 
	// (campus and maybe class), and a list of snapshots
	private Course secCour;
	private String CRN;
	private String subj;
	private String courNum;
	private int xListCap;
	private int xListGroup;
	private int enrolled;
	private String link;
	private String building;
	private String room;
	private LinkedList<Snapshot> snapshotList= new LinkedList<Snapshot>();
	private Vector<Section> sectionVector = new Vector<Section>();
	
	


	// Section constructor
	public Section(){
		secCour = new Course();
		CRN = "";
		xListCap = 0;
		xListGroup = 0;
		enrolled = 0;
		link = "";
		building = "";
		room = "";
		snapshotList = new LinkedList <Snapshot>();
	}

	public Section(String semestDir, String dateExct ){
		snapshotList = new LinkedList <Snapshot>();
		snapshotList.add(new Snapshot(semestDir, dateExct));
		secCour = new Course();
		CRN = "";
		xListCap = 0;
		xListGroup = 0;
		enrolled = 0;
		link = "";
		building = "";
		room = "";
	}

	public Section(String CRN2, Course crse, int xListCap2, int enroll, String link2,
		int xListGroup2, String building2, String room2, LinkedList<Snapshot> snapE){
				CRN=CRN2;
				secCour=crse;
				xListCap=xListCap2;
				enrolled=enroll;
				link=link2;
				xListGroup= xListGroup2;
				building=building2;
				room=room2;
				for(Snapshot tmp : snapE ){
					snapshotList.add(tmp);
				}
		}

	public Section(String CRN, String subj, String courNum) { //constructors
		this.CRN = CRN;
		this.subj = subj;
		this.courNum = courNum;
	}

	// Accessor functions
	public Course getCourse(){return secCour;}
	public String getCRN(){return CRN;}
	public int getXListCap(){return xListCap;}
	public int getXListGroup(){return xListGroup;}
	public int getEnrolled(){return enrolled;}
	public String getLink(){return link;}
	public String getBuilding(){return building;}
	public String getRoom(){return room;}
	public LinkedList <Snapshot>  getSnapshotList(){return snapshotList;}
	
	// Set values functions
	public void setCRN(String CRN) {
		this.CRN = CRN;
	}

	public void setSubj(String subj) {
		this.secCour.setSubj(subj);
	}

	public void setCourNum(String courNum) {
		this.secCour.setCourNum(courNum);
	}
	/**
	 * Get the snapshot for a certain date
	 * @param dateDir the semesterCode
	 * @param date the date yyyy-mm-dd format
	 */
	public  Snapshot getEnrollmentAsOf(String dateDir, String date){
		
		//loop through list of snapshots and return if found else return null
		
		for (Snapshot snapEn : this.getSnapshotList()){
				if(snapEn.getSemesterDirectory()== dateDir
				&& snapEn.getDate()== date)
					return snapEn;		
			
		}
		return null;
		

	}

	// Mutator functions

	// Adds a snapshot to this sections list of snapshots
	public void addSnapshot(Snapshot snapIn){
		snapshotList.add(snapIn);
	}

	/**
	 * Read in values making up section
	 * @param snapsSht -the certain snapshot which to read from
	 */
	public void read_SectionRecords(Snapshot snapsSht){
		//use scanner to read and initialze records
		
		Scanner x;
		boolean found = false;
		int y = 0;
		int count  =0;
		
		
		//Setup exception handler
		try
		{
			x = new Scanner(new File(snapsSht.getTargetFile().getPath()));
			//x.useDelimiter("[,]");
		
			
			while(x.hasNext() && !found)
			{
				
				String tmp=x.nextLine();
				Scanner strScan = new Scanner(tmp).useDelimiter(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

				CRN = null;  // new code start
				String subj = null;
				String courNum = null; // new code end

				while (strScan.hasNext()){
					String token = strScan.next().trim().replaceAll("\"", "");
					if (count == 1) { // new code start
					CRN = token;
					} else if (count ==2) {
						subj = token;
					} else if (count == 3) {
						courNum = token;
					}
					 count++; // new code end
				}
				strScan.close();
				//String tmp=x.next().trim().replaceAll("\"","");
				// Scanner tmpScan = new Scanner(tmp).useDelimiter("");
				//move count up when value has been read stop once all have been read
				//* while(count!=7){
					//String tmp=x.next().trim().replaceAll("\"","");
					//conditions for when at certian positions

				//for CRN
					if(y==1){
						this.CRN= tmp;
						count++;
					} 
					//course subj
					if(y==2){
						this.secCour.setSubj(tmp);
						count++;	
					}
					//course number
					if(y==3){
					this.secCour.setCourNum(tmp);
						count++;

					Section section = new Section();
					section.setCRN(this.CRN);
					section.setSubj(this.secCour.getSubj());
					section.setCourNum(this.secCour.getCourNum());
					
					sectionVector.add(section);
				
				}  

				x.close();
			}
		}
		catch(Exception e)
		{
			System.out.println("File not found");
		}
	

	// Creates a clone of a section
	// public Section clone(){
	// 	// Create new section object with variables
		 
	// 	//(enrolled, CRN, secCour.clone(), 
	// 	// 				   xListCap, /*ENR, link, scheduletype, */
	// 	// 				   campus, /*INSM, print,*/ meetTime, meetDays,
	// 	// 				   building, room, /*override,*/ instructor,
	// 	// 				   ptrmStart, ptrmEnd, waitListCap, waitList,
	// 	// 				   waitListRemain);

	// 	// // Make a copy of the snapshot vector and uses a loop to fill it
	// 	// // with snapshots
	// 	// Vector<Snapshot> snapVecClone = new Vector<Snapshot>();
	// 	// for(int i = 0; i < snapshotVector.size(); i++){
	// 	// 	snapVecClone.add(snapshotVector.get(i).clone());
	// 	// }

	// 	// return clone
	// 	return secClone;
	// }

	// // Prints out information of the section
	// public String toString(){
	// 	return (secCour.toString() + " - CRN " + CRN 
	// 		 + "Instructor: " + instructor + ", Location: " + campus + " campus, " 
	// 		 + building + " " + room + " "
	// 		 + "Meeting Time: " + meetDays + " " + meetTime + " "
	// 		 + "Start Date: " + ptrmStart + ", End Date: " + ptrmEnd + " " 
	// 		 + "Currently Enrolled: " + enrolled + ", Enrollment Cap: " + enrollmentCap
	// 		 + ", xList Group: " + xListGroup + ", xList Cap: " + xListCap + " "
	// 		 + "Wait List Cap: " + waitListCap + ", Wait List: " 
	// 		 + waitList + ", Wait List Remaining: " + waitListRemain + " ");
	// }
}