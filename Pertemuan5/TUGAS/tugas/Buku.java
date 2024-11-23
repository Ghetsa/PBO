package Pertemuan5.TUGAS.tugas;

public class Buku {
  private String judul;
  private Penulis penulis;
  private Penerbit penerbit;
  private double harga;

  public Buku(String judul, Penulis penulis, Penerbit penerbit, double harga) {
    this.judul = judul;
    this.penulis = penulis;
    this.penerbit = penerbit;
    this.harga = harga;
  }

  public String getJudul() {
    return judul;
  }
  public void setJudul(String judul) {
    this.judul = judul;
  }

  public void tampilkanInfoBuku() {
    System.out.printf("| %-55s |%n", "Judul Buku: " + judul, "");
    penulis.tampilkanInfoPenulis();
    penerbit.tampilkanInfoPenerbit();
    System.out.printf("| %-55s |%n", "Harga: " + harga, "");

  }
}