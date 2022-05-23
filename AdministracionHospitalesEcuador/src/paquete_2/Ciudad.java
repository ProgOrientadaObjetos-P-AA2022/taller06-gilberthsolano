/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ciudad {

    private String nombreCiudad = "";
    private String provincia = "";

    public Ciudad() {
        nombreCiudad = "Zamura";
        provincia = "El Oro";
    }

    public Ciudad(String n, String m) {
        this.nombreCiudad = n;
        this.provincia = m;

    }

    public void establecerNombreCiudad(String c) {
        nombreCiudad = c;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public void establecerProvincia(String c) {
        provincia = c;
    }

    public String obtenerProvincia() {
        return provincia;
    }
    @Override
    public String toString(){
        String c=("Ciudad: "+obtenerNombreCiudad()+"\n Provincia:"+obtenerProvincia());
        return c;
    }
}
