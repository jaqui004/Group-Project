package edu.odu.cs.cs350.pne;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Semester {

    int semesterCode; //6 digit semester code for each direcetory
    int regDate; //the date of first day of pre-registration
    int regDeadline; //the date of the last day of regristation 
    
        
    void getSemester(int semesterCode) {
        //*Goes through all of the dictories within history. Semester codes
        // are six digits. FInal two digits will be "10" for Fall, "20" for spring &
        // "30" for summer*/
    
        //Array to store all of the semester directories. 
        String path = "/src/History";
        File file = new File(path);
    
        String [] semesterDir = file.list();
        
        for (String element: semesterDir){ // for testing later
            System.out.println(element);
        }
    }
    
    void semDate(String [] semesterDir, int regDate, int regDeadine) throws FileNotFoundException  {
        //*Reads the dates.txt document that contains the 1st day of registration
        // and the date of the add deadline (last day of registration) */
        
       // loop through semester array to check each folder
        //check for dates document in each semester directory-- throw exception if missing dates.txt
        //read the dates in txt--> store into regDate and regDeadline

        String file = "dates.txt";
        Scanner in = new Scanner(new File (file));
        
            for (String i : semesterDir) {
                
            }
        
    }
    
    void getEnrollmentAsOf() {
        //*Enrollment snapshots that contain all of the current information of 
        //a courses' enrollment. Most of this information will be in Section.java.
        //Call function here.*/
    }

}
