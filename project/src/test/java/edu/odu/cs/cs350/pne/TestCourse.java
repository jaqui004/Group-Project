package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCourse{

    //default values
    String defaultSubj="CS";
    String defaultCourseNum = "120G";

   
    @Test
    public void testCourseConstructor() {
        Course course1= new Course(defaultSubj, defaultCourseNum);
        Course crs= new Course();
        assertEquals(course1.getSubj(), defaultSubj);
        assertEquals(course1.getCourNum(), defaultCourseNum);
        assertNotEquals(course1 , crs);

    }
}
