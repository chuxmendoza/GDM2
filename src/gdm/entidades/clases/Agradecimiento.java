/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm.entidades.clases;

/**
 *
 * @author Chuy
 */
public class Agradecimiento {

    public Agradecimiento() {
    }
    public Agradecimiento(int id){
        this.id = id;
    }
    
    
    private int id;
    private String clave;
    private String mensaje;
    private Boolean personalizada;
    
    //<editor-fold defaultstate="collapsed" desc=" Getters and Setters del Agradecimiento ">
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
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
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
     * @return the personalizada
     */
    public Boolean getPersonalizada() {
        return personalizada;
    }

    /**
     * @param personalizada the personalizada to set
     */
    public void setPersonalizada(Boolean personalizada) {
        this.personalizada = personalizada;
    }
      //</editor-fold>
}
