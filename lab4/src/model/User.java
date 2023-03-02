/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author wenqing-mbp16
 */
public class User {
    String name;
    String employeeID;
    int age;
    String gender;
    Date startDate;
    String level;
    long telephoneNumber;
    String email;
    String imagePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = String.format("%06d", employeeID);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

   public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(String myDate) {
       
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date formattedDate = null;
        try {
            formattedDate = formatter.parse(myDate);
        } catch (Exception e) {
            System.err.println(e);
        }
        this.startDate = formattedDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

//    public long getTelephoneNumber() {
//        return telephoneNumber;
//    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


    @Override
    public String toString() {
        return name;
    }
    
   
    public long  getNumber() {
        return this.telephoneNumber;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDate() {
        return this.startDate.toString();
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
    
}
