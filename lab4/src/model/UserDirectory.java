/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author wenqing-mbp16
 */
import java.util.ArrayList;

public class UserDirectory {
    private ArrayList<User> allUsers;

    public UserDirectory() {
        this.allUsers = new ArrayList<>();
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
    
    public void addUser(User newUser) {
        allUsers.add(newUser);
    }
    
    public void removeUser(User user) {
        allUsers.remove(user);
    }
    
    public int getSize() {
        return allUsers.size();
    }
}

    
    
    
    
    
    

