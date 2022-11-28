/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author USER
 */
public class User {
    private String uid;
    private String name;
    private String pw;
    private String email;
    private String userType;

    public User() {
        uid = null;
        name = null;
        pw = null;
        email = null;
    }
    
    public User(String uid, String name, String pw, String email, String userType) {
        this.uid = uid;
        this.name = name;
        this.pw = pw;
        this.email = email;
        this.userType = userType;
    }

    public User(String uid, String name, String pw, String email) {
        this.uid = uid;
        this.name = name;
        this.pw = pw;
        this.email = email;
    }

    public User(String uid) {
        this.uid = uid;
    }
    
    
    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setuserType(String userType) {
        this.userType = userType;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    public String getEmail() {
        return email;
    }
    
    public String getuserType(){
        return userType;
    }
    
    public String toStaffLevel(){
        return uid + "|" + name + "|" + pw + "|" + email + "|" + userType;
    }

    @Override
    public String toString() {
        return uid + "|" + name + "|" + pw + "|" + email;
    
  }    
}
