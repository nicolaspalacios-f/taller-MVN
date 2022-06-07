package edu.escuelaing.arsw.ASE.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!!
 *
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        int contador = 0;
        File archivo = new File(args[1]);
        Scanner scanne = new Scanner(archivo);
        if (args[0].equals("phy")) {
            while (scanne.hasNextLine()) {
                scanne.nextLine();
                contador += 1;
            }
        } else if (args[0].equals("loc"))
            while (scanne.hasNextLine()) {
                String line = scanne.nextLine().strip();
                if (line.length() > 0) {
                    if (!(line.startsWith("/")) && (!(line.startsWith("*")))) {
                        contador += 1;
                    }
                }
            }
        System.out.println("La cantidad de lineas de tipo " + args[0] + " es de " + contador);
    }
}