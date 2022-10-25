/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

public class User {
    
    private String uid;
    private String name;
    private String pw;
    private String email;

    public User() {
        uid = null;
        name = null;
        pw = null;
        email = null;
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
    
    public static void adminLogin(){
        
    }

    @Override
    public String toString() {
        return uid + "|" + name + "|" + pw + "|" + email;
    
  }
}

    
    
    
    
