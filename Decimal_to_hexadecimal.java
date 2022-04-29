package Conversiones_ASCII;

import java.util.Scanner;

public class Decimal_to_hexadecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal: ");
        int cifra = sc.nextInt();
        System.out.print("Hexadecimal: ");
        hexadecimal(cifra);
        System.out.println("");
    }

    public static void hexadecimal(int N) {
        if (N < 16) {
            if (N == 10) {
                System.out.print("A");
            }
            if (N == 11) {
                System.out.print("B");
            }
            if (N == 12) {
                System.out.print("C");
            }
            if (N == 13) {
                System.out.print("D");
            }
            if (N == 14) {
                System.out.print("E");
            }
            if (N == 15) {
                System.out.print("F");
            }
            if (N < 10) {
                System.out.print(N);
            }
        } else {
            hexadecimal(N / 16);
            System.out.println(N % 16);
        }
    }
}
