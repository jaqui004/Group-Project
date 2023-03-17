package edu.odu.cs.cs350.pne;
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
	private int enrollmentCap;
	// ENR
	// Link
	private String building;
	private String room;
	private Vector<Snapshot> snapshotVector= new Vector<>();
	// Schedule type
	// Campus 
	// INSM
	// Print
	private String meetTime;
	private String meetDays;
	// Override
	private String instructor;
	private String ptrmStart;
	private String ptrmEnd;
	private int waitListCap;
	private int waitList;
	private int waitListRemain;

	// Section constructor
	// Read in order:
	// enrolled, CRN, subject, 
	// Part of course
		// course number, title, credits, hours, 
	// xListCap,
	// ENR?, link, schedulteType, campus, INSM, print?, meetTime, meetDays, 
	// building, room, override?, instructor, overallCap, ptrmStart,
	// ptrmEnd, waitListCap, waitList, waitListRemain
	public Section(int enrollInput, String crnInput, Course courInput, 
	              int xCapInput /*, ENR, link, scheduleType, */
				  String campInput/*INSM, print*/, String meetTimeInput,
				  String meetDaysInput, String buildInput,
				  String roomInput,/*override*/ String instructorInput,
				  String ptrmStartInput, String ptrmEndInput,
				  int waitCapInput, int waitInput, int waitRemainInput){

		enrolled = enrollInput;
		CRN = crnInput;
		secCour = courInput;
		xlistCap = xCapInput;
		// ENR
		// Link
		// scheduletype
		campus = campInput;
		// INSM
		// print
		meetTime = meetTimeInput;
		meetDays = meetDaysInput;
		building = buildInput
		room = roomInput;
		// override
		instructor = instructorInput;
		ptrmStart = ptrmStartInput;
		ptrmEnd = ptrmEndInput;
		waitListCap = waitCapInput;
		waitList = waitInput;
		waitListRemain = waitRemainInput;
	}

	// Accessor functions

	// Mutator functions
}
