package Pertemuan5.PERCOBAAN.Percobaan2;

public class Mobil {
  private String merk;
  private int biaya;

  Mobil() {
  }

  Mobil(String merk, int biaya) {
    this.merk = merk;
    this.biaya = biaya;
  }

  public String getMerk() {
    return merk;
  }

  public void setMerk(String newMerk) {
    merk = newMerk;
  }
  public int getBiaya() {
    return biaya;
  }

  public void setBiaya(int newBiaya) {
    biaya = newBiaya;
  }

  public int hitungBiayaMobil(int hari) {
    return biaya * hari;
    }
}
