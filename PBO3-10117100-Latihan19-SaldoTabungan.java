package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double Saldo, Bunga, Bunga1, Target;
        double Bulan = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("=====Program Bunga Bank======");
        System.out.print("Saldo Awal     : Rp ");
        Saldo = sc.nextDouble();
        System.out.print("Bunga/Bulan (%): ");
        Bunga = sc.nextDouble();
        System.out.print("Saldo Target   : Rp ");
        Target = sc.nextDouble();


        System.out.println();
        Bunga = Bunga / 100;
        for (Bulan = 1; Saldo <= Target; Bulan++) {
            Bunga1 = Saldo * Bunga;
            Saldo = (int) (Saldo + Bunga1);
            System.out.println("Saldo di bulan ke- " + Bulan + "  Rp " +Saldo);

        }
    }
}
