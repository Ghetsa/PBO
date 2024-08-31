package PRAKTIKUM;
public class Motor {
// 3.	MotorListrik
  // •	Atribut	: model, kapasitasLBaterai, lampuRem, lampuDepan, lampuSen
  // •	Method	: nyalakan(), matikan(), rem(), belokKanan(), belokKiri(), isiDaya()
// 4.	MotorBensin
  // •	Atribut	: model, kapasitasBensin, lampuRem, lampuDepan, lampuSen
  // •	Method	: nyalakan(), matikan(), rem(), belokKanan(), belokKiri(), isiBensin()

  private boolean power = false, lampuRem = false, lampuDepan = false, lampuSenKanan = false, lampuSenKiri = false;
  private String model;
  private int kecepatan = 0;

  public void setModel(String newValue) {
    model = newValue;
  }
  public void gas(int increment) {
    kecepatan= kecepatan + increment;
  }
  
  public void rem(int decrement) {
    if (kecepatan != 0) {
      kecepatan = kecepatan - decrement;
    }
    lampuRem = true;
  }
  
  public void nyalakan() {
    power = true;
    lampuDepan = true;
  }

  public void matikan() {
    power = false;
  }

  public void belokKanan() {
    if (power != false) {
      lampuSenKanan = true;
    } else {
      System.out.println("Motor mati, tidak bisa belok");
    }
  }

  public void belokKiri() {
    if (power != false) {
      lampuSenKiri = true;
    } else {
      System.out.println("Motor mati, tidak bisa belok");
    }
  }

  public void cetakStatus() {
    System.out.println("---------------------------------");
    System.out.println("Merk                : " + model);
    System.out.println("Power               : " + power);
    System.out.println("Kecepatan           : " + kecepatan + "km/jam");
    System.out.println("Lampu Depan         : " + lampuDepan);
    System.out.println("Lampu Rem           : " + lampuRem);
    System.out.println("Lampu Sen Kanan     : " + lampuSenKanan);
    System.out.println("Lampu Sen Kanan     : " + lampuSenKiri);
  }





















}
