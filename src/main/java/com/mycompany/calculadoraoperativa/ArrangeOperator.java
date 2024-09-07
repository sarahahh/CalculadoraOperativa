/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraoperativa;

import Operators.Operators;

/**
 *
 * @author estudiantelis
 */
public class ArrangeOperator {
    private int a;
    private int b;
    private final float value1;
    private final float value2;
    
    public Operators operator = new Operators();
    
    public ArrangeOperator(int a, int b, float value1, float value2) {
        this.a = a;
        this.b = b;
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public String arithmeticOperator() {
        float result;
        if(a == 1 && b == 1) {
            result = operator.add(value1, value2);
            return value1 + " + " + value2 + " = " + result;
        } else if (a == 1 && b == 2) {
            result = operator.minus(value1, value2);
            return value1 + " - " + value2 + " = " + result;
        } else if (a == 1 && b == 3) {
            result = operator.multiplied(value1, value2);
            return value1 + " * " + value2 + " = " + result;
        } else if (a == 1 && b == 4) {
            result = operator.divided(value1, value2);
            return value1 + " / " + value2 + " = " + result;
        } else if (a == 1 && b == 5) {
            result = operator.module(value1, value2);
            return value1 + " % " + value2 + " = " + result;
        }
        return "Alguna opcion es incorrecta";
    }
    
}
