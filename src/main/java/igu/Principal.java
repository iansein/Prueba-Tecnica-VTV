package igu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Ian
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGestionAltas = new javax.swing.JButton();
        btnGestionInformes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnGestionModificacionesYBajas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 88, 140));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA VTV");
        jLabel1.setAlignmentY(0.0F);

        btnGestionAltas.setBackground(new java.awt.Color(0, 51, 153));
        btnGestionAltas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGestionAltas.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionAltas.setText("ALTAS");
        btnGestionAltas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGestionAltas.setFocusPainted(false);
        btnGestionAltas.setMaximumSize(new java.awt.Dimension(90, 90));
        btnGestionAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionAltasActionPerformed(evt);
            }
        });

        btnGestionInformes.setBackground(new java.awt.Color(0, 51, 153));
        btnGestionInformes.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGestionInformes.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionInformes.setText("INFORMES");
        btnGestionInformes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGestionInformes.setFocusPainted(false);
        btnGestionInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionInformesActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/certant-logo.png"))); // NOI18N

        btnGestionModificacionesYBajas1.setBackground(new java.awt.Color(0, 51, 153));
        btnGestionModificacionesYBajas1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnGestionModificacionesYBajas1.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionModificacionesYBajas1.setText("MODIFICACIONES Y BAJAS");
        btnGestionModificacionesYBajas1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGestionModificacionesYBajas1.setFocusPainted(false);
        btnGestionModificacionesYBajas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionModificacionesYBajas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1)
                .addContainerGap(315, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGestionModificacionesYBajas1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(btnGestionAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionInformes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(btnGestionAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnGestionModificacionesYBajas1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnGestionInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionAltasActionPerformed
        GestionAltas gestionAltas = new GestionAltas();
        gestionAltas.setVisible(true);
        gestionAltas.setLocationRelativeTo(null);
        setEnabled(false);
        gestionAltas.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true);
                toFront();
            }
        });
    }//GEN-LAST:event_btnGestionAltasActionPerformed

    private void btnGestionInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionInformesActionPerformed
        this.setEnabled(false);
        GestionInformes gestionInformes = new GestionInformes();
        gestionInformes.setVisible(true);
        gestionInformes.setLocationRelativeTo(null);
        gestionInformes.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true);
                toFront();
            }
        });
    }//GEN-LAST:event_btnGestionInformesActionPerformed

    private void btnGestionModificacionesYBajas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionModificacionesYBajas1ActionPerformed
        this.setEnabled(false);
        GestionModificadoYBorrado gestionModificadoYBorrado = new GestionModificadoYBorrado();
        gestionModificadoYBorrado.setVisible(true);
        gestionModificadoYBorrado.setLocationRelativeTo(null);
        gestionModificadoYBorrado.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true);
                toFront();
            }
        });
    }//GEN-LAST:event_btnGestionModificacionesYBajas1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionAltas;
    private javax.swing.JButton btnGestionInformes;
    private javax.swing.JButton btnGestionModificacionesYBajas1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
