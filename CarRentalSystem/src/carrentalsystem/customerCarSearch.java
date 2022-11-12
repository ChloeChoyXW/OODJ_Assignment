/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;
import static carrentalsystem.Functions.messageBox;
import static carrentalsystem.Functions.readTextFile;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author trish
 */
public class customerCarSearch {
    public static void showCarInfo(){
        ArrayList <Car> carList = readTextFile ( "car" );
        System.out.println(carList);
       
        Scanner filter = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter search range (Car ID/Brand/Car Type/Seat Num/Car Plate/ Availability): ");
        String input = filter.nextLine();

       try {
            switch (input) {
                case "Car ID":
                    Scanner id = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Car ID: ");
                    String ID = id.nextLine();
                    for (Car i : carList) {
                        if (ID.equals(i.getCarID())) {
                            System.out.println(i);
                        }
                    }



               case "Car Brand":
                    Scanner brand = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Car Brand: ");
                    String carbrand = brand.nextLine().toUpperCase();
                    for (Car i : carList) {
                        if (carbrand.equals(i.getBrand())) {
                            System.out.println(i);
                        }
                    }



               case "Car Type":
                    Scanner cartype = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Car Type: ");
                    String type = cartype.nextLine().toUpperCase();
                    for (Car i : carList) {
                        if (type.equals(i.getCarType())) {
                            System.out.println(i);
                        }
                    }



               case "Seat Num":
                    Scanner seatnum = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Number of Seats: ");
                    String seat = seatnum.nextLine();
                    for (Car i : carList) {
                        if (seat.equals(i.getSeatNum())) {
                            System.out.println(i);
                        }
                    }


               case "Car Plate":
                    Scanner carplate = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Car Number Plate: ");
                    String plate = carplate.nextLine().toUpperCase();
                    for (Car i : carList) {
                        if (plate.equals(i.getCarPlate())) {
                            System.out.println(i);
                        }
                    }
                    
                case "Availability":
                    Scanner status = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Available/Unavailable:  ");
                    String availability = status.nextLine();
                    for (Car i : carList) {
                        if (availability.equals(i.getStatus())) {
                            System.out.println(i);
                        }
                    }
            }

        } catch (IllegalArgumentException e) {
            messageBox("List not found! Please retype your keyword.");
      }
       
    }
}
    
    
