/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.User;
import Controllers.*;
import EntitySets.SetOfUsers;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author Kaashiff Ahamed
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    
    
    public Signup() {
        initComponents();
        
        PromptSupport.setPrompt("Enter Fullname", txtName);
        PromptSupport.setPrompt("Enter Username", txtUserName);
        PromptSupport.setPrompt("Enter Address", txtAddress);
        PromptSupport.setPrompt("Enter Email", txtEmail);
        PromptSupport.setPrompt("Enter Contact Number", txtPhone);
        PromptSupport.setPrompt("Enter Password", txtPassword);
        PromptSupport.setPrompt("Confirm Password", txtCPassword);
        
        
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtName);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGender = new javax.swing.ButtonGroup();
        txtName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        rbOthers = new javax.swing.JRadioButton();
        rbMale = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtCPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(250, 400));
        setMinimumSize(new java.awt.Dimension(250, 400));
        setPreferredSize(new java.awt.Dimension(250, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 25));

        txtUserName.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 25));

        txtEmail.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 25));

        txtAddress.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 25));

        txtPhone.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 25));

        bgGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        getContentPane().add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        bgGender.add(rbOthers);
        rbOthers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbOthers.setText("Others");
        getContentPane().add(rbOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        bgGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbMale.setText("Male");
        getContentPane().add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.setMaximumSize(new java.awt.Dimension(80, 30));
        btnSubmit.setMinimumSize(new java.awt.Dimension(80, 30));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 80, 30));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setMaximumSize(new java.awt.Dimension(80, 30));
        btnCancel.setMinimumSize(new java.awt.Dimension(80, 30));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 80, 30));

        txtPassword.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 25));

        txtCPassword.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtCPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Gender");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        Login lg = new Login();
        lg.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name=txtName.getText();
        String uname=txtUserName.getText();
        String email=txtEmail.getText();
        String pass=txtPassword.getText();
        String cpass=txtCPassword.getText();
        String mobile=txtPhone.getText();
        String address=txtAddress.getText();
        String gender="";
        if(rbFemale.isSelected())
                gender="Female";
        else if(rbMale.isSelected())
                gender="Male";
        else
                gender="Others";
        
        String err="";
        int errcheck=0;
        
        if(cpass.equals(pass)!=true)
        {
            err+="\n Passwords Does not match";
            errcheck=1;
        }
        if(uname.isEmpty())
        {
            err+="\n Must Enter an Username";
            errcheck=1;
        }
        if(pass.isEmpty())
        {
            err+="\n Enter Password";
            errcheck=1;
        }
        
        if(errcheck==1)
        {
            JOptionPane.showMessageDialog(rootPane, err);
            return;
        }
        
        else{
            
        SetOfUsers<User> sOu;
        try{
            sOu = (SetOfUsers)Serialize.deserialize("SetOfUsers.ser");
        }catch(IOException | ClassNotFoundException e)
        {
            sOu = new SetOfUsers();
        }
        
        for(User sOu1:sOu)
        {
            if(uname.equals(sOu1.getUserName())){
                JOptionPane.showMessageDialog(rootPane, "Username already exists.");
                return;
            }
            
        }
        sOu.add(new User(name, uname, pass, email, address, mobile, gender,1));
        
            try {
                Serialize.serialize(sOu,"SetOfUsers.ser");
            } catch (IOException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        for(User sOp1:sOu)
        {
            String un=sOp1.getUserName();
            String id=sOp1.getUserID();
            System.out.println(""+id+","+un+"");
        }
         
        new Login().setVisible(true);
        this.dispose();        
        
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbOthers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtCPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
