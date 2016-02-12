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
public class EgresoValor {
    private int id;
    private Egreso egreso;
    private Double valor;

    //<editor-fold defaultstate="collapsed" desc=" Getters and Setters del egresoValor ">
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
     * @return the egreso
     */
    public Egreso getEgreso() {
        return egreso;
    }

    /**
     * @param egreso the egreso to set
     */
    public void setEgreso(Egreso egreso) {
        this.egreso = egreso;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
     //</editor-fold>
    
}
