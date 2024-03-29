/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.PatientDirectory;

/**
 *
 * @author akshitabarot
 */
public class VHospDetails extends javax.swing.JFrame {

    /**
     * Creates new form VHospDetails
     */
    
     HospitalDirectory HospDirectory;
      DoctorDirectory DocDirectory;
      PatientDirectory PatDirectory;
      
      
    public VHospDetails() {
        initComponents();
    }

    
    VHospDetails(DoctorDirectory DocDirectory, HospitalDirectory HospDirectory, PatientDirectory PatDirectory) {
        initComponents();
       this.PatDirectory = PatDirectory;
        this.HospDirectory = HospDirectory;
        this.DocDirectory = DocDirectory;
        
       populateTable();
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
        jLabel3 = new javax.swing.JLabel();
        jEmailHosp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPhoneNoHosp = new javax.swing.JTextField();
        jNameHosp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jHospID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHosp = new javax.swing.JTable();
        searchHosp = new javax.swing.JLabel();
        tfSearchHosp = new javax.swing.JTextField();
        btnViewHosp = new javax.swing.JButton();
        btnUpdateHosp = new javax.swing.JButton();
        btnDeleteHosp = new javax.swing.JButton();
        btnBackHospView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Charter", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOSPITAL DETAILS");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 20, 300, 50);

        jEmailHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailHospActionPerformed(evt);
            }
        });
        jPanel1.add(jEmailHosp);
        jEmailHosp.setBounds(700, 180, 220, 30);

        jLabel13.setFont(new java.awt.Font("Charter", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("EMAIL");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(510, 180, 140, 30);

        jLabel12.setFont(new java.awt.Font("Charter", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PHONE NUMBER");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(510, 110, 140, 30);

        jPhoneNoHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPhoneNoHospActionPerformed(evt);
            }
        });
        jPhoneNoHosp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPhoneNoHospKeyPressed(evt);
            }
        });
        jPanel1.add(jPhoneNoHosp);
        jPhoneNoHosp.setBounds(700, 110, 220, 30);

        jNameHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameHospActionPerformed(evt);
            }
        });
        jNameHosp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNameHospKeyPressed(evt);
            }
        });
        jPanel1.add(jNameHosp);
        jNameHosp.setBounds(220, 180, 220, 30);

        jLabel2.setFont(new java.awt.Font("Charter", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOSPITAL NAME");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 180, 140, 30);

        jLabel5.setFont(new java.awt.Font("Charter", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HOSPITAL ID");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 110, 140, 30);

        jHospID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHospIDActionPerformed(evt);
            }
        });
        jHospID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jHospIDKeyReleased(evt);
            }
        });
        jPanel1.add(jHospID);
        jHospID.setBounds(220, 110, 220, 30);

        jTableHosp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HospitalID", "Hospital Name", "Phone No", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTableHosp);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 940, 220);

        searchHosp.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        searchHosp.setForeground(new java.awt.Color(204, 0, 0));
        searchHosp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchHosp.setText("SEARCH");
        searchHosp.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 0)));
        jPanel1.add(searchHosp);
        searchHosp.setBounds(40, 290, 150, 40);

        tfSearchHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchHospActionPerformed(evt);
            }
        });
        tfSearchHosp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchHospKeyReleased(evt);
            }
        });
        jPanel1.add(tfSearchHosp);
        tfSearchHosp.setBounds(230, 290, 740, 40);

        btnViewHosp.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnViewHosp.setForeground(new java.awt.Color(204, 0, 0));
        btnViewHosp.setText("VIEW");
        btnViewHosp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewHospMouseClicked(evt);
            }
        });
        btnViewHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewHosp);
        btnViewHosp.setBounds(120, 630, 130, 30);

        btnUpdateHosp.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnUpdateHosp.setForeground(new java.awt.Color(204, 0, 0));
        btnUpdateHosp.setText("UPDATE");
        btnUpdateHosp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateHospMouseClicked(evt);
            }
        });
        btnUpdateHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateHosp);
        btnUpdateHosp.setBounds(350, 630, 130, 30);

        btnDeleteHosp.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnDeleteHosp.setForeground(new java.awt.Color(204, 0, 0));
        btnDeleteHosp.setText("DELETE");
        btnDeleteHosp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteHospMouseClicked(evt);
            }
        });
        btnDeleteHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteHosp);
        btnDeleteHosp.setBounds(550, 630, 130, 30);

        btnBackHospView.setFont(new java.awt.Font("Charter", 1, 14)); // NOI18N
        btnBackHospView.setForeground(new java.awt.Color(204, 0, 0));
        btnBackHospView.setText("BACK");
        btnBackHospView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackHospViewMouseClicked(evt);
            }
        });
        btnBackHospView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHospViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackHospView);
        btnBackHospView.setBounds(760, 630, 130, 30);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 970, 970);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEmailHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailHospActionPerformed

    private void jPhoneNoHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPhoneNoHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPhoneNoHospActionPerformed

    private void jPhoneNoHospKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPhoneNoHospKeyPressed
        // TODO add your handling code here:

        try{
            String cellNumber = jPhoneNoHosp.getText();
            int length = cellNumber.length();
            char c = evt.getKeyChar();

            //checks for number 0 to 9
            if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
                ///checks if length not more than 10 digit
                if(length<10){
                    jPhoneNoHosp.setEditable(true);

                } else{
                    jPhoneNoHosp.setEditable(false);
                }
            }   else{
                if (evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                    jPhoneNoHosp.setEditable(true);
                } else{
                    jPhoneNoHosp.setEditable(false);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jPhoneNoHospKeyPressed

    private void jNameHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameHospActionPerformed

    private void jNameHospKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNameHospKeyPressed
        // TODO add your handling code here:

        char c = evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c )|| Character.isISOControl(c)){
            jNameHosp.setEditable(true);
        } else {
            jNameHosp.setEditable(false);
        }
    }//GEN-LAST:event_jNameHospKeyPressed

    private void jHospIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHospIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHospIDActionPerformed

    private void jHospIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jHospIDKeyReleased
        // TODO add your handling code here:
        //        char c = evt.getKeyChar();
        //
        //        if(Character.isLetter(c) || Character.isWhitespace(c )|| Character.isISOControl(c)){
            //            tfFnameDoc.setEditable(true);
            //        } else {
            //            tfFnameDoc.setEditable(false);
            //        }
    }//GEN-LAST:event_jHospIDKeyReleased

    private void tfSearchHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchHospActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tfSearchHospActionPerformed
        
        public void search(String str){
        DefaultTableModel model = (DefaultTableModel) jTableHosp.getModel();
        TableRowSorter<DefaultTableModel> trs  = new TableRowSorter<DefaultTableModel>(model);
        jTableHosp.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        }
        
    private void tfSearchHospKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchHospKeyReleased
        // TODO add your handling code here:

        String search = tfSearchHosp.getText();
        search(search);
    }//GEN-LAST:event_tfSearchHospKeyReleased

    
    private void btnViewHospMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewHospMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex = jTableHosp.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to delete");
        }

        DefaultTableModel model = (DefaultTableModel) jTableHosp.getModel();
        Hospital selectedhosp = (Hospital) model.getValueAt(selectedRowIndex, 0);

        jHospID.setText(String.valueOf(selectedhosp.getHospitalID()));  //here String.valueof is used to convert any data type like int to String.
        //JDocID.setEditable(false);

        jNameHosp.setText(String.valueOf(selectedhosp.getHospitalName()));
        //JFNameDoc.setEditable(false);=
        
        jPhoneNoHosp.setText(String.valueOf(selectedhosp.getPhoneNo()));
        //JPhoneNoDoc.setEditable(false);

        jEmailHosp.setText(String.valueOf(selectedhosp.getEmailAdd()));
        
       
    }//GEN-LAST:event_btnViewHospMouseClicked

    private void btnViewHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewHospActionPerformed

    private void btnUpdateHospMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateHospMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTableHosp.getModel();
        if (jTableHosp.getSelectedRowCount()==1){

            String hospitalID = jHospID.getText();
            String hospitalName = jNameHosp.getText();
            String phoneNoHosp = jPhoneNoHosp.getText();
            String emailHosp = jEmailHosp.getText();
 
            int x= 0;
            //String image = image_txt.getText();
            //int length = cellphoneno.length();

            int length = phoneNoHosp.length();
            if(length<10){
                JOptionPane.showMessageDialog(this,
                    "Please enter cell no of 10 digits",
                    "Try Again",
                    JOptionPane.ERROR_MESSAGE);
                x=1;

            } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailHosp)))
            {
                JOptionPane.showMessageDialog(null,
                    "Please enter a valid email",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                x=1;
                
            } if(x!=1){
                model.setValueAt(hospitalID, jTableHosp.getSelectedRow(),0);
                model.setValueAt(hospitalName, jTableHosp.getSelectedRow(),1);
                model.setValueAt(phoneNoHosp, jTableHosp.getSelectedRow(),2);
                model.setValueAt(emailHosp, jTableHosp.getSelectedRow(),3);


                JOptionPane.showMessageDialog(this, "Update Successfully");
            }
        }
        else if (jTableHosp.getRowCount()==0){
            //if table is empty
            JOptionPane.showMessageDialog(this, "table is empty");
        } else  {
            //if row is not selected or multiple row is selected
            JOptionPane.showMessageDialog(this, "Please select single row for update");

        }

        jHospID.setText("");
        jNameHosp.setText("");
        jPhoneNoHosp.setText("");
        jEmailHosp.setText("");

    }//GEN-LAST:event_btnUpdateHospMouseClicked

    private void btnUpdateHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateHospActionPerformed

    private void btnDeleteHospMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteHospMouseClicked
        // TODO add your handling code here:

        int selectedRowIndex = jTableHosp.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to delete");
        }

        DefaultTableModel model = (DefaultTableModel) jTableHosp.getModel();
        Hospital selectedHosp = (Hospital) model.getValueAt(selectedRowIndex, 0);

        HospDirectory.deleteHosp(selectedHosp);

        JOptionPane.showMessageDialog(this, "Hospital Details has been deleted");

        populateTable();

        //        SysAdDoc dda1 = new SysAdDoc(DocDirectory, HospDirectory, PatDirectory);
        //        dda1.setVisible(true);
        //        this.dispose();
    }//GEN-LAST:event_btnDeleteHospMouseClicked

    private void btnDeleteHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDeleteHospActionPerformed

    private void btnBackHospViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackHospViewMouseClicked
        // TODO add your handling code here:

        HospitalDetailsAdmin hda1 = new HospitalDetailsAdmin(DocDirectory, HospDirectory, PatDirectory);
        hda1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackHospViewMouseClicked

    private void btnBackHospViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHospViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackHospViewActionPerformed

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
            java.util.logging.Logger.getLogger(VHospDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VHospDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VHospDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VHospDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VHospDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackHospView;
    private javax.swing.JButton btnDeleteHosp;
    private javax.swing.JButton btnUpdateHosp;
    private javax.swing.JButton btnViewHosp;
    private javax.swing.JTextField jEmailHosp;
    private javax.swing.JTextField jHospID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNameHosp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPhoneNoHosp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHosp;
    private javax.swing.JLabel searchHosp;
    private javax.swing.JTextField tfSearchHosp;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTableHosp.getModel();
        model.setRowCount(0);
        
        for(Hospital hd : HospDirectory.getHospitalDirectory()){
            
            Object[] row = new Object[4];
            row[0] =  hd;
            row[1] =  hd.getHospitalName();
            row[2] =  hd.getPhoneNo();
            row[3] =  hd.getEmailAdd();

            
            model.addRow(row);
            
            
        }
}

}
