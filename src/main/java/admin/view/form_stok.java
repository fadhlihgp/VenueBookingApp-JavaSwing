/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin.view;

/**
 *
 * @author Rimuza
 */
public class form_stok extends javax.swing.JPanel {

    /**
     * Creates new form form_stok
     */
    public form_stok() {
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

        mainPanel1 = new javax.swing.JPanel();
        dataBarang1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cetak = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        mainPanel1.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel1.setForeground(new java.awt.Color(255, 255, 255));
        mainPanel1.setLayout(new java.awt.CardLayout());

        dataBarang1.setBackground(new java.awt.Color(255, 255, 255));
        dataBarang1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LAPORAN STOK");

        cetak.setText("CETAK");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataBarang1Layout = new javax.swing.GroupLayout(dataBarang1);
        dataBarang1.setLayout(dataBarang1Layout);
        dataBarang1Layout.setHorizontalGroup(
            dataBarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataBarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(606, Short.MAX_VALUE))
        );
        dataBarang1Layout.setVerticalGroup(
            dataBarang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBarang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cetak, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        mainPanel1.add(dataBarang1, "card2");

        add(mainPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed

    }//GEN-LAST:event_cetakActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JPanel dataBarang1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel1;
    // End of variables declaration//GEN-END:variables
}
