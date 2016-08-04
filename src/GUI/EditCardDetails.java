/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controllers.Serialize;
import Controllers.Session;
import static Controllers.Session.currentUser;
import Entities.CreditCard;
import EntitySets.SetOfCreditCards;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.xswingx.PromptSupport;

/**
 *
 * @author CRYSIS_POOL
 */
public class EditCardDetails extends javax.swing.JFrame {

    /**
     * Creates new form EditCardDetails
     */
    public EditCardDetails() {
        initComponents();
        
        PromptSupport.setPrompt("Enter card number", txtCardNo);
        PromptSupport.setPrompt("Enter name", txtName);
        PromptSupport.setPrompt("Enter CVV number", txtCVV);
        
        
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, txtCardNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddCard = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtCVV = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCardNo = new javax.swing.JTextField();
        ycExp = new com.toedter.calendar.JYearChooser();
        mcExp = new com.toedter.calendar.JMonthChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(250, 400));
        setMinimumSize(new java.awt.Dimension(250, 400));
        setPreferredSize(new java.awt.Dimension(250, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddCard.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnAddCard.setText("Add Details");
        btnAddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCardActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 100, 30));

        label1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        label1.setText("Card No");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        label2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        label2.setText("Name on card");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        label3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        label3.setText("CVV No");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        label4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        label4.setText("Exp date");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        btnLogout.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        txtCVV.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, -1));

        txtName.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 110, -1));

        txtCardNo.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(txtCardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 110, -1));
        getContentPane().add(ycExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 20));

        mcExp.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        getContentPane().add(mcExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ViewCardDetails vcd = new ViewCardDetails();
        vcd.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login lg = new Login();
        lg.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCardActionPerformed
        // TODO add your handling code here:
        long cardNo=Long.parseLong(txtCardNo.getText());
        int cVV=Integer.parseInt(txtCVV.getText());
        String cardName=txtName.getText();
        int month=mcExp.getMonth()+1;
        int year=ycExp.getYear();
        String expDate=""+month+"/"+year+"";
        String id=currentUser.getUserID();
        
        SetOfCreditCards<CreditCard> sOc;
        try{
            sOc = (SetOfCreditCards) Serialize.deserialize("SetOfCreditCards.ser");
        }catch(IOException | ClassNotFoundException e)
        {
            sOc = new SetOfCreditCards<>();
        }
        int check=0;
        
        for(CreditCard card:sOc)
        {
            if(id.equals(card.getUserID())){
                check=1;
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to update your details","Warning",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    card.setCardName(cardName);
                    card.setCardNo(cardNo);
                    card.setcVVno(cVV);
                    card.setExpDate(expDate);
                }
                else if(dialogResult==JOptionPane.NO_OPTION)
                {
                    return;
                }
            }
            
        }
        if(check==0){
        sOc.add(new CreditCard(cardNo, cardName, expDate, cVV, id));
        
            try {
                Serialize.serialize(sOc,"SetOfCreditCards.ser");
            } catch (IOException ex) {
                Logger.getLogger(EditCardDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           
        for(CreditCard card:sOc)
        {
            long cno=card.getCardNo();
            String uid=card.getUserID();
            String cname=card.getCardName();
            int cvv=card.getcVVno();
            String exp=card.getExpDate();
            
            System.out.println(""+uid+","+cno+","+cname+","+cvv+","+exp+"");
        }
        
    }//GEN-LAST:event_btnAddCardActionPerformed

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
            java.util.logging.Logger.getLogger(EditCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCardDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCard;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private com.toedter.calendar.JMonthChooser mcExp;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtName;
    private com.toedter.calendar.JYearChooser ycExp;
    // End of variables declaration//GEN-END:variables
}
