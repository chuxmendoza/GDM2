/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Anticipo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import negocio.Clases.ContratoClienteNegocio;

/**
 *
 * @author Chuy
 */
public class JDialogAgregarAnticipo extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAgregarAnticipo
     */
    public JDialogAgregarAnticipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public int idContratoCliente = 0;
    public double total = 0;
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Agregar1.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar2.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar3.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar1.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar2.png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Editar3.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Eliminar1.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel1.setText("Anticipos");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(40, 40, 40)
                .addComponent(jButton6)
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
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton4))
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
    
    private void cargarAbonos() 
    {
        DefaultTableModel mod = (DefaultTableModel)tblContratosC.getModel();
        List<Anticipo> abonos = new ArrayList();
        if(mod.getRowCount() > 0)
            mod.removeRow(0);
        
        abonos = ContratoClienteNegocio.ListarAbonos(idContratoCliente);
        
        for(Anticipo a : abonos)
        {
            int id = a.getId();
            String nombre = a.getNombre();
            String concepto = a.getConcepto();
            double cantidad = a.getCantidad();
            double resto = total -= a.getCantidad();
            String fecha = a.getFecha().toString();
            String celular = a.getCelular();
            String telefono = a.getTelefono();
            mod.addRow(new Object[] {id, nombre, concepto, cantidad, resto, fecha, celular, telefono});
        } 
        tblContratosC.setModel(mod);
    }   
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblContratosC;
    // End of variables declaration//GEN-END:variables
}