/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraoperativa;

import Operators.Operators;

/**
 *
 * @author estudiantelis
 * Clase ArrangeOperator: Se encarga de gestionar las operaciones aritméticas y de bits.
 */
public class ArrangeOperator {
    
    // Variables para almacenar las opciones seleccionadas y los valores
    private int a;
    private int b;
    private final float value1;
    private final float value2;
    private final int valueBin1;
    private final int valueBin2;
    
    // Instancia de la clase Operators
    public Operators operator = new Operators();
    
    // Constructor para operaciones aritméticas
    public ArrangeOperator(int a, int b, float value1, float value2) {
        this.a = a;
        this.b = b;
        this.value1 = value1;
        this.value2 = value2;
        this.valueBin1 = 0;
        this.valueBin2 = 0;
    }
    
    // Constructor para operaciones de bits que requieren dos valores
    public ArrangeOperator(int a, int b, int valueBin1, int valueBin2) {
        this.a = a;
        this.b = b;
        this.valueBin1 = valueBin1;
        this.valueBin2 = valueBin2;
        this.value1 = 0;
        this.value2 = 0;
    }
    
    // Constructor para operaciones de bits que requieren un solo valor (NOT)
    public ArrangeOperator(int a, int b, int valueBin1) {
        this.a = a;
        this.b = b;
        this.valueBin1 = valueBin1;
        this.valueBin2 = 0;
        this.value1 = 0;
        this.value2 = 0;
    }
    
    // Método que realiza las operaciones aritméticas basadas en las opciones a y b
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
    
    // Método que realiza operaciones de bits basadas en las opciones a y b
    public String operatorBinarios() {
        int result;
        if(a == 2 && b == 1) {
            result = operator.orBin(valueBin1, valueBin2);
            return Integer.toBinaryString(valueBin1) + " OR " + Integer.toBinaryString(valueBin2) + " = " + Integer.toBinaryString(result);
        } else if (a == 2 && b == 2) {
            result = operator.andBin(valueBin1, valueBin2);
            return Integer.toBinaryString(valueBin1) + " AND " + Integer.toBinaryString(valueBin2) + " = " + Integer.toBinaryString(result);
        } else if (a == 2 && b == 3) {
            result = operator.xorBin(valueBin1, valueBin2);
            return Integer.toBinaryString(valueBin1) + " XOR " + Integer.toBinaryString(valueBin2) + " = " + Integer.toBinaryString(result);
        } else if(a == 2 && b == 4){    
            result = operator.notBin(valueBin1);
            return Integer.toBinaryString(valueBin1) + " NOT " +  " = " + Integer.toBinaryString(result);
        } else if (a == 2 && b == 5){         
            result = operator.desplazaIzqBin(valueBin1, valueBin2);
            return Integer.toBinaryString(valueBin1) + " << " + Integer.toBinaryString(valueBin2) + " = " + Integer.toBinaryString(result);
        } else if (a == 2 && b == 6){
            result = operator.desplazaDerBin(valueBin1, valueBin2);
            return Integer.toBinaryString(valueBin1) + " >> " + Integer.toBinaryString(valueBin2) + " = " + Integer.toBinaryString(result);
        } else if (a == 2 && b == 7){
            result = operator.desplazaDerSinSignoBin(valueBin1, valueBin2);
            return Integer.toBinaryString(valueBin1) + " >>> " + Integer.toBinaryString(valueBin2) + " = " + Integer.toBinaryString(result);
        }
        return "Alguna opcion es incorrecta";
    }   
    
    public String addMinusBin() {
        int result;
        if(a == 3 && b == 1) {
            result = operator.addBit(valueBin1, valueBin2);
            return valueBin1 + " + " + valueBin2 + " = " + result;
        } else if (a == 3 && b == 2) {
            result = operator.minusBit(valueBin1, valueBin2);
            return valueBin1 + " - " + valueBin2 + " = " + result;
        }
        return "Alguna opcion es incorrecta";
    }
}
