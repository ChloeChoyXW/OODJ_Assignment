/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class adminViewDetails {
    public static void showBooking(){
        ArrayList<Booking> bookingList = readTextFile("booking");
        ArrayList<Member> memberList = readTextFile("member");
        ArrayList<Car> carList = readTextFile("car");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        Scanner filter = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter search range: ");
        String input = filter.nextLine();

        try {
            switch (input) {
                case "Booking ID":
                    Scanner bid = new Scanner(System.in);
                    System.out.println("Enter Booking ID: ");
                    String bookingID = bid.nextLine();
                    for(Booking b : bookingList) {
                        if (bookingID.equals(b.getBookingID())) {
                            System.out.println(b);
                        }
                    }
                    break;    
                
                case "UID":
                    Scanner uid = new Scanner(System.in);
                    System.out.println("Enter User ID: ");
                    String userID = uid.nextLine();
                    for(Booking b : bookingList) {                        
                        if (userID.equals(b.getMember().getUid())) {
                            System.out.println(b);
                        }
                    }
                    break;
                    
                case "IC":
                    Scanner ic = new Scanner(System.in);
                    System.out.println("Enter User IC: ");
                    String userIC = ic.nextLine();
                    for(Member m : memberList) {
                        if(userIC.equals(m.getIcNo())){
                            for(Booking b : bookingList){                               
                                if (m.getUid().equals(b.getMember().getUid())) {
                                    System.out.println(b);
                                }   
                            }
                        }   
                    }
                    break;

                case "Car ID":
                    Scanner cid = new Scanner(System.in);
                    System.out.println("Enter Car ID: ");
                    String carID = cid.nextLine();
                    for (Booking b : bookingList) {    
                        if (carID.equals(b.getCar().getCarID())) {
                            System.out.println(b);
                        }
                    }
                    break;
                    
                case "Car Plate":
                    Scanner plateNum = new Scanner(System.in);
                    System.out.println("Enter Car Plate: ");
                    String carPlate = plateNum.nextLine();
                    for(Car c : carList){
                        if(carPlate.equals(c.getCarPlate())){
                           for (Booking b : bookingList) {    
                                if (c.getCarID().equals(b.getCar().getCarID())) {
                                    System.out.println(b);
                                }
                            } 
                        }
                    }
                    break;
                    
                case "Car Brand":
                    Scanner brand = new Scanner(System.in);
                    System.out.println("Enter Car Brand: ");
                    String carBrand = brand.nextLine();
                    for(Car c : carList){
                        if(carBrand.equalsIgnoreCase(c.getBrand())){
                           for (Booking b : bookingList) {    
                                if (c.getCarID().equals(b.getCar().getCarID())) {
                                    System.out.println(b);
                                }
                            } 
                        }
                    }
                    break;

                case "Start Date": 
                    Scanner sDate = new Scanner(System.in);
                    System.out.println("Enter Start Date: ");
                    String startDate = sDate.nextLine() + " 00:00";
                    LocalDateTime startRentDate = LocalDateTime.parse(startDate, formatter);
                    LocalDateTime startRentDateRange = startRentDate.plusDays(1);

                    for (Booking b : bookingList) {
                        if  (b.getStartDate().isAfter(startRentDate) && b.getStartDate().isBefore(startRentDateRange)) {
                            System.out.println(b);
                        }
                    }
                    break;

                case "End Date":
                    Scanner eDate = new Scanner(System.in);
                    System.out.println("Enter End Date: ");
                    String endDate = eDate.nextLine() + " 00:00";
                    LocalDateTime endRentDate = LocalDateTime.parse(endDate, formatter);
                    LocalDateTime endRentDateRange = endRentDate.plusDays(1);

                    for (Booking b : bookingList) {
                        if  (b.getEndDate().isAfter(endRentDate) && b.getEndDate().isBefore(endRentDateRange)) {
                            System.out.println(b);
                        }
                    }
                    break;
                    
                case "Booking Status":
                    Scanner status = new Scanner(System.in);
                    System.out.println("Enter Booking Status: ");
                    String bookingStatus = status.nextLine();
                    for (Booking b : bookingList) {
                        if (bookingStatus.equals(b.getBookingStatus())) {
                            System.out.println(b);
                        }
                    }
                    break;
                    
                case "Payment Status":
                    Scanner payment = new Scanner(System.in);
                    System.out.println("Enter Payment Status: ");
                    String paymentStatus = payment.nextLine();
                    for (Booking b : bookingList) {
                        if (paymentStatus.equals(b.getPaymentStatus())) {
                            System.out.println(b);
                        }
                    }
                    break;
            }

        } catch (IllegalArgumentException e) {
            messageBox("List not found! Please retype your keyword.");
        }
    }

    
    public static void showCustomerInfo(){
        ArrayList<Booking> bookingList = readTextFile("booking");
        ArrayList<Member> memberList = readTextFile("member");
        
        Scanner uid = new Scanner(System.in);
        System.out.println("Enter User ID: ");
        String userID = uid.nextLine();
        
        for(Member m : memberList){
            if(userID.equals(m.getUid())){
                System.out.println(m);
            }
        }
        
        for(Booking b : bookingList){
            if(userID.equals(b.getMember().getUid())){
                System.out.println(b);
            }
        } 
    }
}
