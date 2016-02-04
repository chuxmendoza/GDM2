/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm.entidades.clases;
 
import java.util.Date;
import java.util.List;

/**
 *
 * @author Chuy
 */
public class ContratoCliente {
    private int id;
    private int folio;
    private Cliente cliente;
    private Modelo modelo;
    private boolean reconocimiento;
    private boolean titulo;
    private String dirigido;
    private Agradecimiento agradecimiento;
    private String mensaje;
    private boolean fotoPanoramica;
    private boolean fotoPersonalizada;
    private boolean fotoMisa;
    private boolean fotoEstudio;
    private Anillo anillo;
    private boolean rentaToga;
    private boolean misa;
    private boolean baile;
    private int mesaExtra;
    private int fotosExtra;
    private boolean triptico;
    private double precio;
    private Date fechaEntregaPaquete;
    private Date fechaEntregaDatos;
    private Date fechaLimitePago;
    private String contratoImagen; 
    private List<Anticipo> anticipos;
    private Date fechaContrato;
    private String comentarios;
    private boolean liquidado;
    private Usuario usuario;

    //<editor-fold defaultstate="collapsed" desc=" Getters and Setters de ContratoCliente ">
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the reconocimiento
     */
    public boolean isReconocimiento() {
        return reconocimiento;
    }

    /**
     * @param reconocimiento the reconocimiento to set
     */
    public void setReconocimiento(boolean reconocimiento) {
        this.reconocimiento = reconocimiento;
    }

    /**
     * @return the agradecimiento
     */
    public Agradecimiento getAgradecimiento() {
        return agradecimiento;
    }

    /**
     * @param agradecimiento the agradecimiento to set
     */
    public void setAgradecimiento(Agradecimiento agradecimiento) {
        this.agradecimiento = agradecimiento;
    }

    /**
     * @return the fotoPanoramica
     */
    public boolean getFotoPanoramica() {
        return fotoPanoramica;
    }

    /**
     * @param fotoPanoramica the fotoPanoramica to set
     */
    public void setFotoPanoramica(boolean fotoPanoramica) {
        this.fotoPanoramica = fotoPanoramica;
    }

    /**
     * @return the fotoMisa
     */
    public boolean isFotoMisa() {
        return fotoMisa;
    }

    /**
     * @param fotoMisa the fotoMisa to set
     */
    public void setFotoMisa(boolean fotoMisa) {
        this.fotoMisa = fotoMisa;
    }

    /**
     * @return the fotoEstudio
     */
    public boolean isFotoEstudio() {
        return fotoEstudio;
    }

    /**
     * @param fotoEstudio the fotoEstudio to set
     */
    public void setFotoEstudio(boolean fotoEstudio) {
        this.fotoEstudio = fotoEstudio;
    }

    /**
     * @return the anillo
     */
    public Anillo getAnillo() {
        return anillo;
    }

    /**
     * @param anillo the anillo to set
     */
    public void setAnillo(Anillo anillo) {
        this.anillo = anillo;
    }

    /**
     * @return the rentaToga
     */
    public boolean isRentaToga() {
        return rentaToga;
    }

    /**
     * @param rentaToga the rentaToga to set
     */
    public void setRentaToga(boolean rentaToga) {
        this.rentaToga = rentaToga;
    }

    /**
     * @return the misa
     */
    public boolean isMisa() {
        return misa;
    }

    /**
     * @param misa the misa to set
     */
    public void setMisa(boolean misa) {
        this.misa = misa;
    }

    /**
     * @return the baile
     */
    public boolean isBaile() {
        return baile;
    }

    /**
     * @param baile the baile to set
     */
    public void setBaile(boolean baile) {
        this.baile = baile;
    }

    /**
     * @return the mesaExtra
     */
    public int getMesaExtra() {
        return mesaExtra;
    }

    /**
     * @param mesaExtra the mesaExtra to set
     */
    public void setMesaExtra(int mesaExtra) {
        this.mesaExtra = mesaExtra;
    }

    /**
     * @return the fotosExtra
     */
    public int getFotosExtra() {
        return fotosExtra;
    }

    /**
     * @param fotosExtra the fotosExtra to set
     */
    public void setFotosExtra(int fotosExtra) {
        this.fotosExtra = fotosExtra;
    }

    /**
     * @return the triptico
     */
    public boolean isTriptico() {
        return triptico;
    }

    /**
     * @param triptico the triptico to set
     */
    public void setTriptico(boolean triptico) {
        this.triptico = triptico;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the fechaEntregaPaquete
     */
    public Date getFechaEntregaPaquete() {
        return fechaEntregaPaquete;
    }

    /**
     * @param fechaEntregaPaquete the fechaEntregaPaquete to set
     */
    public void setFechaEntregaPaquete(Date fechaEntregaPaquete) {
        this.fechaEntregaPaquete = fechaEntregaPaquete;
    }

    /**
     * @return the fechaEntregaDatos
     */
    public Date getFechaEntregaDatos() {
        return fechaEntregaDatos;
    }

    /**
     * @param fechaEntregaDatos the fechaEntregaDatos to set
     */
    public void setFechaEntregaDatos(Date fechaEntregaDatos) {
        this.fechaEntregaDatos = fechaEntregaDatos;
    }

    /**
     * @return the fechaLimitePago
     */
    public Date getFechaLimitePago() {
        return fechaLimitePago;
    }

    /**
     * @param fechaLimitePago the fechaLimitePago to set
     */
    public void setFechaLimitePago(Date fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    /**
     * @return the contratoImagen
     */
    public String getContratoImagen() {
        return contratoImagen;
    }

    /**
     * @param contratoImagen the contratoImagen to set
     */
    public void setContratoImagen(String contratoImagen) {
        this.contratoImagen = contratoImagen;
    } 
    
    /**
     * @return the anticipos
     */
    public List<Anticipo> getAnticipos() {
        return anticipos;
    }

    /**
     * @param anticipos the anticipos to set
     */
    public void setAnticipos(List<Anticipo> anticipos) {
        this.anticipos = anticipos;
    }
       /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
     

    /**
     * @return the fechaContrato
     */
    public Date getFechaContrato() {
        return fechaContrato;
    }

    /**
     * @param fechaContrato the fechaContrato to set
     */
    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    } 
    /**
     * @return the comentarios
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * @param comentarios the comentarios to set
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    /**
     * @return the liquidado
     */
    public boolean getLiquidado() {
        return liquidado;
    }

    /**
     * @param liquidado the liquidado to set
     */
    public void setLiquidado(boolean liquidado) {
        this.liquidado = liquidado;
    }
    
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the titulo
     */
    public boolean isTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the dirigido
     */
    public String getDirigido() {
        return dirigido;
    }

    /**
     * @param dirigido the dirigido to set
     */
    public void setDirigido(String dirigido) {
        this.dirigido = dirigido;
    }

    /**
     * @return the fotoPersonalizada
     */
    public boolean isFotoPersonalizada() {
        return fotoPersonalizada;
    }

    /**
     * @param fotoPersonalizada the fotoPersonalizada to set
     */
    public void setFotoPersonalizada(boolean fotoPersonalizada) {
        this.fotoPersonalizada = fotoPersonalizada;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    //</editor-fold>
}
