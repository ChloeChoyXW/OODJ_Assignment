/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package carrentalsystem;
import java.io.File;  
import java.io.IOException;
/**
 *
 * @author trish
 */
public class User {
    
    protected String UserID;
    public String Name;
    protected int Contact_No;
    protected String Password;
    protected String Usertype;
}


public User(String UserID, String Name,int Contact_No, String Password, String Usertype) {
  
    this.UserID = UserID;
    this.Name = Name;
    this.Contact_No = Contact_No;
    this.Password = Password;
    this.Usertype = Usertype;
  
}


private String getUserID() {return this.UserID;}
private void setUserID(String UserID) {this.UserID = UserID;}

public String Name() {return this.Name;}
public void Name(String Name) {this.Name = Name;}

private int getContact_No() {return this.Contact_No;}
private void set(int Contact_No) {this.Contact_No = Contact_No;}

private String Password() {return this.Password;}
private void Password(String Password) {this.Password = Password;}

private String Usertype() {return this.Usertype;}
private void Usertype(String Usertype) {this.Usertype = Usertype;}


// Addition function
public void Add(){               //For ID numbers
        ArrayList<Customer> customers = View();
        if (User.isEmpty()) {
            this.UserID = 1;
        } else {
            this.UserID = ((User)User.get(User.size() - 1)).ID + 1;
        }

}

//add in functions later? Update & Remove


public class CreateFile {         //creating text file for user functions
  public static void User(String[] args) {
    try {
      File User = new File("userinfo.txt");
      if (User.createNewFile()) {
        System.out.println("File created: " + User.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

