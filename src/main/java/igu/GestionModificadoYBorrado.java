/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ian
 */
public class GestionModificadoYBorrado extends javax.swing.JFrame {

    /**
     * Creates new form GestionModificadoYBorrado
     */
    public GestionModificadoYBorrado() {
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

        jLabel1 = new javax.swing.JLabel();
        btnModificacionYBorradoAuto = new javax.swing.JButton();
        btnModificacionYBorradoPropietario = new javax.swing.JButton();
        btnModificacionYBorradoInspector = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("GESTION MODIFICACION Y BORRADO");

        btnModificacionYBorradoAuto.setText("AUTO");
        btnModificacionYBorradoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionYBorradoAutoActionPerformed(evt);
            }
        });

        btnModificacionYBorradoPropietario.setText("PROPIETARIO");
        btnModificacionYBorradoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionYBorradoPropietarioActionPerformed(evt);
            }
        });

        btnModificacionYBorradoInspector.setText("INSPECTOR");
        btnModificacionYBorradoInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionYBorradoInspectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificacionYBorradoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificacionYBorradoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificacionYBorradoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(405, 405, 405))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnModificacionYBorradoPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificacionYBorradoInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificacionYBorradoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificacionYBorradoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionYBorradoAutoActionPerformed
        ConsultaAuto consuAuto = new ConsultaAuto();
        consuAuto.setVisible(true);
        consuAuto.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModificacionYBorradoAutoActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificacionYBorradoAuto;
    private javax.swing.JButton btnModificacionYBorradoInspector;
    private javax.swing.JButton btnModificacionYBorradoPropietario;
    private javax.swing.JLabel jLabel1;
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