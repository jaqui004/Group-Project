package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSnapshot{
    //set default values for testing
    public String defaultDate = "2020-04-01";
    public Path default_TargetDir = Paths.get("./project/src/test/data/");
    public int defaultEnrollment = 0;
    

    //test for constructor
    @Test
    public void testSnapshotConstructor(){
        Snapshot snpshot1 = new Snapshot(defaultDate, default_TargetDir, defaultEnrollment); 
        assertEquals(snpshot1.getDate(), "2020-04-01");
        assertEquals(snpshot1.getTargetDir(), Paths.get("./project/src/test/data"));
        assertEquals(snpshot1.getEnrollment(), 0);
    }
    
}
