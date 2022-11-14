/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.readTextFile;
import static carrentalsystem.Functions.updateBookingDetails;
import static carrentalsystem.Functions.addBookings;
import carrentalsystem.Bookings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author trish
 */
public class updatingBookings {
    public static void UpdatingBookings() throws IOException {
    
        ArrayList <Bookings> bookingsList = readTextFile ( "bookings" );
        System.out.println(bookingsList);
        
        ArrayList<Bookings> updateBList = new ArrayList<>();
        
        Scanner bookingsid = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please input your BookingID: ");
        String bookingID = bookingsid.nextLine();
        
        Scanner updatebdetails = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please edit your required details: ");
        String bdetails = updatebdetails.nextLine();

        for(Bookings i: bookingsList) {
            if(bookingID.equals(i.getBookingID())) {
                i.setBookingID(bdetails);
                updateBList.add(i);
            }
            
            else {
                updateBList.add(i);
            }
        }   
     updateBookingDetails(updateBList);
    }

    public class removingBookings {                                                                  //need to add in functions, lmk if i can do it if this is right
    public static void RemovingBookings() throws IOException {
    
        ArrayList <Bookings> bookingsList = readTextFile ( "bookings" );
        System.out.println(bookingsList);
    
        Scanner bookingsid = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please input your BookingID: ");
        String bookingID = bookingsid.nextLine();
        
        for(Bookings i: bookingsList) {
            if(bookingID.equals(i.getBookingID())) {                                          //very unsure if itll remove the line
                bookingsList.remove(i);
            }
            
            else {
                bookingsList.remove(i);
                }       
            
            }
        }
    }
    
public static void addBookings() throws IOException {     
        
    String bookingID = "BK007";
    String uid = "UID005";
    String startDate = "2022/12/03 12:00";
    String endDate = "2022/12/05 14:00";
    String bookingStatus = "Confirmed";
    double paymentAmount = 600.00;
    String paymentStatus = "Paid";
        
        Bookings newBookings = new Bookings(bookingID, uid, startDate, endDate, bookingStatus, paymentAmount, paymentStatus);
        addBookings();
    }
}

//Im struggling to fix these ^ ive tried everything the hint asks but : ( please 
