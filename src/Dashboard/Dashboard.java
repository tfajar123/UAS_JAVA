/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dashboard;

import java.sql.Connection;
import Content.CreateData;
import Content.ShowData;
import Content.UpdateData;
import Content.Display;
import Launcher.Launcher;
import Content.UpdateTamu;
/**
 *
 * @author tfaja
 */
public class Dashboard extends javax.swing.JFrame {
       
    CreateData a = new CreateData();
    ShowData b = new ShowData();
    UpdateData c = new UpdateData();
    Display d = new Display();
    UpdateTamu e = new UpdateTamu();
    Launcher l;
    Connection cn;
    
    /**
     * Creates new form Dashboard
     * @param l
     * @param cn
     */
    public Dashboard(Launcher l, Connection cn) {
//        buat hilangi menu bar
//        this.setUndecorated(true);
//        this.getRootPane().setWindowDecorationStyle(javax.swing.JRootPane.NONE);
        this.setMinimumSize(new java.awt.Dimension(400, 400));
        this.l = l;
        this.cn = cn;
        initComponents();
        main.add(a);
        main.add(b);
        main.add(c);
        main.add(d);
        main.add(e);
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(true);
        e.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSidePanel = new javax.swing.JPanel();
        jCheckIn = new javax.swing.JButton();
        jShowData = new javax.swing.JButton();
        jKamar = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jEditKamar = new javax.swing.JButton();
        main = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);

        jSidePanel.setBackground(new java.awt.Color(51, 0, 51));
        jSidePanel.setPreferredSize(new java.awt.Dimension(235, 645));

        jCheckIn.setText("Check In");
        jCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckInActionPerformed(evt);
            }
        });

        jShowData.setText("Edit Reservasi");
        jShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowDataActionPerformed(evt);
            }
        });

        jKamar.setText("Data Kamar");
        jKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKamarActionPerformed(evt);
            }
        });

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jEditKamar.setText("Edit Tamu");
        jEditKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditKamarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSidePanelLayout = new javax.swing.GroupLayout(jSidePanel);
        jSidePanel.setLayout(jSidePanelLayout);
        jSidePanelLayout.setHorizontalGroup(
            jSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSidePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jSidePanelLayout.setVerticalGroup(
            jSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSidePanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jEditKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        main.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
            .addComponent(main)
        );

        setSize(new java.awt.Dimension(1001, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckInActionPerformed
        // TODO add your handling code here:
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
    }//GEN-LAST:event_jCheckInActionPerformed

    private void jShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowDataActionPerformed
        // TODO add your handling code here:
        a.setVisible(false);
        b.setVisible(true);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
    }//GEN-LAST:event_jShowDataActionPerformed

    private void jKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKamarActionPerformed
        // TODO add your handling code here:
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(true);
        d.setVisible(false);
        e.setVisible(false);
    }//GEN-LAST:event_jKamarActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
        koneksi.KoneksiDB.TutupKoneksi(cn);
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jExitActionPerformed

    private void jEditKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditKamarActionPerformed
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(true);
    }//GEN-LAST:event_jEditKamarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCheckIn;
    private javax.swing.JButton jEditKamar;
    private javax.swing.JButton jExit;
    private javax.swing.JButton jKamar;
    private javax.swing.JButton jShowData;
    private javax.swing.JPanel jSidePanel;
    private javax.swing.JLayeredPane main;
    // End of variables declaration//GEN-END:variables
}
