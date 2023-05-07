/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema04;

/**
 *
 * @author VEL-USER
 */
public class cliente {
    String nombreCliente;
    String apellidoCliente;

    public cliente(String nC, String aC) {
        nombreCliente = nC;
        apellidoCliente = aC;
    }

    public String getNomCliente() {
        return nombreCliente;
    }

    public void setNomCliente(String nC) {
        nombreCliente = nC;
    }

    public String getApeCliente() {
        return apellidoCliente;
    }

    public void setApeCliente(String aC) {
        apellidoCliente = aC;
    }
}
