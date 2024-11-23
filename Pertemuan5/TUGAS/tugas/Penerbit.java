package Pertemuan5.TUGAS.tugas;

public class Penerbit {
  private String nama;
  private String alamat;

  public Penerbit(String nama, String alamat) {
    this.nama = nama;
    this.alamat = alamat;
  }

  public String getNama() {
    return nama;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getAlamat() {
    return alamat;
  }
  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public void tampilkanInfoPenerbit() {
    System.out.printf("| %-55s |%n", "Penerbit: " + nama + ", Alamat: " + alamat, "");
  }
}