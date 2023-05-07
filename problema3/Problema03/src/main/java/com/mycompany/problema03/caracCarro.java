/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema03;

/**
 *
 * @author VEL-USER
 */
public class caracCarro {
     String cedulaDueño;
    private String marcaVehiculo;
    private int añoFabricacion;
    private double valorVehiculo;
    private int añoAct = 2023;
    private double valorMatricula;

    public caracCarro(String cD, String mV, int aF, double vM) {
        cedulaDueño = cD;
        marcaVehiculo = mV;
        añoFabricacion = aF;
        valorVehiculo = vM;
    }

    public String getcedulaDueño() {
        return cedulaDueño;
    }

    public void setCeDueño(String cD) {
        cedulaDueño = cD;
    }

    public String getMarVehiculo() {
        return marcaVehiculo;
    }

    public void setMarVehiculo(String mV) {
        marcaVehiculo = mV;
    }

    public int getAñoFab() {
        return añoFabricacion;
    }

    public void setAñoFab(int aF) {
        añoFabricacion = aF;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorV) {
        valorVehiculo = valorV;
    }

    public int getAñoAct() {
        return añoAct;
    }

    public void setAñoAct(int añoA) {
        añoAct = añoA;
    }

    public void calcularMatricula(){
        valorMatricula = (0.02 * valorVehiculo) * (añoAct - añoFabricacion);
    } 
    
    public double obtenerMatricula(){
        return valorMatricula;
    }

}