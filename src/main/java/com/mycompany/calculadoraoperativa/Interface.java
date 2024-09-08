/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraoperativa;

import Utility.Input;
import java.io.IOException;
/**
 * 
 * @author estudiantelis
 * Clase Interface: Maneja la interacción con el usuario para la calculadora.
 */
public class Interface {
    
    // Método que muestra el menú y maneja las decisiones del usuario
    public void messenge() throws IOException {
        Input In = new Input(); // Instancia de la clase Input
        int decition1;  
        int decition2;
        
        System.out.println("Bienvenido a la calculadora de operaciones.\n\n");
        
        // Primer menú de opciones
        decition1 = In.leerInt("Que desea hacer?\n\n1). Operaciones matematicas con numeros reales.\n2). Operadores de bits. \n3). Suma y resta de numeros binarios.\n\n");
        
        // Switch para manejar la primera decisión del usuario
        switch (decition1) {
            // Menú de operaciones matemáticas básicas
            case 1:
                decition2 = In.leerInt("Que desea hacer?\n\n1). Sumar.\n2). Restar.\n3). Multiplicar.\n4). Dividir.\n5). Modulo.\n\n");
                float value1 = In.leerFloat("Ingrese el primer valor: ");
                float value2 = In.leerFloat("Ingrese el segundo valor: ");
                ArrangeOperator operator = new ArrangeOperator(decition1, decition2, value1, value2);
                System.out.println(operator.arithmeticOperator());
                break;
            // Menú de operaciones con operadores de bits    
            case 2:
                decition2 = In.leerInt("Que desea hacer?\n\n1). Or.\n2). And.\n3). XOR.\n4). NOT.\n5). Desplazamiento izquierda. \n6). Desplazamiento derecha. \n7). desplazamiento derecha sin signo\n\n");
                if (decition2 == 4){
                    int valueBin1 = In.leerInt("Ingrese el valor del bit como numero entero: ");
                    ArrangeOperator operatorBin = new ArrangeOperator(decition1, decition2, valueBin1);
                    System.out.println(operatorBin.operatorBinarios());
                }else{
                    int valueBin1 = In.leerInt("Ingrese el primer valor del bit como numero entero: ");
                    int valueBin2 = In.leerInt("Ingrese el segundo valor del bit como numero entero: ");
                    ArrangeOperator operatorBin = new ArrangeOperator(decition1, decition2, valueBin1, valueBin2);
                    System.out.println(operatorBin.operatorBinarios());
                }
                break;
            // Menu de suma y resta de bits.
            case 3:
                decition2 = In.leerInt("Que desea hacer?\n\n1). Sumar.\n2). restar.\n\n");
                int valueBin1 = In.leerBin("Ingrese el primer valor del bit: ");
                int valueBin2 = In.leerBin("Ingrese el segundo valor del bit: ");
                ArrangeOperator operatorBin = new ArrangeOperator(decition1, decition2, valueBin1, valueBin2);
                System.out.println(operatorBin.addMinusBin());
                break;
            default:
            System.out.println("Opcion incorrecta.");
            break;
        }
    }
}
