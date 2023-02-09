/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Wenqing Yang
 */
public class User {

    String firstName;
    String lastName;
    String city;
    String age;
    String telephoneNumber;
    String email;
    String address;
    String country;
    String major;
    String imagePath;
            //（String is a type of return value）
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }   
    
    public String gettelephoneNumber() {
        return telephoneNumber;
    }

    public void settelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }   
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {  
       this.country = country;
    }

    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major)  {
        this.major = major;
    }
    
    public String getImagePath() {
        return imagePath;
    }
 
    public void setImagePath(String path) {
        this.imagePath = path;
    }
}



   