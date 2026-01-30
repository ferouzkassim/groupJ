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
    public RangesClass(int From, int To,String Label){
       this.From = From;
       this.To = To;
       this.label = Label;
    }
    public boolean isInRange(int mark){
        return mark>this.From&&mark<this.To;
    }
    public String GetGrade(){
     return this.label;
    }
}
