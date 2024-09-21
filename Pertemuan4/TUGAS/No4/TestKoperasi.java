package Pertemuan4.TUGAS.No4;

import java.util.Scanner;

public class TestKoperasi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int menu = 0;
    Anggota donny = new Anggota("111333444", "Donny", 5000000);
    System.out.println("===========================================================");
    System.out.println("|                    APLIKASI KOPERASI                    |");
    System.out.println("===========================================================");
    System.out.printf("| %-55s |%n", "Nama Anggota: " + donny.getNama(), "");
    System.out.printf("| %-55s |%n", "Limit Pinjaman: " + donny.getLimitPinjaman(), "");
    System.out.println("-----------------------------------------------------------");
    do {
      System.out.printf("| %-55s |%n", "Menu:", "");
      System.out.printf("| %-55s |%n", "1. Pinjam Uang", "");
      System.out.printf("| %-55s |%n", "2. Bayar Angsuran", "");
      System.out.printf("| %-55s |%n", "0. Bayar Angsuran", "");
      System.out.println("-----------------------------------------------------------");
      System.out.print("| Pilih (1/2/0): ");
      menu = scanner.nextInt();

      switch (menu) {
        case 1:
          System.out.println("-----------------------------------------------------------");
          System.out.println("|                     Peminjaman Uang                     |");
          System.out.println("-----------------------------------------------------------");
          System.out.print("| Masukkan jumlah pinjaman: ");
          int jumlahPinjam = scanner.nextInt();
          donny.pinjam(jumlahPinjam);
          break;
        case 2:
          System.out.println("-----------------------------------------------------------");
          System.out.println("|                   Pembayaran Angsuran                   |");
          System.out.println("-----------------------------------------------------------");
          System.out.print("| Masukkan jumlah angsuran: ");
          int jumlahAngsuran = scanner.nextInt();
          donny.angsur(jumlahAngsuran);
          break;
        case 0:
          System.out.println("-----------------------------------------------------------");
          System.out.println("|               !!! KELUAR DARI PROGRAM !!!               |");
          System.out.println("-----------------------------------------------------------");
          break;
        default:
          System.out.printf("| %-55s |%n", "Pilihan Menu anda salah, silahkan coba lagi...", "");
      }
    } while (menu != 0);

    // System.out.println("Nama Anggota: " + donny.getNama());
    // System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

    // System.out.println("\nMeminjam uang 10.000.000...");
    // donny.pinjam(10000000);
    // // System.out.println("Jumlah pinjaman saat ini: " +
    // donny.getJumlahPinjaman());

    // System.out.println("\nMeminjam uang 4.000.000...");
    // donny.pinjam(4000000);
    // // System.out.println("Jumlah pinjaman saat ini: " +
    // donny.getJumlahPinjaman());

    // System.out.println("\nMembayar angsuran 1.000.000");
    // donny.angsur(1000000);
    // // System.out.println("Jumlah pinjaman saat ini: " +
    // donny.getJumlahPinjaman());

    // System.out.println("\nMembayar angsuran 3.000.000");
    // donny.angsur(3000000);
    // // System.out.println("Jumlah pinjaman saat ini: " +
    // donny.getJumlahPinjaman());

  }
}