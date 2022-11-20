
import static carrentalsystem.Functions.readTextFile;
import java.io.IOException;
import static carrentalsystem.Functions.updatePaymentDetails;
import static carrentalsystem.Functions.addPaymentDetails;
import carrentalsystem.MemberPayment;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trish
 */
public class paymentUpdates {
    public static void updatingPaymentDetails() throws IOException {
        
        ArrayList <MemberPayment> memberPList = readTextFile ( "member_payment" );
        System.out.println(memberPList);
        
        ArrayList<MemberPayment> updatememberPList = new ArrayList<>();
        
        Scanner userID = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please input your UserID: ");
        String uid = userID.nextLine();
        
        Scanner updatedetails = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please edit your required  payment details: ");
        String details = updatedetails.nextLine();

        for(MemberPayment i: memberPList) {
            if(uid.equals(i.getUid())) {
                i.setCardNo(details);
                updatememberPList.add(i);
            }
            
            else {
                updatememberPList.add(i);
            }
        }   
        updatePaymentDetails(updatememberPList);
    }
    
    public static void addPaymentDetails() throws IOException {        
        
        String uid = "UID009"; 
        String cardNo = "1232098645679897";
        int cvv = 563;
        YearMonth expiryDate = 09/09;
        
        MemberPayment newMemberPayment = new MemberPayment(uid, cardNo, cvv, expiryDate);
        addPaymentDetails(newMemberPayment);
    }
}

