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
 * @author trish
 */
public class viewCustomer {
    public static void showCustomerInfo() {
        ArrayList <Member> memberList = readTextFile ( "member" );
        System.out.println(memberList);
        
        Scanner userID = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter UserID:");
        String ID = userID.nextLine().toUpperCase();
        
            
        for(Member i : memberList) {
            if(ID.equals(i.getUid())) {
                System.out.println(i);
            }
                
        }
    }
}

