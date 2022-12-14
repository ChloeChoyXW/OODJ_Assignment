/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;

import static carrentalsystem.Functions.*;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class AdminViewStaff extends javax.swing.JFrame {
    private String aid;
    private String userType;
    /**
     * Creates new form AdminViewStaff
     */
    
    //display all staffs
    public AdminViewStaff(String aid, String userType) {
        initComponents();
        this.aid = aid;
        this.userType = userType;
        
        ArrayList<User> adminList = readTextFile("admin");
        DisplayStaffsTable(adminList);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        staffIDDisplay = new javax.swing.JTextField();
        nameDisplay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailDisplay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        staffLevelDisplay = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pwInput = new javax.swing.JPasswordField();
        removeButton = new javax.swing.JButton();
        addStaffButton = new javax.swing.JButton();
        staffLevelInput = new javax.swing.JComboBox<>();
        generateReportButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        viewBookingMenu = new javax.swing.JMenu();
        viewCarMenu = new javax.swing.JMenu();
        viewCustomerMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Staff ID", "Name", "Email", "Staff Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        staffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(staffTable);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Staffs");

        jLabel2.setText("Staff ID:");

        jLabel3.setText("Name:");

        staffIDDisplay.setEditable(false);

        nameDisplay.setEditable(false);

        jLabel4.setText("Email:");

        emailDisplay.setEditable(false);

        jLabel5.setText("Staff Level:");

        staffLevelDisplay.setEditable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Staff Details");

        jLabel7.setText("Name:");

        jLabel8.setText("Email:");

        jLabel9.setText("Password:");

        jLabel10.setText("Staff Level:");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel11.setText("Add New Staff");

        removeButton.setText("Remove");
        removeButton.setToolTipText("");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addStaffButton.setText("Add");
        addStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffButtonActionPerformed(evt);
            }
        });

        staffLevelInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Staff" }));

        generateReportButton.setText("Generate Report");
        generateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportButtonActionPerformed(evt);
            }
        });

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
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(generateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nameDisplay)
                                                    .addComponent(staffIDDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(emailDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(staffLevelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(122, 122, 122))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(emailInput, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                                            .addComponent(nameInput)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(pwInput, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(staffLevelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(generateReportButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(staffIDDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nameDisplay)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(emailDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(staffLevelDisplay)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(emailInput)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(pwInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(staffLevelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(36, 36, 36)
                                .addComponent(addStaffButton)
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeButton)
                                .addGap(9, 9, 9)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTableMouseClicked
        if(evt.getClickCount()>=2){
            int row = staffTable.getSelectedRow();
            String staffID = staffTable.getModel().getValueAt(row, 0).toString();
            String staffName = staffTable.getModel().getValueAt(row, 1).toString();
            String email = staffTable.getModel().getValueAt(row, 2).toString();
            String staffLevel = staffTable.getModel().getValueAt(row, 3).toString();
            
            staffIDDisplay.setText(staffID);
            nameDisplay.setText(staffName);
            emailDisplay.setText(email);
            staffLevelDisplay.setText(staffLevel);
        }
    }//GEN-LAST:event_staffTableMouseClicked

    //remove staff
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        ArrayList<User> adminLists = readTextFile("admin");
        ArrayList<User> updatedAdminList = new ArrayList<>();
        ArrayList<User> readAdminList = null;
        String staffID = staffIDDisplay.getText();
        if(!staffID.isBlank()){
            for(User u : adminLists){
                if(!u.getUid().equals(staffID)){
                    updatedAdminList.add(u);
                }
            }
            
            try {
                updateAdminDetails(updatedAdminList);
                staffIDDisplay.setText("");
                nameDisplay.setText("");
                emailDisplay.setText("");
                staffLevelDisplay.setText("");
                readAdminList = readTextFile("admin");
                DisplayStaffsTable(readAdminList);
            } catch (IOException ex) {
                messageBox("Error occured! Please try again!");
                Logger.getLogger(AdminViewStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            messageBox("Please select staff!");
        }
    }//GEN-LAST:event_removeButtonActionPerformed
    
    //add new staff
    private void addStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffButtonActionPerformed
        ArrayList<User> staffLists = readTextFile("admin");
        ArrayList<User> newAdminList = null;
        int lastIndex = 0;
        int newIDNumber = 0;
        String newID = null;
        String staffName = nameInput.getText();
        String email = emailInput.getText();
        String pw = pwInput.getText();
        String staffLevel = staffLevelInput.getSelectedItem().toString();
        
        if(!staffName.isBlank() && !email.isBlank() && !pw.isBlank() && !staffLevel.isBlank()){
            //get new booking id
            if(!staffLists.isEmpty()) {
                    lastIndex = staffLists.size() - 1;
                 }

            String admin = staffLists.get(lastIndex).getUid();

            String[] num = admin.split("AID");
            for(String i : num) {
                if(!i.equals("")) {
                    newIDNumber = Integer.parseInt(i) + 1;
                }

                if(newIDNumber < 10) {
                    newID = "00"; 
                }
                else if(newIDNumber < 100) {
                    newID = "0";
                }
                else{
                    newID = "";
                }
            }
            String newAdminID = "AID" + newID + String.valueOf(newIDNumber);

           User newStaff = new User(newAdminID, staffName, pw, email, staffLevel);

           try {
                addAdmin(newStaff);
                newAdminList = readTextFile("admin");
                DisplayStaffsTable(newAdminList);
                nameInput.setText("");
                emailInput.setText("");
                pwInput.setText("");
           } catch (IOException ex) {
               Logger.getLogger(AdminViewStaff.class.getName()).log(Level.SEVERE, null, ex);
           }
        }else{
            messageBox("Please enter all details!");
        }
        
        
    }//GEN-LAST:event_addStaffButtonActionPerformed

    private void viewCustomerMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomerMenuMouseClicked
        AdminViewUser.adminViewUser(this.aid, this.userType);
        this.dispose();
    }//GEN-LAST:event_viewCustomerMenuMouseClicked

    private void viewCarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCarMenuMouseClicked
        AdminViewCarDetails.adminViewCarDetails(this.aid, this.userType);
        this.dispose();
    }//GEN-LAST:event_viewCarMenuMouseClicked

    private void viewBookingMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBookingMenuMouseClicked
        AdminViewBookingDetails.adminViewBooking(this.aid, this.userType);
        this.dispose();
    }//GEN-LAST:event_viewBookingMenuMouseClicked

    //generate staff report
    private void generateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButtonActionPerformed
        String filePath = null;
        LocalDateTime now = LocalDateTime.now();
        String timeNow = String.valueOf(now.getYear())+"_" + String.valueOf(now.getMonthValue()) + "_" + String.valueOf(now.getDayOfMonth());
        String tableData = "";
        
        try{
            tableData =  staffTable.getModel().getValueAt(0, 0).toString();
        
            if(staffTable.getRowCount()>0 && !tableData.equals("No records.")){
                String fileName = JOptionPane.showInputDialog("Enter File Name:");
                if(fileName != null){
                    JFileChooser chooseFile = new JFileChooser();
                    chooseFile.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    int i = chooseFile.showSaveDialog(this);
                    if(i==JFileChooser.APPROVE_OPTION){
                        filePath = chooseFile.getSelectedFile().getPath();
                        filePath = filePath + "\\staff_report_" + fileName + "_" + timeNow + ".pdf";

                        try {
                            PdfWriter writer = new PdfWriter(filePath);
                             PdfDocument pdf = new PdfDocument(writer);
                             pdf.addNewPage();
                             Document doc = new Document(pdf);

                             String header = "Staff Details";
                             doc.add(new Paragraph(header));


                             float columnWidth[] = {200, 200, 200, 200};
                             Table table = new Table(columnWidth);
                             table.addCell(new Cell().add(new Paragraph("Staff ID")));
                             table.addCell(new Cell().add(new Paragraph("Name")));
                             table.addCell(new Cell().add(new Paragraph("Email")));
                             table.addCell(new Cell().add(new Paragraph("Staff Level")));
                             for(int row = 0; row < staffTable.getRowCount(); row++){
                                 for(int column = 0; column < staffTable.getColumnCount(); column++){
                                    String value = staffTable.getModel().getValueAt(row, column).toString();
                                    table.addCell(new Cell().add(new Paragraph(value)));
                                 }   
                             }

                             doc.add(table);
                             doc.close();
                             messageBox("Report Generated!");
                        } catch (FileNotFoundException ex) {
                            messageBox("<HTML>Error occured! Please ensure no duplicate file name and try again!</HTML>");
                            Logger.getLogger(BusinessReport.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                else{
                    messageBox("Please enter file name!");
                }
            }else{
                messageBox("There is no data in table!");
            }
        }
        catch(NullPointerException e){
            messageBox("There is no data in table!");
        }
    }//GEN-LAST:event_generateReportButtonActionPerformed

    
    private void DisplayStaffsTable(ArrayList<User> staffList) { 
        try {
            DefaultTableModel tableModel = (DefaultTableModel)staffTable.getModel();
            tableModel.setRowCount(0);

            //get and set data to table
            if(!staffList.isEmpty()){
                for(User u : staffList){
                    String AID = u.getUid();
                    String name = u.getName();                   
                    String email = u.getEmail();
                    String staffLevel = u.getuserType();                   
                    
                    Object[] data = {AID, name, email, staffLevel};
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
    public static void adminViewStaffs(String aid, String userType) {
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
            java.util.logging.Logger.getLogger(AdminViewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewStaff(aid, userType).setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton addStaffButton;
    private javax.swing.JTextField emailDisplay;
    private javax.swing.JTextField emailInput;
    private javax.swing.JButton generateReportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameDisplay;
    private javax.swing.JTextField nameInput;
    private javax.swing.JPasswordField pwInput;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField staffIDDisplay;
    private javax.swing.JTextField staffLevelDisplay;
    private javax.swing.JComboBox<String> staffLevelInput;
    private javax.swing.JTable staffTable;
    private javax.swing.JMenu viewBookingMenu;
    private javax.swing.JMenu viewCarMenu;
    private javax.swing.JMenu viewCustomerMenu;
    // End of variables declaration//GEN-END:variables
}
