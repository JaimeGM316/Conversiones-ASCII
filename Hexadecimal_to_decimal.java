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
public class Hexadecimal_to_decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hexadecimal: ");
        String cifra = sc.nextLine();
        System.out.print("Decimal: ");
        decimal(cifra);
        System.out.println("");
    }

    public static void decimal(String s) {
        String digits = "0123456789ABCDEF";  
             s = s.toUpperCase();  
             int resultado = 0;  
             for (int i = 0; i < s.length(); i++)  
             {  
                 char c = s.charAt(i);  
                 int d = digits.indexOf(c);  
                 resultado = 16*resultado + d;  
             }  
             System.out.println(resultado);
}  
}
