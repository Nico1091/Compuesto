
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nico
 */
public class PowerPoint {

public class OpenPowerPoint {
    public static void main(String[] args) {
        try {
            // Cambia la ruta a la ubicación de PowerPoint en tu sistema
            String powerpointPath = "C:\\Program Files\\Microsoft Office\\root\\Office16\\POWERPNT.EXE";

            // Ejecuta el comando para abrir PowerPoint
            Process process = Runtime.getRuntime().exec(powerpointPath);

            // Espera a que se cierre PowerPoint
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("PowerPoint se ha cerrado correctamente.");
            } else {
                System.out.println("Ocurrió un problema al intentar abrir PowerPoint.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




}
