/*
 * 
 */
package com.cuenta;
import com.CuentaBancaria;
import com.Persona;
/**
 *
 * @author kirin
 */
public class CuentaAhorro extends CuentaBancaria{
    private float intereses;

    public CuentaAhorro(float intereses, String iban, Persona titular) {
        super(iban, titular);
        this.intereses = intereses;
    }

    public float getIntereses() {
        return intereses;
    }

    public void setIntereses(float intereses) {
        this.intereses = intereses;
    }
    
    
}
