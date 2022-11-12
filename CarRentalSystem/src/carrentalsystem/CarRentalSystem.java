/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.updatingBookings.addBookings;
import static carrentalsystem.updatingBookings.removingBookings.RemovingBookings;
import java.io.IOException;
import static java.lang.System.exit;

/**
 *
 * @author USER
 */
public class CarRentalSystem {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        confirmBooking();
        RemovingBookings();
        exit(0);
    }
    
}
