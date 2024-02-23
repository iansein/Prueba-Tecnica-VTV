package igu;
import igu.ListadoAutosAptos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


/**
 *
 * @author Ian
 */
public class GestionInformes extends javax.swing.JFrame {


    public GestionInformes() {
        initComponents();
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInspecciones = new javax.swing.JButton();
        btnAutosRechazados = new javax.swing.JButton();
        btnAutosPropietarios = new javax.swing.JButton();
        btnAutosCondicionales = new javax.swing.JButton();
        btnAutosAptos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 88, 140));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de INFORMES");
        jLabel1.setAlignmentY(0.0F);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/certant-logo.png"))); // NOI18N

        btnInspecciones.setBackground(new java.awt.Color(0, 51, 153));
        btnInspecciones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnInspecciones.setForeground(new java.awt.Color(255, 255, 255));
        btnInspecciones.setText("INSPECCIONES");
        btnInspecciones.setFocusPainted(false);
        btnInspecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInspeccionesActionPerformed(evt);
            }
        });

        btnAutosRechazados.setBackground(new java.awt.Color(0, 51, 153));
        btnAutosRechazados.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAutosRechazados.setForeground(new java.awt.Color(255, 255, 255));
        btnAutosRechazados.setText("AUTOS RECHAZADOS");
        btnAutosRechazados.setFocusPainted(false);
        btnAutosRechazados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutosRechazadosActionPerformed(evt);
            }
        });

        btnAutosPropietarios.setBackground(new java.awt.Color(0, 51, 153));
        btnAutosPropietarios.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAutosPropietarios.setForeground(new java.awt.Color(255, 255, 255));
        btnAutosPropietarios.setText("AUTOS PROPIETARIOS");
        btnAutosPropietarios.setFocusPainted(false);
        btnAutosPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutosPropietariosActionPerformed(evt);
            }
        });

        btnAutosCondicionales.setBackground(new java.awt.Color(0, 51, 153));
        btnAutosCondicionales.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAutosCondicionales.setForeground(new java.awt.Color(255, 255, 255));
        btnAutosCondicionales.setText("AUTOS CONDICIONALES");
        btnAutosCondicionales.setFocusPainted(false);
        btnAutosCondicionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutosCondicionalesActionPerformed(evt);
            }
        });

        btnAutosAptos.setBackground(new java.awt.Color(0, 51, 153));
        btnAutosAptos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAutosAptos.setForeground(new java.awt.Color(255, 255, 255));
        btnAutosAptos.setText("AUTOS APTOS");
        btnAutosAptos.setFocusPainted(false);
        btnAutosAptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutosAptosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAutosPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAutosCondicionales, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(btnInspecciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAutosRechazados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAutosAptos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(btnInspecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAutosAptos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAutosCondicionales, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAutosRechazados, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAutosPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInspeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInspeccionesActionPerformed
         ListadoInspecciones inspecciones = new ListadoInspecciones();
         inspecciones.setVisible(true);
        inspecciones.setLocationRelativeTo(null);
         inspecciones.setLocationRelativeTo(null);
          setEnabled(false); 
            inspecciones.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         }); 
    }//GEN-LAST:event_btnInspeccionesActionPerformed

    private void btnAutosRechazadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutosRechazadosActionPerformed
         ListadoAutosRechazados autosRechazados = new ListadoAutosRechazados();
         autosRechazados.setVisible(true);
        autosRechazados.setLocationRelativeTo(null);
         autosRechazados.setLocationRelativeTo(null);
          setEnabled(false); 
            autosRechazados.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         }); 
    }//GEN-LAST:event_btnAutosRechazadosActionPerformed

    private void btnAutosPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutosPropietariosActionPerformed
        GestionListadoPropietarios autosPropietarios = new GestionListadoPropietarios();
        autosPropietarios.setVisible(true);
        autosPropietarios.setLocationRelativeTo(null);
        autosPropietarios.setLocationRelativeTo(null);
          setEnabled(false); 
            autosPropietarios.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         }); 
    }//GEN-LAST:event_btnAutosPropietariosActionPerformed

    private void btnAutosCondicionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutosCondicionalesActionPerformed
        ListadoAutosCondicionales autosCondicionales = new ListadoAutosCondicionales();
        autosCondicionales.setVisible(true);
        autosCondicionales.setLocationRelativeTo(null);
        autosCondicionales.setLocationRelativeTo(null);
        setEnabled(false); 
        autosCondicionales.addWindowListener(new WindowAdapter() {
                @Override
            public void windowClosed(WindowEvent e) {
                setEnabled(true);
                toFront();
            }
         });  
    }//GEN-LAST:event_btnAutosCondicionalesActionPerformed

    private void btnAutosAptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutosAptosActionPerformed
        ListadoAutosAptos autosAptos = new ListadoAutosAptos();
         autosAptos.setVisible(true);
        autosAptos.setLocationRelativeTo(null);
         autosAptos.setLocationRelativeTo(null);
          setEnabled(false); 
            autosAptos.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setEnabled(true);
                    toFront();
                }
         });    
    }//GEN-LAST:event_btnAutosAptosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutosAptos;
    private javax.swing.JButton btnAutosCondicionales;
    private javax.swing.JButton btnAutosPropietarios;
    private javax.swing.JButton btnAutosRechazados;
    private javax.swing.JButton btnInspecciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
