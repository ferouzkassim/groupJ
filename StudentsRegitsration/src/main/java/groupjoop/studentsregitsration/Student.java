/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupjoop.studentsregitsration;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import static org.apache.commons.io.IOUtils.writer;

/**
 *
 * @author DROID
 */
public class Student {
     private String Firstname;
     private String LastName;
     private String Email;
     private String Password;
     private LocalDate DateofBirth;
     private String IdNumber;
      private  Enum Gender;
      private String CourseUnit;
    public Student(String firstName,String Lastname){
     this.Firstname = firstName.trim();
     this.LastName = Lastname.trim();
    }
    public void AddEmail(String Email) throws Exception{
    if(!Email.contains("@")) throw new Exception("Email invalid Should Contain @");
        this.Email = Email;
    }
    public void AddPassword(String Password) throws Exception{
    if (!Password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
    throw new Exception("Invalid password: must contain at least one number and one capital letter, and be at least 8 characters long");
            }
        this.Password = Password;
    }
    public void GenerateId(){
     Random rds = new Random();
     this.IdNumber = "ID:"+this.DateofBirth.getDayOfYear()+"-"+rds.nextInt(9999);
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
    public void AddDob(int year,int month,int Day){
      this.DateofBirth= LocalDate.of(year, month, Day);
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
        var crs ="";
        for(String e:this.CourseUnit.split(" ")){
          crs += e.charAt(0);
        }
    var record = this.IdNumber+"|"+this.Firstname+" "+ this.LastName+"|"+this.Gender.toString()+"|"+crs;
    
    return record;
    }
    public void SaveToCsv() throws IOException{
     try (FileWriter out = new FileWriter("students.csv", true); 
             CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT)) {
           
            printer.printRecord(RecordFormat());
            
            

            System.out.println("Data saved successfully to " + "students.csv");
        } catch (IOException e) {
            System.err.println("Error writing to CSV: " + e.getMessage());
        }
     
    }

    /**
     * @return the Firstname
     */
    public String getFirstname() {
        return Firstname;
    }

    /**
     * @param Firstname the Firstname to set
     */
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }
}
