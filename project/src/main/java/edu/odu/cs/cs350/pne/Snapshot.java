package main.java.edu.odu.cs.cs350.pne;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Snapshot {
	
	// Is a part of a section object used for data analysis

	// Made up of a date and an enrollment number
	private String date;
	private int enrolled;

	// Constructor
	public Snapshot(String dateInput, int enrolledInput){
		date = dateInput;
		enrolled = enrolledInput;
	}

	// Creates a clone of the snapshot
	public Snapshot clone(){
		Snapshot snapClone = new Snapshot(date, enrolled);
		return snapClone;
	}



}
