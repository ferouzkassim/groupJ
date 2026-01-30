/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.groupj;

/**
 *
 * @author DROID
 */
public class RangesClass {
     private final int From;
     private final int To;
     private final String label;
     private int Grade;
    public RangesClass(int From, int To,String Label,int Grade){
       this.From = From;
       this.To = To;
       this.label = Label;
       this.Grade = Grade;
    }
    public boolean isInRange(int mark){
        return mark>=this.From&&mark<=this.To;
    }
    public String GetLabel(){
     return this.label;
    }
    public int GetGrade(){
        return this.Grade;
    }
}
