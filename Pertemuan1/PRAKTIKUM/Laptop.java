package PRAKTIKUM;

public class Laptop {
  private boolean power = false;
  private String merk;
  private double ukuranLayar;
  private int kecerahanLayar, kapasitasBaterai, persentaseBaterai;

  public void setMerk(String newValue) {
    merk = newValue;
  }

  public void setUkuranLayar(double newValue) {
    ukuranLayar = newValue;
  }

  public void setKecerahanLayar(int newValue) {
    kecerahanLayar = newValue;
  }

  public void setKapasitasBaterai(int newValue) {
    kapasitasBaterai = newValue;
  }

  public void setPersenBaterai(int newValue) {
    persentaseBaterai = newValue;
  }

  public void nyalakan() {
    power = true;
  }

  public void matikan() {
    power = false;
  }

  public void tambahKecerahan(int increment) {
    if (kecerahanLayar + increment <= 100) {
      kecerahanLayar += increment;
    } else if (kecerahanLayar == 100) {
      System.out.println("Kecerahan layar sudah maksimal");
    }
  }

  public void isiDaya(int increment) {
    if (persentaseBaterai == 100) {
    } else if (persentaseBaterai + increment <= 100) {
      persentaseBaterai += increment;
    } else if (persentaseBaterai + increment >= 100) {
      persentaseBaterai = 100;
    }

  }

  public void cetakStatus() {
    System.out.println("---------------------------------");
    System.out.println("Merk                : " + merk);
    System.out.println("Power               : " + (power ? "Hidup" : "Mati"));
    System.out.println("Ukuran Layar        : " + ukuranLayar + "inci");
    System.out.println("Kecerahan Layar     : " + kecerahanLayar + "%");
    System.out.println("Kapasitas Baterai   : " + kapasitasBaterai);
    System.out.println("Persen Baterai      : " + persentaseBaterai + "%");
    System.out.println("---------------------------------");

  }
}
