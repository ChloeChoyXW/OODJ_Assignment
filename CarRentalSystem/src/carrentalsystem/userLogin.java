/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.readTextFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class userLogin {
    static String uid;
    static String userType;
    
    public static void login(){
        ArrayList<Member> memberList = readTextFile("member");
        ArrayList<User> adminList = readTextFile("admin");
        Scanner email = new Scanner(System.in);
        System.out.println("Email:");
        String userEmail = email.nextLine();
        
        Scanner pw = new Scanner(System.in);
        System.out.println("Password:");
        String password = pw.nextLine();
        
        for(Member m : memberList){
            if(userEmail.equals(m.getEmail()) && password.equals(m.getPw())){
                uid = m.getUid(); 
                userType = "member";
            }
        }
        
        for(User u : adminList){
            if(userEmail.equals(u.getEmail()) && password.equals(u.getPw())){
                uid = u.getUid(); 
                userType = "admin";
            }
        }   
    }
    
    public static void logout(){
//        ltr redirect back to main page without login details
        uid = null;
        userType = null;
    }
}
