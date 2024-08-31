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
    // System.out.println("---------------------------------");
    // if (bensin == kapasitasBensin) {
    //   // System.out.println("Baterai sudah penuh");
    // } else 
    bensinSekarang(); 
    if (bensin + increment <= kapasitasBensin) {
      bensin += increment;
      // System.out.println("|Mengisi daya selesai: " + bensin + "%\t|");
    } else if (bensin + increment >= kapasitasBensin) {
      bensin = kapasitasBensin;
      // System.out.println("Mengisi daya selesai: " + bensin + "%\n");
    }
    // System.out.println("---------------------------------");
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
