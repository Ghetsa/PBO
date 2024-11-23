package Pertemuan5.TUGAS.tugas;

public class Pembeli {
  private String nama;
  private String alamat;

  public Pembeli(String nama, String alamat) {
    this.nama = nama;
    this.alamat = alamat;
  }

  public void beliBuku(Buku buku) {

    System.out.println("-----------------------------------------------------------");
    System.out.printf("| %-55s |%n", nama + " membeli buku berjudul: " + buku.getJudul(), "");
    System.out.println("-----------------------------------------------------------");
  }
}