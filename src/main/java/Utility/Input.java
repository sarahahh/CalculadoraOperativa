/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author estudiantelis
 */
public class Input {
    
    public static Scanner teclado = new Scanner(System.in); 
    public static BufferedReader bIn = new BufferedReader( new InputStreamReader (System.in) ); 
    public static Validations vali = new Validations();

    public static int leerInt(String mensaje) throws IOException{
        return vali.validationInt(mensaje);
    }
    
    public static String leerString(String mensaje) throws IOException{
        
        
        String dato;
        System.out.println(mensaje);
        dato = bIn.readLine();
        return dato;
    }
    
    public static String leerLinea(String mensaje) throws IOException{
        String dato;
        System.out.println(mensaje);
        dato = bIn.readLine();
        return dato;
    }
    
    public static float leerFloat(String mensaje)throws IOException{
        return vali.validationFloat(mensaje);
    }    
    
}
