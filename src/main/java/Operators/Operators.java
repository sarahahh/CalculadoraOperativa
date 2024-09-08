/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operators;

/**
 *
 * @author estudiantelis
 * Clase Operators: Contiene métodos para realizar operaciones matemáticas y de bits.
 */
public class Operators {
    
    public float add(float a, float b) {
        return a + b;
    }
    
    public float minus(float a, float b) {
        return a - b;
    }
    
    public float multiplied(float a, float b) {
        return a * b;
    }
    
    public float divided(float a, float b) {
        return a / b;
    }
    
    public float module(float a, float b) {
        return a % b;
    }
    
    public int orBin(int a, int b) {
        return a | b;
    }
    
    public int andBin(int a, int b) {
        return a & b;
    }
    
    public int xorBin(int a, int b) {
        return a ^ b;
    }
    
    public int notBin(int a) {
        return ~ a;
    }
    
    public int desplazaIzqBin(int a, int b) {
        return a << b;
    }
    
    public int desplazaDerBin(int a, int b) {
        return a >> b;
    }
    
    public int desplazaDerSinSignoBin(int a, int b) {
        return a >>> b;
    }
    
    public int addBit(int a, int b) {
        int aux = 0;
        int i = 1;
        int result = 0;
        while (a > 0 || b > 0) {
            if ((a%10)+(b%10)+aux > 1){
                result += ((a%10)+(b%10)+aux - 2)*i;
                 aux = 1;
            } else {
                result += ((a%10)+(b%10)+aux)*i;
                aux = 0;
            }
            i *= 10;
            a /= 10;
            b /= 10;
        }
        if (aux == 1) {
            result += aux*i;
        }
        return result;
    }
    
    public int minusBit(int a, int b){
        int aux = 0;
        int i = 1;
        int result = 0;

        // Mientras haya bits que procesar en ambos números
        while (a > 0 || b > 0) {
            int bitA = a % 10;
            int bitB = b % 10;
            bitA -= aux;
            if (bitA < bitB) {
                bitA += 2;
                aux = 1;
            } else {
                aux = 0;
            }
            int bitResult = bitA - bitB;
            result += bitResult * i;
            a /= 10;
            b /= 10;
            i *= 10;
        }
        return result;
    }
}
