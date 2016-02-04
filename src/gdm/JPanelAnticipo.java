/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Anticipo;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Clases.AnticipoNegocio;
import negocio.Clases.ContratoClienteNegocio;

/**
 *
 * @author Chuy
 */
public class JPanelAnticipo extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAgregarAnticipo
     */
    public JPanelAnticipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public int idContratoCliente = 0;
    public double total = 0;
    public double pagado = 0; 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblContratosC = new javax.swing.JTable();
        btnAnticiposAgregar = new javax.swing.JButton();
        btnAnticiposEditar = new javax.swing.JButton();
        btnAnticiposEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tblContratosC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Concepto", "Cantidad", "Resto", "Fecha", "Celular", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblContratosC.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(tblContratosC);
        if (tblContratosC.getColumnModel().getColumnCount() > 0) {
            tblContratosC.getColumnModel().getColumn(0).setMinWidth(0);
            tblContratosC.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblContratosC.getColumnModel().getColumn(0).setMaxWidth(0);
            tblContratosC.getColumnModel().getColumn(1).setMinWidth(250);
            tblContratosC.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblContratosC.getColumnModel().getColumn(1).setMaxWidth(250);
            tblContratosC.getColumnModel().getColumn(2).setMinWidth(100);
            tblContratosC.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblContratosC.getColumnModel().getColumn(2).setMaxWidth(100);
            tblContratosC.getColumnModel().getColumn(3).setMinWidth(200);
            tblContratosC.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblContratosC.getColumnModel().getColumn(3).setMaxWidth(200);
            tblContratosC.getColumnModel().getColumn(4).setMinWidth(200);
            tblContratosC.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblContratosC.getColumnModel().getColumn(4).setMaxWidth(200);
            tblContratosC.getColumnModel().getColumn(5).setMinWidth(100);
            tblContratosC.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblContratosC.getColumnModel().getColumn(5).setMaxWidth(100);
            tblContratosC.getColumnModel().getColumn(6).setMinWidth(150);
            tblContratosC.getColumnModel().getColumn(6).setPreferredWidth(150);
            tblContratosC.getColumnModel().getColumn(6).setMaxWidth(150);
            tblContratosC.getColumnModel().getColumn(7).setMinWidth(150);
            tblContratosC.getColumnModel().getColumn(7).setPreferredWidth(150);
            tblContratosC.getColumnModel().getColumn(7).setMaxWidth(150);
        }

        btnAnticiposAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar1.png"))); // NOI18N
        btnAnticiposAgregar.setContentAreaFilled(false);
        btnAnticiposAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnticiposAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar2.png"))); // NOI18N
        btnAnticiposAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar3.png"))); // NOI18N
        btnAnticiposAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnticiposAgregarActionPerformed(evt);
            }
        });

        btnAnticiposEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar1.png"))); // NOI18N
        btnAnticiposEditar.setContentAreaFilled(false);
        btnAnticiposEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnticiposEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar2.png"))); // NOI18N
        btnAnticiposEditar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar3.png"))); // NOI18N
        btnAnticiposEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnticiposEditarActionPerformed(evt);
            }
        });

        btnAnticiposEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar1.png"))); // NOI18N
        btnAnticiposEliminar.setContentAreaFilled(false);
        btnAnticiposEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnticiposEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar2.png"))); // NOI18N
        btnAnticiposEliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar3.png"))); // NOI18N
        btnAnticiposEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnticiposEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel1.setText("Anticipos");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnAnticiposAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnAnticiposEditar)
                .addGap(40, 40, 40)
                .addComponent(btnAnticiposEliminar)
                .addGap(136, 136, 136))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnticiposEditar)
                    .addComponent(btnAnticiposEliminar)
                    .addComponent(btnAnticiposAgregar))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarAbonos();
    }//GEN-LAST:event_formWindowOpened

    private void btnAnticiposAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnticiposAgregarActionPerformed
        // TODO add your handling code here:
        try{
        if (ContratoClienteNegocio.Liquidado(idContratoCliente))
        {
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ContratoClienteLiquidado")
                , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContratoCliente"), JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JDialogAgregarAnticipo frame = new JDialogAgregarAnticipo(null, rootPaneCheckingEnabled);
        frame.idContratoCliente = idContratoCliente;
        frame.total = total;
        frame.pagado = pagado;
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        if (frame.DialogResult)
            cargarAbonos();
        }   catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAnticiposAgregarActionPerformed

    private void btnAnticiposEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnticiposEditarActionPerformed
        // TODO add your handling code here:
        try{
        if (ContratoClienteNegocio.Liquidado(idContratoCliente))
        {
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ContratoClienteLiquidado")
                , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloContratoCliente"), JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(tblContratosC.getSelectedRow()!= -1)
        {
            JDialogAgregarAnticipo frame = new JDialogAgregarAnticipo(null, rootPaneCheckingEnabled);
            frame.id = Integer.parseInt(tblContratosC.getValueAt(tblContratosC.getSelectedRow(), 0).toString());
            frame.idContratoCliente = idContratoCliente;
            frame.editar = true;
            frame.total = total;
            frame.pagado = pagado;
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            if (frame.DialogResult)
                cargarAbonos();
            }
        else
        {
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloAnticipo"), JOptionPane.INFORMATION_MESSAGE);
        }
        }   catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnAnticiposEditarActionPerformed

    private void btnAnticiposEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnticiposEliminarActionPerformed
        // TODO add your handling code here:
        try
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            if(tblContratosC.getSelectedRow()!= -1)
            {

                int opcion = JOptionPane.showConfirmDialog(null, 
                        ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("Eliminar"), 
                        ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloAnticipo"), 
                        JOptionPane.YES_NO_OPTION);
                if(opcion==0)
                { 
                     int id = Integer.parseInt(tblContratosC.getValueAt(tblContratosC.getSelectedRow(), 0).toString());
                     if(AnticipoNegocio.Eliminar(id, idContratoCliente))
                     {
                         cargarAbonos();
                     }
                } 
            }
            else
            {
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("SeleccionElemento")
                    , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloAnticipo"), JOptionPane.INFORMATION_MESSAGE);
            }

        }   catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
       }finally{
            this.setCursor(Cursor.getDefaultCursor());
        }    
    }//GEN-LAST:event_btnAnticiposEliminarActionPerformed
    
    private void cargarAbonos() 
    {   try{
        DefaultTableModel mod = (DefaultTableModel)tblContratosC.getModel();
        List<Anticipo> abonos = new ArrayList();
        mod.setRowCount(0);
        
        abonos = ContratoClienteNegocio.ListarAbonos(idContratoCliente);
        double _total = total;
        double _pagado = 0;
        for(Anticipo a : abonos)
        {
            _pagado = _pagado + a.getCantidad();
            int id = a.getId();
            String nombre = a.getNombre();
            String concepto = a.getConcepto();
            double cantidad = a.getCantidad();
            double resto = _total -= a.getCantidad();
            String fecha = a.getFecha().toString();
            String celular = a.getCelular();
            String telefono = a.getTelefono();
            mod.addRow(new Object[] {id, nombre, concepto, cantidad, resto, fecha, celular, telefono});
        } 
        pagado = _pagado;
        tblContratosC.setModel(mod);
    }     catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
 }}
    
    
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
            java.util.logging.Logger.getLogger(JPanelAnticipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPanelAnticipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPanelAnticipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPanelAnticipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JPanelAnticipo dialog = new JPanelAnticipo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnticiposAgregar;
    private javax.swing.JButton btnAnticiposEditar;
    private javax.swing.JButton btnAnticiposEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblContratosC;
    // End of variables declaration//GEN-END:variables
}
