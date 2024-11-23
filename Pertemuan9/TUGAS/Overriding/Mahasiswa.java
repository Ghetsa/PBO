package Pertemuan9.TUGAS.Overriding;

class Mahasiswa extends Manusia {
  // Override method makan
  @Override
  public void makan() {
    System.out.println("| Mahasiswa makan untuk menambah energi belajar  |");
  }

  public void tidur() {
    System.out.println("| Mahasiswa tidur untuk mengembalikan energi     |");
  }
}