/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import static Utility.Input.bIn;
import java.io.IOException;

/**
 *
 * @author estudiantelis
 */
public class Validations {
    public float validationFloat(String label) throws IOException {
        
        do {
            System.out.print(label);
            try {
                float retornar = Float.parseFloat(bIn.readLine());
                return retornar;
            } catch(NumberFormatException e) {
            System.err.println("Debe ingresar un dato Float y que sea con punto.");
            }
        } while(true);
    }
    
    public int validationInt(String label) throws IOException {
        
        do {
            System.out.print(label);
            try {
                int retornar = Integer.parseInt(bIn.readLine());
                return retornar;
            } catch(NumberFormatException e) {
            System.err.println("Debe ingresar un dato entero. \n");
            }
        } while(true);
    }
    
    public int validationBin(String label) throws IOException {
        int bin = validationInt(label);
        int i = bin;
        while (i >= 1) {
            if (i % 10 > 1) {
                System.out.println("El numero ingresado no es binario");
                bin = validationInt(label);
                i = bin;
            }
            i = i / 10;
        }
        return bin;
    }
}
