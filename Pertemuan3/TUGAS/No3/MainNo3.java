package Pertemuan3.TUGAS.No3;

import Pertemuan3.TUGAS.No3.TugasNo3.Lingkaran;

public class MainNo3 {
  public static void main(String[] args) {
    TugasNo3.Lingkaran ling1 = new TugasNo3().new Lingkaran(2);
    TugasNo3.Lingkaran ling2 = new TugasNo3().new Lingkaran(5);
    TugasNo3.Lingkaran ling3 = new TugasNo3().new Lingkaran(10);

    System.out.println("===============================================");
    System.out.println("|     PROGRAM HITUNG LUAS & KELL LINGKARAN    |");
    System.out.println("===============================================");
    System.out.printf("| %-43s |%n", "Luas lingkaran 1     : " + ling1.hitungLuas(), "");
    System.out.printf("| %-43s |%n", "Keliling lingkaran 1 : " + ling1.hitungKeliling(), "");
    System.out.println("-----------------------------------------------");
    System.out.printf("| %-43s |%n", "Luas lingkaran 2     : " + ling2.hitungLuas(), "");
    System.out.printf("| %-43s |%n", "Keliling lingkaran 2 : " + ling2.hitungKeliling(), "");
    System.out.println("-----------------------------------------------");
    System.out.printf("| %-43s |%n", "Luas lingkaran 3     : " + ling3.hitungLuas(), "");
    System.out.printf("| %-43s |%n", "Keliling lingkaran 3 : " + ling3.hitungKeliling(), "");
    System.out.println("===============================================");
  }
}
