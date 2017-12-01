/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos.UI;
import basedatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Marie
 */
public class TipoRegimenPensionario extends javax.swing.JFrame {
    char flag = '_';
    /**
     * Creates new form TipoRegimenPensionario
     */
    public TipoRegimenPensionario() {
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

        jLabel2 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        reactivar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        codigo = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        adicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        descripcion = new javax.swing.JTextField();
        inactivar = new javax.swing.JButton();
        codigoafp = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Codigo AFP:");

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        reactivar.setText("Reactivar");
        reactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reactivarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado Registro:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Codigo AFP", "Descripcion", "Estado de registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("Descripcion:");

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo:");

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });

        inactivar.setText("Inactivar");
        inactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivarActionPerformed(evt);
            }
        });

        codigoafp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(estado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(codigoafp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoafp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionar)
                    .addComponent(modificar)
                    .addComponent(eliminar)
                    .addComponent(cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inactivar)
                    .addComponent(reactivar)
                    .addComponent(actualizar)
                    .addComponent(salir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        flag = 'e';
        int row = jTable1.getSelectedRow();
        codigo.setText(jTable1.getValueAt(row, 0) + "");
        codigo.setEditable(false);

        descripcion.setText(jTable1.getValueAt(row, 2) + "");
        descripcion.setEditable(false);
        estado.setText(jTable1.getValueAt(row, 3) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void reactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reactivarActionPerformed
        flag = 'r';
        int row = jTable1.getSelectedRow();
        codigo.setText(jTable1.getValueAt(row, 0) + "");
        codigo.setEditable(false);
;
        descripcion.setText(jTable1.getValueAt(row, 2) + "");
        descripcion.setEditable(false);
        estado.setText(jTable1.getValueAt(row, 3) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_reactivarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        flag = 'c';
        codigo.setText("");

        descripcion.setText("");
        estado.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        try {
            PreparedStatement ps = Conexion.obtener().prepareStatement("START TRANSACTION;");
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch(flag)
        {
            case 'm':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `tipo_regimen_pensionario`"
                    + "SET `afp_AfpCod` = '"+ codigoafp.getText() +"', `TipRegPenDes` = '"
                    + descripcion.getText()+"', `TipRegPenEstReg` = '"+ estado.getText() +"'"
                    + "WHERE `tipo_regimen_pensionario`.`TipRegPenCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'e':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `tipo_regimen_pensionario`"
                    + "SET `TipRegPenEstReg` = '*' "
                    + "WHERE `tipo_regimen_pensionario`.`TipRegPenCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'i':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `tipo_regimen_pensionarioo`"
                    + "SET `TipRegPenEstReg` = 'I' "
                    + "WHERE `tipo_regimen_pensionario`.`TipRegPenCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'r':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `tipo_regimen_pensionario`"
                    + "SET `TipRegPenEstReg` = 'A'"
                    + "WHERE `tipo_regimen_pensionario`.`TipRegPenCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'a':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("INSERT INTO `tipo_regimen_pensionario`"
                    + "(`TipRegPenCod`, `afp_AfpCod`, `TipRegPenDes`, `TipRegPenEstReg`)"
                    + "VALUES ('"+ codigo.getText() +"', '"+ codigoafp.getText()
                    +"','"+ descripcion.getText() +"', '"+ estado.getText() +"');");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            default:

        }
        try {
            String sql = "SELECT * FROM tipo_regimen_pensionario";
            Statement s = Conexion.obtener().createStatement();
            ResultSet rs = s.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"Codigo", "Codigo AFP","Descripcion", "Estado de registro"}, 0);
            while(rs.next())
            {
                String d = rs.getString("TipRegPenCod");
                String e = rs.getString("afp_AfpCod");
                String f = rs.getString("TipRegPenDes");
                String g = rs.getString("TipRegPenEstReg");
                model.addRow(new Object[]{d, e, f, g});
            }
            jTable1.setModel(model);
            codigo.setText("");
            
            descripcion.setText("");
            estado.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        }

        flag = '_';
    }//GEN-LAST:event_actualizarActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        flag = 'a';
        codigo.setText("");

        descripcion.setText("");
        estado.setText("A");
        codigo.setEditable(true);

        descripcion.setEditable(true);
    }//GEN-LAST:event_adicionarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        flag = 'm';
        int row = jTable1.getSelectedRow();
        codigo.setText(jTable1.getValueAt(row, 0) + "");
        //codigo.setEditable(false);

        descripcion.setText(jTable1.getValueAt(row, 2) + "");
        estado.setText(jTable1.getValueAt(row, 3) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_modificarActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void inactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivarActionPerformed
        flag = 'i';
        int row = jTable1.getSelectedRow();
        codigo.setText(jTable1.getValueAt(row, 0) + "");
        codigo.setEditable(false);

        descripcion.setText(jTable1.getValueAt(row, 2) + "");
        descripcion.setEditable(false);
        estado.setText(jTable1.getValueAt(row, 3) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_inactivarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TipoRegimenPensionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoRegimenPensionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoRegimenPensionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoRegimenPensionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TipoRegimenPensionario trp = new TipoRegimenPensionario();
                trp.setTitle("Tipo regimen pensionario");
                try {
                String sql = "SELECT * FROM tipo_regimen_pensionario";
                Statement s = Conexion.obtener().createStatement();
                ResultSet rs = s.executeQuery(sql);
                DefaultTableModel model = new DefaultTableModel(new String[]{"Codigo", "Codigo AFP","Descripcion", "Estado de registro"}, 0);
                while(rs.next())
                {
                    String d = rs.getString("TipRegPenCod");
                    String e = rs.getString("afp_AfpCod");
                    String f = rs.getString("TipRegPenDes");
                    String g = rs.getString("TipRegPenEstReg");;
                    model.addRow(new Object[]{d, e, f, g});
                }
                trp.jTable1.setModel(model);
                } catch (SQLException ex) {
                Logger.getLogger(NivelEducativo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(NivelEducativo.class.getName()).log(Level.SEVERE, null, ex);
                }
                trp.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> codigoafp;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField estado;
    private javax.swing.JButton inactivar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton reactivar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
