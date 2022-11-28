/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.messageBox;
import static carrentalsystem.Functions.readTextFile;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class BusinessReport extends javax.swing.JFrame {
    private LocalDateTime monthYearNow = LocalDateTime.now();
    private LocalDateTime lastMonthReport = monthYearNow.minusMonths(1);
    private ArrayList<Car> carList = readTextFile("car");
    private ArrayList<Booking> bookingList = readTextFile("booking");
    private String aid;
    private String userType;

    /**
     * Creates new form BusinessReport
     */
    public BusinessReport(String aid, String userType) {
        initComponents();
        navigateReportYearMonthLabel();
        monthlySales();
        this.aid = aid;
        this.userType = userType;
        JMenu logout = new JMenu("Logout");
        if(!this.userType.equalsIgnoreCase("manager")){
            MenuBar.add(logout);
            logout.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        logout();
                    }
                });
        }else{
            JMenu viewStaff = new JMenu("View Staffs");
            JMenu report = new JMenu("Reports");
            MenuBar.add(viewStaff);
            MenuBar.add(report);
            MenuBar.add(logout);
            
            viewStaff.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        viewStaff();
                        
                        
                    }
                });
            
            report.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        viewReport();
                        
                        
                    }
                });
            
            logout.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        logout();
                        
                        
                    }
                });
        }
    }
    
    private void viewStaff(){
        AdminViewStaff.adminViewStaffs(this.aid, this.userType);
        this.dispose();
    }
    
    private void viewReport(){
        BusinessReport.businessReport(this.aid, this.userType);
        this.dispose();
    }
    
    private void logout(){
        CustomerAddBooking.main(null);
        this.dispose();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        businessReportLabel = new javax.swing.JLabel();
        reportMonthYearLabel = new javax.swing.JLabel();
        previousMonthButton = new javax.swing.JButton();
        nextMonthButton = new javax.swing.JButton();
        monthRevenueDisplay = new javax.swing.JLabel();
        reportPane = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        viewBookingMenu = new javax.swing.JMenu();
        viewCarMenu = new javax.swing.JMenu();
        viewCustomerMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        businessReportLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        businessReportLabel.setText("Business Report");

        reportMonthYearLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        reportMonthYearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportMonthYearLabel.setToolTipText("");
        reportMonthYearLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        reportMonthYearLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        previousMonthButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        previousMonthButton.setText("<");
        previousMonthButton.setPreferredSize(new java.awt.Dimension(22, 22));
        previousMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousMonthButtonActionPerformed(evt);
            }
        });

        nextMonthButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextMonthButton.setText(">");
        nextMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMonthButtonActionPerformed(evt);
            }
        });

        monthRevenueDisplay.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        monthRevenueDisplay.setText("Total revenue of the month:");

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Car Brand", "Car Type", "Seat Num", "Car Plate", "Price/hour", "Rental Frequency", "Total hours rented", "Revenue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        reportPane.setViewportView(reportTable);

        viewBookingMenu.setText("View Bookings");
        viewBookingMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewBookingMenuMouseClicked(evt);
            }
        });
        MenuBar.add(viewBookingMenu);

        viewCarMenu.setText("View Cars");
        viewCarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCarMenuMouseClicked(evt);
            }
        });
        MenuBar.add(viewCarMenu);

        viewCustomerMenu.setText("View Customers");
        viewCustomerMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCustomerMenuMouseClicked(evt);
            }
        });
        MenuBar.add(viewCustomerMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportPane, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthRevenueDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(previousMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reportMonthYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(businessReportLabel))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(nextMonthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(businessReportLabel)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previousMonthButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportMonthYearLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(monthRevenueDisplay)
                .addGap(18, 18, 18)
                .addComponent(reportPane, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMonthButtonActionPerformed
        lastMonthReport = lastMonthReport.plusMonths(1);
        navigateReportYearMonthLabel();
        monthlySales();
    }//GEN-LAST:event_nextMonthButtonActionPerformed

    private void previousMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousMonthButtonActionPerformed
        lastMonthReport = lastMonthReport.minusMonths(1);
        navigateReportYearMonthLabel();
        monthlySales();
    }//GEN-LAST:event_previousMonthButtonActionPerformed

    private void viewBookingMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBookingMenuMouseClicked
        AdminViewBookingDetails.adminViewBooking(this.aid, this.userType);
        this.dispose();
    }//GEN-LAST:event_viewBookingMenuMouseClicked

    private void viewCarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCarMenuMouseClicked
        AdminViewCarDetails.adminViewCarDetails(this.aid, this.userType);
        this.dispose();
    }//GEN-LAST:event_viewCarMenuMouseClicked

    private void viewCustomerMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomerMenuMouseClicked
        AdminViewUser.adminViewUser(this.aid, this.userType);
        this.dispose();
    }//GEN-LAST:event_viewCustomerMenuMouseClicked

    private void navigateReportYearMonthLabel(){
        String reportMonth = String.valueOf(lastMonthReport.getMonth());
        String reportYear = String.valueOf(lastMonthReport.getYear());
        reportMonthYearLabel.setText(reportMonth + " " + reportYear);
    }
    
    
    private void monthlySales(){
        ArrayList<Booking> bookingList = readTextFile("booking");
        ArrayList<Car> carList = readTextFile("car");
        ArrayList<Double> revenueofMonth = new ArrayList<>();
        ArrayList<String> carRentedID = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> carRentCount = new HashMap<>();
        LinkedHashMap<String, Integer> orderedCarRentCount = new LinkedHashMap<>();
        LinkedHashMap<String, Long> totalHourRent = new LinkedHashMap<>();
        LinkedHashMap<String, Double> totalCarRevenue = new LinkedHashMap<>();
        double sum=0;
        long totalHour = 0;
        double totalRevenue = 0;
            
            
//          Sum up all revenue of the month
            for(Booking b : bookingList){
                if(b.getStartDate().getMonth().equals(lastMonthReport.getMonth()) && b.getPaymentStatus().equals("Paid")){
                    revenueofMonth.add(b.getPaymentAmount());
                }
            }

            for(Double d : revenueofMonth){
                sum+=d;
            }  
            monthRevenueDisplay.setText("Total revenue of the month: " +sum);
            
            //add all car id of car rented in carRentedID list
            for(Booking b : bookingList){
                if((b.getStartDate().getMonth().equals(lastMonthReport.getMonth())) && (b.getStartDate().getYear()==lastMonthReport.getYear()) && b.getPaymentStatus().equalsIgnoreCase("Paid")){
                    carRentedID.add(b.getCar().getCarID());
                }
           
            }

            //calcultate the rental frequency of each car id
            for(Car c : carList){
                int frequency = Collections.frequency(carRentedID, c.getCarID());               
                carRentCount.put(c.getCarID(), frequency);
                list.add(frequency);
            }
            
            //sort car id and frequency count by descending order
            list.sort(Comparator.reverseOrder());

            for (int i : list) {
                for (Map.Entry<String, Integer> entry : carRentCount.entrySet()) {
                    if (entry.getValue().equals(i)) {
                        orderedCarRentCount.put(entry.getKey(), i);
                    }
                }
            }
            
            //calculate total hour rented of each car 
            for (Map.Entry<String, Integer> entry : orderedCarRentCount.entrySet()) {
                for(Booking b : bookingList){
                    if (entry.getKey().equals(b.getCar().getCarID()) && b.getStartDate().getMonth().equals(lastMonthReport.getMonth()) && b.getPaymentStatus().equalsIgnoreCase("Paid")) {
                        long hour = ChronoUnit.HOURS.between(b.getStartDate(), b.getEndDate());
                        totalHour+=hour;
                    }
                }
                totalHourRent.put(entry.getKey(), totalHour);
                totalHour = 0;
            }
            
            //calculate total revenue for each car
            for (Map.Entry<String, Integer> entry : orderedCarRentCount.entrySet()) {
                for(Booking b : bookingList){
                    if (entry.getKey().equals(b.getCar().getCarID()) && b.getStartDate().getMonth().equals(lastMonthReport.getMonth()) && b.getPaymentStatus().equalsIgnoreCase("Paid")) {                        
                        totalRevenue+=b.getPaymentAmount();
                    }
                }
                totalCarRevenue.put(entry.getKey(), totalRevenue);
                totalRevenue = 0;
            }
            
            displayReportTable(orderedCarRentCount, totalHourRent, totalCarRevenue);             
            
            carRentCount.clear();
            list.clear();
            orderedCarRentCount.clear();
            revenueofMonth.clear();
            carRentedID.clear();
            
          
    }
    
    private void displayReportTable(LinkedHashMap<String, Integer> monthlyCarList, LinkedHashMap<String, Long> carRentedHourList, LinkedHashMap<String, Double> carRevenueList) {      
        String carID = null;
        String brand = null;
        String carType = null;
        int seatNum = 0;
        String carPlate = null;
        double price = 0;
        int frequency = 0;
        long totalHours = 0;
        double revenue = 0;
        try {
            DefaultTableModel tableModel = (DefaultTableModel)reportTable.getModel();
            tableModel.setRowCount(0);

            //get and set data to table
            if(!monthlyCarList.isEmpty() && !carRentedHourList.isEmpty() && !carRevenueList.isEmpty()){
                Set<String> carListKey = monthlyCarList.keySet();
                //loop through all car id
                for(String k : carListKey){
                    for(Car c : carList){
                        if(k.equals(c.getCarID())){
                            carID = c.getCarID();
                            brand = c.getBrand();
                            carType = c.getCarType();
                            seatNum = c.getSeatNum();
                            carPlate = c.getCarPlate();
                            price = c.getPricePerHour();
                            frequency = monthlyCarList.get(k);
                            
                        }
                    }
                
                    
                    for(Map.Entry<String, Long> hourEntry : carRentedHourList.entrySet()){
                        if(hourEntry.getKey().equals(k)){
                            totalHours = hourEntry.getValue();
                        }
                        
                    }
                    
                    for(Map.Entry<String, Double> revenueEntry : carRevenueList.entrySet()){
                        if(revenueEntry.getKey().equals(k)){
                            revenue = revenueEntry.getValue();
                        }
                        
                    }
                    Object[] data = {carID, brand, carType, seatNum, carPlate, price, frequency, totalHours, revenue};
                    tableModel.addRow(data);  
                }
            }
            else{
                String[] noRecord = {"No records."};
                tableModel.addRow(noRecord);
            }
            
        } catch (Exception e) {
            messageBox("Details not found! Please try again!");
            Logger.getLogger(AdminViewCarDetails.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void businessReport(String aid, String userType) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusinessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusinessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusinessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusinessReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusinessReport(aid, userType).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel businessReportLabel;
    private javax.swing.JLabel monthRevenueDisplay;
    private javax.swing.JButton nextMonthButton;
    private javax.swing.JButton previousMonthButton;
    private javax.swing.JLabel reportMonthYearLabel;
    private javax.swing.JScrollPane reportPane;
    private javax.swing.JTable reportTable;
    private javax.swing.JMenu viewBookingMenu;
    private javax.swing.JMenu viewCarMenu;
    private javax.swing.JMenu viewCustomerMenu;
    // End of variables declaration//GEN-END:variables
}
