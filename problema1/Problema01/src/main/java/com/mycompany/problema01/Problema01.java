/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problema01;

/**
 *
 * @author VEL-USER
 */
public class Problema01 {

    public static void main(String[] args) {
        System.out.println("Problema01");
        
        calcularpromedio cp = new calcularpromedio(); 
        Universidad u = new Universidad();
        
        cp.getSuma();
        cp.getPromedio();
        
        
        System.out.printf("El nombre del estudiante es: %s\nLa nota 1 es de: "
                + "%.2f\nLa nota 2 es de: %.2f\nLa nota 3 es de: %.2f\nEl "
                + "promedio de sus calificaciones es: %.2f\nAtt. : %s\nDireccion"
                + "en: %s\n",
                cp.getNombre(),
                cp.getNota1(),
                cp.getNota2(),
                cp.getNota3(),
                cp.Promedio(),
                u.getNombre(),
                u.getDireccion());
        
    }
}
