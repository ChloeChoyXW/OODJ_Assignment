/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author USER
 */
import java.time.*;

public class Bookings {
    private String bookingID;
    private String userID;
    private String carID;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String bookingStatus;
    private double paymentAmount;
    private String paymentStatus;

    public Bookings() {
        bookingID = null;
        userID = null;
        carID = null;
        startDate = null;
        endDate = null;
        bookingStatus = null;
        paymentAmount = 0;
        paymentStatus = null;
    }

    public Bookings(String bookingID, String userID, String carID, LocalDateTime startDate, LocalDateTime endDate, String bookingStatus, double paymentAmount, String status) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.carID = carID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookingStatus = bookingStatus;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = status;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setStatus(String status) {
        this.paymentStatus = status;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getUserID() {
        return userID;
    }

    public String getCarID() {
        return carID;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getStatus() {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return bookingID + "|" + userID + "|" + carID + "|" + startDate + "|"+ endDate + "|" + bookingStatus + "|" + paymentAmount + "|" + paymentStatus;
    }
    
    
    
    
    
}
