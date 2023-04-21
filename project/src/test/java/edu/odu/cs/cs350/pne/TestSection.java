package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.Vector;

import org.junit.jupiter.api.Test;

public class TestSection{
    //setup default values
    public Course defaultCourse = new Course("CS120G");
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

        assertThat(section1.getCourse, equals(null));
        assertEquals(section1.getCRN(), "");
        assertEquals(section1.getXListCap(), 0);
        assertEquals(section1.getXListGroup(), 0);
        assertEquals(section1.getEnrolled(), 0);
        assertThat(section1.getSnapshots().isEmpty());
        assertEquals(section1.getLink(), "");
        assertEquals(section1.getBuilding(), "");
        assertEquals(section1.getRoom(), "");
        assertEquals(section1.getEnrollmentAsOf(), defaultEnrollSnap);


    }
}
