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
 */
public class Interface {
    public void messenge() throws IOException {
        Input In = new Input();
        int decition1;
        int decition2;
        
        System.out.println("Bienvenido a la calculadora de operaciones.\n\n");
        
        decition1 = In.leerInt("Que desea hacer?\n1). Operaciones matematicas con numeros reales.\n2). Operadores de bits. \n3). Suma y resta de numeros binarios.\n\n");
        switch (decition1) {
            case 1:
                decition2 = In.leerInt("Que desea hacer?\n1). Sumar.\n2). Restar.\n3). Multiplicar.\n4). Dividir.\n5). Modulo.\n\n");
                float value1 = In.leerFloat("Ingrese un valor: ");
                float value2 = In.leerFloat("Ingrese un valor: ");
                ArrangeOperator operator = new ArrangeOperator(decition1, decition2, value1, value2);
                System.out.println(operator.arithmeticOperator());
                break;
            case 2:
                decition2 = In.leerInt("Que desea hacer?\n1). Or.\n2). And.\n3). XOR.\n4). NOT.\n5). Desplazamiento izquierda. \n6). Desplazamiento derecha. \n7). desplazamiento derecha sin signo\n\n");
                int valueBin1 = In.leerInt("Ingrese el valor del bit como numero entero 1: ");
                int valueBin2 = In.leerInt("Ingrese el valor del bit como numero entero 2: ");
                ArrangeOperator operatorBin = new ArrangeOperator(decition1, decition2, valueBin1, valueBin2);
                System.out.println(operatorBin.operatorBinarios());
                break;
            default:
                System.out.println("Opcion incorrecta.");
                break;
        }
    }
}
