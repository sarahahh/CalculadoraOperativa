/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.Scanner; // Importar la clase Scanner para leer entradas de consola
import java.io.BufferedReader; // Importar BufferedReader para leer entradas de texto
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author estudiantelis
 */
public class Input {
    
    // Crear objetos Scanner, Buffer y Validation
    public static Scanner teclado = new Scanner(System.in); 
    public static BufferedReader bIn = new BufferedReader( new InputStreamReader (System.in) ); 
    public static Validations vali = new Validations();

    // Método para leer y validar un número entero
    public static int leerInt(String mensaje) throws IOException{
        return vali.validationInt(mensaje);
    }
    
    // Método para leer y devolver una cadena de texto
    public static String leerString(String mensaje) throws IOException{
        String dato;
        System.out.println(mensaje);
        dato = bIn.readLine();
        return dato;
    }
    
    // Método para leer y devolver una línea completa de texto
    public static String leerLinea(String mensaje) throws IOException{
        String dato;
        System.out.println(mensaje);
        dato = bIn.readLine();
        return dato;
    }
    
    // Método para leer y validar un número flotante
    public static float leerFloat(String mensaje) throws IOException {
        return vali.validationFloat(mensaje);
    }    
    
    // Método para leer y validar un número binario
    public static int leerBin(String messange) throws IOException {
        return vali.validationBin(messange);
    }  
}
