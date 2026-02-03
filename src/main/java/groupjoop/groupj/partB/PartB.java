/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.groupj.partB;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * accepts 3 bidders and selects a bidder with a high price 
 * @author DROID
 */
public class PartB {
    public static void main(String[]args) throws InterruptedException, Exception{
        // we deal in usds
        Scanner MySc  = new Scanner(System.in);
          System.out.println("Hey there lets generate the car you will sell today");
         
          System.out.println("Give me the model");
           String carmakae =MySc.next();
        System.out.println("Give me the License number ");
         String lisence =MySc.next().strip();
         System.out.println("Give me Pending Payment we have with it ");
         double pendingBalance = MySc.nextDouble();
         System.out.println("what curency are we working in ");
        String curen =MySc.next();
        Money curr = new Money(pendingBalance,curen);
        Vehicle benz = new Vehicle(lisence,curr,carmakae);
        System.out.println("We have a car called"+benz.MakeName()+"\nwho wants to start bidding \nenter your names below ");
        System.out.println("Kinldy note we are dealing with "+curen+" currency only");
     
        ArrayList<Bidders> biddingList;
        biddingList = new ArrayList(3);
        while(biddingList.toArray().length<3){
         System.out.println("Enter Your Name Bidder");
         String name = MySc.next();
         System.out.println("Just to Confirm all your bids will be in "+ curen);
         Bidders newBider = new Bidders(name,curen);
         biddingList.add(newBider);
        }
        System.out.println("now lets bid !! ### cash coming in");
        int bidtimes = 1;
        while(bidtimes<=2){
        for(Bidders e:biddingList){
            if(!e.isClosed()){
          System.out.println("hey "+e.getName()+ "\tplace your bid");
          Thread.sleep(500);
          double bidde = MySc.nextDouble();
          e.Bid(bidde);
            System.out.println(e.getName()+ "\tbids\t"+bidde+ "$");
            System.out.println("Press x to close your final bit or press any key to continue");
            String c = MySc.next();
            if("x".equals(c)||"X".equals(c)){
                e.CloseBide();
            }
            }
            
          
        } 
        System.out.println("Round "+bidtimes+"\n done");
        bidtimes++;
        }
        
        System.out.println("Bidding Closed ");
        Bidders highestBidder = new Bidders("","");
        for(Bidders x: biddingList){
           if(x.AMiMax(biddingList)){
            highestBidder=x;
           }
        }
        System.out.println(benz.MakeName()+ "Sold to\n"+highestBidder.getName()+"\n for "+highestBidder.getTotalBid()+"at a" + benz.ProfitOrLoss(highestBidder.getActulaMoney())+"\nof\n" );
        
        
    }
}
