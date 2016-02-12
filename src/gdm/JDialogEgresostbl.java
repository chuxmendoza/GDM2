/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Contrato;
import gdm.entidades.clases.EgresoValor;
import java.awt.Cursor;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Clases.ContratoNegocio;
import negocio.Clases.EgresoValorNegocio;

/**
 *
 * @author Chuy
 */
public class JDialogEgresostbl extends javax.swing.JDialog {

    /**
     * Creates new form JDialogEgresos
     */
    public JDialogEgresostbl(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
  public int idCon = 0;
  public Integer id=0;
  public List<EgresoValor> egresos;
  public EgresoValor egreso= new EgresoValor();
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
        tblEgresosValor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalVentas = new javax.swing.JTextField();
        txtGanancias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        tblEgresosValor.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        tblEgresosValor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEgresosValor.setRowHeight(23);
        tblEgresosValor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tblEgresosValorComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(tblEgresosValor);
        if (tblEgresosValor.getColumnModel().getColumnCount() > 0) {
            tblEgresosValor.getColumnModel().getColumn(0).setMinWidth(0);
            tblEgresosValor.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblEgresosValor.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inversiones");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel2.setText("Total De Ventas:");

        jLabel3.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel3.setText("Ganancias:");

        txtTotalVentas.setEditable(false);
        txtTotalVentas.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        txtGanancias.setEditable(false);
        txtGanancias.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:        
        
        cargarEgresos();                      
        double totalVenta = ContratoNegocio.TotalGanancia(idCon);
        txtTotalVentas.setText(totalVenta+"");
        Contrato contrato = ContratoNegocio.Obtener(idCon);
        txtGanancias.setText(contrato.getGanancia()+"");
        System.out.println(totalVenta);
        
        
    }//GEN-LAST:event_formWindowOpened

    private void tblEgresosValorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tblEgresosValorComponentAdded
        // TODO add your handling code here:
    
    }//GEN-LAST:event_tblEgresosValorComponentAdded
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEgresosValor;
    private javax.swing.JTextField txtGanancias;
    private javax.swing.JTextField txtTotalVentas;
    // End of variables declaration//GEN-END:variables

    private void cargarEgresos() {
       try
        { 
 //            contratos = ContratoClienteNegocio.Listado();
           egresos = ContratoNegocio.ListarEV(idCon);
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
       DefaultTableModel mod = (DefaultTableModel)tblEgresosValor.getModel();
       mod.setRowCount(0);
            for(EgresoValor egreso : egresos){
             id = egreso.getId();
            String nombreEgreso = egreso.getEgreso().getNombre();
            Double valor = egreso.getValor();
           
                                         
            mod.addRow(new Object[] {id,nombreEgreso,valor});

        }
        

        tblEgresosValor.setModel(mod);  
      }
       catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
   
    }
    }

    private boolean restarEgreso() {
        boolean eliminar= false;
    egreso= EgresoValorNegocio.Obtener(id);
    Contrato contrato = ContratoNegocio.Obtener(idCon);
    
    try{
    double cantidad = contrato.getGanancia();
    double valor = egreso.getValor();
    double ganancia = cantidad + valor;
    contrato.setGanancia(ganancia);
    eliminar=true;
    }catch(Exception ex){
          Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
            
    }    
    return eliminar;
    
    }


}
