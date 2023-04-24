package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.io.File;

public class TestSnapshot{
    //set default values for testing
    public String defaultDate = "2020-04-01";
    public File default_TargetFile = new File("./project/src/test/data/202010/2020-04-01");
    public String default_semDir = "202010";
    

    //test for constructor
    @Test
    public void testSnapshotConstructor(){
        Snapshot snpshot1 = new Snapshot(default_semDir, defaultDate); 
        assertEquals(snpshot1.getDate(), "2020-04-01");
        assertEquals(snpshot1.getTargetFile(), default_TargetFile);
        assertEquals(snpshot1.getSemesterDirectory(), "202010");

        Snapshot snpS2 = new Snapshot(default_semDir, defaultDate, default_TargetFile);
        assertEquals(snpshot1.getDate(), "2020-04-01");
        assertEquals(snpshot1.getTargetFile(), default_TargetFile);
        assertEquals(snpshot1.getSemesterDirectory(), "202010");
        assertThat(snpshot1.equals(snpS2), is(false));
    }

    
}
