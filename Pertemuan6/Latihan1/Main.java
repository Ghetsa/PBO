package Pertemuan6.Latihan1;

public class Main {
  public static void main(String[] args) {
      // Contoh objek Persegi Panjang
      PersegiPanjang persegiPanjang = new PersegiPanjang(5, 10);
      System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
      System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

      // Contoh objek Lingkaran
      Lingkaran lingkaran = new Lingkaran(7);
      System.out.println("Luas Lingkaran: " + lingkaran.luas());
      System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

      // Contoh objek Segitiga
      Segitiga segitiga = new Segitiga(6, 8);
      System.out.println("Luas Segitiga: " + segitiga.luas());
      System.out.println("Keliling Segitiga: " + segitiga.keliling());
  }
}