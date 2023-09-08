/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daton;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico
 */
public class Daton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limiteInferior = 1;
        int limiteSuperior = 1000000;

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número a buscar
        System.out.print("Ingresa un número para buscar en el rango [" + limiteInferior + " - " + limiteSuperior + "]: ");
        int numeroBuscado = scanner.nextInt();

        // Realizar una búsqueda lineal en el rango
        boolean encontrado = false;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i == numeroBuscado) {
                encontrado = true;
                break; // Salir del bucle cuando se encuentra el número
            }
        }

        // Comprobar si se encontró el número
        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " fue encontrado en el rango.");
        } else {
            System.out.println("El número " + numeroBuscado + " no fue encontrado en el rango.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
    
}
