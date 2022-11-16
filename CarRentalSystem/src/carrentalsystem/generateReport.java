/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.readTextFile;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class generateReport {
    public static void monthlySales(){
        ArrayList<Booking> bookingList = readTextFile("booking");
        ArrayList<Car> carList = readTextFile("car");
        
        ArrayList<Double> priceListofMonth = new ArrayList<>();
        ArrayList<String> carRentedID = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> carRentCount = new HashMap<>();
        LinkedHashMap<String, Integer> orderedCarRentCount = new LinkedHashMap<>();
        
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime reportMonth = timeNow;
        LocalDateTime reportYear = timeNow;
        

        while(true){
            double sum=0;
            Scanner filter = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter plus or minus: ");
            String input = filter.nextLine();
            
            //navigate through months (and year)?
            if(input.equals("plus")){
                reportMonth = reportMonth.plusMonths(1);
            }
            else{
                reportMonth = reportMonth.minusMonths(1);
            }
            
            System.out.println(reportMonth.getMonth());
            
//                    b.getStartDate().getYear()== reportYear.getYear()

            for(Booking b : bookingList){
                if(b.getStartDate().getMonth().equals(reportMonth.getMonth()) && b.getPaymentStatus().equals("Paid")){
                    System.out.println(b.toString());
                    priceListofMonth.add(b.getPaymentAmount());

                }
            }

            for(Double d : priceListofMonth){
                sum+=d;
            }

            System.out.println(priceListofMonth.toString() +"\n" + sum);
            
            
            
            //show highest renting car of the month
            for(Booking b : bookingList){
                if(b.getStartDate().getMonth().equals(reportMonth.getMonth())){
                    carRentedID.add(b.getCar().getCarID());
                }
           
            }

            //car id and the frequency
            for(Car c : carList){
                int frequency = Collections.frequency(carRentedID, c.getCarID());
                System.out.println("Frequency of " + c.getCarID() + " in " + reportMonth.getMonth() + ":" + frequency);
                carRentCount.put(c.getCarID(), frequency);
                list.add(frequency);
            }
            
            //sort car id count by descending order
            list.sort(Comparator.reverseOrder());

            for (int i : list) {
                for (Entry<String, Integer> entry : carRentCount.entrySet()) {
                    if (entry.getValue().equals(i)) {
                        orderedCarRentCount.put(entry.getKey(), i);
                    }
                }
            }
            
            System.out.println("Sorted car rent count:" + orderedCarRentCount);

              
            
            carRentCount.clear();
            list.clear();
            orderedCarRentCount.clear();
            priceListofMonth.clear();
            carRentedID.clear();
            
        }
    }
    
}
