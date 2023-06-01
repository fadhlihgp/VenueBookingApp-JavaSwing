/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.view.admin;

import org.example.controllers.BookingController;
import org.example.dependencyInjection.BookingControllerFactory;
import org.example.dtos.BookingDetail;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author fadhl
 */
public class ConfirmationView extends javax.swing.JFrame {

    private BookingControllerFactory bookingFactory = new BookingControllerFactory();
    private BookingController bookingController = bookingFactory.controller();
    private String bookingId;
    public ConfirmationView() {
        initComponents();
        fillData();
    }
    public ConfirmationView(String bookingId){
        this.bookingId = bookingId;
        initComponents();
        fillData();
        validateButton();
    }
    
    private void validateButton() {
        if (!lblStatus.getText().equals("Belum Terkonfirmasi")){
            btnConfirm.setEnabled(false);
            btnReject.setEnabled(false);
        }
    }
    private void fillData(){
        BookingDetail bookingDetail = bookingController.reportBookingStruck(bookingId);
        String status = "";
        if (bookingDetail.isConfirmed() != null){
            if (bookingDetail.isConfirmed() == true){
                status = "Berhasil";
            } else if (bookingDetail.isConfirmed() == false){
                status = "Ditolak";
            }
        } else {
            status = "Belum Terkonfirmasi";
        }
        lblBookingKode.setText(bookingDetail.getBookedId());
        lblVenueKode.setText(bookingDetail.getVenueId());
        lblVenueName.setText(bookingDetail.getVenueName());
        lblDateOrder.setText(bookingDetail.getDateOrder());
        lblDateBooked.setText(bookingDetail.getDateBooked());
        lblCategory.setText(bookingDetail.getCategory());
        lblStart.setText(bookingDetail.getStartTime());
        lblEnd.setText(bookingDetail.getEndTime());
        lblStatus.setText(bookingDetail.getStatus());
        lblTotalPrice.setText(bookingDetail.getPrice().toString());
        lblName.setText(bookingDetail.getFullName());
        lblPhoneNumber.setText(bookingDetail.getPhoneNumber());
        lblStatus.setText(status);
        ImageIcon icon = new ImageIcon(bookingDetail.getImageUrl());
        Image img = icon.getImage().getScaledInstance(lblPhoto.getWidth(), lblPhoto.getHeight(), Image.SCALE_DEFAULT);
        ImageIcon ic = new ImageIcon(img);
        lblPhoto.setIcon(ic);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfirmationPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblBookingKode = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDateOrder = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVenueKode = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblVenueName = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblDateBooked = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblStart = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Konfirmasi Pesanan");

        ConfirmationPanel.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Kode Pesanan");
        ConfirmationPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 118, -1, -1));

        lblBookingKode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBookingKode.setForeground(new java.awt.Color(102, 102, 102));
        lblBookingKode.setText("Kode Pesanan");
        ConfirmationPanel.add(lblBookingKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel4.setText("Tanggal Transaksi");
        ConfirmationPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 72, -1, -1));

        lblDateOrder.setText("Tanggal Transaksi");
        ConfirmationPanel.add(lblDateOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 72, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Kode Lapangan");
        ConfirmationPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 152, -1, -1));

        lblVenueKode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVenueKode.setForeground(new java.awt.Color(102, 102, 102));
        lblVenueKode.setText("Kode Lapangan");
        ConfirmationPanel.add(lblVenueKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Nama Lapangan");
        ConfirmationPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 186, -1, -1));

        lblVenueName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVenueName.setForeground(new java.awt.Color(102, 102, 102));
        lblVenueName.setText("Nama Lapangan");
        ConfirmationPanel.add(lblVenueName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, 30));

        lblCategory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(102, 102, 102));
        lblCategory.setText("Kategori");
        ConfirmationPanel.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Kategori");
        ConfirmationPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 220, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText("name");
        ConfirmationPanel.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Nama Pemesan");
        ConfirmationPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 118, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("No Telepon");
        ConfirmationPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 152, -1, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(102, 102, 102));
        lblPhoneNumber.setText("No Telp");
        ConfirmationPanel.add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        lblDateBooked.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDateBooked.setForeground(new java.awt.Color(102, 102, 102));
        lblDateBooked.setText("Tgl Pesanan");
        ConfirmationPanel.add(lblDateBooked, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 246, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Tanggal Sewa");
        ConfirmationPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 254, -1, -1));

        lblStart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStart.setForeground(new java.awt.Color(102, 102, 102));
        lblStart.setText("Mulai");
        ConfirmationPanel.add(lblStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Mulai");
        ConfirmationPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 288, -1, -1));

        lblEnd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEnd.setForeground(new java.awt.Color(102, 102, 102));
        lblEnd.setText("Selesai");
        ConfirmationPanel.add(lblEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Selesai");
        ConfirmationPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 322, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Status Pesanan");
        ConfirmationPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 356, -1, -1));

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(102, 102, 102));
        lblStatus.setText("Status");
        ConfirmationPanel.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Total ");
        ConfirmationPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 390, -1, -1));

        lblTotalPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(102, 102, 102));
        lblTotalPrice.setText("Price");
        ConfirmationPanel.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Bukti Pembayaran");
        ConfirmationPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 186, -1, -1));

        lblPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ConfirmationPanel.add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 208, 155, 200));

        btnConfirm.setBackground(new java.awt.Color(0, 153, 0));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Konfirmasi");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 152, 39));

        btnCancel.setBackground(new java.awt.Color(204, 255, 255));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setText("Batal");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 145, 39));

        jLabel28.setText("==============================================================================");
        ConfirmationPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, -1, -1));

        jLabel29.setText("==============================================================================");
        ConfirmationPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Konfirmasi Pesanan");
        ConfirmationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        btnReject.setBackground(new java.awt.Color(255, 0, 0));
        btnReject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Tolak");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        ConfirmationPanel.add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 145, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfirmationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ConfirmationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Yakin ingin konfirmasi transaksi ?");
        if (i == JOptionPane.YES_OPTION){
            bookingController.updateStatusBooked(true, bookingId);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Berhasil konfirmasi transaksi");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Pastikan hubungi customer sebelumnya, Yakin ingin menolak transaksi ?");
        if (i == JOptionPane.YES_OPTION) {
            bookingController.updateStatusBooked(false, bookingId);
            JOptionPane.showMessageDialog(null, "Berhasil menolak transaksi");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfirmationPanel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblBookingKode;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDateBooked;
    private javax.swing.JLabel lblDateOrder;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblVenueKode;
    private javax.swing.JLabel lblVenueName;
    // End of variables declaration//GEN-END:variables
}
