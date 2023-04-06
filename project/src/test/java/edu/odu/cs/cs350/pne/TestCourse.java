package edu.odu.cs.cs350.pne;

public class TestCourse{
    
    @Test
    public void testCourseConstructor{
        
        String courseSubj = "CS";
	    String courseNumber = "120G";
	    String courseTitle = "INTRO INFO LITERACY & RESEARCH";
	    int courseCredits = 3;
	    int courseHours = 50; 

        Course testCourse = new Course(courseSubj, courseNumber, courseTitle,
	              courseCredits, courseHours);
        
        assertEquals(courseSubj, testCourse.getSubj());
        assertEquals(courseNumber, testCourse.getCourNum());
        assertEquals(courseTitle, testCourse.getTitle());
        assertEquals(courseCredits, testCourse.getCredits());
        assertEquals(courseHours, testCourse.getHours());

    }

    @Test 
    public void testCourseClone{
       String courseSubj = "CS";
	   String courseNumber = "120G";
       String courseTitle = "INTRO INFO LITERACY & RESEARCH";
	   int courseCredits = 3;
	   int courseHours = 50; 

       Course courseOrig = new Course(courseSubj, courseNumber, courseTitle,
	              courseCredits, courseHours);

       Course courseClone = courseOrig.clone();

       assertEquals(courseOrig.getSubj(), couseClone.getSubj());
       assertEquals(courseOrig.getCourNum(), courseClone.getCourNum());
       assertEquals(courseOrig.getTitle(), courseClone.getTitle());
       assertEquals(courseOrig.getCredits(), courseClone.getCredits());
       assertEquals(courseOrig.getHours(), courseClone.getHours());

       // Test for snapshot vector
    }

    @Test
    public void testCourseToString{

       String courseSubj = "CS";
	   String courseNumber = "120G";
       String courseTitle = "INTRO INFO LITERACY & RESEARCH";
	   int courseCredits = 3;
	   int courseHours = 50; 

       Course courseTest = new Course(courseSubj, courseNumber, courseTitle,
	              courseCredits, courseHours);

        assertThat(courseTest.toString(), containsString("CS"));
        assertThat(courseTest.toString(), containsString("120G"));
        assertThat(courseTest.toString(), containsString("INTRO INFO LITERACY & RESEARCH"));

    }

}