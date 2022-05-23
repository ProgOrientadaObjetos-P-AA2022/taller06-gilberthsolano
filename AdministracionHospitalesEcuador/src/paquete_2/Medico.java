/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Medico {

    private String nombreDoctor;
    private String especialidadDoctor[];
    private double sueldoDoctor;

    public Medico() {

    }

    public Medico(String nombre, String especialidad[], double sueldo) {
        nombreDoctor = nombre;
        especialidadDoctor = especialidad;
        sueldoDoctor = sueldo;

    }

    public void establecerNombreDoctor(String c) {
        nombreDoctor = c;
    }

    public String obtenerNombreDoctor() {
        return nombreDoctor;
    }

    public void establecerEspecialidadDoctor(String c[]) {
        especialidadDoctor = c;
    }

    public String[] obtenerEspecialidadDoctor() {
        return especialidadDoctor;
    }

    public void establecerSueldoDoctor(double c) {
        sueldoDoctor = c;
    }

    public double obtenerSueldoDoctor() {
        return sueldoDoctor;
    }
    @Override
    public String toString(){
        String m=(" - "+obtenerNombreDoctor()+" - "+obtenerSueldoDoctor()+" - "
              );
        for (int i = 0; i < obtenerEspecialidadDoctor().length; i++) {
           m= m.concat(obtenerEspecialidadDoctor()[i]);
            
        }
        return m;
        
    }
}
