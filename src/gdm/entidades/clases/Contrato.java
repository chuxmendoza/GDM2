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
    
    //</editor-fold>
 
} 