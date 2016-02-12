/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm;
 
import gdm.entidades.clases.Anticipo; 
import gdm.entidades.clases.Common;
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
public class JDialogAgregarAnticipo extends javax.swing.JDialog {
   public boolean DialogResult = false;
    /**
     * Creates new form JDialogAgregarContrato
     */
    public JDialogAgregarAnticipo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
     public boolean editar = false;
     public int id = 0; 
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblNombre2 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        txtConcepto = new javax.swing.JTextField();
        lblNombre3 = new javax.swing.JLabel();
        lblNombre4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        imgFoto = new javax.swing.JLabel();
        btnAgregarImagen3 = new javax.swing.JButton();
        btnRetirarImagen = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        dtFecha = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jLabel1.setFont(new java.awt.Font("Euphemia", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Anticipos");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNombre.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");

        lblNombre1.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre1.setText("Telefono:");

        txtTelefono.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        lblNombre2.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre2.setText("Celular:");

        txtCelular.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        txtConcepto.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N

        lblNombre3.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre3.setText("Concepto:");

        lblNombre4.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        lblNombre4.setText("Cantidad:");

        txtCantidad.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        imgFoto.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        imgFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarImagen3.setText("Seleccionar imagen");
        btnAgregarImagen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagen3ActionPerformed(evt);
            }
        });

        btnRetirarImagen.setText("Remover imagen");
        btnRetirarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNombre3)
                        .addGap(18, 18, 18)
                        .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarImagen3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetirarImagen)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetirarImagen)
                    .addComponent(btnAgregarImagen3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar1.png"))); // NOI18N
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar2.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/gdm/entidades/imagenes/Aceptar3.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Euphemia", 0, 14)); // NOI18N
        jLabel5.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(291, 291, 291))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addContainerGap(19, Short.MAX_VALUE))
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
        
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        try
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                String nombre = txtNombre.getText().trim();
                String celular = txtCelular.getText().trim();
                String telefono = txtTelefono.getText().trim();
                double cantidad = Double.parseDouble(txtCantidad.getText().trim());
                String concepto = txtConcepto.getText().trim();
                Date fecha = dtFecha.getDate();
                
            if(!editar)
            { 
                if (!validarGuardar())
                {
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("AbonoMayorTotal")
                        , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloAnticipo"), JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(AnticipoNegocio.Guardar(idContratoCliente, 
                        nombre, celular, telefono, cantidad, concepto, nombreArchivo, fecha, Program.idUsuario))
                {
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("AnticipoAgregado")
                        , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloAnticipo"), JOptionPane.INFORMATION_MESSAGE);
                    Common.copiarArchivo(rutaArchivo, DirectorioNegocio.ObtenerRutaRecibos()+nombreArchivo);
                    this.DialogResult = true;
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                        , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);
                }        
            }
            else
            {
                if (!validarEditar())
                {
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("AbonoMayorTotal")
                        , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloAnticipo"), JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(AnticipoNegocio.Editar(idContratoCliente, id, 
                        nombre, celular, telefono, cantidad, concepto, nombreArchivo))
                {
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("AnticipoEditado")
                        , ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloAnticipo"), JOptionPane.INFORMATION_MESSAGE);
                     Common.copiarArchivo(rutaArchivo, DirectorioNegocio.ObtenerRutaRecibos()+nombreArchivo);
                     this.DialogResult = true;
                     this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                        , "TituloError", JOptionPane.INFORMATION_MESSAGE);
                }
      
            } 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                , "Acceso denegado", JOptionPane.INFORMATION_MESSAGE); 
        }
        finally
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       // TODO add your handling code here:
       if(editar)
       {
            cargarEdicion();
       }   
    }//GEN-LAST:event_formWindowOpened
        JFileChooser fc = null;
        String nombreArchivo = null;
        String rutaArchivo = null;
    private void btnAgregarImagen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagen3ActionPerformed
        // TODO add your handling code here:
        try
        {
            if (fc == null) {
                fc = new JFileChooser();

                //Add a custom file filter and disable the default
                //(Accept All) file filter.
                fc.addChoosableFileFilter(new ImageFilter());
                fc.setAcceptAllFileFilterUsed(false);

                //Add custom icons for file types.
                fc.setFileView(new ImageFileView());

                //Add the preview pane.
                fc.setAccessory(new ImagePreview(fc));
            }

            //Show it.
            int returnVal = fc.showDialog(this, "Buscar");

            //Process the results.
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                //TODO something with the name from the fil using file.getName()
                ImageIcon icon = new ImageIcon(((new ImageIcon(file.getPath())).getImage())
                    .getScaledInstance(297, 233, java.awt.Image.SCALE_SMOOTH));
                imgFoto.setIcon(icon);
                rutaArchivo = file.getPath();
                nombreArchivo = file.getName();
            }
        }
        catch (Exception ex)
        {

        }
        finally
        {
            //Reset the file chooser for the next time it's shown.
            fc.setSelectedFile(null);
        }
    }//GEN-LAST:event_btnAgregarImagen3ActionPerformed

    private void btnRetirarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarImagenActionPerformed
        // TODO add your handling code here:
        imgFoto.setIcon(null);
        rutaArchivo = null;
        nombreArchivo = null;
    }//GEN-LAST:event_btnRetirarImagenActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();        
        if(((car < '0') || (car > '9'))&& (car !='.'))evt.consume();{
    }//GEN-LAST:event_txtCantidadKeyTyped
    if (car == '.' && txtCantidad.getText().contains(".")) { evt.consume(); }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarImagen3;
    private javax.swing.JButton btnRetirarImagen;
    private org.jdesktop.swingx.JXDatePicker dtFecha;
    private javax.swing.JLabel imgFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre4;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarEdicion() {
        try
        {                
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Anticipo entidad = AnticipoNegocio.Obtener(id);
            if(entidad != null)
            {  
                txtNombre.setText(entidad.getNombre());
                txtCelular.setText(entidad.getCelular()); 
                txtTelefono.setText(entidad.getTelefono()); 
                txtCantidad.setText(entidad.getCantidad()+""); 
                txtConcepto.setText(entidad.getConcepto());
                dtFecha.setDate(entidad.getFecha()); 
                if (entidad.getRecibo() != null)
                if (!entidad.getRecibo().isEmpty())
                {
                    String rutaImagen = DirectorioNegocio.ObtenerRutaRecibos();
                    if (Common.RutaExistente(rutaImagen+entidad.getRecibo()))
                    {
                        ImageIcon icon = new ImageIcon(((new ImageIcon(rutaImagen+entidad.getRecibo())).getImage())
                            .getScaledInstance(297, 233, java.awt.Image.SCALE_SMOOTH));
                        imgFoto.setIcon(icon);
                        nombreArchivo = entidad.getRecibo();
                        rutaArchivo = rutaImagen+entidad.getRecibo();
                    }
                }   
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
    
    private boolean validarGuardar()
    {
        boolean guardar = false;
        try
        {
            double cantidad = Integer.parseInt(txtCantidad.getText().trim());
            if ((pagado+cantidad) <= total)
                guardar = true;
        }catch(Exception ex)
        {
             Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);      
        }
        return guardar;
    }
    
    private boolean validarEditar()
    {
        boolean _editar = false;
        try
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            double cantidad = Double.parseDouble(txtCantidad.getText().trim());
            if (AnticipoNegocio.ValidarTotalPago(idContratoCliente, id, cantidad, total))
                _editar = true;
        }
        catch(Exception ex)
        {
            Program.logger.error(this, ex);
            JOptionPane.showMessageDialog(this, ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("ErrorMensaje")
                ,  ResourceBundle.getBundle("gdm/entidades/clases/resource").getString("TituloError"), JOptionPane.INFORMATION_MESSAGE);      
        }
        finally
        {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
        return _editar;
    }   
    
}
