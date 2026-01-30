/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.groupj.partB;

/**
 *
 * @author DROID
 */
public class Money {
    private String currency;
    private double value;
    public Money (double valu,String currency){
        this.currency = currency;
        this.value = valu;
    }
    public double moneyValue(){
     return this.value;
    }
    public String CurrencyValue(){
     return this.currency;
    }
    public String Sente(){
     return this.value +this.currency;
    }
    public static Money minus(Money value1, Money Value2) throws Exception{
      double newprice = value1.value-Value2.value;
      if(value1.currency == null ? Value2.currency != null : !value1.currency.equals(Value2.currency)){
       throw new Exception("currency not the same ");
      }
     
      return new Money(newprice,value1.currency);
    } 
    public void AddMoney (double price){
        this.value+=price;
    }
}
    

