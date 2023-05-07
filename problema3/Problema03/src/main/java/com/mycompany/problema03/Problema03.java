/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema03;

/**
 *
 * @author VEL-USER
 */
public class Problema03 {

    public static void main(String[] args) {
        System.out.println("Problema03");
        String ceDueño = "1105776239";
        String marVehiculo = "Mazda";
        int añoFab = 2020;
        double valorVehiculo = 60000;

        caracCarro c = new caracCarro(ceDueño, marVehiculo, añoFab, valorVehiculo);
        
        c.calcularMatricula();
        
        System.out.println("El numero de cedula del dueño es: "+ c.getcedulaDueño());
        System.out.println("La marca del vehiculo es: "+ c.getMarVehiculo());
        System.out.println("El año d fabricación del vehiculo es: "+ c.getAñoFab());
        System.out.println("El valor del vehiculo es de: "+ c.getValorVehiculo());
        System.out.printf("El valor total de la matricula es de: %.2f", c.obtenerMatricula());
    }
}
