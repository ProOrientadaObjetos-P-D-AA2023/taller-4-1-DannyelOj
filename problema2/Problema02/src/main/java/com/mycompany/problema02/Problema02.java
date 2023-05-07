/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema02;

/**
 *
 * @author VEL-USER
 */
public class Problema02 {

    public static void main(String[] args) {
        System.out.println("Problema02");
        String nombre = "Mochix";
        String apellido = "Ortix";

        datosProfesore d = new datosProfesore(nombre, apellido);

        int cedula = 1105906035;
        double sueldoBasico = 450;

        sueldos s = new sueldos(cedula, sueldoBasico);

        s.calcularIva();

        System.out.println("EL nombre del profesor es: " + d.getNombre() + d.getApellido());
        System.out.println("Con numero de cedula: " + s.getCedula());
        System.out.println("Con un sueldo de: " + s.obtenerSueldoT());
    }
}
