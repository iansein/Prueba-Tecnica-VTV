
package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Inspector;


/**
 *
 * @author Ian
 */
public class ConsultaInspector extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public ConsultaInspector() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInspectores = new javax.swing.JTable();
        btnEliminarInspector = new javax.swing.JButton();
        btnModificarInspector = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(3, 88, 140));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BORRAR Y MODIFICAR INSPECTOR");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaInspectores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaInspectores);

        btnEliminarInspector.setBackground(new java.awt.Color(102, 0, 0));
        btnEliminarInspector.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminarInspector.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarInspector.setText("ELIMINAR");
        btnEliminarInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInspectorActionPerformed(evt);
            }
        });

        btnModificarInspector.setBackground(new java.awt.Color(0, 102, 0));
        btnModificarInspector.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarInspector.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarInspector.setText("MODIFICAR");
        btnModificarInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarInspectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnEliminarInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarInspector, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInspectorActionPerformed
        if(tablaInspectores.getRowCount() > 0){
            if(tablaInspectores.getSelectedRow() != -1){

                int idInspector = Integer.parseInt(String.valueOf(tablaInspectores.getValueAt(tablaInspectores.getSelectedRow(), 0)));
                control.borrarInspector(idInspector);

                mostrarMensaje("Se ha eliminado al inspector exitosamente", "Info", "Éxito al eliminar");

                cargarTabla();

            }
            else{
                mostrarMensaje("No se ha seleccionado un registro", "Error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("No se puede eliminar, la tabla esta vacía", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarInspectorActionPerformed

    private void btnModificarInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarInspectorActionPerformed

        if(tablaInspectores.getRowCount() > 0){
            if(tablaInspectores.getSelectedRow() != -1){
                int idInspector = Integer.parseInt(String.valueOf(tablaInspectores.getValueAt(tablaInspectores.getSelectedRow(), 0)));

                ModificarInspector modificar = new ModificarInspector(idInspector);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);

            }
            else{
                mostrarMensaje("No se ha seleccionado un registro", "ERROR", "Error al modificar");
            }
        }
        else{
            mostrarMensaje("No se puede modificar, la tabla esta vacía", "ERROR", "Error al modificar");
        }

    }//GEN-LAST:event_btnModificarInspectorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){

             @Override
             public boolean isCellEditable(int row, int column){
                 return false;
             }
         }; 
      
      String titulos[] = {"Id", "Nombre", "Apellido", "DNI", "Nro Inspector", "Telefono"};
      modeloTabla.setColumnIdentifiers(titulos);
      
      List<Inspector> listaInspectores = control.traerInspectores();
      
      if(listaInspectores != null){
          for(Inspector inspector: listaInspectores){
              Object[] objeto = {inspector.getId(), inspector.getNombre(), inspector.getApellido(), 
                  inspector.getDni(), inspector.getTelefono(), inspector.getNroInspector()};
              
              modeloTabla.addRow(objeto);
          }
      }
      
      
      tablaInspectores.setModel(modeloTabla);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarInspector;
    private javax.swing.JButton btnModificarInspector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInspectores;
    // End of variables declaration//GEN-END:variables
    

}
