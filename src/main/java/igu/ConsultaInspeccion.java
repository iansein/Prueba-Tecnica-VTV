package igu;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Auto;
import logica.Controladora;
import logica.Inspeccion;

/**
 *
 * @author Ian
 */
public class ConsultaInspeccion extends javax.swing.JFrame {
    Controladora control = new Controladora();
    
    public ConsultaInspeccion() {
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
        tablaInspecciones = new javax.swing.JTable();
        btnEliminarInspeccion = new javax.swing.JButton();
        btnModificarInspeccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(3, 88, 140));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BORRAR Y MODIFICAR INSPECCIÓN");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaInspecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaInspecciones);

        btnEliminarInspeccion.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminarInspeccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminarInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarInspeccion.setText("ELIMINAR");
        btnEliminarInspeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInspeccionActionPerformed(evt);
            }
        });

        btnModificarInspeccion.setBackground(new java.awt.Color(0, 102, 0));
        btnModificarInspeccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificarInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarInspeccion.setText("MODIFICAR");
        btnModificarInspeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarInspeccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarInspeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarInspeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(btnEliminarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void btnEliminarInspeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInspeccionActionPerformed
        if(tablaInspecciones.getRowCount() > 0){
            if(tablaInspecciones.getSelectedRow() != -1){

                int idInspeccion = Integer.parseInt(String.valueOf(tablaInspecciones.getValueAt(tablaInspecciones.getSelectedRow(), 0)));
                control.borrarInspeccion(idInspeccion);

                mostrarMensaje("Se ha eliminado la inspección exitosamente", "Info", "Éxito al eliminar");

                cargarTabla();
            }
            else{
                mostrarMensaje("No se ha seleccionado un registro", "Error", "Error al eliminar");
            }
        }
        else{
            mostrarMensaje("No se puede eliminar, la tabla esta vacía", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarInspeccionActionPerformed

    private void btnModificarInspeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarInspeccionActionPerformed

        if(tablaInspecciones.getRowCount() > 0){
            if(tablaInspecciones.getSelectedRow() != -1){
                int idInspeccion = Integer.parseInt(String.valueOf(tablaInspecciones.getValueAt(tablaInspecciones.getSelectedRow(), 0)));

                ModificarInspeccion modificar = new ModificarInspeccion(idInspeccion);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);
            }
            else{
                mostrarMensaje("No se ha seleccionado un registro", "Error", "Error al modificar");
            }
        }
        else{
            mostrarMensaje("No se puede modificar, la tabla esta vacía", "Error", "Error al modificar");
        }
    }//GEN-LAST:event_btnModificarInspeccionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened
    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){

             @Override
             public boolean isCellEditable(int row, int column){
                 return false;
             }
         }; 
      
      String titulos[] = {"Id", "Nro Inspección", "Fecha", "Estado", "Exento", "Inspector a cargo", "Dominio auto"};
      modeloTabla.setColumnIdentifiers(titulos);
      
      List<Inspeccion> listaInspecciones = control.traerInspecciones();
     
        if(listaInspecciones != null){
          for(Inspeccion inspeccion: listaInspecciones){
              System.out.println(inspeccion.getId());
              Auto autoInspeccionado = inspeccion.getAutoInspeccionado();
              String dominio = (autoInspeccionado != null) ? autoInspeccionado.getDominio() : "N/A";
              Object[] objeto = {
                  inspeccion.getId(),
                  inspeccion.getNumeroInspeccion(),
                  inspeccion.getFechaInspeccionFormateada(),
                  inspeccion.getEstadoInspeccion(),
                  inspeccion.isExento(),
                  inspeccion.getInspector().getNroInspector(),
                  dominio
              };
              System.out.println();
              modeloTabla.addRow(objeto);
          }
       }
       tablaInspecciones.setModel(modeloTabla);
    }    
    
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarInspeccion;
    private javax.swing.JButton btnModificarInspeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInspecciones;
    // End of variables declaration//GEN-END:variables
}
