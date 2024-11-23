package Pertemuan9.TUGAS.Overriding;

class Dosen extends Manusia {
  // Override method makan
  @Override
  public void makan() {
    System.out.println("| Dosen makan untuk menjaga energi mengajar      |");
  }

  public void lembur() {
    System.out.println("| Dosen lembur untuk mempersiapkan materi kuliah |");
  }
}