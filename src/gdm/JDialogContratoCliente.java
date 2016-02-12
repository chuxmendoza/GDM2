/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Anticipo;
import gdm.entidades.clases.ContratoCliente;
import gdm.entidades.clases.Perfil;
import gdm.entidades.clases.Usuario;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Clases.ContratoClienteNegocio;
import org.apache.log4j.Logger;
import negocio.Clases.ContratoNegocio;

/**
 *
 * @author Chuy
 */
public class JDialogContratoCliente extends javax.swing.JDialog {

    /**
     * Creates new form JDialogContratoCliente
     */
    public JDialogContratoCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public int idContrato = 0;
    public int idCliente= 0;
    private List<ContratoCliente> contratos; 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContratos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        Abonar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        comboLiquidado = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setMaximumSize(new java.awt.Dimension(1134, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1134, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1134, 650));

        tblContratos.getTableHeader().setFont(new java.awt.Font("Euphemia", 0, 18));
        tblContratos.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        tblContratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Folio", "Nombre completo", "Modelo", "Triptico", "Reconocimiento", "Título", "Agradecimiento", "Dirigido a:", "Foto panorámica", "Foto personalizada", "Foto estudio", "Foto misa", "Material de anillos", "kilates", "Gramos", "Renta de toga", "Misa", "Baile", "Mesa extra", "Fotos extra", "Fecha de contrato", "Precio", "Comentarios", "Entrega del paquete", "Entrega de datos", "Límite de pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContratos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblContratos.setRowHeight(23);
        tblContratos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblContratos);
        if (tblContratos.getColumnModel().getColumnCount() > 0) {
            tblContratos.getColumnModel().getColumn(0).setMinWidth(0);
            tblContratos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblContratos.getColumnModel().getColumn(0).setMaxWidth(0);
            tblContratos.getColumnModel().getColumn(1).setMinWidth(80);
            tblContratos.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblContratos.getColumnModel().getColumn(1).setMaxWidth(80);
            tblContratos.getColumnModel().getColumn(2).setMinWidth(280);
            tblContratos.getColumnModel().getColumn(2).setPreferredWidth(280);
            tblContratos.getColumnModel().getColumn(2).setMaxWidth(280);
            tblContratos.getColumnModel().getColumn(3).setMinWidth(130);
            tblContratos.getColumnModel().getColumn(3).setPreferredWidth(130);
            tblContratos.getColumnModel().getColumn(3).setMaxWidth(130);
            tblContratos.getColumnModel().getColumn(5).setMinWidth(150);
            tblContratos.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblContratos.getColumnModel().getColumn(5).setMaxWidth(150);
            tblContratos.getColumnModel().getColumn(6).setMinWidth(100);
            tblContratos.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblContratos.getColumnModel().getColumn(6).setMaxWidth(100);
            tblContratos.getColumnModel().getColumn(7).setMinWidth(150);
            tblContratos.getColumnModel().getColumn(7).setPreferredWidth(150);
            tblContratos.getColumnModel().getColumn(7).setMaxWidth(150);
            tblContratos.getColumnModel().getColumn(8).setMinWidth(150);
            tblContratos.getColumnModel().getColumn(8).setPreferredWidth(150);
            tblContratos.getColumnModel().getColumn(8).setMaxWidth(150);
            tblContratos.getColumnModel().getColumn(9).setMinWidth(150);
            tblContratos.getColumnModel().getColumn(9).setPreferredWidth(150);
            tblContratos.getColumnModel().getColumn(9).setMaxWidth(150);
            tblContratos.getColumnModel().getColumn(10).setMinWidth(180);
            tblContratos.getColumnModel().getColumn(10).setPreferredWidth(180);
            tblContratos.getColumnModel().getColumn(10).setMaxWidth(180);
            tblContratos.getColumnModel().getColumn(11).setMinWidth(130);
            tblContratos.getColumnModel().getColumn(11).setPreferredWidth(130);
            tblContratos.getColumnModel().getColumn(11).setMaxWidth(130);
            tblContratos.getColumnModel().getColumn(12).setMinWidth(100);
            tblContratos.getColumnModel().getColumn(12).setPreferredWidth(100);
            tblContratos.getColumnModel().getColumn(12).setMaxWidth(100);
            tblContratos.getColumnModel().getColumn(13).setMinWidth(170);
            tblContratos.getColumnModel().getColumn(13).setPreferredWidth(170);
            tblContratos.getColumnModel().getColumn(13).setMaxWidth(170);
            tblContratos.getColumnModel().getColumn(14).setMinWidth(100);
            tblContratos.getColumnModel().getColumn(14).setPreferredWidth(100);
            tblContratos.getColumnModel().getColumn(14).setMaxWidth(100);
            tblContratos.getColumnModel().getColumn(15).setMinWidth(100);
            tblContratos.getColumnModel().getColumn(15).setPreferredWidth(100);
            tblContratos.getColumnModel().getColumn(15).setMaxWidth(100);
            tblContratos.getColumnModel().getColumn(16).setMinWidth(150);
            tblContratos.getColumnModel().getColumn(16).setPreferredWidth(150);
            tblContratos.getColumnModel().getColumn(16).setMaxWidth(150);
            tblContratos.getColumnModel().getColumn(17).setMinWidth(100);
            tblContratos.getColumnModel().getColumn(17).setPreferredWidth(100);
            tblContratos.getColumnModel().getColumn(17).setMaxWidth(100);
            tblContratos.getColumnModel().getColumn(19).setMinWidth(150);
            tblContratos.getColumnModel().getColumn(19).setPreferredWidth(150);
            tblContratos.getColumnModel().getColumn(19).setMaxWidth(150);
            tblContratos.getColumnModel().getColumn(20).setMinWidth(150);
            tblContratos.getColumnModel().getColumn(20).setPreferredWidth(150);
            tblContratos.getColumnModel().getColumn(20).setMaxWidth(150);
            tblContratos.getColumnModel().getColumn(21).setMinWidth(180);
            tblContratos.getColumnModel().getColumn(21).setPreferredWidth(180);
            tblContratos.getColumnModel().getColumn(21).setMaxWidth(180);
            tblContratos.getColumnModel().getColumn(22).setMinWidth(200);
            tblContratos.getColumnModel().getColumn(22).setPreferredWidth(200);
            tblContratos.getColumnModel().getColumn(22).setMaxWidth(200);
            tblContratos.getColumnModel().getColumn(23).setMinWidth(250);
            tblContratos.getColumnModel().getColumn(23).setPreferredWidth(250);
            tblContratos.getColumnModel().getColumn(23).setMaxWidth(250);
            tblContratos.getColumnModel().getColumn(24).setMinWidth(250);
            tblContratos.getColumnModel().getColumn(24).setPreferredWidth(250);
            tblContratos.getColumnModel().getColumn(24).setMaxWidth(250);
            tblContratos.getColumnModel().getColumn(25).setMinWidth(250);
            tblContratos.getColumnModel().getColumn(25).setPreferredWidth(250);
            tblContratos.getColumnModel().getColumn(25).setMaxWidth(250);
            tblContratos.getColumnModel().getColumn(26).setMinWidth(250);
            tblContratos.getColumnModel().getColumn(26).setPreferredWidth(250);
            tblContratos.getColumnModel().getColumn(26).setMaxWidth(250);
        }

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

        Abonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Abonar1.png"))); // NOI18N
        Abonar.setContentAreaFilled(false);
        Abonar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Abonar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Abonar2.png"))); // NOI18N
        Abonar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Abonar3.png"))); // NOI18N
        Abonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonarActionPerformed(evt);
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar1.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar2.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar3.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel3.setText("Folio:");

        txtFolio.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        comboLiquidado.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        comboLiquidado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar por liquidación", "Liquidado", "No Liquidado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(109, 109, 109)
                        .addComponent(Abonar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(comboLiquidado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboLiquidado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Abonar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar)
                    .addComponent(jButton4)
                    .addComponent(btnEditar))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: 
        try{
        JDialogAgregarContratoCliente cc = new JDialogAgregarContratoCliente(null, rootPaneCheckingEnabled);
        cc.idContrato = idContrato;
        cc.setVisible(true);
<<<<<<< HEAD
        if (cc.DialogResult)
        {
            cargarContratos();
        }
=======
        }
          catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
          }
>>>>>>> 35cba5d2aaaef8aaf860c97765cb6c717916a785
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
          try
        {   this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblContratos.getSelectedRow()!= -1){
                int id = Integer.parseInt(tblContratos.getValueAt(tblContratos.getSelectedRow(), 0).toString());

                JDialogAgregarContratoCliente agregar = new JDialogAgregarContratoCliente(null, true);

                //this.setVisible(true);
                agregar.id = id;
                agregar.editar=true;
                agregar.idContrato=idContrato;
               
             
                agregar.setVisible(true);
                if (agregar.DialogResult)
                {
                    cargarContratos();
                }
            }else{
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                    , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContrato"), JOptionPane.INFORMATION_MESSAGE);
            }
        }   catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
   }finally{
            this.setCursor(Cursor.getDefaultCursor());
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void AbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonarActionPerformed
        // TODO add your handling code here:
        try
        {
         this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblContratos.getSelectedRow()!= -1)
            {    
                JPanelAnticipo frame = new JPanelAnticipo(null, true);
                frame.idContratoCliente =  Integer.parseInt(tblContratos.getValueAt(tblContratos.getSelectedRow(), 0).toString());
                frame.total =  Double.parseDouble(tblContratos.getValueAt(tblContratos.getSelectedRow(), 22).toString());
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }else{
                  JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                    , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContrato"), JOptionPane.INFORMATION_MESSAGE);
        
            }  
        }
          catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
          }finally
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_AbonarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
          cargarContratos();

    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
                 try
        {
            btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblContratos.getSelectedRow()!= -1){

                int opcion = JOptionPane.showConfirmDialog(null, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("Eliminar"), ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContrato"), JOptionPane.YES_NO_OPTION);
                if(opcion==0){
                    int id = Integer.parseInt(tblContratos.getValueAt(tblContratos.getSelectedRow(), 0).toString());
                    if(ContratoClienteNegocio.Eliminar(id)){
                        cargarContratos();
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
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
    }//GEN-LAST:event_btnBuscarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abonar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox comboLiquidado;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblContratos;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables


          
      

    private void cargarContratos() { 
         try
        { 
 //            contratos = ContratoClienteNegocio.Listado();
           contratos = ContratoNegocio.ListarCC(idContrato);
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
            
            int folio= !txtFolio.getText().trim().isEmpty()?Integer.parseInt(txtFolio.getText()):0;
            String nombre =txtNombre.getText().trim();
            boolean liquidado = comboLiquidado.getSelectedIndex()==2?false:true;
            boolean validarLiquidado=comboLiquidado.getSelectedIndex()==0?false:true;
            
            
            contratos = ContratoClienteNegocio.Buscar(idContrato,nombre,folio,liquidado,validarLiquidado);
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
       DefaultTableModel mod = (DefaultTableModel)tblContratos.getModel();
       mod.setRowCount(0);
            for(ContratoCliente contrato : contratos){
            int id = contrato.getId();
            String nombre= contrato.getCliente().getNombre();
            int folio = contrato.getFolio();
            String triptico= contrato.isTriptico()  ? "Si" : "No";
            String modelo= contrato.getModelo().getNombre();
            String reconocimiento= contrato.isReconocimiento() ? "Si" : "No";
            String titulo= contrato.isTitulo() ? "Si" : "No";
            String dirigido= contrato.getDirigido();
            String agradecimiento= contrato.getAgradecimiento().getClave();
            String fotoPanoramica= contrato.getFotoPanoramica() ? "Si" : "No";
            String fotoPersonalizada= contrato.isFotoPersonalizada() ? "Si" : "No";
            String fotoEstudio= contrato.isFotoEstudio() ? "Si" : "No";
            String fotoMisa= contrato.isFotoMisa() ? "Si" : "No";
            String anillo= contrato.getAnillo().getMetal().getNombre();
            double k= contrato.getAnillo().getK();
            double g= contrato.getAnillo().getG();
            String rentaToga = contrato.isRentaToga() ? "Si" : "No";
            String misa= contrato.isMisa() ? "Si" : "No";
            String baile = contrato.isBaile() ? "Si" : "No";
            int mesaExtra = contrato.getMesaExtra();
            int fotosExtra= contrato.getFotosExtra();
            double precio = contrato.getPrecio();
            Date fechaEntregaPaquete = contrato.getFechaEntregaPaquete();
            Date fechaEntregaDatos= contrato.getFechaEntregaDatos();
            Date fechaLimitePago=contrato.getFechaLimitePago();
            Date fechaContrato= contrato.getFechaContrato();
            String Comentarios = contrato.getComentarios();
                                         
            mod.addRow(new Object[] {id,folio,nombre, modelo ,triptico,reconocimiento,titulo ,agradecimiento,
                dirigido,fotoPanoramica,fotoPersonalizada,fotoEstudio,
            fotoMisa,anillo,k,g,rentaToga,misa,baile,mesaExtra,fotosExtra,fechaContrato,""+precio,Comentarios,
            fechaEntregaPaquete,fechaEntregaDatos,fechaLimitePago});

        }
        

        tblContratos.setModel(mod);  
      }
       catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
   } }
}   

        
