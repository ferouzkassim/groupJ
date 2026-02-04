/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.studentsregitsration;

import java.util.regex.Pattern;

/**
 *
 * @author DROID
 */
public class PasswordChecker {
    private final String passone;
    private final String passtwo;
    public PasswordChecker(String passwordone,String passwordtwo){
     this.passone = passwordone;
     this.passtwo = passwordtwo;
    }
    public boolean IsSame() throws Exception  {
      if(this.passone==null) {
          throw new Exception("Cant compare empty");
      }
      if(this.passtwo==null) {
          throw new Exception("One of the passowrds is empty");
      }
      return (this.passone == null ? this.passtwo == null : this.passone.equals(this.passtwo));
    }
    public boolean StaisfyConditions(){
        if(this.passone.length()>=8 && this.passone.length()<=20) {
           return Pattern.matches( "a-z/A-Z/#",this.passone);
        }
     return false;
    }
    public String GetPassword(){
    return this.passone;
    }
}
