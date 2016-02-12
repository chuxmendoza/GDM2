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
public class Contrato {

    public Contrato() {
    }
    public Contrato(int id) {
        this.id = id;      
    }
    
    
    private int id;
    private Escuela escuela;
    private Especialidad especialidad;
    private String generacion;
    private Date fechaEvento;
    private FotoPanoramica fotoPanoramica;
    private Misa misa;
    private Baile baile;
    private String comentarios;
    private List<ContratoCliente> contratoCliente;
    private List<EgresoValor> egresoValor;
    private Usuario usuario;
    private Date fechaAlta;
    private double ganancia;
    private boolean finalizado;
    
//<editor-fold defaultstate="collapsed" desc=" Getters and Setters del Contrato ">
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
     * @return the escuela
     */
    public Escuela getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the generacion
     */
    public String getGeneracion() {
        return generacion;
    }

    /**
     * @param generacion the generacion to set
     */
    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    /**
     * @return the fechaEvento
     */
    public Date getFechaEvento() {
        return fechaEvento;
    }

    /**
     * @param fechaEvento the fechaEvento to set
     */
    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    /**
     * @return the fotoPanoramica
     */
    public FotoPanoramica getFotoPanoramica() {
        return fotoPanoramica;
    }

    /**
     * @param fotoPanoramica the fotoPanoramica to set
     */
    public void setFotoPanoramica(FotoPanoramica fotoPanoramica) {
        this.fotoPanoramica = fotoPanoramica;
    }

    /**
     * @return the misa
     */
    public Misa getMisa() {
        return misa;
    }

    /**
     * @param misa the misa to set
     */
    public void setMisa(Misa misa) {
        this.misa = misa;
    }

    /**
     * @return the baile
     */
    public Baile getBaile() {
        return baile;
    }

    /**
     * @param baile the baile to set
     */
    public void setBaile(Baile baile) {
        this.baile = baile;
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
     * @return the contratoCliente
     */
    public List<ContratoCliente> getContratoCliente() {
        return contratoCliente;
    }

    /**
     * @param contratoCliente the contratoCliente to set
     */
    public void setContratoCliente(List<ContratoCliente> contratoCliente) {
        this.contratoCliente = contratoCliente;
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
    
    /**
     * @return the fechaAlta
     */
    public Date getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
       /**
     * @return the egresoValor
     */
    public List<EgresoValor> getEgresoValor() {
        return egresoValor;
    }

    /**
     * @param egresoValor the egresoValor to set
     */
    public void setEgresoValor(List<EgresoValor> egresoValor) {
        this.egresoValor = egresoValor;
    }
    //</editor-fold>
<<<<<<< HEAD
    
    @Override
    public String toString()
    {
        String nombre = especialidad.getNombre() + " - " + escuela.getNombre() + " - " + escuela.getCiudad() + " - " + generacion;
        return nombre;
    }
 
=======

    /**
     * @return the ganancia
     */
    public double getGanancia() {
        return ganancia;
    }

    /**
     * @param ganancia the ganancia to set
     */
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    /**
     * @return the finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * @param finalizado the finalizado to set
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

>>>>>>> 35cba5d2aaaef8aaf860c97765cb6c717916a785
} 