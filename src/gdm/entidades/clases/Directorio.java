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
public class Directorio {
    private int id;
    private String contratos;
    private String recibos;
    private String modelos;
    private String agradecimientos;
    
    //<editor-fold defaultstate="collapsed" desc=" Getters and Setters del egreso ">
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
     * @return the contratos
     */
    public String getContratos() {
        return contratos;
    }

    /**
     * @param contratos the contratos to set
     */
    public void setContratos(String contratos) {
        this.contratos = contratos;
    }

    /**
     * @return the recibos
     */
    public String getRecibos() {
        return recibos;
    }

    /**
     * @param recibos the recibos to set
     */
    public void setRecibos(String recibos) {
        this.recibos = recibos;
    }

    /**
     * @return the modelos
     */
    public String getModelos() {
        return modelos;
    }

    /**
     * @param modelos the modelos to set
     */
    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    /**
     * @return the agradecimientos
     */
    public String getAgradecimientos() {
        return agradecimientos;
    }

    /**
     * @param agradecimientos the agradecimientos to set
     */
    public void setAgradecimientos(String agradecimientos) {
        this.agradecimientos = agradecimientos;
    }
    //</editor-fold>
}
