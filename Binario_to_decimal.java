package Conversiones_ASCII;

import java.util.Scanner;

public class Binario_to_decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binario: ");
        String cifra = sc.nextLine();
        System.out.print("Decimal: ");
        decimal(cifra);
        System.out.println("");
    }

    public static void decimal(String s) {
        int resultado = 0;
        int aux = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            resultado += Math.pow(2, aux) * Character.getNumericValue(s.charAt(i));
            aux++;
        }
        System.out.println(resultado);
    }
}
