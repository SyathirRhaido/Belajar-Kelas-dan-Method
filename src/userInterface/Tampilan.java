/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import belajarkelasdanmethod.Manusia;

/**
 *
 * @author ridho
 */
public class Tampilan extends javax.swing.JFrame {

    Manusia manusia = new Manusia();
    /**
     * Creates new form Tampilan
     */
    public Tampilan() {
        initComponents();
        
    }
    public void AmbilKartuNama(){
        String getNama = manusia.nama = "Ridho Pratama Putra";
        String getJk = manusia.jenisKelamin = "Laki - laki";
        String getAgama = manusia.agama = "Islam";
        String getPekerjaan =manusia.pekerjaan = "Masih di rintis";
        int getUmur = manusia.umur = 20;
        
        jLabelnama.setText(getNama);
        jLabelJK.setText(getJk);
        jLabelAgama.setText(getAgama);
        jLabelUmur.setText(""+getUmur);
        jLabelPekerjaan.setText(getPekerjaan);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelKartuNama = new javax.swing.JLabel();
        jButtonLihat = new javax.swing.JButton();
        jLabelKartuNama1 = new javax.swing.JLabel();
        jLabelnama = new javax.swing.JLabel();
        jLabelKartuNama2 = new javax.swing.JLabel();
        jLabelUmur = new javax.swing.JLabel();
        jLabelKartuNama3 = new javax.swing.JLabel();
        jLabelJK = new javax.swing.JLabel();
        jLabelKartuNama4 = new javax.swing.JLabel();
        jLabelPekerjaan = new javax.swing.JLabel();
        jLabelKartuNama5 = new javax.swing.JLabel();
        jLabelAgama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelKartuNama.setText("Nama ");

        jButtonLihat.setText("Lihat");
        jButtonLihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLihatActionPerformed(evt);
            }
        });

        jLabelKartuNama1.setText("Kartu Nama Saya");

        jLabelnama.setText("Value Nama");

        jLabelKartuNama2.setText("Umur");

        jLabelUmur.setText("Value Umur");

        jLabelKartuNama3.setText("Jenis Kelamin");

        jLabelJK.setText("Value JK");

        jLabelKartuNama4.setText("Pekerjaan");

        jLabelPekerjaan.setText("Value Pekerjaan");

        jLabelKartuNama5.setText("Agama");

        jLabelAgama.setText("Value Agama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLihat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKartuNama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKartuNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKartuNama3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnama, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUmur, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJK, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabelKartuNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelKartuNama4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabelPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelKartuNama5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabelAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelKartuNama1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelKartuNama)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelKartuNama3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelKartuNama2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelnama)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelJK)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUmur)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKartuNama4)
                    .addComponent(jLabelPekerjaan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKartuNama5)
                    .addComponent(jLabelAgama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButtonLihat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLihatActionPerformed
        // TODO add your handling code here:
       AmbilKartuNama();
         
    }//GEN-LAST:event_jButtonLihatActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLihat;
    private javax.swing.JLabel jLabelAgama;
    private javax.swing.JLabel jLabelJK;
    private javax.swing.JLabel jLabelKartuNama;
    private javax.swing.JLabel jLabelKartuNama1;
    private javax.swing.JLabel jLabelKartuNama2;
    private javax.swing.JLabel jLabelKartuNama3;
    private javax.swing.JLabel jLabelKartuNama4;
    private javax.swing.JLabel jLabelKartuNama5;
    private javax.swing.JLabel jLabelPekerjaan;
    private javax.swing.JLabel jLabelUmur;
    private javax.swing.JLabel jLabelnama;
    // End of variables declaration//GEN-END:variables
}
