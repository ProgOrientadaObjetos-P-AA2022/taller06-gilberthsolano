/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Enfermero {

    private String nombreEnfermero;
    private String tipo;
    private double sueldoEnfermero;

    public Enfermero() {

    }

    public Enfermero(String n, double s, String t) {
        nombreEnfermero = n;
        sueldoEnfermero = s;
        tipo = t;

    }

    public void establecerNombreEnfermero(String c) {
        nombreEnfermero = c;

    }

    public String obtenerNombreEnfermero() {
        return nombreEnfermero;
    }

    public void establecerTipo(String c) {
        tipo = c;

    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerSueldoEnfermero(double c) {
        sueldoEnfermero = c;

    }

    public double obtenerSueldoEnfermero() {
        return sueldoEnfermero;
    }

    @Override
    public String toString() {
        String e = (" - " + obtenerNombreEnfermero() + " - " + obtenerSueldoEnfermero() + " - " + obtenerTipo());
        return e;
    }

}
