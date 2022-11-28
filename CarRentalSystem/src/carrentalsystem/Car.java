/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

/**
 *
 * @author USER
 */
public class Car {
    private String carID;
    private String brand;
    private String carType;
    private int seatNum;
    private String carPlate;
    private double pricePerHour;
    private String status;

    public Car() {
        carID = null;
        brand = null;
        carType = null;
        seatNum = 0;
        carPlate = null;
        pricePerHour = 0;
        status = null;
    }

    public Car(String carID, String brand, String carType, int seatNum, String carPlate, double pricePerHour, String status) {
        this.carID = carID;
        this.brand = brand;
        this.carType = carType;
        this.seatNum = seatNum;
        this.carPlate = carPlate;
        this.pricePerHour = pricePerHour;
        this.status = status;
    }

    public Car(String carID) {
        this.carID = carID;
    }
    

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getCarType() {
        return carType;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public String getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return carID + "|" + brand + "|" + carType + "|" + seatNum + "|" + carPlate + "|" + pricePerHour + "|" + status;
    }
}
