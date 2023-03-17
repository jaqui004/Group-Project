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
	// xListGroup?
	private int enrolled;
	private int enrollmentCap;
	private String location;
	private Vector<Snapshot> snapshotVector= new Vector<>();



	// Accessor functions

	// Mutator functions
}
