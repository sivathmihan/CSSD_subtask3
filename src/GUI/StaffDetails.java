/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controllers.Serialize;
import Entities.User;
import EntitySets.SetOfUsers;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CRYSIS_POOL
 */
public class StaffDetails extends javax.swing.JFrame {

    /**
     * Creates new form StaffDetails
     */
    SetOfUsers<User> sOu;
    public StaffDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgType = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout2 = new javax.swing.JButton();
        btnaddstaff = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstaff = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnLogout1 = new javax.swing.JButton();
        rbInspector = new javax.swing.JRadioButton();
        rbDriver = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(250, 400));
        setMinimumSize(new java.awt.Dimension(250, 400));
        setPreferredSize(new java.awt.Dimension(250, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setMaximumSize(new java.awt.Dimension(80, 30));
        btnBack.setMinimumSize(new java.awt.Dimension(80, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        btnLogout2.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLogout2.setText("Logout");
        btnLogout2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnLogout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout2.setMaximumSize(new java.awt.Dimension(80, 30));
        btnLogout2.setMinimumSize(new java.awt.Dimension(80, 30));
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 70, 30));

        btnaddstaff.setBackground(new java.awt.Color(255, 255, 255));
        btnaddstaff.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnaddstaff.setText("Add Staff");
        btnaddstaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnaddstaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaddstaff.setMaximumSize(new java.awt.Dimension(80, 30));
        btnaddstaff.setMinimumSize(new java.awt.Dimension(80, 30));
        btnaddstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstaffActionPerformed(evt);
            }
        });
        jPanel2.add(btnaddstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        tblstaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblstaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblstaff);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 260));

        txtSearch.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setMaximumSize(new java.awt.Dimension(80, 30));
        btnSearch.setMinimumSize(new java.awt.Dimension(80, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, 30));

        btnLogout1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLogout1.setText("Logout");
        btnLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 30));

        bgType.add(rbInspector);
        rbInspector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbInspector.setText("Inspector");
        getContentPane().add(rbInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        bgType.add(rbDriver);
        rbDriver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbDriver.setText("Driver");
        getContentPane().add(rbDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminHome ah = new AdminHome();
        ah.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnaddstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstaffActionPerformed
       new AddStaff().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnaddstaffActionPerformed

    private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogout1ActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogout2ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
       searchStaffByID(tblstaff, sOu, txtSearch, rbDriver,rbInspector);

    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgType;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout1;
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnaddstaff;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbDriver;
    private javax.swing.JRadioButton rbInspector;
    private javax.swing.JTable tblstaff;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables


   private void searchStaffByID(JTable tblstaff, SetOfUsers<User> sOu,JTextField txt,JRadioButton rbDriver,JRadioButton rbInspector) {
       DefaultTableModel dtm=(DefaultTableModel) tblstaff.getModel();
        dtm.setRowCount(0);
        String text=txt.getText();
        String type="";
        if(rbDriver.isSelected())
            type="driver";
        if(rbInspector.isSelected())
            type="inspector";
        
      try {
          sOu=(SetOfUsers<User>) Serialize.deserialize("SetOfUsers.ser");
          
          for(User usr:sOu){
              if(type.equals("")){
                  if(usr.getUserID().contains(text) && (usr.getType().equals("driver")||usr.getType().equals("inspector"))){
                  Vector v=new Vector();
                  v.add(usr.getUserID());
                  v.add(usr.getUserFulName());
                  v.add(usr.getUserName());
                  v.add(usr.getMobileNumber());
                  Vector h=new Vector();
                  h.add("ID");
                  h.add("Name");
                  h.add("Username");
                  h.add("Mobile Number");
                  dtm.addRow(v);
                  dtm.setColumnIdentifiers(h);
              }
                  
              }
              else{
              if(usr.getUserID().contains(text) && usr.getType().equals(type)){
                  Vector v=new Vector();
                  v.add(usr.getUserID());
                  v.add(usr.getUserFulName());
                  v.add(usr.getUserName());
                  v.add(usr.getMobileNumber());
                  Vector h=new Vector();
                  h.add("ID");
                  h.add("Name");
                  h.add("Username");
                  h.add("Mobile Number");
                  dtm.addRow(v);
                  dtm.setColumnIdentifiers(h);
              }
              }
               tblstaff.setModel(dtm);
               
          }
      } catch (IOException ex) {
          Logger.getLogger(StaffDetails.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(StaffDetails.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
}
