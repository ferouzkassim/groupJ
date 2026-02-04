/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.studentsregitsration;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author DROID
 */
public class GetDate {
    private  LocalDate today = null;
    public GetDate(){
    this.today = LocalDate.now();
    }
    public  Vector<String> GetYears(){
     RangesClass rgs = new RangesClass(16,60,"",1);
     var res = rgs.GetRanges();
     Vector<String> yeaars = new Vector<>();
    
     for(int r:res){
      int yeat =  this.today.getYear()-r;
     
      yeaars.add(String.valueOf(yeat));
     }
     return yeaars;
    }
   
}

