/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toko_app;

import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;

/**
 *
 * @author smart user
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        FullScreen();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        buttonApply = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selamat Datang Di Juke Market");
        jPanel1.add(jLabel1);

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));
        jPanel3.setLayout(new java.awt.GridLayout(1, 3, 10, 10));

        jPanel4.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridLayout(5, 0, 0, 10));
        jPanel2.add(jLabel2);

        buttonLogin.setBackground(new java.awt.Color(51, 51, 51));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(204, 204, 204));
        buttonLogin.setText("Login");
        buttonLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonLogin.setBorderPainted(false);
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.setMaximumSize(new java.awt.Dimension(76, 12));
        buttonLogin.setMinimumSize(new java.awt.Dimension(76, 12));
        buttonLogin.setPreferredSize(new java.awt.Dimension(76, 12));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel2.add(buttonLogin);

        buttonApply.setBackground(new java.awt.Color(51, 51, 51));
        buttonApply.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonApply.setForeground(new java.awt.Color(204, 204, 204));
        buttonApply.setText("Daftar");
        buttonApply.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonApply.setBorderPainted(false);
        buttonApply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonApply.setMaximumSize(new java.awt.Dimension(76, 12));
        buttonApply.setMinimumSize(new java.awt.Dimension(76, 12));
        buttonApply.setPreferredSize(new java.awt.Dimension(76, 12));
        buttonApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApplyActionPerformed(evt);
            }
        });
        jPanel2.add(buttonApply);

        buttonExit.setBackground(new java.awt.Color(51, 51, 51));
        buttonExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(204, 204, 204));
        buttonExit.setText("Keluar");
        buttonExit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonExit.setBorderPainted(false);
        buttonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonExit.setMaximumSize(new java.awt.Dimension(76, 12));
        buttonExit.setMinimumSize(new java.awt.Dimension(76, 12));
        buttonExit.setPreferredSize(new java.awt.Dimension(76, 12));
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });
        jPanel2.add(buttonExit);

        jPanel3.add(jPanel2);

        jPanel5.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jPanel1.add(jPanel3);

        jPanel6.setBackground(new java.awt.Color(38, 38, 38));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1754, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1770, 943));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApplyActionPerformed
        // TODO add your handling code here:
        Daftar.main(null);
        dispose();
    }//GEN-LAST:event_buttonApplyActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        Login_Form.main(null);
        dispose();
    }//GEN-LAST:event_buttonLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
     private void FullScreen() {
        getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        pack();
        setResizable(false);

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Point p = new Point(0, 0);
                SwingUtilities.convertPointToScreen(p, getContentPane());
                Point l = getLocation();
                l.x -= p.x;
                l.y -= p.y;
                setLocation(l);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApply;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
