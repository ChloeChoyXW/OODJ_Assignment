/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.*;
import java.awt.Font;
import java.io.IOException;
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
public class HandleCarInfo {
    public static void addCar() throws IOException{
        ArrayList<Car> carList = readTextFile("car");
        int lastIndex = 0;
        int newIDNumber = 0;
        String number = null;
        
        
        try{
            // get booking ID of last index
            if(!carList.isEmpty()) {
               lastIndex = carList.size() - 1;
            }

            String carID = carList.get(lastIndex).getCarID();

            String[] num = carID.split("C");
            for(String i : num) {
                if(!i.equals("")) {
                    newIDNumber = Integer.parseInt(i) + 1;
                }

                if(newIDNumber < 10) {
                    number = "00"; 
                }
                else if(newIDNumber < 100) {
                    number = "0";
                }
                else{
                    number = "";
                }
            }
            String id = "C" + number + String.valueOf(newIDNumber);
            
            Scanner carbrand = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter car brand:");
            String brand = carbrand.nextLine().toUpperCase();

            Scanner Cartype = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter car type:");
            String type = Cartype.nextLine().toUpperCase();

            Scanner carseat = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter car seat:");
            int seat = Integer.parseInt(carseat.nextLine());

            Scanner Carplate = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter car plate:");
            String plate = Carplate.nextLine().toUpperCase();

            Scanner carprice = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter car price:");
            int price = Integer.parseInt(carprice.nextLine());

            String availability = "Available";

            Car details = new Car(id, brand, type, seat, plate, price, availability);        
            addCars(details);
            
        }catch (Exception e) {
            messageBox("Error occured! Please try again!");
            System.out.println(e);
        }

        
    }
    
    public static void editCarInfo() throws IOException{
        ArrayList<Car> carList = readTextFile("car");
        ArrayList<Car> updatedList = new ArrayList<>();
        Scanner carID = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter car ID:");
        String ID = "C" + carID.nextLine();
        
        for(Car b : carList){
            if(ID.equals(b.getCarID())){
                
                System.out.println(b.toString());
            }
        }
        
        
        Scanner carPrice = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter car price:");
        int price = Integer.parseInt(carPrice.nextLine());
        
        Scanner carPlate = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter car plate:");
        String plateNum = carPlate.nextLine().toUpperCase();
        
        Scanner carAvailability = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter car availability:");
        String availability = "C" + carAvailability.nextLine();
        
        for(Car c : carList){
            if(ID.equals(c.getCarID())){
                updatedList.add(new Car(c.getCarID(), c.getBrand(), c.getCarType(), c.getSeatNum(), plateNum, price, availability));
            }
            else{
                updatedList.add(c);
            }
        }
        
        updateCarDetails(updatedList);
        
    }   
}
