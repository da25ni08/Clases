/*
 * 
 */
package com.cuenta.corrientes;

import com.cuenta.CuentaCorriente;

/**
 *
 * @author kirin
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente{
    private float maximoDescubierto, interesDescubierto, comisionFijaDescubierto;

    public CuentaCorrienteEmpresa(float maximoDescubierto, float interesDescubierto, float comisionFijaDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
        this.interesDescubierto = interesDescubierto;
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }

    public float getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public float getInteresDescubierto() {
        return interesDescubierto;
    }

    public float getComisionFijaDescubierto() {
        return comisionFijaDescubierto;
    }

    public void setMaximoDescubierto(float maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    public void setInteresDescubierto(float interesDescubierto) {
        this.interesDescubierto = interesDescubierto;
    }

    public void setComisionFijaDescubierto(float comisionFijaDescubierto) {
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }
    
    
}
