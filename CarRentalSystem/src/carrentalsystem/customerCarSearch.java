/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;
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
        System.out.println(carList); {
       
        Scanner keyword = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Keyword such as CarID, Brand, Car Type, Seat Num, Car Plate, Available/Unavailable : ");
        String key = keyword.nextLine().toUpperCase();
        
        for(Car i : carList) {
            if(key.equals(i.getCarID())) {
            System.out.println(i);
            }

            else if(key.equals(i.getBrand())) {
                    System.out.println(i);
                    }
            
            else if(key.equals(i.getCarType())) {
                    System.out.println(i);
                    }
        
            else if (key.equals(i.getSeatNum())) {
                    System.out.println(i);
                    }
            
            else if(key.equals(i.getCarPlate())) {
                    System.out.println(i);
                    }
            
            else if(key.equals(i.getStatus())) {
                    System.out.println(i);
                    }
            
            else { 
                System.out.println("List not found. Please retry search. ");

                }
            }
        }
    }
}
    
    
