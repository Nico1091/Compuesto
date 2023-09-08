/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_num;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Nico
 */
public class Lista_num {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lista de rango: 1-8
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.sort(lista); // Aseguramos que la lista esté ordenada

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Ingrese un numero para buscar en la lista (1-8) o escriba 'salir' para finalizar: ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("salir")) {
                try {
                    int numeroBuscado = Integer.parseInt(input);
                    int resultado = busquedaBinaria(lista, numeroBuscado);

                    if (resultado != -1) {
                        System.out.println("El numero " + numeroBuscado + " se encuentra en la posicion " + resultado);
                    } else {
                        System.out.println("El numero " + numeroBuscado + " no se encuentra en la lista.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número valido.");
                }
            }
        } while (!input.equalsIgnoreCase("salir"));
    }

    public static int busquedaBinaria(int[] lista, int numeroBuscado) {
        int izquierda = 0;
        int derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (lista[medio] == numeroBuscado) {
                return medio; // Encontrado
            } else if (lista[medio] < numeroBuscado) {
                izquierda = medio + 1; // El número buscado está en la mitad derecha
            } else {
                derecha = medio - 1; // El número buscado está en la mitad izquierda
            }
        }

        return -1; // No encontrado
    }
}