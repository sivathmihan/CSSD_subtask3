/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Kaashiff Ahamed
 */
public class ViewCardDetails extends javax.swing.JFrame {

    /**
     * Creates new form ViewCardDetails
     */
    public ViewCardDetails() {
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

        lblCardNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCvv = new javax.swing.JLabel();
        lblExpDate = new javax.swing.JLabel();
        btnAddCard = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(250, 400));
        setMinimumSize(new java.awt.Dimension(250, 400));
        setPreferredSize(new java.awt.Dimension(250, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCardNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCardNo.setText("cardno");
        getContentPane().add(lblCardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        lblCvv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCvv.setText("cvv");
        getContentPane().add(lblCvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        lblExpDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblExpDate.setText("expd");
        getContentPane().add(lblExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        btnAddCard.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCard.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnAddCard.setText("Add Details");
        btnAddCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnAddCard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCard.setMaximumSize(new java.awt.Dimension(80, 30));
        btnAddCard.setMinimumSize(new java.awt.Dimension(80, 30));
        btnAddCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCardActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 80, 30));

        label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label1.setText("Card No");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label2.setText("Name on card");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        label3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label3.setText("CVV No");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        label4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label4.setText("Exp date");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setMaximumSize(new java.awt.Dimension(80, 30));
        btnBack.setMinimumSize(new java.awt.Dimension(80, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setMaximumSize(new java.awt.Dimension(80, 30));
        btnLogout.setMinimumSize(new java.awt.Dimension(80, 30));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        PassangerProfile pp = new PassangerProfile();
        pp.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCardActionPerformed
        EditCardDetails ecd = new EditCardDetails();
        ecd.setVisible(true);
        
        this.dispose();
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
            java.util.logging.Logger.getLogger(ViewCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCardDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCardDetails().setVisible(true);
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
    private javax.swing.JLabel lblCardNo;
    private javax.swing.JLabel lblCvv;
    private javax.swing.JLabel lblExpDate;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
