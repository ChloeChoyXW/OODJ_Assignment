/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carrentalsystem;
import static carrentalsystem.Functions.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;

/**
 *
 * @author USER
 */
public class AdminViewUser extends javax.swing.JFrame {
    private String aid;
    private String userType;
    private String userID;
    /**
     * Creates new form AdminViewUser
     */
    public AdminViewUser(String aid, String userType) {
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        searchFilter = new javax.swing.JComboBox<>();
        searchInput = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        uidLabel = new javax.swing.JLabel();
        uidDisplay = new javax.swing.JTextField();
        nameDisplay = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        icDisplay = new javax.swing.JTextField();
        icLabel = new javax.swing.JLabel();
        emailDisplay = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        phoneDisplay = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressDisplay = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        cardNoLabel = new javax.swing.JLabel();
        cardNoDisplay = new javax.swing.JTextField();
        expiryLabel = new javax.swing.JLabel();
        expiryDisplay = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        viewBookingMenu = new javax.swing.JMenu();
        viewCarMenu = new javax.swing.JMenu();
        viewCustomerMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("View User");

        searchFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User ID", "IC No", "Email", "Phone No" }));

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("User Details"));

        uidLabel.setText("User ID:");

        uidDisplay.setEditable(false);

        nameDisplay.setEditable(false);

        nameLabel.setText("Name:");

        icDisplay.setEditable(false);

        icLabel.setText("IC No:");

        emailDisplay.setEditable(false);

        emailLabel.setText("Email:");

        phoneDisplay.setEditable(false);

        phoneLabel.setText("Phone No:");

        addressLabel.setText("Address:");

        addressDisplay.setEditable(false);
        addressDisplay.setColumns(20);
        addressDisplay.setRows(5);
        jScrollPane1.setViewportView(addressDisplay);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(uidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uidDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameDisplay)))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uidLabel)
                    .addComponent(uidDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icLabel)
                    .addComponent(icDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User Payment Details"));

        cardNoLabel.setText("Card No:");

        cardNoDisplay.setEditable(false);

        expiryLabel.setText("Expiry Date:");

        expiryDisplay.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(expiryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expiryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cardNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardNoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNoLabel)
                    .addComponent(cardNoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expiryLabel)
                    .addComponent(expiryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        removeButton.setText("Remove User");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
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
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(removeButton))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try{
            String filter = searchFilter.getSelectedItem().toString();
            String input = searchInput.getText();
            Member memberDetails = showCustomerInfo(filter, input);
            displayUserDetails(memberDetails);
            searchInput.setText("");
        }catch(NullPointerException e){
            messageBox("Details not found! Please re-check input.");
        }
        
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        ArrayList<Member> memberList = readTextFile("member");
        ArrayList<MemberPayment> paymentList = readTextFile("payment");
        ArrayList<Member> updatedMemberList = new ArrayList<>();
        ArrayList<MemberPayment> updatedPaymentList = new ArrayList<>();
        
        this.userID = uidDisplay.getText();

        for(Member m : memberList){
            if(!m.getUid().equals(this.userID)){
                updatedMemberList.add(m);
            }
        }
        
        for(MemberPayment p : paymentList){
            if(!p.getUid().equals(this.userID)){
                updatedPaymentList.add(p);
            }
        }
        
        try {
            updateMemberDetails(updatedMemberList);
            updatePaymentDetails(updatedPaymentList);
            
            uidDisplay.setText("");
            nameDisplay.setText("");
            icDisplay.setText("");
            emailDisplay.setText("");
            phoneDisplay.setText("");
            addressDisplay.setText("");
            cardNoDisplay.setText("");
            expiryDisplay.setText("");
        } catch (IOException ex) {
            messageBox("Error occured! Please try again.");
            Logger.getLogger(AdminViewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_removeButtonActionPerformed

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
       
    //filter data based on range and input
    private Member showCustomerInfo(String input, String searchText){
        ArrayList<Member> memberList = readTextFile("member");

        try {
            switch (input) {
                case "User ID":
                    for(Member m: memberList) {
                        if (searchText.equalsIgnoreCase(m.getUid())) {
                            return m;
                        }
                    }   
                

                case "IC No": 
                    for(Member m: memberList) {
                        if  (searchText.equalsIgnoreCase(m.getIcNo())){
                            return m;
                        }
                    }

                case "Email":
                    for(Member m: memberList) {
                        if (searchText.equalsIgnoreCase(m.getEmail())){
                            return m;
                        }
                    }

                case "Phone No":
                    for(Member m: memberList) {
                        if (searchText.equalsIgnoreCase(m.getPhoneNo())) {
                            return m;
                        }
                    }
            }

        } catch (IllegalArgumentException e) {
            messageBox("User details not found! Please try again!");
            Logger.getLogger(AdminViewCarDetails.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(e);
            
        }
        return null;
    }
    
    //display user details
    private void displayUserDetails(Member m){
        ArrayList<MemberPayment> paymentList = readTextFile("payment");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
        
        uidDisplay.setText(m.getUid());
        nameDisplay.setText(m.getName());
        icDisplay.setText(m.getIcNo());
        emailDisplay.setText(m.getEmail());
        phoneDisplay.setText(m.getPhoneNo());
        addressDisplay.setText(m.getAddress());
        
        for(MemberPayment p : paymentList){
            if(p.getUid().equals(m.getUid())){
                cardNoDisplay.setText(p.getCardNo());
                expiryDisplay.setText(p.getExpiryDate().format(formatter));
            }
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void adminViewUser(String aid, String userType) {
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
            java.util.logging.Logger.getLogger(AdminViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewUser(aid, userType).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextArea addressDisplay;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField cardNoDisplay;
    private javax.swing.JLabel cardNoLabel;
    private javax.swing.JTextField emailDisplay;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField expiryDisplay;
    private javax.swing.JLabel expiryLabel;
    private javax.swing.JTextField icDisplay;
    private javax.swing.JLabel icLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameDisplay;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField phoneDisplay;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchFilter;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField uidDisplay;
    private javax.swing.JLabel uidLabel;
    private javax.swing.JMenu viewBookingMenu;
    private javax.swing.JMenu viewCarMenu;
    private javax.swing.JMenu viewCustomerMenu;
    // End of variables declaration//GEN-END:variables
}
