/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Ian
 */
public class GestionAltas extends javax.swing.JFrame {


    public GestionAltas() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGestionAltaAuto = new javax.swing.JButton();
        btnGestionAltasPropietario = new javax.swing.JButton();
        btnGestionAltaInspeccion = new javax.swing.JButton();
        btnGestionAltaInspector = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 88, 140));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de ALTAS");
        jLabel1.setAlignmentY(0.0F);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/certant-logo.png"))); // NOI18N

        btnGestionAltaAuto.setBackground(new java.awt.Color(0, 51, 153));
        btnGestionAltaAuto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGestionAltaAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionAltaAuto.setText("AUTO");
        btnGestionAltaAuto.setFocusPainted(false);
        btnGestionAltaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionAltaAutoActionPerformed(evt);
            }
        });

        btnGestionAltasPropietario.setBackground(new java.awt.Color(0, 51, 153));
        btnGestionAltasPropietario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGestionAltasPropietario.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionAltasPropietario.setText("PROPIETARIO");
        btnGestionAltasPropietario.setFocusPainted(false);
        btnGestionAltasPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionAltasPropietarioActionPerformed(evt);
            }
        });

        btnGestionAltaInspeccion.setBackground(new java.awt.Color(0, 51, 153));
        btnGestionAltaInspeccion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGestionAltaInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionAltaInspeccion.setText("INSPECCIÓN");
        btnGestionAltaInspeccion.setFocusPainted(false);
        btnGestionAltaInspeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionAltaInspeccionActionPerformed(evt);
            }
        });

        btnGestionAltaInspector.setBackground(new java.awt.Color(0, 51, 153));
        btnGestionAltaInspector.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGestionAltaInspector.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionAltaInspector.setText("INSPECTOR");
        btnGestionAltaInspector.setFocusPainted(false);
        btnGestionAltaInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionAltaInspectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(258, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGestionAltaInspeccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGestionAltasPropietario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(btnGestionAltaInspector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGestionAltaAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(btnGestionAltaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestionAltaInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGestionAltasPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGestionAltaInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionAltaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionAltaAutoActionPerformed
        AltaAuto alta = new AltaAuto();
        alta.setVisible(true);
        alta.setLocationRelativeTo(null);
        alta.setLocationRelativeTo(null);
          setEnabled(false); 
            alta.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         });
    }//GEN-LAST:event_btnGestionAltaAutoActionPerformed

    private void btnGestionAltasPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionAltasPropietarioActionPerformed
        AltaPropietario altaP = new AltaPropietario();
        altaP.setVisible(true);
        altaP.setLocationRelativeTo(null);
         altaP.setLocationRelativeTo(null);
          setEnabled(false); 
            altaP.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         });
    }//GEN-LAST:event_btnGestionAltasPropietarioActionPerformed

    private void btnGestionAltaInspeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionAltaInspeccionActionPerformed
        AltaInspeccion altaInspeccion = new AltaInspeccion();
        altaInspeccion.setVisible(true);
        altaInspeccion.setLocationRelativeTo(null);
        altaInspeccion.setLocationRelativeTo(null);
          setEnabled(false); 
            altaInspeccion.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         });
    }//GEN-LAST:event_btnGestionAltaInspeccionActionPerformed

    private void btnGestionAltaInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionAltaInspectorActionPerformed
        AltaInspector altaI = new AltaInspector();
        altaI.setVisible(true);
        altaI.setLocationRelativeTo(null);
         altaI.setLocationRelativeTo(null);
          setEnabled(false); 
            altaI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         });
    }//GEN-LAST:event_btnGestionAltaInspectorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionAltaAuto;
    private javax.swing.JButton btnGestionAltaInspeccion;
    private javax.swing.JButton btnGestionAltaInspector;
    private javax.swing.JButton btnGestionAltasPropietario;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
