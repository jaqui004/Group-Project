package edu.odu.cs.cs350.pne;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.util.Vector;

import org.junit.jupiter.api.Test;

public class TestSection{
    //setup default values
    public Course defaultCourse = new Course();
    public String defaultCRN = "11592";
    public int defualtXlistCap = 50;
    public int defaultXlistGroup = 30;
    public int defaultEnrolled = 0 ;
    // **Dont forget to initialize vector!**
	public Vector <Snapshot> defaultSnapshots = new Vector <Snapshot>();
    public String defaultLink = "P1";
    public String defaultBuilding = "OCNPS", defaultRoom = "0100";
    public File defaultEnrollSnap = new File("./project/src/test/data/202010/2020-04-01");
    
    
    @Test
    public void testSectionConstructor(){
        Section section1 = new Section();
        String tmp = " 0 - ";

        assertEquals(section1.getCourse().toString(), tmp);
        assertEquals(section1.getCRN(), "");
        assertEquals(section1.getXListCap(), 0);
        assertEquals(section1.getXListGroup(), 0);
        assertEquals(section1.getEnrolled(), 0);
        assertTrue(section1.getSnapshotVec().isEmpty());
        assertEquals(section1.getLink(), "");
        assertEquals(section1.getBuilding(), "");
        assertEquals(section1.getRoom(), "");
       /// assertEquals(section1.getEnrollmentAsOf("", ""),);

    }

    @Test
    public void testAddSnapshot(){
        Section section1 = new Section();
        Snapshot snp1 = new Snapshot("202010", "2020-04-01");
        section1.addSnapshot(snp1);
        String tmpDir = "202010";
        String dateTmp = "2020-04-01";
        
        assertTrue(section1.getSnapshotVec().contains(snp1));
        assertEquals(section1.getSnapshotVec().size(), 1);
        
        assertEquals(section1.getEnrollmentAsOf(tmpDir, dateTmp), snp1);


    }

}
