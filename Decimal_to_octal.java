package Conversiones_ASCII;

import java.util.Scanner;

public class Decimal_to_octal {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal: ");
        int cifra = sc.nextInt();
        System.out.print("Octal: ");
        octal(cifra);
        System.out.println("");
    }

    public static void octal(int N) {
        if (N < 8) {
            System.out.print(N);
        } else {
            octal(N / 8);
            System.out.print(N % 8);
        }
    }
}
