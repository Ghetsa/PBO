package Pertemuan5.PERCOBAAN.Percobaan4;

public class Gerbong {
  private Kursi[] arrayKursi;
  private String kode;

  Gerbong(String kode, int jumlah) {
    this.kode = kode;
    this.arrayKursi = new Kursi[jumlah];
    this.initKursi();
  }

  private void initKursi() {
    for (int i = 0; i < arrayKursi.length; i++) {
      this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
    }
  }

  public String info() {
    String info = "";
    info += "Kode: " + kode + "\n";
    for (Kursi kursi : arrayKursi) {
      info += kursi.info();
    }
    return info;
  }

  public String getKode() {
    return kode;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public Kursi[] getArrayKursi() {
    return arrayKursi;
  }

  public void setPenumpang(Penumpang penumpang, int nomor) {
    this.arrayKursi[nomor - 1].setPenumpang(penumpang);
  }
}
