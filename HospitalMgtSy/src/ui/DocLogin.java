/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.DocModel;
import model.Doctor;

/**
 *
 * @author akshitabarot
 */
public class DocLogin extends javax.swing.JFrame {

    /**
     * Creates new form DocLogin
     */
    public DocLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jUserName = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        loginDoc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backDoc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 450, 58, 40);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DOCTOR'S LOGIN");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 280, 252, 54);

        jLabel3.setText("UserName");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 370, 58, 50);
        jPanel1.add(jUserName);
        jUserName.setBounds(490, 380, 138, 37);

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPassword);
        jPassword.setBounds(490, 450, 138, 40);

        loginDoc.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        loginDoc.setForeground(new java.awt.Color(204, 0, 0));
        loginDoc.setText("LOGIN");
        loginDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginDocActionPerformed(evt);
            }
        });
        jPanel1.add(loginDoc);
        loginDoc.setBounds(350, 520, 74, 24);

        jButton2.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("RESET");
        jPanel1.add(jButton2);
        jButton2.setBounds(550, 520, 72, 24);

        backDoc.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        backDoc.setForeground(new java.awt.Color(204, 0, 0));
        backDoc.setText("BACK");
        backDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backDocMouseClicked(evt);
            }
        });
        jPanel1.add(backDoc);
        backDoc.setBounds(450, 560, 72, 24);

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 250, 430, 360);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-150, -240, 1440, 1290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void loginDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginDocActionPerformed
        // TODO add your handling code here:
        
        DocModel doc = new DocModel();
        doc.setUserName(jUserName.getText());
        doc.setPassword(jPassword.getText());
        
         if (doc.getUserName().isEmpty() || doc.getPassword().isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
        return;
        //username = Doctoradmin & password = abcde
         }
        if (doc.getUserName().equals("docadmin") && doc.getPassword().equals("docadmin")){
            DocFrame Doc1 = new DocFrame();
            Doc1.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "Please enter correct username or password",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);     
       }
    }//GEN-LAST:event_loginDocActionPerformed

    private void backDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backDocMouseClicked
        // TODO add your handling code here:
        
        MainJFrame lp = new MainJFrame();
        lp.setVisible(true);
    }//GEN-LAST:event_backDocMouseClicked

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
            java.util.logging.Logger.getLogger(DocLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backDoc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUserName;
    private javax.swing.JButton loginDoc;
    // End of variables declaration//GEN-END:variables
}
