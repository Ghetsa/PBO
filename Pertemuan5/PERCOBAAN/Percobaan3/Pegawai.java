package Pertemuan5.PERCOBAAN.Percobaan3;

public class Pegawai {
  private String nip;
  private String nama;

  Pegawai(String nip, String nama) {
    this.nip = nip;
    this.nama = nama;
  }

  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String info() {
    String info = "";
    info += "Nip: " + this.nip + "\n";
    info += "Nama: " + this.nama + "\n";
    return info;
  }

  
}
