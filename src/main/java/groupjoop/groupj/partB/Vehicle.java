/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.groupj.partB;

/**
 *
 * @author DROID
 */
public class Vehicle {
    private final String regnumber;
    private final Money price;
    private final String Make;
    public Vehicle(String License,Money price,String type){
        this.price = price;
        this.regnumber = License;
        this.Make = type;
    }
    public static Money VehiclePrice(String Curency,double price ){
     var money = new Money(price,Curency);
     return money;
    }
    public void DepositBalance(Money sente) {
     
        try {
            Money.minus(this.price, sente);
        } catch (Exception ex) {
            System.getLogger(Vehicle.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    public String MakeName(){
    return this.Make;
    }
    public String ProfitOrLoss(Money price) throws Exception{
      Money result = Money.minus(price, this.price);
      if(result.moneyValue()<0){
       return "Loss";
      }
      if(result.moneyValue()==0){
      return "Square";
      }
      return "Proft";
    }
     
}
