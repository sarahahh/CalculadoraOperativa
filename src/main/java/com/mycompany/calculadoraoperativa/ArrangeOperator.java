/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraoperativa;

import Operators.Operators;
import Utility.Input;
import java.io.IOException;

/**
 *
 * @author estudiantelis
 */
public class ArrangeOperator {
    private int a;
    private int b;
    private float value1;
    private float value2;
    
    public Operators operator = new Operators();
    
    public ArrangeOperator(int a, int b, float value1, float value2) {
        this.a = a;
        this.b = b;
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public void operacion() {
        Input In = new Input();
        if(a == 1 && b == 1) {
            float result = operator.sumar(value1, value2);
            
            System.out.println(value1 + " + " + value2 + " = " + result);
        }
    }
    
}
