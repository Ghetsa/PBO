package Pertemuan5.TUGAS.tugas;

public class Penulis {
  private String nama;
  private String negara;

  public Penulis(String nama, String negara) {
      this.nama = nama;
      this.negara = negara;
  }

  public String getNama() {
      return nama;
  }
  
  public void setNama(String nama) {
      this.nama = nama;
  }

  public String getNegara() {
      return negara;
  }
  
  public void setNegara(String negara) {
      this.negara = negara;
  }

  public void tampilkanInfoPenulis() {
    System.out.printf("| %-55s |%n", "Penulis: " + nama + ", Negara: " + negara, "");
  }
}