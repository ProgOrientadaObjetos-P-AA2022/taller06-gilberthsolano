/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Hospitalaria {

    private String nombreHospital;
    private String direccion;
    private Ciudad ciu;
    private int numEspecialidad;
    private Medico med[];
    private Enfermero enf[];
    private double sueldoTotal;

    public Hospitalaria() {

    }

    public Hospitalaria(String n, String d, Ciudad c, int nE, Medico m[], Enfermero e[], double sueldototal) {
        nombreHospital = n;
        direccion = d;
        ciu = c;
        numEspecialidad = nE;
        med = m;
        enf = e;
        sueldoTotal=sueldototal;

    }

    public void establecerNombreHospital(String c) {
        nombreHospital = c;
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public void establecerDireccion(String c) {
        direccion = c;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerCiudad(Ciudad c) {
        ciu = c;
    }

    public Ciudad obtenerCiudad() {
        return ciu;
    }

    public void establecerNumeroEspecialidades(int c) {
        numEspecialidad = c;

    }

    public int obtenerNumeroEspecialidades() {
        return numEspecialidad;
    }

    public void establecerMedico(Medico m[]) {
        med = m;
    }

    public Medico[] obtenerMedico() {
        return med;
    }

    public void establecerEnfermero(Enfermero e[]) {
        enf = e;
    }

    public Enfermero[] obtenerEnfermero() {
        return enf;
    }
    public void establecerSueldoTotal(double sueldo){
        sueldoTotal=sueldo;
        
    }
    public double calcularSueldoTotal(double sueldo1, double sueldo2) {
        
           double suma=0;
           suma=sueldo1+sueldo2;
           sueldoTotal=suma;
           return sueldoTotal;
          
        
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    //metodo toString
    @Override
    public String toString(){
       String h="HOSPITAL";
       h=String.format("%s %s\n Direccion: %s\n %s\n Numero especialidades: %d \n   "
               ,h,obtenerNombreHospital(), 
               obtenerDireccion(), obtenerCiudad(),
               obtenerNumeroEspecialidades());
       h=String.format(" %s\n Lista Medicos:\n ",h);
        for (int i = 0; i < obtenerMedico().length; i++) {
            h=String.format("%s \n %s\n",h,obtenerMedico()[i]);
            
        }
        h=String.format(" %s\n Lista Enfermeros: \n ", h);
        for (int i = 0; i < obtenerEnfermero().length; i++) {
            h=String.format("%s \n %s\n ",h, obtenerEnfermero()[i]);
            
        }
        h=String.format("%s\n Total de sueldos a pagar por mes: %.2f \n ", h, obtenerSueldoTotal());
        
        return h;
        
    }
    

}
