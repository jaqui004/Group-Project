package edu.odu.cs.cs350.pne;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
//import java.util.ArrayList;
import java.util.LinkedList;



public class TestSection{
    //setup default values
    public String defaultCRN = "11592";
    public int defaultXlistCap = 50;
    public int defaultXlistGroup = 30;
    public int defaultEnrolled = 0 ;
    public String defaultSemesterDir = "202010";
    public String defaultDate = "2020-04-01";
    public Course defaultCourse = new Course("CS","120G");
    // **Dont forget to initialize List!**
	public LinkedList <Snapshot> defaultSnapshots = new LinkedList <Snapshot>();
    public String defaultLink = "P1";
    public String defaultBuilding = "OCNPS", defaultRoom = "0100";
    public Snapshot defaultSnaps = new Snapshot(defaultSemesterDir, defaultDate);
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
        assertTrue(section1.getSnapshotList().isEmpty());
        assertEquals(section1.getLink(), "");
        assertEquals(section1.getBuilding(), "");
        assertEquals(section1.getRoom(), "");
       /// assertEquals(section1.getEnrollmentAsOf("", ""),);

    }

    @Test
    public void testSectionCopyConst(){
        Section section1 = new Section(defaultSemesterDir,defaultDate);
        String tmp = " 0 - ";

        assertEquals(section1.getCourse().toString(), tmp);
        assertEquals(section1.getCRN(), "");
        assertEquals(section1.getXListCap(), 0);
        assertEquals(section1.getXListGroup(), 0);
        assertEquals(section1.getEnrolled(), 0);
        assertFalse(section1.getSnapshotList().isEmpty());
        assertEquals(section1.getLink(), "");
        assertEquals(section1.getBuilding(), "");
        assertEquals(section1.getRoom(), "");
       /// assertEquals(section1.getEnrollmentAsOf("", ""),);

    }

    @Test
    public void testSectionCopyConst3(){
        defaultSnapshots.add(defaultSnaps);
        Section section1 = new Section(defaultCRN,defaultCourse,defaultXlistCap,
        defaultEnrolled,defaultLink,defaultXlistGroup,defaultBuilding, 
        defaultRoom,defaultSnapshots);
        //String tmp = " 0 - ";

        assertEquals(section1.getCourse(), defaultCourse);
        assertEquals(section1.getCRN(), defaultCRN);
        assertEquals(section1.getXListCap(), defaultXlistCap);
        assertEquals(section1.getXListGroup(), defaultXlistGroup);
        assertEquals(section1.getEnrolled(), defaultEnrolled);

        assertTrue(section1.getSnapshotList().contains(defaultSnaps));
        assertFalse(section1.getSnapshotList().isEmpty());
        assertTrue(section1.getSnapshotList().equals(defaultSnapshots));

        assertEquals(section1.getLink(), defaultLink);
        assertEquals(section1.getBuilding(), defaultBuilding);
        assertEquals(section1.getRoom(), defaultRoom);
    }



    @Test
    public void testAddSnapshot(){
        Section section1 = new Section();
        Snapshot snp1 = new Snapshot("202010", "2020-04-01");
        section1.addSnapshot(snp1);
        String tmpDir = "202010";
        String dateTmp = "2020-04-01";
        
        assertTrue(section1.getSnapshotList().contains(snp1));
        assertEquals(section1.getSnapshotList().size(), 1);
        
        assertEquals(section1.getEnrollmentAsOf(tmpDir, dateTmp) , snp1);


    }

    //@Test
    // public void testReads(){
    //     Section section1 = new Section();
    //     Snapshot snaps1 = new Snapshot("202010", "2020-04-01");

    //     section1.read_SectionRecords(snaps1); 
    //     //assertEquals(section1.getCourse(), defaultCourse);
    //     assertEquals(section1.getCRN(), defaultCRN);
    //     assertEquals(section1.getXListCap(), defaultXlistCap);
    //     assertEquals(section1.getXListGroup(), defaultXlistGroup);
    //     assertEquals(section1.getEnrolled(), defaultEnrolled);
    //     assertNotEquals(section1.getSnapshotList(), 0);
    //     assertEquals(section1.getLink(), defaultLink);
    //     assertEquals(section1.getBuilding(), defaultBuilding);
    //     assertEquals(section1.getRoom(), defaultRoom);


    // }

}
