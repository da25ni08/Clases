/*
 * 
 */
package com.cuenta.corrientes;

import com.cuenta.CuentaCorriente;

/**
 *
 * @author kirin
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    private float comisionMantenimiento;

    public CuentaCorrientePersonal(float comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public float getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(float comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }
    
    
}
