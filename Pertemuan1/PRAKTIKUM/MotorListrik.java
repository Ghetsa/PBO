package PRAKTIKUM;

public class MotorListrik extends Motor {
  private int kapasitasBaterai;
  private double persentaseBaterai, Baterai;

  public void setPersenBaterai(int newValue) {
    persentaseBaterai = newValue;
    BateraiSekarang();

  }

  public void setKapasitasBaterai(int newValue) {
    kapasitasBaterai = newValue;
  }

  public void BateraiSekarang() {
    Baterai = (Baterai / kapasitasBaterai) * 100;
  }

  public void updatePersenBaterai() {
    persentaseBaterai = (Baterai / kapasitasBaterai) * 100;
  }

  public void isiBaterai(int increment) {
    BateraiSekarang();
    if (Baterai + increment <= kapasitasBaterai) {
      Baterai += increment;
    } else if (Baterai + increment >= kapasitasBaterai) {
      Baterai = kapasitasBaterai;
    }
    updatePersenBaterai();
  }

  public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Kapasitas Baterai   : " + kapasitasBaterai + "Wh");
    System.out.println("Baterai Sekarang    : " + Baterai + "Wh");
    System.out.println("Persen Baterai      : " + persentaseBaterai + "%");
    System.out.println("---------------------------------");
  }
}