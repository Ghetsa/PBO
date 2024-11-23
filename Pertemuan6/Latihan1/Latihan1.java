package Pertemuan6.Latihan1;

abstract class BangunDatar {
  abstract float luas();

  abstract float keliling();
}

class PersegiPanjang extends BangunDatar {
  float panjang;
  float lebar;

  PersegiPanjang(float panjang, float lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  float luas() {
    return panjang * lebar;
  }

  float keliling() {
    return 2 * (panjang + lebar);
  }
}

class Lingkaran extends BangunDatar {
  float r;

  Lingkaran(float r) {
    this.r = r;
  }

  float luas() {
    return (float) (Math.PI * r * r);
  }

  float keliling() {
    return (float) (2 * Math.PI * r);
  }
}

class Segitiga extends BangunDatar {
  float alas;
  float tinggi;

  Segitiga(float alas, float tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  float luas() {
    return (alas * tinggi) / 2;
  }

  float keliling() {
    return 3 * alas;
  }
}

// Kelas Main untuk menjalankan program
public class Latihan1 {
  public static void main(String[] args) {
    PersegiPanjang pp = new PersegiPanjang(5, 3);
    Lingkaran lingkaran = new Lingkaran(7);
    Segitiga segitiga = new Segitiga(4, 6);

    System.out.println("===============================================================");
    System.out.println("|                     HITUNG BANGUN DATAR                     |");
    System.out.println("===============================================================");
    System.out.printf("| %-20s| %-16s| %-19s |%n", "Persegi Panjang", "Luas: " + pp.luas() , "Keliling: " + pp.keliling(), "");
    System.out.printf("| %-20s| %-16s| %-19s |%n", "Lingkaran", "Luas: " + lingkaran.luas() , "Keliling: " + lingkaran.keliling(), "");
    System.out.printf("| %-20s| %-16s| %-19s |%n", "Segitiga", "Luas: " + segitiga.luas() , "Keliling: " + segitiga.keliling(), "");
    System.out.println("---------------------------------------------------------------");
  }
}
