package Pertemuan9.TUGAS.Overloading;

import java.util.Scanner;

public class Segitiga {
  private int sudut;

  public void setSudut(int sudut) {
    this.sudut = sudut;
  }

  public int getSudut() {
    return sudut;
  }

  public int totalSudut(int sudutA) {
    return sudut = 180 - sudutA;
  }

  public int totalSudut(int sudutA, int sudutB) {
    return sudut = 180 - (sudutA - sudutB);
  }

  public int keliling(int sisiA, int sisiB, int sisiC) {
    return sisiA + sisiB + sisiC;
  }

  public double keliling(int sisiA, int sisiB) {
    return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Segitiga segitiga = new Segitiga();
    boolean keluar = false;

    while (!keluar) {
      System.out.println("===========================================================");
      System.out.println("|                APLIKASI HITUNG SEGITIGA                 |");
      System.out.println("===========================================================");
      System.out.printf("| %-55s |%n", "Menu:");
      System.out.printf("| %-55s |%n", "1. Hitung Total Sudut (1 sudut diketahui)");
      System.out.printf("| %-55s |%n", "2. Hitung Total Sudut (2 sudut diketahui)");
      System.out.printf("| %-55s |%n", "3. Hitung Keliling (3 sisi diketahui)");
      System.out.printf("| %-55s |%n", "4. Hitung Sisi Miring Segitiga Siku-Siku");
      System.out.printf("| %-55s |%n", "5. Keluar");
      System.out.println("===========================================================");

      System.out.print("Pilih menu: ");
      int menu = input.nextInt();

      switch (menu) {
        case 1:
          System.out.println("-----------------------------------------------------------");
          System.out.println("|         Hitung Total Sudut (1 sudut diketahui)          |");
          System.out.println("-----------------------------------------------------------");
          System.out.print("| Masukkan sudut A: ");
          int sudutA = input.nextInt();
          System.out.printf("| %-55s |%n", "Total sudut dengan satu sudut diketahui: " + segitiga.totalSudut(sudutA));
          System.out.println("-----------------------------------------------------------");
          break;

        case 2:
          System.out.println("-----------------------------------------------------------");
          System.out.println("|         Hitung Total Sudut (2 sudut diketahui)          |");
          System.out.println("-----------------------------------------------------------");
          System.out.print("| Masukkan sudut A: ");
          sudutA = input.nextInt();
          System.out.print("| Masukkan sudut B: ");
          int sudutB = input.nextInt();
          System.out.printf("| %-55s |%n",
              "Total sudut dengan dua sudut diketahui: " + segitiga.totalSudut(sudutA, sudutB));
          System.out.println("-----------------------------------------------------------");
          break;

        case 3:
          System.out.println("-----------------------------------------------------------");
          System.out.println("|           Hitung Keliling (3 sisi diketahui)            |");
          System.out.println("-----------------------------------------------------------");
          System.out.print("| Masukkan sisi A: ");
          int sisiA = input.nextInt();
          System.out.print("| Masukkan sisi B: ");
          int sisiB = input.nextInt();
          System.out.print("| Masukkan sisi C: ");
          int sisiC = input.nextInt();
          System.out.printf("| %-55s |%n",
              "Keliling segitiga dengan tiga sisi: " + segitiga.keliling(sisiA, sisiB, sisiC));
          System.out.println("-----------------------------------------------------------");
          break;

        case 4:
          System.out.println("-----------------------------------------------------------");
          System.out.println("|          Hitung Sisi Miring Segitiga Siku-Siku          |");
          System.out.println("-----------------------------------------------------------");
          System.out.print("| Masukkan sisi A (siku-siku): ");
          sisiA = input.nextInt();
          System.out.print("| Masukkan sisi B (siku-siku): ");
          sisiB = input.nextInt();
          System.out.printf("| %-55s |%n",
              "Sisi miring (keliling) segitiga siku-siku: " + segitiga.keliling(sisiA, sisiB));
          System.out.println("-----------------------------------------------------------");
          break;

        case 5:
          keluar = true;
          System.out.println("-----------------------------------------------------------");
          System.out.printf("| %-55s |%n", "Terima kasih telah menggunakan program ini.");
          System.out.println("-----------------------------------------------------------");
          break;

        default:
        System.out.println("-----------------------------------------------------------");
          System.out.printf("| %-55s |%n", "Pilihan tidak valid. Silakan coba lagi.");
          System.out.println("-----------------------------------------------------------");
          break;
      }
    }
    input.close();
  }
}
