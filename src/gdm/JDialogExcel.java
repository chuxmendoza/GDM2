/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;
 
import gdm.entidades.clases.Agradecimiento; 
import gdm.entidades.clases.Common;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane; 
import jxl.write.WriteException;
import negocio.Clases.AgradecimientoNegocio; 
import negocio.Clases.DirectorioNegocio;

/**
 *
 * @author Chuy
 */
public class JDialogExcel extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAgregarAgradecimiento
     */
    
    public boolean DialogResult = false;
    public int id = 0;
    public JDialogExcel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cboTipoExcel = new gdm.presentacion.CustomComboBox();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(248, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(750, 550));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 550));

        jLabel7.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Exportar excel");

        cboTipoExcel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Completo", "Formato para empresa" }));

        btnExportar.setText("Aceptar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnExportar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(cboTipoExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addComponent(cboTipoExcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened
        JFileChooser fc = null;
        String ruta = null;
    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try
        {
            boolean exportado = false;
            if (fc == null)
            {
                fc = new JFileChooser();
                //fc.setCurrentDirectory(new java.io.File("."));
                fc.setDialogTitle("Buscar directorio");
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                
                if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                {
                    ruta = fc.getSelectedFile().toString(); 
            
                    if (cboTipoExcel.getSelectedIndex() != -1)
                    { 
                        if(cboTipoExcel.getSelectedIndex() == 0)
                        { 
                            Common.exportarExcelContratoConPrecios(ruta, id); 
                            exportado = true;
                        }
                        else if (cboTipoExcel.getSelectedIndex() == 1)
                        { 
                            Common.exportarExcelContratoSinPrecios(ruta, id); 
                            exportado = true;
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("CamposVacios")
                            , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloCamposVacios"), JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                if (exportado)
                {
                    this.DialogResult = true;
                    this.dispose();
                }
            }
        }
        catch (HeadlessException | IOException | WriteException ex)
        {
            Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }
        finally
        { 
            fc = null;
        } 
    }//GEN-LAST:event_btnExportarActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private gdm.presentacion.CustomComboBox cboTipoExcel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
