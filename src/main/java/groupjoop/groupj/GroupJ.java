/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package groupjoop.groupj;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        String Calculator = Calculator(myscn);
    }
    static String Calculator (int mark){
        RangesClass D1 = new RangesClass(80,100,"D1");
        RangesClass D2 = new RangesClass(75,89,"D2");
        RangesClass C3 = new RangesClass(66,74,"C3");
        RangesClass C4 = new RangesClass(60,65,"C4");
        RangesClass C5 = new RangesClass(50,59,"C5");
        RangesClass C6 = new RangesClass(45,49,"C6");
        RangesClass P7 = new RangesClass(35,44,"P7");
        RangesClass P8 = new RangesClass(30,34,"P8");
        RangesClass F = new RangesClass(0,29,"F");
        ArrayList<RangesClass> rangesList = new ArrayList<RangesClass>(Arrays.asList(
        D1,D2,C3,C4,C5,C6,P7,P8,F
        ));
       
        rangesList.forEach(e->{
               if(e.isInRange(mark)){
                System.out.println(e.GetGrade());
                
               }
        });
         return "";
    }
       
   
    
}
