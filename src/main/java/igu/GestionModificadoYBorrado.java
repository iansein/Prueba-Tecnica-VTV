package igu;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ian
 */
public class GestionModificadoYBorrado extends javax.swing.JFrame {


    public GestionModificadoYBorrado() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInspeccion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnModificacionYBorradoInspector = new javax.swing.JButton();
        btnModificacionYBorradoPropietario = new javax.swing.JButton();
        btnModificacionYBorradoAuto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(3, 88, 140));

        btnInspeccion.setBackground(new java.awt.Color(0, 51, 153));
        btnInspeccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnInspeccion.setText("INSPECCIÓN");
        btnInspeccion.setFocusPainted(false);
        btnInspeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInspeccionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIÓN MODIFICACIÓN Y BORRADO");

        btnModificacionYBorradoInspector.setBackground(new java.awt.Color(0, 51, 153));
        btnModificacionYBorradoInspector.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificacionYBorradoInspector.setForeground(new java.awt.Color(255, 255, 255));
        btnModificacionYBorradoInspector.setText("INSPECTOR");
        btnModificacionYBorradoInspector.setFocusPainted(false);
        btnModificacionYBorradoInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionYBorradoInspectorActionPerformed(evt);
            }
        });

        btnModificacionYBorradoPropietario.setBackground(new java.awt.Color(0, 51, 153));
        btnModificacionYBorradoPropietario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificacionYBorradoPropietario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificacionYBorradoPropietario.setText("PROPIETARIO");
        btnModificacionYBorradoPropietario.setFocusPainted(false);
        btnModificacionYBorradoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionYBorradoPropietarioActionPerformed(evt);
            }
        });

        btnModificacionYBorradoAuto.setBackground(new java.awt.Color(0, 51, 153));
        btnModificacionYBorradoAuto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificacionYBorradoAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificacionYBorradoAuto.setText("AUTO");
        btnModificacionYBorradoAuto.setFocusPainted(false);
        btnModificacionYBorradoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionYBorradoAutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificacionYBorradoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificacionYBorradoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificacionYBorradoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(btnModificacionYBorradoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificacionYBorradoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnModificacionYBorradoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
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

    private void btnInspeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInspeccionActionPerformed

    }//GEN-LAST:event_btnInspeccionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnModificacionYBorradoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionYBorradoPropietarioActionPerformed
        ConsultaPropietario consuPropietario = new ConsultaPropietario();
        consuPropietario.setVisible(true);
        consuPropietario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModificacionYBorradoPropietarioActionPerformed

    private void btnModificacionYBorradoInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionYBorradoInspectorActionPerformed
        ConsultaInspector consuInspector = new ConsultaInspector();
        consuInspector.setVisible(true);
        consuInspector.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModificacionYBorradoInspectorActionPerformed

    private void btnModificacionYBorradoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionYBorradoAutoActionPerformed
                ConsultaAuto consuAuto = new ConsultaAuto();
        consuAuto.setVisible(true);
        consuAuto.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModificacionYBorradoAutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInspeccion;
    private javax.swing.JButton btnModificacionYBorradoAuto;
    private javax.swing.JButton btnModificacionYBorradoInspector;
    private javax.swing.JButton btnModificacionYBorradoPropietario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
      
      DefaultTableModel modeloTabla = new DefaultTableModel(){
          
          @Override
          public boolean isCellEditable(int row, int column){
              return false;
          }
      }; 
      
      String titulos[] = {"id", "nombre", "apellido", "DNI"};
      modeloTabla.setColumnIdentifiers(titulos);
    }
}
