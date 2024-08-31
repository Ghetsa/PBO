package PRAKTIKUM;

public class MotorListrik extends Motor {
  private int kapasitasBaterai, persentaseBaterai;

  public void setKapasitasBaterai(int newValue) {
    kapasitasBaterai = newValue;
  }

  public void setPersenBaterai(int newValue) {
    persentaseBaterai = newValue;
  }
  public void isiDaya(int increment) {
    // System.out.println("---------------------------------");
    if (persentaseBaterai == 100) {
      // System.out.println("Baterai sudah penuh");
    } else if (persentaseBaterai + increment <= 100) {
      persentaseBaterai += increment;
      // System.out.println("|Mengisi daya selesai: " + persentaseBaterai + "%\t|");
    } else if (persentaseBaterai + increment >= 100) {
      persentaseBaterai = 100;
      // System.out.println("Mengisi daya selesai: " + persentaseBaterai + "%\n");
    }
    // System.out.println("---------------------------------");

  }

  public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Kapasitas Bensin    : " + kapasitasBaterai);
    System.out.println("Persen Bensin       : " + persentaseBaterai + "%");
    System.out.println("---------------------------------");
  }
}
