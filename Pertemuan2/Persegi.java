package Pertemuan2;

class Persegi {
  int sisi;

  public Persegi(int sisi) {
    this.sisi = sisi;
  }

  public void dataPersegi() {
    System.out.println("Panjang sisi persegi: " + sisi);
  }

  public int luasPersegi() {
    return sisi * sisi;
  }

  public int kelilingPersegi() {
    return 4 * sisi;
  }
}