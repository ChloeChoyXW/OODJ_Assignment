/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HandleBookingInfo {
    static String ash;
    
    public static void confirmBooking() throws IOException{
        
        ArrayList<Booking> bookingList = readTextFile("booking");
        ArrayList<Booking> unconfirmedBookingList = new ArrayList<>();
        ArrayList<Booking> updatedBookingList = new ArrayList<>();
        
        //show uncomfirmed bookings
        for(Booking b : bookingList){
            if(b.getBookingStatus().equalsIgnoreCase("unconfirmed")){
                unconfirmedBookingList.add(b);
            }
        }
        
        System.out.println(unconfirmedBookingList.toString());        
        
        Scanner bookingID = new Scanner(System.in);
        System.out.println("Enter Booking ID:");
        String id = bookingID.nextLine().toUpperCase();
        
        for(Booking i : bookingList){
            if(i.getBookingID().equals(id)){
                i.setBookingStatus("Unconfirmed");
                updatedBookingList.add(i);
                
            }
            else{
                updatedBookingList.add(i);                
            }
        }
        
        updateBookingDetails(updatedBookingList);
    }
    
    public static void declineBooking() throws IOException{
        ArrayList<Booking> bookingList = readTextFile("booking");
        ArrayList<Booking> unconfirmedBookingList = new ArrayList<>();
        ArrayList<Booking> updatedBookingList = new ArrayList<>();
        
        //show uncomfirmed bookings
        for(Booking b : bookingList){
            if(b.getBookingStatus().equalsIgnoreCase("unconfirmed")){
                unconfirmedBookingList.add(b);
            }
        }
        
        System.out.println(unconfirmedBookingList.toString());    
        
        Scanner bookingID = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Booking ID:");
        String id = bookingID.nextLine().toUpperCase();
        
        for(Booking i : bookingList){
            if(i.getBookingID().equals(id)){
                i.setBookingStatus("Declined");
                updatedBookingList.add(i);
                
            }
            else{
                updatedBookingList.add(i);                
            }
        }
        
        updateBookingDetails(updatedBookingList);
    }
        
        public static void removeBooking() throws IOException{
            ArrayList<Booking> bookingList = readTextFile("booking");
            ArrayList<Booking> updatedBookingList = new ArrayList<>();
            Scanner bookingID = new Scanner(System.in);
            System.out.println("Enter Booking ID:");
            String id = bookingID.nextLine().toUpperCase();
            
            for(Booking i : bookingList){
               if(!i.getBookingID().equals(id)){
                    updatedBookingList.add(i);     
                } 
            }
            updateBookingDetails(updatedBookingList); 
        }
        
    public static void returnedCarBooking() throws IOException{
        ArrayList<Booking> bookingList = readTextFile("booking");
        ArrayList<Booking> updatedBookingList = new ArrayList<>();

        Scanner bookingID = new Scanner(System.in);
        System.out.println("Enter Booking ID:");
        String id = bookingID.nextLine().toUpperCase();

        for(Booking i : bookingList){
            if(i.getBookingID().equals(id)){
                i.setBookingStatus("Returned");
                updatedBookingList.add(i);

            }
            else{
                updatedBookingList.add(i);                
            }
        }

        updateBookingDetails(updatedBookingList);
    }

}
