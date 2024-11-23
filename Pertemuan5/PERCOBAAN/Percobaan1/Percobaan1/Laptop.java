package Pertemuan5.PERCOBAAN.Percobaan1.Percobaan1;

public class Laptop {

  private String merk;
  private Processor proc;

  Laptop() {
  }

  Laptop(String merk, Processor proc) {
    this.merk = merk;
    this.proc = proc;
  }

  public void info() {
    System.out.println("Merk Laptop = " + merk);
    if (proc != null) {
      proc.info();
    } else {
      System.out.println("Processor tidak tersedia");
    }
  }

  public String getMerk() {
    return merk;
  }

  public void setMerk(String newMerk) {
    merk = newMerk;
  }

  public Processor getProc() {
    return proc;
  }

  public void setProc(Processor newProc) {
    proc = newProc;
  }
}
