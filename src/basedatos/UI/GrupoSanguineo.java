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
public class GrupoSanguineo extends javax.swing.JFrame {
    char flag = '_';
    /**
     * Creates new form GrupoSanguineo
     */
    public GrupoSanguineo() {
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

        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        inactivar = new javax.swing.JButton();
        reactivar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        adicionar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        inactivar.setText("Inactivar");
        inactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactivarActionPerformed(evt);
            }
        });

        reactivar.setText("Reactivar");
        reactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reactivarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado de registro:");

        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Estado de registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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

        jLabel1.setText("Codigo:");

        jLabel2.setText("Descripcion:");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(descripcion)))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addGap(25, 25, 25))))
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
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionar)
                    .addComponent(modificar)
                    .addComponent(eliminar)
                    .addComponent(cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(inactivar)
                    .addComponent(reactivar)
                    .addComponent(actualizar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        flag = 'c';
        codigo.setText("");
        descripcion.setText("");
        estado.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void inactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactivarActionPerformed
        flag = 'i';
        int row = jTable1.getSelectedRow();
        codigo.setText(jTable1.getValueAt(row, 0) + "");
        codigo.setEditable(false);
        descripcion.setText(jTable1.getValueAt(row, 1) + "");
        descripcion.setEditable(false);
        estado.setText(jTable1.getValueAt(row, 2) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_inactivarActionPerformed

    private void reactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reactivarActionPerformed
        flag = 'r';
        int row = jTable1.getSelectedRow();
        codigo.setText(jTable1.getValueAt(row, 0) + "");
        codigo.setEditable(false);
        descripcion.setText(jTable1.getValueAt(row, 1) + "");
        descripcion.setEditable(false);
        estado.setText(jTable1.getValueAt(row, 2) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_reactivarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        try {
            PreparedStatement ps = Conexion.obtener().prepareStatement("START TRANSACTION;");
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch(flag)
        {
            case 'm':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `grupo_sanguineo`"
                    + "SET `GruSanDes` = '"+ descripcion.getText() +"', `GruSanEstReg` = '"+ estado.getText() +"'"
                    + "WHERE `grupo_sanguineo`.`GruSanCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'e':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `grupo_sanguineo`"
                    + "SET `GruSanEstReg` = '*' "
                    + "WHERE `grupo_sanguineo`.`GruSanCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'i':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `grupo_sanguineo`"
                    + "SET `GruSanEstReg` = 'I' "
                    + "WHERE `grupo_sanguineo`.`GruSanCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'r':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("UPDATE `grupo_sanguineo`"
                    + "SET `GruSanEstReg` = 'A'"
                    + "WHERE `tipo_trabajador`.`GruSanCod` = '"+ codigo.getText() +"'; ");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            case 'a':
            try {
                Statement s = Conexion.obtener().createStatement();
                PreparedStatement ps = Conexion.obtener().prepareStatement("INSERT INTO `grupo_sanguineo`"
                    + "(`GruSanCod`, `GruSanDes`, `GruSanEstReg`)"
                    + "VALUES ('"+ codigo.getText() +"', '"+ descripcion.getText() +"', '"+ estado.getText() +"');");
                ps.execute();
                ps = Conexion.obtener().prepareStatement("COMMIT;");
                ps.execute();
            } catch (SQLException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
            }
            default:

        }
        try {
            String sql = "SELECT * FROM grupo_sanguineo";
            Statement s = Conexion.obtener().createStatement();
            ResultSet rs = s.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"Codigo", "Descripcion", "Estado de registro"}, 0);
            while(rs.next())
            {
                String d = rs.getString("GruSanCod");
                String e = rs.getString("GruSanDes");
                String f = rs.getString("GruSanEstReg");
                model.addRow(new Object[]{d, e, f });
            }
            jTable1.setModel(model);
            codigo.setText("");
            descripcion.setText("");
            estado.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
        }

        flag = '_';

    }//GEN-LAST:event_actualizarActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

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
        codigo.setEditable(false);
        descripcion.setText(jTable1.getValueAt(row, 1) + "");
        estado.setText(jTable1.getValueAt(row, 2) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        flag = 'e';
        int row = jTable1.getSelectedRow();
        codigo.setText(jTable1.getValueAt(row, 0) + "");
        codigo.setEditable(false);
        descripcion.setText(jTable1.getValueAt(row, 1) + "");
        descripcion.setEditable(false);
        estado.setText(jTable1.getValueAt(row, 2) + "");
        estado.setEditable(false);
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GrupoSanguineo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrupoSanguineo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrupoSanguineo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrupoSanguineo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GrupoSanguineo grupoSanguineo = new GrupoSanguineo();
                grupoSanguineo.setTitle("Tipo de Trabajador");
                try {
                String sql = "SELECT * FROM grupo_sanguineo";
                Statement s = Conexion.obtener().createStatement();
                ResultSet rs = s.executeQuery(sql);
                DefaultTableModel model = new DefaultTableModel(new String[]{"Codigo", "Descripcion", "Estado de registro"}, 0);
                while(rs.next())
                {
                    String d = rs.getString("GruSanCod");
                    String e = rs.getString("GruSanDes");
                    String f = rs.getString("GruSanEstReg");
                    model.addRow(new Object[]{d, e, f });
                }
                grupoSanguineo.jTable1.setModel(model);
                } catch (SQLException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                Logger.getLogger(GrupoSanguineo.class.getName()).log(Level.SEVERE, null, ex);
                }
                grupoSanguineo.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton adicionar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField estado;
    private javax.swing.JButton inactivar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton reactivar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
