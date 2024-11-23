package Pertemuan6.Latihan1;


class Segitiga extends BangunDatar {
  float alas;
  float tinggi;

  Segitiga(float alas, float tinggi) {
      this.alas = alas;
      this.tinggi = tinggi;
  }

  @Override
  float luas() {
      return (alas * tinggi) / 2;
  }

  @Override
  float keliling() {
      // Menghitung sisi miring menggunakan teorema Pythagoras
      float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
      return alas + tinggi + sisiMiring;
  }
}