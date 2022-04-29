/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones_ASCII;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Octal_to_decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Octal: ");
        String cifra = sc.nextLine();
        System.out.print("Decimal: ");
        decimal(cifra);
        System.out.println("");
    }

    public static void decimal(String s) {
        long resultado = 0;
        int potencia = 0;
        for (int x = s.length() - 1; x >= 0; x--) {
            int valorActual = Character.getNumericValue(s.charAt(x));
            long elevado = (long) Math.pow(8, potencia) * valorActual;
            resultado += elevado;
            potencia++;
        }
        System.out.println(resultado);
    }
}
