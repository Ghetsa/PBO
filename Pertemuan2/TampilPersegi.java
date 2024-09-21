package Pertemuan2;

import java.util.Scanner;

public class TampilPersegi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("===============================================");
    System.out.println("|           Tampil Persegi Persegi            |");
    System.out.println("===============================================");
    System.out.print("| Masukkan panjang sisi persegi: ");
    int sisi = scanner.nextInt();

    Persegi persegi = new Persegi(sisi);

    System.out.println("-----------------------------------------------");
    System.out.printf("| %-43s |%n", "Luas persegi: " + persegi.luasPersegi(), "");
    System.out.printf("| %-43s |%n", "Keliling persegi: " + persegi.kelilingPersegi(), "");
    System.out.println("===============================================");

  }
}
