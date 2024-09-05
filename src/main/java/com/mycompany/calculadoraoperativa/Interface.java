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
        
        decition1 = In.leerInt("Que desea hacer?\n1). Operaciones matematicas.\n2). Operadores racionales.\n3). Operadores de bits.\n\n");
        switch (decition1) {
            case 1:
                decition2 = In.leerInt("Que desea hacer?\n1). Sumar.\n2). Restar.\n3). Multiplicar.\n4). Dividir.\n5). Modulo.\n\n");
                float value1 = In.leerFloat("Ingrese un valor: ");
                float value2 = In.leerFloat("Ingrese un valor: ");
                ArrangeOperator operator = new ArrangeOperator(decition1, decition2, value1, value2);
                operator.operacion();
                break;
        }
    }
}
