package Pertemuan5.PERCOBAAN.Percobaan2;

public class Pelanggan {

  private String nama;
  private Mobil mobil;
  private Sopir sopir;
  private int hari;

  Pelanggan() {
  }

  Pelanggan(String nama, Mobil mobil, Sopir sopir, int hari) {
    this.nama = nama;
    this.mobil = mobil;
    this.sopir = sopir;
    this.hari = hari;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public Mobil getMobil() {
    return mobil;
  }

  public void setMobil(Mobil mobil) {
    this.mobil = mobil;
  }

  public Sopir getSopir() {
    return sopir;
  }

  public void setSopir(Sopir sopir) {
    this.sopir = sopir;
  }

  public int getHari() {
    return hari;
  }

  public void setHari(int hari) {
    this.hari = hari;
  }

  public int hitungBiayaTotal() {
    return mobil.hitungBiayaMobil(hari) +
        sopir.hitungBiayaSopir(hari);
  }

}
