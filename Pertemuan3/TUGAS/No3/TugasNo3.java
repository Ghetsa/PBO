package Pertemuan3.TUGAS.No3;
public class TugasNo3 {
  class Lingkaran {
    public double phi = 3.14, r;

    public Lingkaran(double r) {
      this.r = r;
    }

    public double hitungLuas() { // method buat hitung luas
      double luas = phi * (r * r);
      return luas;
    }

    public double hitungKeliling() { // method buat hitung keliling
      double keliling = phi * (2 * r);
      return keliling;
    }
  }
}
