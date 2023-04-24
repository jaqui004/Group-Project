package edu.odu.cs.cs350.pne;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class History {
//* History classes stores necessary data to dictories containing
// history snapshots. 

    // Made up of a list of section objects for now***
    // Enrollment projections take place here
    private LinkedList<Section> sectionList = new LinkedList<Section>();
    
    public History(){
        sectionList=new LinkedList<Section>();
    
    }

    public History(String dir, String date, int filesize){
        sectionList=new LinkedList<Section>();
        sectionList.add(new Section(dir,date));

        ///Might work for something else
    //     ListIterator <Section> secs = sectionList.listIterator();
    //     ListIterator <Snapshot> snps = secs.next().getSnapshotList().listIterator();
    //    //initialize the lists using iterators
    //     for(int i=0; i< filesize; i++){
    //         Section tmp = secs.next();
    //         Snapshot snp= tmp.getEnrollmentAsOf(dir, date);  
    //         sectionList.add(tmp);  
    //     }
    }

    public Iterator <Section> iterator(){
        return sectionList.iterator();
    }

    // public History(LinkedList<Section>sects){
    //     sectionList = new LinkedList<Section>();
    //     ListIterator <Section> iter = sects.listIterator();

    //     while(iter.hasNext()){
    //         Section current = iter.next();
    //         ListIterator<Snapshot> itr = current.getSnapshotList().listIterator();

    //         while(itr.hasNext()){
    //             Snapshot currnt = itr.next();
                
    //         }
    //     }
    // }

    public void addSection(Section toAdd){
        sectionList.add(toAdd);
    }

    public static void main(String[] args){
        String tmp="";
       // History history1 = new History();
        for (int i=0; i<args.length; i++){
            tmp=args[i];
            // File inFile = new File(tmp);
            // String getD = inFile.getName();  
            // File Dir = inFile.getParentFile();
            // String getDir = Dir.getName();
        }
        File inFile = new File(tmp);
        String getD = inFile.getName();  
        File Dir = inFile.getParentFile();
        String getDir = Dir.getName();
        File[] files = Dir.listFiles();
        int filenum = files.length;
        History hist = new History(getDir, getD, filenum);
        

        


        

       




    }

    // Outputs details regarding current course enrollment for each course
    // projected enrollment as of last snapshot, and the enrollment cap
    // over all offerings of that course
    public void summaryReport(){
        
        System.out.println("Current Enrollment Figures\n");
        System.out.println("--------------------------\n");
        
        System.out.println("Not implemented yet.\n\n");
        
        // Loop through the list of current courses and output the course
        // information, current numbers, and course cap

        System.out.println("Projected Enrollment Figures\n");
        System.out.println("----------------------------\n");

        System.out.println("Not implemented yet.\n\n");
        
        // Outpt info obtained from data analysis, along with course
        // information and the course cap
    }
}
