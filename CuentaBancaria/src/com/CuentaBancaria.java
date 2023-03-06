/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author kirin
 */
public class CuentaBancaria {

    private String iban;
    private Persona titular;

    public CuentaBancaria(String iban, Persona titular) {
        this.iban = iban;
        this.titular = titular;
    }

    public String getIban() {
        return iban;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
}
