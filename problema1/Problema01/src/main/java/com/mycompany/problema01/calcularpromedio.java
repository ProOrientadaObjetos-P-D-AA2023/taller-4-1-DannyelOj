/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema01;

/**
 *
 * @author VEL-USER
 */
public class calcularpromedio {
    
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private double suma;
    private double promedio;
    
    public calcularpromedio(){
        nombre = "Mochix Ortix";
        nota1 = 10;
        nota2 = 0;
        nota3= 5;
    }
    
    public calcularpromedio(String n, int n1, int n2, int n3 ){
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3= n3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    //----------------------------------
    public void getSuma() {
        suma = nota1 + nota2 + nota3;
    }

    public double Suma() {
        return  suma;
    }
    //----------------------------------
    public void getPromedio() {
        promedio = suma/3;
    }

    public double Promedio() {
        return promedio;
    }
    
    //-----------------------------------
    
}
