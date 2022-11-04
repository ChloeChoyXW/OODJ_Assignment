/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util;

/**
 *
 * @author trish
 */
public class CustomerBooking extends User {          //linked to User class, Car and User_pAYMENT
    
    private User user;
    private Car car;
    private int ID; //booking ID
    private short RentingDate, RentingTime, ReturnDate, ReturnTime;
    private User_Payment UserPayment;
    
    public CustomerBooking() {
    }
    
    public CustomerBooking(int ID, User user, Car car, short RentingDate, short RentingTime, short ReturnDate, short ReturnTime, int Bill) {
        this.ID = ID;
        this.user = user;
        this.car = car;
        this.RentingDate = RentingDate;
        this.RentingTime = RentingTime;
        this.ReturnDate = ReturnDate;
        this.ReturnTime = ReturnTime;
        this.UserPayment = UserPayment;
    }
    
    public int getID() {
        return ID;
    }
    
    public void setId(int ID) {
        this.ID = ID;
    }
    
    public User getuser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public Car getcar() {
        return car;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }
    
    public short getRentingDate() {
        return RentingDate;
    }
    
    public void setRentingDate(short RentingDate){
        this.RentingDate = RentingDate;
    }
    
    public short getRentingTime() {
        return RentingTime;
    }
    
    public void setRentingTime(short RentingTime){
        this.RentingTime = RentingTime;
    }
  
    public short getReturnDate() {
        return ReturnDate;
    }
    
    public void setReturnDate(short ReturnDate){
        this.ReturnDate = ReturnDate;
    }
    
    public short getReturnTime() {
        return ReturnTime;
    }
    
    public void setReturnTime(short ReturnTime){
        this.ReturnTime = ReturnTime;
    }
    
    public int getUserPayment() {
        return UserPayment;
    }
    
    public void setUserPayment(int UserPayment) {
        this.UserPayment = UserPayment;
    }
    
    
    
    @Override
     public String toString() {
        return "CustomerBooking{" + "ID=" + ID + ", \nuser=" + user.toString() + ", \ncar=" + car.toString() + ", \nRentingDate=" + RentingDate + ",RentingTime=" + RentingTime + ",ReturnDate=" + ReturnDate + ", ReturnTime=" + ReturnTime + ",UserPayment=" + UserPayment + '}' + "\n";
    }
    
     public void Update() {
        ArrayList<CustomerBooking> customerBooking = CustomerBooking.View();

        // for loop for replacing the new Booking object with old one with same ID
        for (int i = 0; i < CustomerBooking.size(); i++) {
            if (customerBooking.get(i).ID == ID) {
                customerBooking.set(i, this);
            }
        }

        // code for writing new Booking record 
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("Bookings.txt"));
            for (int i = 0; i < customerBooking.size(); i++) {
                outputStream.writeObject(customerBooking.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
    
     public void Remove() {
        ArrayList<CustomerBooking> customerBooking = CustomerBooking.View();
        // for loop for deleting the required Booking
        for (int i = 0; i < customerBooking.size() - 1; i++) {
            if ((customerBooking.get(i).ID == ID)) {

                for (int j = i; j < customerBooking.size() - 1; j++) {
                    customerBooking.set(j, (customerBooking.get(j + 1)));
                }

            }
        }
        // code for writing new Booking record 
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("Bookings.ser"));
            for (int i = 0; i < customerBooking.size() - 1; i++) {
                outputStream.writeObject(customerBooking.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }



public int UserPayment() {                      
        short rentingTime = this.getRentingTime();
        short returnTime = this.getReturnTime();
        short totalTime = returnTime - rentingTime;
        short totalTime = totalTime / (1000 * 60 * 60);

        short rentPerHour = short.getCar().getRentPerHour();
        if (totalTime != 0) {
            return (int) (rentPerHour * totalTime);
        } else {
            return rentPerHour;
        }
    }


// codes to search by keyword/filter pls


public static ArrayList<Car> getBookedCars() {
        ArrayList<Car> bookedCars = new ArrayList<>();
        ArrayList<CustomerBooking> bookings = CustomerBooking.View();
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).ReturnTime == 0) {
                bookedCars.add(bookings.get(i).car);
            }
        }
        return bookedCars;
    }

    public static ArrayList<Car> getUnbookedCars() {
        ArrayList<Car> allCars = Car.View();
        ArrayList<Car> bookedCars = CustomerBooking.getBookedCars();
        for (int i = 0; i < bookedCars.size(); i++) {
            allCars.remove(bookedCars.get(i));
        }
        return allCars;
    }

}