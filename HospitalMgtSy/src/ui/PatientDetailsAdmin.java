/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;

/**
 *
 * @author akshitabarot
 */
public class PatientDetailsAdmin extends javax.swing.JFrame {

    /**
     * Creates new form PatientDetailsAdmin
     */
    
    PatientDirectory PatDirectory;
    DoctorDirectory DocDirectory;
    HospitalDirectory HospDirectory;
    
    
    public PatientDetailsAdmin() {
        initComponents();
    }
    
    PatientDetailsAdmin(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory) {
        initComponents();
        this.DocDirectory = DocDirectory;   //we are pushing whole reference to DoctorDirectory
        this.HospDirectory = HospDirectory;
        this.PatDirectory = PatDirectory;
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
        btnAddPatientDetails = new javax.swing.JButton();
        btnViewPatientDetails = new javax.swing.JButton();
        btnBackPatientDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnAddPatientDetails.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        btnAddPatientDetails.setForeground(new java.awt.Color(204, 0, 0));
        btnAddPatientDetails.setText("Add Patient");
        btnAddPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatientDetailsMouseClicked(evt);
            }
        });
        btnAddPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddPatientDetails);
        btnAddPatientDetails.setBounds(310, 119, 220, 50);

        btnViewPatientDetails.setFont(new java.awt.Font("Charter", 1, 18)); // NOI18N
        btnViewPatientDetails.setForeground(new java.awt.Color(204, 0, 0));
        btnViewPatientDetails.setText("View Patient");
        btnViewPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewPatientDetailsMouseClicked(evt);
            }
        });
        btnViewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewPatientDetails);
        btnViewPatientDetails.setBounds(310, 240, 220, 50);

        btnBackPatientDetails.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnBackPatientDetails.setForeground(new java.awt.Color(204, 0, 0));
        btnBackPatientDetails.setText("BACK");
        btnBackPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackPatientDetailsMouseClicked(evt);
            }
        });
        jPanel1.add(btnBackPatientDetails);
        btnBackPatientDetails.setBounds(370, 350, 100, 40);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 770, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPatientDetailsActionPerformed

    private void btnViewPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientDetailsActionPerformed
        // TODO add your handling code here:
//        VDocDetails VDD = new VDocDetails(DocDirectory, HospDirectory, PatDirectory);
//        VDD.setVisible(true);
//        this.dispose();

        
    }//GEN-LAST:event_btnViewPatientDetailsActionPerformed

    private void btnAddPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatientDetailsMouseClicked
        // TODO add your handling code here:

        APatientDetails APD = new APatientDetails(DocDirectory, HospDirectory, PatDirectory);
        APD.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnAddPatientDetailsMouseClicked

    private void btnViewPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPatientDetailsMouseClicked
        // TODO add your handling code here:

        VPatDetails VPD = new VPatDetails(DocDirectory, HospDirectory, PatDirectory);
        VPD.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnViewPatientDetailsMouseClicked

    private void btnBackPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackPatientDetailsMouseClicked
        // TODO add your handling code here:
       SysAdFrame SA1 = new SysAdFrame(DocDirectory, HospDirectory, PatDirectory);
       SA1.setVisible(true); 
       this.dispose();
    }//GEN-LAST:event_btnBackPatientDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetailsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetailsAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatientDetails;
    private javax.swing.JButton btnBackPatientDetails;
    private javax.swing.JButton btnViewPatientDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}