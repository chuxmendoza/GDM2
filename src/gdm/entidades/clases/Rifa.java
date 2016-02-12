/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdm.entidades.clases;

import java.util.Date;

/**
 *
 * @author Chuy
 */
public class Rifa {
    
    private int id;
    private int numeroInicial;
    private int numeroFinal;
    private Date fechaRifa;

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
     * @return the numeroInicial
     */
    public int getNumeroInicial() {
        return numeroInicial;
    }

    /**
     * @param numeroInicial the numeroInicial to set
     */
    public void setNumeroInicial(int numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    /**
     * @return the numeroFinal
     */
    public int getNumeroFinal() {
        return numeroFinal;
    }

    /**
     * @param numeroFinal the numeroFinal to set
     */
    public void setNumeroFinal(int numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

    /**
     * @return the fechaRifa
     */
    public Date getFechaRifa() {
        return fechaRifa;
    }

    /**
     * @param fechaRifa the fechaRifa to set
     */
    public void setFechaRifa(Date fechaRifa) {
        this.fechaRifa = fechaRifa;
    }
    
}
