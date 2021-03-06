/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Perfil;
import gdm.entidades.clases.Usuario;
import java.awt.Cursor;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import negocio.Clases.UsuarioNegocio;


/**
 *
 * @author Chuy
 */
public class JPanelUsuarios extends javax.swing.JPanel {
    /**
     * Creates new form UsuariosJPanel
     */
    private List<Usuario> usuarios;   
      
    public JPanelUsuarios() {
        initComponents();       
        cargarUsuarios();       
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(248, 255, 255));
        setMaximumSize(new java.awt.Dimension(1190, 650));
        setMinimumSize(new java.awt.Dimension(1190, 650));
        setPreferredSize(new java.awt.Dimension(1190, 650));

        tblUsuarios.getTableHeader().setFont(new java.awt.Font("Euphemia", 0, 18));
        tblUsuarios.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre", "Login", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblUsuarios.setRowHeight(23);
        tblUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblUsuarios);
        tblUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setMinWidth(0);
            tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblUsuarios.getColumnModel().getColumn(0).setMaxWidth(0);
            tblUsuarios.getColumnModel().getColumn(1).setMinWidth(320);
            tblUsuarios.getColumnModel().getColumn(1).setPreferredWidth(320);
            tblUsuarios.getColumnModel().getColumn(1).setMaxWidth(320);
            tblUsuarios.getColumnModel().getColumn(2).setMinWidth(270);
            tblUsuarios.getColumnModel().getColumn(2).setPreferredWidth(270);
            tblUsuarios.getColumnModel().getColumn(2).setMaxWidth(270);
            tblUsuarios.getColumnModel().getColumn(3).setMinWidth(220);
            tblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(220);
            tblUsuarios.getColumnModel().getColumn(3).setMaxWidth(220);
        }

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel1.setText("Usuarios");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar1.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar3.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar1.png"))); // NOI18N
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar2.png"))); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar3.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar1.png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar2.png"))); // NOI18N
        btnEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar3.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de Usuario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnAgregar)
                            .addGap(185, 185, 185)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(167, 167, 167)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(200, 200, 200))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(195, 195, 195)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
      try
      {   btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
          if(tblUsuarios.getSelectedRow()!= -1){
           int id = Integer.parseInt(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0).toString());
          
            
           JDialogAgregarUsuario agregar = new JDialogAgregarUsuario(null, true);
           
           //this.setVisible(true);
           agregar.id = id;
           agregar.editar=true;
           agregar.setVisible(true);
           if (agregar.DialogResult)
           {
               cargarUsuarios();
           }
           }else{
               JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                            , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloUsuario"), JOptionPane.INFORMATION_MESSAGE);
          }
       }   catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
   }finally{
          btnEditar.setCursor(Cursor.getDefaultCursor());
      }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
         try
      {
     
        btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));       
        JDialogAgregarUsuario usuario = new JDialogAgregarUsuario(null, true);      
        usuario.setVisible(true);
        if(usuario.DialogResult)
        {
            cargarUsuarios();
        }
      } 
           catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
       }finally{
           btnAgregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            
      }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
              try
      { 
          btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
          if(tblUsuarios.getSelectedRow()!= -1){
             
          int opcion = JOptionPane.showConfirmDialog(null, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("Eliminar"), ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloUsuario"), JOptionPane.YES_NO_OPTION);
          if(opcion==0){
                      int id = Integer.parseInt(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0).toString());
          if(UsuarioNegocio.Eliminar(id)){
              cargarUsuarios();
          }
                }
           
          
           }else{
               JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                            , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloUsuario"), JOptionPane.INFORMATION_MESSAGE);
          }
          
  
       }   catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
            }finally{
          btnEliminar.setCursor(Cursor.getDefaultCursor());
      }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            buscar();
        }catch(Exception ex)
        {
            Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }
        finally
        {
            this.setCursor(Cursor.getDefaultCursor());
        }   
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarUsuarios() {
          try
        { 
            usuarios = UsuarioNegocio.Listado();
            cargarTabla();
        }
        catch(Exception ex)
        {
            Program.logger.error(this, ex);
        }
        finally
        {
            this.setCursor(Cursor.getDefaultCursor());
        }
     }

    private void buscar() {
       try
        { 
            String nombre =txtNombre.getText().trim();
            usuarios = UsuarioNegocio.Buscar(nombre);
            cargarTabla();
        }
        catch(Exception ex)
        {
            Program.logger.error(this, ex);
        }
        finally
        {
            this.setCursor(Cursor.getDefaultCursor());
        }
    } 

    private void cargarTabla() {
        try{
        DefaultTableModel mod = (DefaultTableModel)tblUsuarios.getModel();
        mod.setRowCount(0);                 
        for(Usuario usuario : usuarios){
            int id = usuario.getId();
            String nombre = usuario.getNombre();
            String login = usuario.getLogin();
            Perfil perfil = usuario.getPerfil();
                 
            mod.addRow(new Object[] {id, nombre, login, perfil});
        }
        
        tblUsuarios.setModel(mod);
    }     catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
 }
    }
    }

    

