/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;

import gdm.entidades.clases.Egreso;
import java.awt.Cursor;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import negocio.Clases.EgresoNegocio;

/**
 *
 * @author Chuy
 */
public class JDialogAgregarEgreso extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAgregarEgreso
     */
    
    public boolean DialogResult = false;
    public JDialogAgregarEgreso(java.awt.Frame parent, boolean modal) {
          super(parent, modal);
        initComponents();
         this.setLocationRelativeTo(null);
    }
      public boolean editar = false;
    public int id = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEgresoNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnInversion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(248, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(750, 550));
        jPanel4.setMinimumSize(new java.awt.Dimension(750, 550));

        jLabel5.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");

        txtEgresoNombre.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel7.setText("Inversión");

        btnInversion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInversion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar1.png"))); // NOI18N
        btnInversion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInversion.setBorderPainted(false);
        btnInversion.setContentAreaFilled(false);
        btnInversion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInversion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInversion.setIconTextGap(-3);
        btnInversion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar2.png"))); // NOI18N
        btnInversion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar3.png"))); // NOI18N
        btnInversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInversion)
                            .addComponent(txtEgresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addGap(81, 81, 81)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEgresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btnInversion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversionActionPerformed
        // TODO add your handling code here:

        try{
             if(!editar){
            if(!txtEgresoNombre.getText().trim().isEmpty() ){

                if(!EgresoNegocio.ValidarEgreso(txtEgresoNombre.getText())){

                    if(EgresoNegocio.Guardar(txtEgresoNombre.getText())){
                        JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("UsuarioAgregado")
                            , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
                         this.DialogResult = true;
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("UsuarioRepetido")
                            , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
                    }

                }else{
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("UsuarioRepetido")
                        , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
                }

            }else{
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("CamposVacios")
                    , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
            }
             }else{
                     if(!txtEgresoNombre.getText().trim().isEmpty() ){

                if(!EgresoNegocio.ValidarEgreso(txtEgresoNombre.getText())){

                    if(EgresoNegocio.Editar(id,txtEgresoNombre.getText())){
                        JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("UsuarioAgregado")
                            , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
                         this.DialogResult = true;
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("UsuarioRepetido")
                            , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
                    }

                }else{
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("UsuarioRepetido")
                        , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
                }

            }else{
                JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("CamposVacios")
                    , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE);
            }
             }
             

        }catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
 
        }
    }//GEN-LAST:event_btnInversionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         if(editar){
            cargarEdicion();
        }
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInversion;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtEgresoNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarEdicion() {
              try{
                   
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Egreso egreso = EgresoNegocio.Obtener(id);
        if(egreso != null){
            
            txtEgresoNombre.setText(egreso.getNombre());            
          
        }
     }catch(Exception ex){
       Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
  }
        finally{
          this.setCursor(Cursor.getDefaultCursor());     
        }     }
}
