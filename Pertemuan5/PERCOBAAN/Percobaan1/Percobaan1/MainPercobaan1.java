package Pertemuan5.PERCOBAAN.Percobaan1.Percobaan1;

public class MainPercobaan1 {
  public static void main(String[] args) {
    Processor p = new Processor("Intel i5", 3.0);
    Laptop L = new Laptop("Thinkpad", p);
    L.info();

    Processor p1 = new Processor();
    p1.setMerk("Intel i5");
    p1.setCache(4);
    Laptop L1 = new Laptop();
    L1.setMerk("Lenovo");
    L1.setProc(p1);
    p1.info();
  }
}
