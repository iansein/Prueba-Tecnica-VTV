package igu;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Auto;
import logica.Controladora;
import logica.Inspeccion;
import logica.Inspector;
import logica.Medicion;
import logica.Oblea;
import logica.Observacion;
import logica.Validador;

/**
 *
 * @author Ian
 */
public class AltaInspeccion extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Auto autoSeleccionado;
    Inspector inspectorSeleccionado;
    Inspeccion inspeccion = new Inspeccion();

    public AltaInspeccion() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNroInspeccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarInspeccion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiarInspeccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInspectores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbPatente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbSuspension = new javax.swing.JComboBox<>();
        cbVidrios = new javax.swing.JComboBox<>();
        cbEspejos = new javax.swing.JComboBox<>();
        cbEmergencia = new javax.swing.JComboBox<>();
        cbSeguridad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbSistemaDeFrenos = new javax.swing.JComboBox<>();
        cbLuces = new javax.swing.JComboBox<>();
        cbTrenDelantero = new javax.swing.JComboBox<>();
        cbDireccion = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cbContaminacionAmbiental = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbExento = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cbChasis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(3, 88, 140));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nro inspección");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTA INSPECCIÓN");
        jLabel1.setAlignmentY(0.0F);

        btnAgregarInspeccion.setBackground(new java.awt.Color(51, 102, 0));
        btnAgregarInspeccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregarInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarInspeccion.setText("AGREGAR");
        btnAgregarInspeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInspeccionActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/certant-logo.png"))); // NOI18N

        btnLimpiarInspeccion.setBackground(new java.awt.Color(153, 102, 0));
        btnLimpiarInspeccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpiarInspeccion.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarInspeccion.setText("LIMPIAR");
        btnLimpiarInspeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarInspeccionActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
        jScrollPane2.setViewportView(tablaInspectores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Seleccione el inspector a cargo:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Seleccione el auto inspeccionado:");

        cbPatente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Luces");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Patente");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Espejos");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Vidrios");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Seguridad");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Emergencia");

        cbSuspension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        cbVidrios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        cbEspejos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        cbEmergencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));
        cbEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmergenciaActionPerformed(evt);
            }
        });

        cbSeguridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));
        cbSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeguridadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Seleccione las mediciones del vehículo:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Seleccione las observaciones del vehículo:");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Suspensión");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Dirección");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Tren delantero");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Sistema de frenos");

        cbSistemaDeFrenos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        cbLuces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        cbTrenDelantero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        cbDireccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Contaminación ambiental");

        cbContaminacionAmbiental.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha");

        txtFecha.setText("dd/mm/yyyy");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Exento de pago");

        cbExento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Chasis");

        cbChasis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apta", "Condicional", "Rechazada" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel11))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbExento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cbLuces, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbEspejos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbPatente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cbEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel13)
                                                            .addComponent(jLabel12))
                                                        .addGap(30, 30, 30)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(cbSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cbVidrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNroInspeccion)
                                                .addGap(343, 343, 343)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel17)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(cbTrenDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbSuspension, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel20))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbContaminacionAmbiental, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbSistemaDeFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)))
                                        .addGap(0, 10, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLimpiarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(cbTrenDelantero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSistemaDeFrenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSuspension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(cbContaminacionAmbiental, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(cbVidrios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbChasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbLuces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(cbSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbEspejos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(cbEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNroInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(cbExento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiarInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeguridadActionPerformed

    private void cbEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmergenciaActionPerformed

    private void btnLimpiarInspeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarInspeccionActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarInspeccionActionPerformed

    private void btnAgregarInspeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInspeccionActionPerformed
        String fecha = txtFecha.getText();
        String nroInspeccionTxt = txtNroInspeccion.getText();

        if (!validarCampos(fecha, nroInspeccionTxt)) {
            return;
        }

        if (tablaInspectores.getRowCount() > 0) {
            if (tablaInspectores.getSelectedRow() != -1) {

                int idInspector = Integer.parseInt(String.valueOf(tablaInspectores.getValueAt(tablaInspectores.getSelectedRow(), 0)));
                inspectorSeleccionado = control.traerInspector(idInspector);
            } else {
                mostrarMensaje("No se ha seleccionado al inspector a cargo", "Error", "Error al agregar");
                return;
            }
        } else {
            mostrarMensaje("No se puede agregar, la tabla esta de Inspectores esta vacía", "Error", "Error al agregar");
            return;
        }

        if (tablaAutos.getRowCount() > 0) {
            if (tablaAutos.getSelectedRow() != -1) {

                int idAuto = Integer.parseInt(String.valueOf(tablaAutos.getValueAt(tablaAutos.getSelectedRow(), 0)));
                autoSeleccionado = control.traerAuto(idAuto);
            } else {
                mostrarMensaje("No se ha seleccionado al auto inspeccionado", "Error", "Error al agregar");
                return;
            }
        } else {
            mostrarMensaje("No se puede agregar, la tabla esta de Autos esta vacía", "Error", "Error al agregar");
            return;
        }

        try {
            Date fechaParseada;
            try {
                fechaParseada = Validador.formatearFecha(fecha);
                System.out.println("Fecha obtenida: " + fecha);
            } catch (ParseException ex) {
                mostrarMensaje("Fecha inválida", "Error", "Error al agregar");
                return;
            }

            Observacion observacion = crearObservacion();
            Medicion medicion = crearMedicion();
            boolean exentoBool = obtenerExento();
            int nroInspeccion = Integer.parseInt(nroInspeccionTxt);
            String estado = determinarEstadoVehiculo();

            inspeccion.setFechaInspeccion(fechaParseada);
            inspeccion.setExento(exentoBool);
            inspeccion.setNumeroInspeccion(nroInspeccion);
            inspeccion.setEstadoInspeccion(estado);
            inspeccion.setAutoInspeccionado(autoSeleccionado);
            inspeccion.setInspector(inspectorSeleccionado);

            if (estado.equals("Apto")) {
                Date fechaVencimiento = Validador.formatearFechaVencimiento(fechaParseada);
                Oblea oblea = new Oblea();
                oblea.setFechaEmision(fechaParseada);
                oblea.setFechaVencimiento(fechaVencimiento);
                oblea.setAuto(autoSeleccionado);
                autoSeleccionado.setOblea(oblea);
                control.modificarAuto(autoSeleccionado);
            }

            medicion.setInspeccion(inspeccion);
            observacion.setInspeccion(inspeccion);

            control.agregarInspeccion(inspeccion);
            control.agregarMedicion(medicion);
            control.agregarObservacion(observacion);

            mostrarMensaje("Se agrego una inspección exitosamente", "Info", "Éxito al agregar");
            cargarTablaAutos();
            limpiarCampos();
        } catch (Exception ex) {
            mostrarMensaje("Hubo un error al agregar", "Error", "Error al agregar");
        }
    }//GEN-LAST:event_btnAgregarInspeccionActionPerformed

    public void limpiarCampos() {
        txtNroInspeccion.setText("");
        txtFecha.setText("dd/MM/yyyy");
    }

    private boolean validarCampos(String fecha, String nroInspeccionTxt) {
        if (!Validador.esTextoNoVacio(fecha) || !Validador.esTextoNoVacio(nroInspeccionTxt)) {
            mostrarMensaje("Complete todos los campos.", "Error", "Error al agregar");
            return false;
        }

        if (!Validador.esNumero(nroInspeccionTxt)) {
            mostrarMensaje("Ingrese un número de inspección válido.", "Error", "Error al agregar");
            return false;
        }

        return true;
    }

    private Observacion crearObservacion() {
        String observacionEstadoChasis = (String) cbChasis.getSelectedItem();
        String observacionEstadoPatente = (String) cbPatente.getSelectedItem();
        String observacionEstadoLuces = (String) cbLuces.getSelectedItem();
        String observacionEstadoEspejos = (String) cbEspejos.getSelectedItem();
        String observacionEstadoVidrios = (String) cbVidrios.getSelectedItem();
        String observacionEstadoSeguridad = (String) cbSeguridad.getSelectedItem();
        String observacionEstadoEmergencia = (String) cbEmergencia.getSelectedItem();

        Observacion observacion = new Observacion();
        observacion.setPatente(observacionEstadoPatente);
        observacion.setEspejos(observacionEstadoEspejos);
        observacion.setLuces(observacionEstadoLuces);
        observacion.setVidrios(observacionEstadoVidrios);
        observacion.setSeguridad(observacionEstadoSeguridad);
        observacion.setEmergencia(observacionEstadoEmergencia);
        observacion.setChasis(observacionEstadoChasis);
        observacion.setInspeccion(inspeccion);

        return observacion;
    }

    private Medicion crearMedicion() {
        String medicionEstadoTrenDelantero = (String) cbTrenDelantero.getSelectedItem();
        String medicionEstadoSuspension = (String) cbSuspension.getSelectedItem();
        String medicionEstadoDireccion = (String) cbDireccion.getSelectedItem();
        String medicionEstadoSistemaDeFrenos = (String) cbSistemaDeFrenos.getSelectedItem();
        String medicionEstadoContaminacion = (String) cbContaminacionAmbiental.getSelectedItem();

        Medicion medicion = new Medicion();
        medicion.setTrenDelantero(medicionEstadoTrenDelantero);
        medicion.setSuspension(medicionEstadoSuspension);
        medicion.setDireccion(medicionEstadoDireccion);
        medicion.setSistemaDeFrenos(medicionEstadoSistemaDeFrenos);
        medicion.setContaminacionAmbiental(medicionEstadoContaminacion);

        medicion.setInspeccion(inspeccion);

        return medicion;
    }

    private boolean obtenerExento() {
        String exento = (String) cbExento.getSelectedItem();
        return exento.equals("Si");
    }

    public String determinarEstadoVehiculo() {
        String medicionEstadoTrenDelantero = (String) cbTrenDelantero.getSelectedItem();
        String medicionEstadoSuspension = (String) cbSuspension.getSelectedItem();
        String medicionEstadoDireccion = (String) cbDireccion.getSelectedItem();
        String medicionEstadoSistemaDeFrenos = (String) cbSistemaDeFrenos.getSelectedItem();
        String medicionEstadoContaminacion = (String) cbContaminacionAmbiental.getSelectedItem();
        String observacionEstadoPatente = (String) cbPatente.getSelectedItem();
        String observacionEstadoLuces = (String) cbLuces.getSelectedItem();
        String observacionEstadoEspejos = (String) cbEspejos.getSelectedItem();
        String observacionEstadoVidrios = (String) cbVidrios.getSelectedItem();
        String observacionEstadoSeguridad = (String) cbSeguridad.getSelectedItem();
        String observacionEstadoEmergencia = (String) cbEmergencia.getSelectedItem();

        boolean hayObservacionRechazada = Stream.of(observacionEstadoPatente, observacionEstadoLuces, observacionEstadoEspejos,
                observacionEstadoVidrios, observacionEstadoSeguridad, observacionEstadoEmergencia)
                .anyMatch(obs -> obs.equals("Rechazada"));

        boolean hayMedicionRechazada = Stream.of(medicionEstadoTrenDelantero, medicionEstadoSuspension,
                medicionEstadoDireccion, medicionEstadoSistemaDeFrenos, medicionEstadoContaminacion)
                .anyMatch(med -> med.equals("Rechazada"));

        if (hayObservacionRechazada || hayMedicionRechazada) {
            return "Rechazado";
        }

        boolean hayObservacionCondicional = Stream.of(observacionEstadoPatente, observacionEstadoLuces, observacionEstadoEspejos,
                observacionEstadoVidrios, observacionEstadoSeguridad, observacionEstadoEmergencia)
                .anyMatch(obs -> obs.equals("Condicional"));

        boolean hayMedicionCondicional = Stream.of(medicionEstadoTrenDelantero, medicionEstadoSuspension,
                medicionEstadoDireccion, medicionEstadoSistemaDeFrenos, medicionEstadoContaminacion)
                .anyMatch(med -> med.equals("Condicional"));

        if (hayObservacionCondicional || hayMedicionCondicional) {
            return "Condicional";
        }

        return "Apto";
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaInspectores();
        cargarTablaAutos();
    }//GEN-LAST:event_formWindowOpened

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void cargarTablaInspectores() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Id", "Nombre", "Apellido", "DNI", "Nro Inspector", "Telefono"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Inspector> listaInspectores = control.traerInspectores();

        if (listaInspectores != null) {
            for (Inspector inspector : listaInspectores) {
                Object[] objeto = {inspector.getId(), inspector.getNombre(), inspector.getApellido(),
                    inspector.getDni(), inspector.getTelefono(), inspector.getNroInspector()};

                modeloTabla.addRow(objeto);
            }
        }

        tablaInspectores.setModel(modeloTabla);

    }

    private void cargarTablaAutos() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Id", "Dominio", "Marca", "Modelo", "Nombre Propietario"};
        modeloTabla.setColumnIdentifiers(titulos);

        List<Auto> listaAutos = control.traerAutosSinObleas();

        if (listaAutos != null) {
            for (Auto auto : listaAutos) {
                Object[] objeto = {auto.getId(), auto.getDominio(), auto.getMarca(), auto.getModelo(), auto.getPropietario().getNombre()};
                modeloTabla.addRow(objeto);
            }
        }

        tablaAutos.setModel(modeloTabla);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarInspeccion;
    private javax.swing.JButton btnLimpiarInspeccion;
    private javax.swing.JComboBox<String> cbChasis;
    private javax.swing.JComboBox<String> cbContaminacionAmbiental;
    private javax.swing.JComboBox<String> cbDireccion;
    private javax.swing.JComboBox<String> cbEmergencia;
    private javax.swing.JComboBox<String> cbEspejos;
    private javax.swing.JComboBox<String> cbExento;
    private javax.swing.JComboBox<String> cbLuces;
    private javax.swing.JComboBox<String> cbPatente;
    private javax.swing.JComboBox<String> cbSeguridad;
    private javax.swing.JComboBox<String> cbSistemaDeFrenos;
    private javax.swing.JComboBox<String> cbSuspension;
    private javax.swing.JComboBox<String> cbTrenDelantero;
    private javax.swing.JComboBox<String> cbVidrios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAutos;
    private javax.swing.JTable tablaInspectores;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNroInspeccion;
    // End of variables declaration//GEN-END:variables
}
