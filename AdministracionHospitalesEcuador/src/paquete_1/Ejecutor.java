/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete_1;

import java.util.Scanner;
import paquete_2.Ciudad;
import paquete_2.Enfermero;
import paquete_2.Hospitalaria;
import paquete_2.Medico;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Variables ciudad
        String nomC = "";
        String nomP = "";
        //Variables hospital
        String nombreH = "";
        String direccionH = "";
        int numEsp = 0;
        //Variable medico
        String nombreM = "";
        double sueldoM = 0;
        String especialidad[];
        //Variable enfermero
        String nombreE = "";
        double sueldoE = 0;
        String tipoE = "";
        Ciudad ci1 = new Ciudad();
        Medico me1 = new Medico();
        Medico meA1[];
        Enfermero enf1 = new Enfermero();
        Enfermero enfA1[];
        Hospitalaria h1 = new Hospitalaria();
        int auxM = 0;
        int auxEM = 0;
        int auxE = 0;
        double sueldom = 0;
        double sueldoe = 0;
        System.out.println("----Ingrese los datos por teclado---------");
        System.out.println("---Datos hospital---");
        System.out.println("Ingrese nombre del hospital");
        nombreH = entrada.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccionH = entrada.nextLine();
        System.out.println("-Ingrese los datos de la Ciudad-");
        System.out.println("Ingrese nombre de la ciudad");
        nomC = entrada.nextLine();
        System.out.println("Ingrese nombre de la provincia que pertenece");
        nomP = entrada.nextLine();
        ci1 = new Ciudad(nomC, nomP);
        System.out.println("Ingrese el numero de especialidades");
        numEsp = Integer.parseInt(entrada.nextLine());
        System.out.println("--Datos del Medico--");
        System.out.println("Ingrese la cantidad de Medicos a ingresar");
        auxM = Integer.parseInt(entrada.nextLine());
        meA1 = new Medico[auxM];
        int i = 0;
        int x = 0;
        do {
            System.out.println("Ingrese el nombre del Medico");
            nombreM = entrada.nextLine();
            System.out.println("Ingrese el sueldo del Medico");
            sueldoM = Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el numero de especialidades del Medico");
            auxEM = Integer.parseInt(entrada.nextLine());
            especialidad = new String[auxEM];
            for (int j = 0; j < especialidad.length; j++) {
                System.out.println("Ingrese nombre de la especialidad: " + (j + 1));
                especialidad[j] = entrada.nextLine();

            }
            sueldom += sueldoM;

            me1 = new Medico(nombreM, especialidad, sueldoM);

            meA1[i] = me1;
            me1 = new Medico();
            i++;
        } while (i < auxM);
        System.out.println("--Datos del Enfermero--");
        System.out.println("Ingrese la cantidad de Enfermeros a ingresar");
        auxE = Integer.parseInt(entrada.nextLine());
        enfA1 = new Enfermero[auxE];

        do {
            System.out.println("Ingrese nombre del Enfermero");
            nombreE = entrada.nextLine();
            System.out.println("Ingrese sueldo del Enfermero");
            sueldoE = Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el tipo de Enfermero Contrato/Nombramiento");
            tipoE = entrada.nextLine();
            sueldoe += sueldoE;

            enf1 = new Enfermero(nombreE, sueldoE, tipoE);
            enfA1[x] = enf1;
            enf1 = new Enfermero();
            x++;

        } while (x < auxE);

        double s = h1.calcularSueldoTotal(sueldom, sueldoe);
        h1 = new Hospitalaria(nombreH, direccionH, ci1, numEsp, meA1, enfA1, s);
        System.out.printf("%s", h1);

    }

}
