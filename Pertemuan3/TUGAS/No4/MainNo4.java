package Pertemuan3.TUGAS.No4;

public class MainNo4 {

  public class Main {
    // Main method untuk menjalankan program
    public static void main(String[] args) {
      // Contoh penggunaan class Barang
      TugasNo4.Barang barang1 = new TugasNo4().new Barang("BR001", "Keyboard", 700000, 10);
      TugasNo4.Barang barang2 = new TugasNo4().new Barang("BR002", "Smartphone", 5000000, 50);
      TugasNo4.Barang barang3 = new TugasNo4().new Barang("BR003", "Headphone", 453000, 30);

      // Menampilkan data barang
      barang1.tampilData();
      barang2.tampilData();
      barang3.tampilData();
    }
  }
}
