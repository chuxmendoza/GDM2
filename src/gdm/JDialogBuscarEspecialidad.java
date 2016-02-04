/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Especialidad;
import java.awt.Cursor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Clases.EscuelaNegocio;
import negocio.Clases.EspecialidadNegocio;

/**
 *
 * @author Chuy
 */
public class JDialogBuscarEspecialidad extends javax.swing.JDialog {
    private List<Especialidad> especialidades;   
    public boolean DialogResult = false;
    public int idEspecialidad = 0;
    public Especialidad especialidad = new Especialidad();
    /**
     * Creates new form JDialogBuscarEspecialidad
     */
    public JDialogBuscarEspecialidad(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
          cargarEspecialidades();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCarreras = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEspecialidad = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelCarreras.setBackground(new java.awt.Color(248, 255, 255));
        jPanelCarreras.setMaximumSize(new java.awt.Dimension(750, 550));
        jPanelCarreras.setMinimumSize(new java.awt.Dimension(750, 550));

        tblEspecialidad.getTableHeader().setFont(new java.awt.Font("Euphemia", 0, 18));
        tblEspecialidad.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        tblEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEspecialidad.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblEspecialidad.setRowHeight(23);
        tblEspecialidad.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tblEspecialidad);
        if (tblEspecialidad.getColumnModel().getColumnCount() > 0) {
            tblEspecialidad.getColumnModel().getColumn(0).setMinWidth(0);
            tblEspecialidad.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblEspecialidad.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel2.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel2.setText("Carrera o Especialidad");

        btnAgregarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar1.png"))); // NOI18N
        btnAgregarCarrera.setBorder(null);
        btnAgregarCarrera.setBorderPainted(false);
        btnAgregarCarrera.setContentAreaFilled(false);
        btnAgregarCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCarrera.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar2.png"))); // NOI18N
        btnAgregarCarrera.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar3.png"))); // NOI18N
        btnAgregarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCarrerasLayout = new javax.swing.GroupLayout(jPanelCarreras);
        jPanelCarreras.setLayout(jPanelCarrerasLayout);
        jPanelCarrerasLayout.setHorizontalGroup(
            jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarrerasLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCarrerasLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCarrerasLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCarrerasLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnAgregarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(268, 268, 268)))
                .addGap(63, 63, 63))
        );
        jPanelCarrerasLayout.setVerticalGroup(
            jPanelCarrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarrerasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnAgregarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarreraActionPerformed
        // TODO add your handling code here:
      try{
          
      
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        
          if(tblEspecialidad.getSelectedRow()!= -1)
          {
              
            int id = Integer.parseInt(tblEspecialidad.getValueAt(tblEspecialidad.getSelectedRow(), 0).toString());  
            especialidad = EspecialidadNegocio.Obtener(id);
            this.DialogResult=true;            
            this.dispose();
          }}catch(Exception e){
              System.out.println(e);
              
          }
    }//GEN-LAST:event_btnAgregarCarreraActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogBuscarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogBuscarEspecialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogBuscarEspecialidad dialog = new JDialogBuscarEspecialidad(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregarCarrera;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelCarreras;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEspecialidad;
    // End of variables declaration//GEN-END:variables

    private void cargarEspecialidades() {
      DefaultTableModel mod = (DefaultTableModel)tblEspecialidad.getModel();
        while(mod.getRowCount() > 0)
            mod.removeRow(0);
        
        especialidades = EspecialidadNegocio.Listado();
        for(Especialidad especialidad : especialidades){
            int id = especialidad.getId();
            String nombre = especialidad.getNombre();
           
                 
            mod.addRow(new Object[] {id, nombre});
        }
        
        tblEspecialidad.setModel(mod);
    }   

    
    }

