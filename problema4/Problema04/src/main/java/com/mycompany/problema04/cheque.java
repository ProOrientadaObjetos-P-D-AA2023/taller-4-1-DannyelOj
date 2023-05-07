/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema04;

/**
 *
 * @author VEL-USER
 */
public class cheque {
    String nombreBanco;
    double valorCheque;
    double comision;

    public cheque(String nB, double vC) {
        nombreBanco = nB;
        valorCheque = vC;
    }

    public String getNomBanco() {
        return nombreBanco;
    }

    public void setNomBanco(String nB) {
        nombreBanco = nB;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double vC) {
        valorCheque = vC;
    }

    public void calcularComision() {
        comision = valorCheque * 0.003;
    }

    public double obtenerComision() {
        return comision;
    }
}
