package Pertemuan5.PERCOBAAN.Percobaan2;

public class Sopir {
  private String nama;
  private int biaya;

  Sopir() {
  }

  Sopir(String nama, int biaya) {
    this.nama = nama;
    this.biaya = biaya;
  }

  public int hitungBiayaSopir(int hari) {
    return biaya * hari;
  }
  public int getBiaya() {
    return biaya;
  }

  public void setBiaya(int newBiaya) {
    biaya = newBiaya;
  }
  public String getNama() {
    return nama;
  }

  public void setNama(String newNama) {
    nama = newNama;
  }
}
