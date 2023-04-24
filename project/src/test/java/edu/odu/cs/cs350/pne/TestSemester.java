package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.LinkedList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class TestSemester{
   public String defaultCode = "202010";
    
    @Test
    public void testSemesterConstructor(){
    Semester semester1 = new Semester();

    assertNotEquals(semester1.getSemCode(), defaultCode);
    assertThat(semester1.getOfferingslist(), is(new LinkedList<Offering>()));
    
    
    }

    @Test 
    public void testAddOffers(){
        
    }
    
    }
