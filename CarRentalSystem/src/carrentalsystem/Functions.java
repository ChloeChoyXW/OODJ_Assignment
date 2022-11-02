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
import java.util.logging.Level;
import java.util.logging.Logger;
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
                        data = row.split("[|]");
                        adminList.add(new User(data[0], data[1], data[2], data[3]));
                    }
                    adminInfo.close();
                    return adminList;
                    
                case "member":
                    ArrayList<Member> memberList = new ArrayList<>();
                    File memberFile = new File("member.txt");
                    Scanner memberInfo = new Scanner(memberFile);

                    while (memberInfo.hasNextLine()) {
                        row = memberInfo.nextLine();
                        data = row.split("[|]");
                        memberList.add(new Member(data[0], data[1], data[2], data[3], Long.parseLong(data[4]),Long.parseLong(data[5]), data[6]));
                    }
                    return memberList;
                    
                case "payment":
                    ArrayList<MemberPayment> paymentList = new ArrayList<>();
                    File paymentFile = new File("member_payment.txt");
                    Scanner paymentInfo = new Scanner(paymentFile);

                    while (paymentInfo.hasNextLine()) {
                        row = paymentInfo.nextLine();
                        data = row.split("[|]");
                        paymentList.add(new MemberPayment(data[0], Long.parseLong(data[1]), Integer.parseInt(data[2]), stringToDate(data[3])));
                    }
                    paymentInfo.close();
                    return paymentList;
                    
                case "car":
                    ArrayList<Car> carList = new ArrayList<>();
                    File carFile = new File("car.txt");
                    Scanner carInfo = new Scanner(carFile);

                    while (carInfo.hasNextLine()) {
                        row = carInfo.nextLine();
                        data = row.split("[|]");
                        carList.add(new Car(data[0], data[1], data[2],Integer.parseInt(data[3]), data[4],Double.parseDouble(data[5]), data[6]));
                    }
                    carInfo.close();
                    return carList;
                    
                case "booking":
                    ArrayList<Bookings> bookList = new ArrayList<>();
                    File bookingFile = new File("bookings.txt");
                    Scanner bookingInfo = new Scanner(bookingFile);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

                    while (bookingInfo.hasNextLine()) {
                        row = bookingInfo.nextLine();
                        data = row.split("[|]");
                        bookList.add(new Bookings(data[0], new Member(data[1]), new Car(data[2]), LocalDateTime.parse(data[3], formatter), LocalDateTime.parse(data[4], formatter), data[5], Double.parseDouble(data[6]), data[7]));
                    }
                    bookingInfo.close();
                    return bookList;
            }

        }catch (FileNotFoundException e) {
            System.out.println("Try again.");
//            JFrame f = new JFrame();
//            JDialog d = new JDialog(f, "Error", true);
//            JLabel l = new JLabel();
//            l.setFont(new Font("Sitka Text", Font.PLAIN, 12));
//            l.setText("Text file not found");
//            l.setHorizontalAlignment(JLabel.CENTER);
//            l.setVerticalAlignment(JLabel.CENTER);
//            d.add(l);
//            d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//            d.setSize(200, 100);
//            d.setLocationRelativeTo(null);
//            d.setVisible(true);
        }
        return null;
    }

        
//      write updated details to file
    public static void updateBookingDetails(ArrayList<Bookings> templist) throws IOException {
        try {
            PrintWriter bookingDetails = new PrintWriter(new FileWriter("bookings.txt", false));
            for(Bookings b : templist){
                bookingDetails.write(b.toString());
            }
            updateDetailsMessage("Booking details updated!");
            bookingDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void updateMemberDetails(ArrayList<Member> templist) throws IOException {
        try {
            PrintWriter memberDetails = new PrintWriter(new FileWriter("member.txt", false));
            for(Member m : templist){
                memberDetails.write(m.toString());
            }
            updateDetailsMessage("Member details updated!");
            memberDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void updatePaymentDetails(ArrayList<MemberPayment> templist) throws IOException {
        try {
            PrintWriter paymentDetails = new PrintWriter(new FileWriter("member_payment.txt", false));
            for(MemberPayment p : templist){
                paymentDetails.write(p.toString());
            }
            updateDetailsMessage("Payment details updated!");
            paymentDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void updateCarDetails(ArrayList<Car> templist) throws IOException {
        try {
            PrintWriter carDetails = new PrintWriter(new FileWriter("car.txt", false));
            for(Car c : templist){
                carDetails.write(c.toString());
            }
            updateDetailsMessage("Car details updated!");
            carDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void updateAdminDetails(ArrayList<User> templist) throws IOException {
        try {
            PrintWriter adminDetails = new PrintWriter(new FileWriter("admin.txt", false));
            for(User a : templist){
                adminDetails.write(a.toString());
            }
            updateDetailsMessage("Admin details updated!");
            adminDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
//    Add details to textfile
    public static void addBookings(ArrayList<Bookings> templist) throws IOException {
        try {
            PrintWriter bookingDetails = new PrintWriter(new FileWriter("bookings.txt", true));
            for(Bookings b : templist){
                bookingDetails.write(b.toString());
            }
            updateDetailsMessage("Booking added!");
            bookingDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void registerMember(ArrayList<Member> templist) throws IOException {
        try {
            PrintWriter memberDetails = new PrintWriter(new FileWriter("member.txt", true));
            for(Member m : templist){
                memberDetails.write(m.toString());
            }
            updateDetailsMessage("Registration successful!");
            memberDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void addPaymentDetails(ArrayList<MemberPayment> templist) throws IOException {
        try {
            PrintWriter paymentDetails = new PrintWriter(new FileWriter("member_payment.txt", true));
            for(MemberPayment p : templist){
                paymentDetails.write(p.toString());
            }
            updateDetailsMessage("Payment details updated!");
            paymentDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void addCars(ArrayList<Car> templist) throws IOException {
        try {
            PrintWriter carDetails = new PrintWriter(new FileWriter("car.txt", true));
            for(Car c : templist){
                carDetails.write(c.toString());
            }
            updateDetailsMessage("Car added!");
            carDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    
    public static void addAdmin(ArrayList<User> templist) throws IOException {
        try {
            PrintWriter adminDetails = new PrintWriter(new FileWriter("admin.txt", true));
            for(User a : templist){
                adminDetails.write(a.toString());
            }
            updateDetailsMessage("Admin added!");
            adminDetails.close();         
        }
        catch (IOException e){
//            Logger.getLogger(SearchBookings.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Try again");
        }
    }
    

//    message appear after updated textfile
    public static void updateDetailsMessage(String message){
        JFrame f = new JFrame();
        JDialog d = new JDialog(f, "Message", true);
        JLabel l = new JLabel();
        l.setFont(new Font("Sitka Text", Font.PLAIN, 12));
        l.setText(message);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);

        d.add(l);
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        d.setSize(200, 100);
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
