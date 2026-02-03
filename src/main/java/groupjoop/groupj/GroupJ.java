/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package groupjoop.groupj;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DROID 
 */
public class GroupJ {

    public static void main(String[] args) {
        System.out.println("Kindly enter the student's mark");
        Scanner myScanner = new Scanner(System.in);
        int myscn = myScanner.nextInt();
        // number one stops here 
        Calculator(myscn,false);
        //number one stops here 
       
        int numberOfIterations = 0;
         System.out.println("number 1ai");
         int[] marks =new int[5];
         int[] gradecounts = new int[10];
        while(numberOfIterations!=5){
            System.out.println("Kindly enter the next student's marks");
            int resStud = myScanner.nextInt();
            marks[numberOfIterations] = resStud;
            numberOfIterations++;
            //gradecounts[res]++;
        }
        System.out.println("Summary ");
        for(int e: marks){
          Calculator(e,true);
         }
        for(int i=1; i<=9;i++){
         System.out.println("Grades "+i+":"+ gradecounts[i]+"students");
        }
    }
    static void Calculator (int mark,boolean showGrade){
        RangesClass D1 = new RangesClass(80,100,"D1",1);
        RangesClass D2 = new RangesClass(75,89,"D2",2);
        RangesClass C3 = new RangesClass(66,74,"C3",3);
        RangesClass C4 = new RangesClass(60,65,"C4",4);
        RangesClass C5 = new RangesClass(50,59,"C5",5);
        RangesClass C6 = new RangesClass(45,49,"C6",6);
        RangesClass P7 = new RangesClass(35,44,"P7",7);
        RangesClass P8 = new RangesClass(30,34,"P8",8);
        RangesClass F = new RangesClass(0,29,"F",9);
        ArrayList<RangesClass> rangesList = new ArrayList<RangesClass>(Arrays.asList(
        D1,D2,C3,C4,C5,C6,P7,P8,F
        ));
     
        rangesList.forEach(e->{
               if(e.isInRange(mark)){
               
                if(showGrade){
                System.out.println(e.GetLabel()+" " + "Grade->"+e.GetGrade());
                }
                else{
                    System.out.println("the Remark is " + e.GetLabel());
                }
                
               }
             
        }); 
      
    }
       
   
    
}
