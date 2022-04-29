package Conversiones_ASCII;

import java.util.Scanner;

public class Decimal_to_binario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal: ");
        int cifra = sc.nextInt();
        System.out.print("Binario: ");
        binario(cifra);
        System.out.println("");
    }

    public static void binario(int N) {
        if (N == 1) {
            System.out.print("1");
        } else {
            binario(N / 2);
            System.out.print(N % 2);
        }
    }

}
