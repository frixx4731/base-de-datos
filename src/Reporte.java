
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author frix4
 */
public class Reporte extends javax.swing.JFrame {

    private Connection cn;
public Reporte(Connection conexion) {
        initComponents();
        this.cn = conexion;
        mostrarDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablareport = new javax.swing.JTable();
        btninsert = new javax.swing.JButton();
        btneliminados = new javax.swing.JButton();
        btnActualizados = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        tablareport.setBackground(new java.awt.Color(0, 255, 204));
        tablareport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Acción", "Fecha y hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablareport);

        btninsert.setText("Insertados");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btneliminados.setText("Eliminados");
        btneliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminadosActionPerformed(evt);
            }
        });

        btnActualizados.setText("Actualizados");
        btnActualizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizadosActionPerformed(evt);
            }
        });

        btnmenu.setText("Inicio");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btneliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnActualizados)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert)
                    .addComponent(btneliminados)
                    .addComponent(btnActualizados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmenu)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
       mostrarDatos();
    }//GEN-LAST:event_btninsertActionPerformed

    private void btneliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminadosActionPerformed
        mostrarDatoseli();
    }//GEN-LAST:event_btneliminadosActionPerformed

    private void btnActualizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizadosActionPerformed
        mostrarDatosact();
    }//GEN-LAST:event_btnActualizadosActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        BDD rep= new  BDD("root", "123456");
        rep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnmenuActionPerformed

    private void mostrarDatos() {
// Formando el modelo o los encabezados de la tabla
DefaultTableModel modelo = new DefaultTableModel();
modelo.addColumn("ID");
modelo.addColumn("Accion");
modelo.addColumn("Fecha y Hora");
tablareport.setModel(modelo);
String consulta = "SELECT * FROM inegi2020.insertados; ";
String data[]= new String[5];
Statement st;
try{
st = cn.createStatement();
ResultSet rs = st.executeQuery(consulta);
while(rs.next()){
data[0] = rs.getString(1);
data[1] = rs.getString(2);
data[2] = rs.getString(3);
modelo.addRow(data);
}
}catch(SQLException e){
System.out.println("Error al mostrar los datos de la BD");
}
}
    private void mostrarDatoseli() {
// Formando el modelo o los encabezados de la tabla
DefaultTableModel modelo = new DefaultTableModel();
modelo.addColumn("ID");
modelo.addColumn("Accion");
modelo.addColumn("Fecha y Hora");
tablareport.setModel(modelo);
String consulta = "SELECT * FROM inegi2020.eliminados; ";
String data[]= new String[5];
Statement st;
try{
st = cn.createStatement();
ResultSet rs = st.executeQuery(consulta);
while(rs.next()){
data[0] = rs.getString(1);
data[1] = rs.getString(2);
data[2] = rs.getString(3);
modelo.addRow(data);
}
}catch(SQLException e){
System.out.println("Error al mostrar los datos de la BD");
}
}
    private void mostrarDatosact() {
// Formando el modelo o los encabezados de la tabla
DefaultTableModel modelo = new DefaultTableModel();
modelo.addColumn("ID");
modelo.addColumn("Accion");
modelo.addColumn("Fecha y Hora");
tablareport.setModel(modelo);
String consulta = "SELECT * FROM inegi2020.actualizaciones; ";
String data[]= new String[5];
Statement st;
try{
st = cn.createStatement();
ResultSet rs = st.executeQuery(consulta);
while(rs.next()){
data[0] = rs.getString(1);
data[1] = rs.getString(2);
data[2] = rs.getString(3);
modelo.addRow(data);
}
}catch(SQLException e){
System.out.println("Error al mostrar los datos de la BD");
}
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizados;
    private javax.swing.JButton btneliminados;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnmenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablareport;
    // End of variables declaration//GEN-END:variables
}
