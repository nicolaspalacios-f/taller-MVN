package edu.escuelaing.arsw.ASE.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal
 *
 */
public class App {
    /**
     * 
     * @param metodo Metodo contador de lineas a usar
     * @param folder Folder del cual se seleccionaran los archivos a contar lineas
     * @return numero de lineas total de todos los archivos dentro del folder
     */
    public static int lector_archivos(String metodo, String folder) throws FileNotFoundException {
        File carpeta = new File(folder);
        File[] listOfFiles = carpeta.listFiles();
        int contador = 0;

        for (File file : listOfFiles) {
            if (file.isFile()) {
                contador += contadorLineas(metodo, file);
            }
        }
        System.out.println(contador);
        return (contador);
    }

    /**
     * 
     * @param metodo Metodo contador de lineas a usar
     * @param archivo Archivo del cual se contaran las lineas
     * @return Cantidad de lineas que contiene el archivo.
     * @throws FileNotFoundException
     */
    public static int contadorLineas(String metodo, File archivo) throws FileNotFoundException {
        int contador = 0;
        Scanner scanne = new Scanner(archivo);
        if (metodo.equals("phy")) {
            while (scanne.hasNextLine()) {
                scanne.nextLine();
                contador += 1;
            }
        } else if (metodo.equals("loc"))
            while (scanne.hasNextLine()) {
                String line = scanne.nextLine().strip();
                if (line.length() > 0) {
                    if (!(line.startsWith("/")) && (!(line.startsWith("*")))) {
                        contador += 1;
                    }
                }
            }
        // System.out.println("La cantidad de lineas de tipo " + args[0] + " es de " +
        // contador);
        return contador;

    }

    public static void main(String[] args) throws FileNotFoundException {
        lector_archivos(args[0], args[1]);
    }
}