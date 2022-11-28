/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Functions {
    //read txt file
    public static ArrayList readTextFile(String readData){
        String row;
        String[] data;
        
        try{
            switch(readData){
                case "admin":
                    ArrayList<User> adminList = new ArrayList<>();
                    File adminFile = new File("admin.txt");
                    Scanner adminInfo = new Scanner(adminFile);

                    while (adminInfo.hasNextLine()) {
                        row = adminInfo.nextLine();
                        if(!row.equals("")){
                            data = row.split("[|]");
                            adminList.add(new User(data[0], data[1], data[2], data[3], data[4]));
                        }
                    }
                    adminInfo.close();
                    return adminList;
                    
                case "member":
                    ArrayList<Member> memberList = new ArrayList<>();
                    File memberFile = new File("member.txt");
                    Scanner memberInfo = new Scanner(memberFile);

                    while (memberInfo.hasNextLine()) {
                        row = memberInfo.nextLine();
                        if(!row.equals("")){
                            data = row.split("[|]");
                            memberList.add(new Member(data[0], data[1], data[2], data[3], data[4],data[5], data[6]));
                        }
                    }
                    return memberList;
                    
                case "payment":
                    ArrayList<MemberPayment> paymentList = new ArrayList<>();
                    File paymentFile = new File("member_payment.txt");
                    Scanner paymentInfo = new Scanner(paymentFile);

                    while (paymentInfo.hasNextLine()) {
                        row = paymentInfo.nextLine();
                        if(!row.equals("")){
                            data = row.split("[|]");
                            paymentList.add(new MemberPayment(data[0], data[1], Integer.parseInt(data[2]), stringToDate(data[3])));
                        }
                    }
                    paymentInfo.close();
                    return paymentList;
                    
                case "car":
                    ArrayList<Car> carList = new ArrayList<>();
                    File carFile = new File("car.txt");
                    Scanner carInfo = new Scanner(carFile);

                    while (carInfo.hasNextLine()) {
                        row = carInfo.nextLine();
                        if(!row.equals("")){
                            data = row.split("[|]");
                            carList.add(new Car(data[0], data[1], data[2],Integer.parseInt(data[3]), data[4],Double.parseDouble(data[5]), data[6]));
                        }
                    }
                    carInfo.close();
                    return carList;
                    
                case "booking":
                    ArrayList<Booking> bookList = new ArrayList<>();
                    File bookingFile = new File("bookings.txt");
                    Scanner bookingInfo = new Scanner(bookingFile);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

                    while (bookingInfo.hasNextLine()) {
                        row = bookingInfo.nextLine();
                        if(!row.equals("")){
                            data = row.split("[|]");
                            bookList.add(new Booking(data[0], new Member(data[1]), new Car(data[2]), LocalDateTime.parse(data[3], formatter), LocalDateTime.parse(data[4], formatter), data[5], Double.parseDouble(data[6]), data[7]));
                        }
                    }
                    bookingInfo.close();
                    return bookList;
            }

        }catch (FileNotFoundException e) {
            messageBox("Text file not found!");
        }
        return null;
    }

        
//      write updated details to file
    public static void updateBookingDetails(ArrayList<Booking> templist) throws IOException {
        try {
            PrintWriter bookingDetails = new PrintWriter(new FileWriter("bookings.txt", false));
            for(Booking b : templist){
                bookingDetails.write(b.toString() + System.lineSeparator());
            }            
            bookingDetails.close();         
            messageBox("Booking details updated!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void updateMemberDetails(ArrayList<Member> templist) throws IOException {
        try {
            PrintWriter memberDetails = new PrintWriter(new FileWriter("member.txt", false));
            for(Member m : templist){
                memberDetails.write(m.toString() + System.lineSeparator());
            }
            memberDetails.close(); 
            messageBox("Member details updated!");        
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void updatePaymentDetails(ArrayList<MemberPayment> templist) throws IOException {
        try {
            PrintWriter paymentDetails = new PrintWriter(new FileWriter("member_payment.txt", false));
            for(MemberPayment p : templist){
                paymentDetails.write(p.toString() + System.lineSeparator());
            }            
            paymentDetails.close();         
            messageBox("Payment details updated!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void updateCarDetails(ArrayList<Car> templist) throws IOException {
        try {
            PrintWriter carDetails = new PrintWriter(new FileWriter("car.txt", false));
            for(Car c : templist){
                carDetails.write(c.toString() + System.lineSeparator());
            }
            carDetails.close();  
            messageBox("Car details updated!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void updateAdminDetails(ArrayList<User> templist) throws IOException {
        try {
            PrintWriter adminDetails = new PrintWriter(new FileWriter("admin.txt", false));
            for(User a : templist){
                adminDetails.write(a.toStaffLevel() + System.lineSeparator());
            }
            adminDetails.close(); 
            messageBox("Admin details updated!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
//    Add details to textfile
    public static void addBookings(Booking details) throws IOException {
        try {
            PrintWriter bookingDetails = new PrintWriter(new FileWriter("bookings.txt", true));
            bookingDetails.write(details.toString() + System.lineSeparator());
            bookingDetails.close();         
            messageBox("Booking added!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void registerMember(Member details) throws IOException {
        try {
            PrintWriter memberDetails = new PrintWriter(new FileWriter("member.txt", true));
            memberDetails.write(details.toString() + System.lineSeparator());           
            memberDetails.close();         
            messageBox("Registration successful!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void addPaymentDetails(MemberPayment details) throws IOException {
        try {
            PrintWriter paymentDetails = new PrintWriter(new FileWriter("member_payment.txt", true));
            paymentDetails.write(details.toString() + System.lineSeparator());            
            paymentDetails.close(); 
            messageBox("Payment details updated!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void addCars(Car details) throws IOException {
        try {
            PrintWriter carDetails = new PrintWriter(new FileWriter("car.txt", true));
            carDetails.write(details.toString() + System.lineSeparator());           
            carDetails.close(); 
            messageBox("Car added!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    
    public static void addAdmin(User details) throws IOException {
        try {
            PrintWriter adminDetails = new PrintWriter(new FileWriter("admin.txt", true));
            adminDetails.write(details.toStaffLevel() + System.lineSeparator());
            adminDetails.close();         
            messageBox("Admin added!");
        }
        catch (IOException e){
            messageBox("Error occured! Please try again.");
        }
    }
    

//    message appear after updated textfile
    public static void messageBox(String message){
        JFrame f = new JFrame();
        JDialog d = new JDialog(f, "Message", true);
        JLabel l = new JLabel();
        l.setFont(new Font("Sitka Text", Font.PLAIN, 12));
        l.setText(message);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);

        d.add(l);
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        d.setSize(300, 200);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }
    
        
//  convert String to YearMonth    
    public static YearMonth stringToDate(String date){
        String[] data = date.split("/");
        data[1] = "20" + data[1];
        return YearMonth.of(Integer.parseInt(data[1]), Integer.parseInt(data[0]));
    }
}
