package edu.odu.cs.cs350.pne;
import java.io.File;


public class Snapshot {
	
	// Is a part of a section object used for data analysis

	// Made up of a date and a semester code for directory and file
	private String date, semesterDirectory;
	private File targetFile;

	
	
	/** 
	* Constructor
	*@param semDir the semester code
	*@param dateIn the date yyyy-mm-dd format
	*/
	public Snapshot(String semDir, String dateIn){
		targetFile= new File("./project/src/test/data/"+semDir+"/"+dateIn);
		date = dateIn;
		semesterDirectory= semDir;
	
	}

	public Snapshot(String semDir, String dateIn, File targetFIn){
		targetFile= targetFIn;
		date = dateIn;
		semesterDirectory= semDir;
	
	}


	//accesors
	public String getDate(){return date;}
	public File getTargetFile(){return targetFile;}
	public String getSemesterDirectory(){return semesterDirectory;}

	//mutators
	


}
