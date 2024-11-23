package Pertemuan8.EXERCISE.Overriding;

public class SalesManager extends Manajer {
  private String departemen;

  public SalesManager(String nama, String departemen, int gaji) {
      super(nama, gaji);
      this.departemen = departemen;
  }

  @Override
  public void cetakStatus() {
      System.out.println("Nama: " + nama);
      System.out.println("Departemen: " + departemen);
      System.out.println("Gaji: " + gaji);
  }
}
