/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema04;

/**
 *
 * @author VEL-USER
 */
public class Problema04 {

    public static void main(String[] args) {
        System.out.println("Problema 04");
        
        String nombreCliente = "Mochix";
        String apellidoCliente = "Ortix";

        cliente c = new cliente(nombreCliente, apellidoCliente);

        String nombreBanco = "Banco de Loja";
        double valorCheque = 340;

        cheque p = new cheque(nombreBanco, valorCheque);

        p.calcularComision();

        System.out.println("El nombre del cliente es: " + c.getNomCliente() + c.getApeCliente());
        System.out.println("El banco al que se dirige el cheque es: " + p.getNomBanco());
        System.out.println("El valor del queque es: " + p.getValorCheque());
        System.out.println("La comison es de: " + p.obtenerComision());
    }
}
