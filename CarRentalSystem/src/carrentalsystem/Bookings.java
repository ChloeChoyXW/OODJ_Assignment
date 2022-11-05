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
import java.time.format.DateTimeFormatter;

public class Bookings {
    private String bookingID;
    private Member member;
    private Car car;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String bookingStatus;
    private double paymentAmount;
    private String paymentStatus;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

    public Bookings() {
        bookingID = null;
        member = null;
        car = null;
        startDate = null;
        endDate = null;
        bookingStatus = null;
        paymentAmount = 0;
        paymentStatus = null;
    }

    public Bookings(String bookingID, Member member, Car car, LocalDateTime startDate, LocalDateTime endDate, String bookingStatus, double paymentAmount, String paymentStatus) {
        this.bookingID = bookingID;
        this.member = member;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookingStatus = bookingStatus;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setCar(Car car) {
        this.car = car;
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

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getBookingID() {
        return bookingID;
    }

    public Member getMember() {
        return member;
    }

    public Car getCar() {
        return car;
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

    public String getPaymentStatus() {
        return paymentStatus;
    }

    @Override
    public String toString() {
        return bookingID + "|" + member.getUid() + "|" + car.getCarID() + "|" + startDate.format(formatter) + "|"+ endDate.format(formatter) + "|" + bookingStatus + "|" + paymentAmount + "|" + paymentStatus;
    }
//    getuserID
    
    
    
    
    
}
