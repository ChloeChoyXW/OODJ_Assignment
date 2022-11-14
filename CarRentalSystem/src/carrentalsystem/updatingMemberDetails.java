/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.readTextFile;
import static carrentalsystem.Functions.registerMember;
import static carrentalsystem.Functions.updateMemberDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trish
 */
public class updatingMemberDetails {
    public static void UpdatingMemberDetails() throws IOException {
    
        ArrayList <Member> memberList = readTextFile ( "member" );
        System.out.println(memberList);
        
        ArrayList<Member> updateMList = new ArrayList<>();
        
        Scanner userID = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please input your UserID: ");
        String uid = userID.nextLine();
        
        Scanner updatedetails = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please edit your required details: ");
        String details = updatedetails.nextLine();

        for(Member i: memberList) {
            if(uid.equals(i.getUid())) {
                i.setName(details);
                updateMList.add(i);
            }
            
            else {
                updateMList.add(i);
            }
        }   
        updateMemberDetails(updateMList);
    }
    
    public static void RegisterMember() throws IOException {        
        
        String uid = "UID006"; 
        String name = "Cecil";
        String pw = "fyeu837";
        String email = "cecil123@gmail.com";
        long icNo = 237728117326L;
        long phoneNo = 0134726472;
        String address = "25, Jalan Merak, Bandar Merak, 47170, Selangor";
        
        Member newMember = new Member(uid, name, pw, email, icNo, phoneNo, address);
        registerMember(newMember);
    }
}
