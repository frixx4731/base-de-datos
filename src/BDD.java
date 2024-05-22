
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class BDD extends javax.swing.JFrame {
private Connection cn;
    private int fila = 0;

    public BDD(String usuario, String contrasena) {
        initComponents();
        Conexion con = new Conexion();
        cn = con.obtenerConexion(usuario, contrasena);
        if (cn != null) {
            setLocationRelativeTo(null);
            mostrarDatos();
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos.");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablacompleto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtprimero = new javax.swing.JTextField();
        txtsegundo = new javax.swing.JTextField();
        btnInsertar = new javax.swing.JToggleButton();
        btnActualiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btntrigger = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablacompleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Nombre"
            }
        ));
        Tablacompleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablacompletoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablacompleto);

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("INEGI2020"));

        txtprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprimeroActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(0, 153, 51), new java.awt.Color(153, 102, 255), new java.awt.Color(0, 204, 204)));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnActualiar.setText("Actualizar");
        btnActualiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btncancelar.setText("Limpiar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID ENTIDAD");

        jLabel2.setText("ENTIDADES");

        btntrigger.setText("Trigger");
        btntrigger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntriggerActionPerformed(evt);
            }
        });

        jButton1.setText("Consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("consulta 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(txtprimero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(txtsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btntrigger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualiar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btntrigger)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsertar)
                        .addComponent(btnActualiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btncancelar))
                    .addComponent(txtprimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir))
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprimeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprimeroActionPerformed

    private void TablacompletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablacompletoMouseClicked
        fila = Tablacompleto.getSelectedRow();
        txtprimero.setText(Tablacompleto.getValueAt(fila,0).toString());
        txtsegundo.setText(Tablacompleto.getValueAt(fila,1).toString());
    }//GEN-LAST:event_TablacompletoMouseClicked

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        try{
        PreparedStatement ps = cn.prepareStatement("call inegi2020.Insertar(?,?)");
        ps.setString(1, txtprimero.getText());
        ps.setString(2, txtsegundo.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Datos guardados correctamente.");
        mostrarDatos();
        limpiarCampos();
        }catch(SQLException e){
        System.out.println("Error al insertar los productos en la BD");
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (fila > 0) {
        if (JOptionPane.showConfirmDialog(null, "Está seguro de eliminar el registro?",
        "Eliminar Producto", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
        int identidad = Integer.parseInt(Tablacompleto.getValueAt(fila, 0).toString());
        try {
        PreparedStatement ps = cn.prepareStatement("call inegi2020.Eliminar(?);");
        ps.setInt(1, identidad);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente.");
        mostrarDatos();
        limpiarCampos();
        } catch (SQLException e) {
        System.out.println("Error al eliminar el producto en la BD " + e);
        }
        } else {
        JOptionPane.showMessageDialog(null, "Registro No Eliminado.");
        }
        } else {
        JOptionPane.showMessageDialog(null, "Seleccione un registro.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiarActionPerformed
        if (fila > 0) {
        try {
        int id = Integer.parseInt(Tablacompleto.getValueAt(fila, 0).toString());
        PreparedStatement ps = cn.prepareStatement("call inegi2020.Actualizar(?,?);");
        ps.setString(1, txtprimero.getText());
        ps.setString(2, txtsegundo.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
        mostrarDatos();
        limpiarCampos();
        } catch (SQLException e) {
        System.out.println("Error al actualizar las entidades en la BD " + e);
        }
        } else {
        JOptionPane.showMessageDialog(null, "Seleccione un registro.");
        }
    }//GEN-LAST:event_btnActualiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (fila > 0) {
        try {
        int id = Integer.parseInt(Tablacompleto.getValueAt(fila, 0).toString());
        PreparedStatement ps = cn.prepareStatement("call inegi2020.save_procedure(?,?);");
        ps.setString(1, txtprimero.getText());
        ps.setString(2, txtsegundo.getText());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Datos Guardados correctamente.");
        mostrarDatos();
        limpiarCampos();
        } catch (SQLException e) {
        System.out.println("Error al Guardar las entidades en la BD " + e);
        }
        } else {
        JOptionPane.showMessageDialog(null, "Seleccione un registro.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btntriggerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntriggerActionPerformed
        Reporte rep= new  Reporte(cn);
        rep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntriggerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try {
        int idEntidad = Integer.parseInt(txtprimero.getText()); // Obtener el ID de la entidad desde el campo de texto
        PreparedStatement ps = cn.prepareStatement("SELECT obtenerMunicipios(?) AS municipios;");
        ps.setInt(1, idEntidad);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            String municipios = rs.getString("municipios");
            if (municipios == null || municipios.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron municipios para el ID de la entidad: " + idEntidad);
            } else {
                String[] listaMunicipios = municipios.split(","); // Asumiendo que los municipios están separados por comas
                StringBuilder sb = new StringBuilder("Municipios:\n");
                for (String municipio : listaMunicipios) {
                    sb.append("- ").append(municipio.trim()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron municipios para el ID de la entidad: " + idEntidad);
        }
        
        mostrarDatos();
    } catch (SQLException e) {
        System.out.println("No se encontraron municipios en la BD: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de entidad válido.");
    } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
        int idMunicipio = Integer.parseInt(txtprimero.getText()); // Obtener el ID del municipio desde el campo de texto
        PreparedStatement ps = cn.prepareStatement("SELECT obtenerLocalidades(?) AS localidades;");
        ps.setInt(1, idMunicipio);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            String localidades = rs.getString("localidades");
            if (localidades == null || localidades.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron localidades para el ID del municipio: " + idMunicipio);
            } else {
                String[] listaLocalidades = localidades.split(","); // Asumiendo que las localidades están separadas por comas
                StringBuilder sb = new StringBuilder("Localidades:\n");
                for (String localidad : listaLocalidades) {
                    sb.append("- ").append(localidad.trim()).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron localidades para el ID del municipio: " + idMunicipio);
        }
        
        mostrarDatos(); // Suponiendo que mostrarDatos es un método para actualizar la interfaz
        limpiarCampos(); // Suponiendo que limpiarCampos es un método para limpiar los campos de entrada
    } catch (SQLException e) {
        System.out.println("No se encontraron localidades en la BD: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de municipio válido.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed
        private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Entidad");
        Tablacompleto.setModel(modelo);
        String consulta = "SELECT * FROM entidades";
        String data[] = new String[2];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los datos de la BD: " + e.getMessage());
        }
    }
        private void limpiarCampos() {
        txtprimero.setText("");
        txtsegundo.setText("");

        }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablacompleto;
    private javax.swing.JButton btnActualiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnInsertar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btntrigger;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtprimero;
    private javax.swing.JTextField txtsegundo;
    // End of variables declaration//GEN-END:variables
}
