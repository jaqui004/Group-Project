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
		this.targetFile= new File("./project/src/test/data/"+semDir+"/"+dateIn);
		this.date = dateIn;
		this.semesterDirectory= semDir;
	
	}

	//accesors
	public String getDate(){return this.date;}
	public File getTargetFile(){return this.targetFile;}
	public String getSemesterDirectory(){return this.semesterDirectory;}

	//mutators
	


}
