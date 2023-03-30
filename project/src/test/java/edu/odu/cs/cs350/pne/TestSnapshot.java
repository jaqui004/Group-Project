package edu.odu.cs.cs350.pne;

public class TestSnapshot{
    
    @Test
    public void testSnapConstructor(){
        String snapDate = "29-AUG-20";
        int snapEnrolled = 20;

        Snapshot testSnap = new Snapshot(snapDate, snapEnrolled);

        assertEquals(snapDate, testSnap.getDate());
        assertEquals(snapEnrolled, testSnap.getEnrolled());
    }
    
    @Test
    public void testClone(){

        Snapshot snapOrig = new Snapshot("29-AUG-20", 20);
        Snapshot snapClone = snapOrig.clone();

        assertEquals(snapOrig.getDate(), snapClone.getDate());
        assertEquals(snapOrig.getEnrolled(), snapClone.getEnrolled());
    }
}
