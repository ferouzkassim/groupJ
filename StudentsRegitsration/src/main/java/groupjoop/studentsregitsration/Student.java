/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.studentsregitsration;

import java.time.Year;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author DROID
 */
public class Student {
     String Firstname;
     String LastName;
     String Email;
     String Password;
     Date DateofBirth;
     String IdNumber;
     Enum Gender;
     String CourseUnit;
    public Student(String firstName,String Lastname){
     this.Firstname = firstName.trim();
     this.LastName = Lastname.trim();
    }
    public void AddEmail(String Email) throws Exception{
    if(!Email.contains("@")) throw new Exception("Email invalid Should Contain @");
        this.Email = Email;
    }
    public void AddPassword(String Password) throws Exception{
     if(!Password.matches("^(?=.*[a-zA-Z])(?=.*\\d).{8}$")) throw new Exception("Invalid password must contain atlease one number , a  Capital letter");
     this.Password = Password;
    }
    public void GenerateId(){
     Random rds = new Random();
     this.IdNumber = "ID:"+Year.parse(this.DateofBirth.toString())+"-"+rds.nextInt(999);
    }
    public void Genderise(String Gender){
    if(Gender.contains("f")||Gender.contains("F")){
     this.Gender = gender.F;
    }
    else{
    this.Gender = gender.M;
    }
    }
    private enum gender{
    M,F
    }
    public void AddCourse(String Course){
     this.CourseUnit = Course;
    }
    public String RecordFormat(){
        var csr = this.CourseUnit.split(" ");
        StringBuilder csrAbb = new StringBuilder();
        Arrays.asList(csr).forEach(e->{
        csrAbb.append(e);
        });
    var record = this.IdNumber+"|"+this.Firstname+" "+ this.LastName+"|"+this.Gender.toString()+"";
    
    return record;
    }
}
