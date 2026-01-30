/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.groupj.partB;

import java.util.List;

/**
 *
 * @author DROID
 */
public class Bidders {
    //these are peopel who wll bid for the auction;
    private final String name;
    private Money totalBid;
    private boolean bidingClosed = false;
    public Bidders(String name, String Currency){
      this.totalBid = new Money(0,Currency);
      this.name = name;
    }
    public void Bid (double money){
     this.totalBid.AddMoney(money);
    }
    public String getName(){
     return this.name;
    }
    public void CloseBide(){
        this.bidingClosed = true;
    }
    public boolean isClosed(){
        return this.bidingClosed;
    }
    public double getTotalBid(){
    return this.totalBid.moneyValue();
    }
    public boolean AMiMax(List<Bidders> bidders){
       
        for(Bidders x: bidders){
            if(this.getTotalBid()<x.getTotalBid()){
             return true;
                  }
           
            //x.getTotalBid()>
      }
       return false;
    }
    public Money getActulaMoney(){
    return this.totalBid;
    }
       
}
