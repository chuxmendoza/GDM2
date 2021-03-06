/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;
 
import gdm.entidades.clases.Anticipo; 
import gdm.entidades.clases.Common;
import gdm.entidades.clases.Directorio;
import gdm.filechooser.ImageFileView;
import gdm.filechooser.ImageFilter;
import gdm.filechooser.ImagePreview;
import java.awt.Cursor;
import java.io.File;
import java.util.Date;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import negocio.Clases.AnticipoNegocio; 
import negocio.Clases.DirectorioNegocio;


/**
 *
 * @author Chuy
 */
public class JDialogAgregarRutas extends javax.swing.JDialog {
   public boolean DialogResult = false;
    /**
     * Creates new form JDialogAgregarContrato
     */
    public JDialogAgregarRutas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        btnContratos = new javax.swing.JButton();
        btnRecibos = new javax.swing.JButton();
        btnModelos = new javax.swing.JButton();
        btnAgradecimientos = new javax.swing.JButton();
        txtRecibos = new javax.swing.JLabel();
        txtModelos = new javax.swing.JLabel();
        txtContrato = new javax.swing.JLabel();
        txtContratos3 = new javax.swing.JLabel();
        txtAgradecimientos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configuración de rutas");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNombre.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre.setText("Contrato:");

        lblNombre1.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre1.setText("Recibos:");

        lblNombre2.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre2.setText("Modelos:");

        lblNombre3.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre3.setText("Agradecimientos:");

        btnContratos.setText("Buscar");
        btnContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratosActionPerformed(evt);
            }
        });

        btnRecibos.setText("Buscar");
        btnRecibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecibosActionPerformed(evt);
            }
        });

        btnModelos.setText("Buscar");
        btnModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelosActionPerformed(evt);
            }
        });

        btnAgradecimientos.setText("Buscar");
        btnAgradecimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgradecimientosActionPerformed(evt);
            }
        });

        txtRecibos.setForeground(new java.awt.Color(0, 135, 191));
        txtRecibos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtModelos.setForeground(new java.awt.Color(0, 135, 191));
        txtModelos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtContrato.setBackground(new java.awt.Color(255, 255, 255));
        txtContrato.setForeground(new java.awt.Color(0, 135, 191));
        txtContrato.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAgradecimientos.setForeground(new java.awt.Color(0, 135, 191));
        txtAgradecimientos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNombre2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtRecibos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModelos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRecibos)
                                .addComponent(btnContratos, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnModelos)
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre1)
                            .addComponent(lblNombre))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombre3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtAgradecimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgradecimientos)
                        .addGap(14, 14, 14)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(txtContratos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(73, 73, 73)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre1)
                        .addGap(1, 1, 1)
                        .addComponent(btnRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModelos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgradecimientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgradecimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(161, 161, 161)
                    .addComponent(txtContratos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(76, 76, 76)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // TODO add your handling code here:
       cargarEdicion(); 
    }//GEN-LAST:event_formWindowOpened
        JFileChooser fc = null; 
    private void btnContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratosActionPerformed
        // TODO add your handling code here:
        try
        {
            if (fc == null)
            {
                fc = new JFileChooser();
                //fc.setCurrentDirectory(new java.io.File("."));
                fc.setDialogTitle("Buscar directorio");
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                 
                String recibos = txtRecibos.getText().trim();
                String modelos = txtModelos.getText().trim();
                String agradecimientos = txtAgradecimientos.getText().trim();
                if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) 
                {
                    txtContrato.setText(fc.getSelectedFile().toString());
                    String contratos = txtContrato.getText().trim();
                    DirectorioNegocio.Editar(contratos, recibos, modelos, agradecimientos); 
                }
            }
        }
        catch (Exception ex)
        {
            Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }
        finally
        {
            //Reset the file chooser for the next time it's shown.
            fc = null;
        }
    }//GEN-LAST:event_btnContratosActionPerformed
        
    private void btnRecibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecibosActionPerformed
        // TODO add your handling code here:
        try
        {
            if (fc == null)
            {
                fc = new JFileChooser();
                //fc.setCurrentDirectory(new java.io.File("."));
                fc.setDialogTitle("Buscar directorio");
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                
                String contratos = txtContrato.getText().trim();
                String modelos = txtModelos.getText().trim(); 
                String agradecimientos = txtAgradecimientos.getText().trim();
                if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                {
                    txtRecibos.setText(fc.getSelectedFile().toString()); 
                    String recibos = txtRecibos.getText().trim();
                    DirectorioNegocio.Editar(contratos, recibos, modelos, agradecimientos);
                }
            }
        }
        catch (Exception ex)
        {
            Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }
        finally
        {
            //Reset the file chooser for the next time it's shown.
            fc = null;
        }
    }//GEN-LAST:event_btnRecibosActionPerformed

    private void btnModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelosActionPerformed
        // TODO add your handling code here:
        try
        {
            if (fc == null)
            {
                fc = new JFileChooser();
                //fc.setCurrentDirectory(new java.io.File("."));
                fc.setDialogTitle("Buscar directorio");
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                
                String contratos = txtContrato.getText().trim();
                String recibos = txtRecibos.getText().trim();
                String agradecimientos = txtAgradecimientos.getText().trim();
                if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                {
                    txtModelos.setText(fc.getSelectedFile().toString());
                    String modelos = txtModelos.getText().trim();
                    DirectorioNegocio.Editar(contratos, recibos, modelos, agradecimientos); 
                }
            }
        }
        catch (Exception ex)
        {
            Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }
        finally
        {
            //Reset the file chooser for the next time it's shown.
            fc = null;
        }
    }//GEN-LAST:event_btnModelosActionPerformed

    private void btnAgradecimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgradecimientosActionPerformed
        // TODO add your handling code here:
        try
        {
            if (fc == null)
            {
                fc = new JFileChooser();
                //fc.setCurrentDirectory(new java.io.File("."));
                fc.setDialogTitle("Buscar directorio");
                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                
                String contratos = txtContrato.getText().trim();
                String recibos = txtRecibos.getText().trim();
                String modelos = txtModelos.getText().trim();
                if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                {
                    txtAgradecimientos.setText(fc.getSelectedFile().toString());
                    String agradecimientos = txtAgradecimientos.getText().trim();
                    DirectorioNegocio.Editar(contratos, recibos, modelos, agradecimientos);
                }
            }
        }
        catch (Exception ex)
        {
            Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
        }
        finally
        {
            //Reset the file chooser for the next time it's shown.
            fc = null;
        }
    }//GEN-LAST:event_btnAgradecimientosActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgradecimientos;
    private javax.swing.JButton btnContratos;
    private javax.swing.JButton btnModelos;
    private javax.swing.JButton btnRecibos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel txtAgradecimientos;
    private javax.swing.JLabel txtContrato;
    private javax.swing.JLabel txtContratos3;
    private javax.swing.JLabel txtModelos;
    private javax.swing.JLabel txtRecibos;
    // End of variables declaration//GEN-END:variables

    private void cargarEdicion() {
        try
        {                
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Directorio entidad = DirectorioNegocio.Obtener();
            if (entidad != null)
            {
                txtContrato.setText(entidad.getContratos());
                txtRecibos.setText(entidad.getRecibos());
                txtModelos.setText(entidad.getModelos());
                txtAgradecimientos.setText(entidad.getAgradecimientos());
            }
        }
        catch(Exception e)
        {
            Program.logger.error(this, e);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);      
        }
        finally
        {
            this.setCursor(Cursor.getDefaultCursor());     
        }
    }

}
