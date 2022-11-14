/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trish
 */
public class customerCarSearch {

    public static void showCarInfo() {
        ArrayList<Car> carList = readTextFile("car");
        System.out.println(carList);

//        Scanner keyword = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter Keyword such as CarID, Brand, Car Type, Seat Num, Car Plate, Available/Unavailable : ");
//        String key = keyword.nextLine().toUpperCase();

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

                case "Brand":
                    for (Car i : carList) {
                        if (input.equals(i.getBrand())) {
                            System.out.println(i);
                        }
                    }

                case "Car Type":
                    for (Car i : carList) {
                        if (input.equals(i.getCarType())) {
                            System.out.println(i);
                        }
                    }

                case "Seat Num":
                    for (Car i : carList) {
                        if (input.equals(i.getSeatNum())) {
                            System.out.println(i);
                        }
                    }

                case "Car Plate":
                    for (Car i : carList) {
                        if (input.equals(i.getCarPlate())) {
                            System.out.println(i);
                        }
                    }
                    
                case "Availability":
                    for (Car i : carList) {
                        if (input.equals(i.getStatus())) {
                            System.out.println(i);
                        }
                    }
            }

        } catch (IllegalArgumentException e) {
            messageBox("Details not found! Please try again!");
        }

    
    }
}
