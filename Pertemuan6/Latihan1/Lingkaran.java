package Pertemuan6.Latihan1;

public class Lingkaran extends BangunDatar {
  float r;

  Lingkaran(float r) {
      this.r = r;
  }

  @Override
  float luas() {
      return (float) (Math.PI * r * r);
  }

  @Override
  float keliling() {
      return (float) (2 * Math.PI * r);
  }
}
