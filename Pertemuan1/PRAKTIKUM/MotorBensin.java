package PRAKTIKUM;

public class MotorBensin extends Motor {
  private int kapasitasBensin;
  private double persentaseBensin, bensin;

  public void setPersenBensin(int newValue) {
    persentaseBensin = newValue;
    bensinSekarang(); 

  }

  public void setKapasitasBensin(int newValue) {
    kapasitasBensin = newValue;
  }

  public void bensinSekarang() {
    bensin = persentaseBensin * kapasitasBensin / 100;
  }

  public void updatePersenBensin() {
    persentaseBensin = (bensin / kapasitasBensin) * 100;
  }

  public void isiBensin(int increment) {
    bensinSekarang(); 
    if (bensin + increment <= kapasitasBensin) {
      bensin += increment;
    } else if (bensin + increment >= kapasitasBensin) {
      bensin = kapasitasBensin;
    }
    updatePersenBensin();
  }

  public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Kapasitas Bensin    : " + kapasitasBensin);
    System.out.println("Bensin Sekarang     : " + bensin + "L");
    System.out.println("Persen Bensin       : " + persentaseBensin + "%");
    System.out.println("---------------------------------");
  }
}